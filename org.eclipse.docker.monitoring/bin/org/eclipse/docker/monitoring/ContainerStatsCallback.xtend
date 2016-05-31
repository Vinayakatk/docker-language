package org.eclipse.docker.monitoring

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.ArrayList
import java.util.Collection
import java.util.LinkedHashMap
import java.util.List
import com.github.dockerjava.api.model.Statistics
import com.github.dockerjava.core.async.ResultCallbackTemplate
import com.google.inject.Injector
import org.eclipse.docker.language.ui.internal.ContainerActivator
import com.google.common.eventbus.EventBus
import org.eclipse.docker.monitoring.events.NetworkEvent
import org.eclipse.docker.monitoring.events.CpuEvent
import org.eclipse.docker.monitoring.events.MemoryEvent
import org.eclipse.docker.monitoring.events.IOEvent
import javafx.application.Platform

public class ContainerStatsCallback extends ResultCallbackTemplate<ContainerStatsCallback, Statistics> {
	MonitoringModel model 
	StatsCallback data  
	
	EventBus bus
	
	String name
	
	new(String name) {
		this.name=name
		var Injector injector = ContainerActivator.getInstance().getInjector(ContainerActivator.ORG_ECLIPSE_DOCKER_LANGUAGE_CONTAINER);
		bus = injector.getInstance(EventBus);
		model = new MonitoringModel()
	 	data = new StatsCallback(model, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0)
	}
	
	override void onNext(Statistics stats) {
		
		Platform.implicitExit = false
		Platform.runLater(new Runnable(){
	
	override run() {
		if (stats !== null) {
			
			var LinkedHashMap<?, ?> usage = (stats.getCpuStats().get("cpu_usage") as LinkedHashMap<?, ?>)
			var Object sysCpuObject = stats.getCpuStats().get("system_cpu_usage")
			var Long sys = new Long((sysCpuObject as Long))
			var Object totalUsageObject = usage.get("total_usage")
			var Long cpu = new Long((totalUsageObject as Long))
			var float perc = 0.0f
			var float sysDelta = sys - data.prevsyscpu
			var long cpuDelat = cpu - data.prevcpu
			if (sysDelta > 0.0 && cpuDelat > 0.0) {
				data.prevcpu = cpu
				data.prevsyscpu = sys
				perc = (cpuDelat / sysDelta) * (((usage.get("percpu_usage") as List<?>)).size()) * 100
			}
			data.prevcpu = cpu
			data.prevsyscpu = sys
			if (data.prevPerc !== perc) {
				data.prevPerc = perc
				var float doubleValue = BigDecimal::valueOf(perc).setScale(2, RoundingMode::HALF_UP).floatValue
//				System::out.println(doubleValue)
				data.model.cpu.percentage=doubleValue
				bus.post(new CpuEvent=>[
					it.name=name
					it.monitoring=data.model.cpu
				])
			}
			var int memoryUsage = (stats.getMemoryStats().get("usage") as Integer)
			var int memoryLimit = (stats.getMemoryStats().get("limit") as Integer)
			data.model.memory.limit=memoryLimit
			data.model.memory.utilized=memoryUsage
			var float UsagePerc = (memoryUsage.floatValue / memoryLimit.floatValue)*100
			var float deltaMemory = UsagePerc - data.preMemUsage
			if (deltaMemory > 0.0) {
				data.preMemUsage = UsagePerc
				data.model.memory.perc=(UsagePerc)
				bus.post(new MemoryEvent=>[
					it.name=name
					it.memoryMonitoring=data.model.memory
				])
			}
			var Collection<Object> values = stats.getNetworks().values()
			var LinkedHashMap<?, ?> p = (values.iterator().next() as LinkedHashMap<?, ?>)
			var Object rxObject = p.get("rx_bytes")
			var Integer rxBytes = Integer::valueOf(rxObject.toString())
			var Object txObject = p.get("tx_bytes")
			var Integer txBytes = Integer::valueOf(txObject.toString())
			var int rxDelta = rxBytes - data.prerx
			var int txDelta = txBytes - data.pretx
			if (rxDelta > 0 || txDelta > 0) {
				data.prerx = rxBytes
				data.pretx = txBytes
//				System::out.println()
				data.model.network.receive=(rxBytes/1024).intValue
				data.model.network.transmit=(txBytes/1024).intValue
				bus.post(new NetworkEvent=>[
					it.name=name
					it.networkMonitoring=data.model.network
				])
			}
			var ArrayList<?> io = (stats.getBlkioStats().get("io_service_bytes_recursive") as ArrayList<?>)
			var Integer readBytes = 0
			var Integer writeBytes = 0
			for (Object object : io) {
				var Object op = ((object as LinkedHashMap<?, ?>)).get("op")
				if (op.equals("Read")) {
					var Object read = ((object as LinkedHashMap<?, ?>)).get("value")
					readBytes = Integer::valueOf(read.toString())
				}
				if (op.toString().equals("Write")) {
					var Object write = ((object as LinkedHashMap<?, ?>)).get("value")
					writeBytes = Integer::valueOf(write.toString())
				}
			}
			var int readDelta = readBytes - data.preread
			var int writeDelta = writeBytes - data.prewrite
			if (readDelta > 0 || writeDelta > 0) {
				data.preread = readBytes
				data.prewrite = writeBytes
				
				data.model.io.read=(readBytes/1024).intValue
				data.model.io.write=(writeBytes/1024).intValue
				bus.post(new IOEvent=>[
					it.name=name
					it.ioMonitoring=data.model.io
				])
			}
		
		}
	}
	
	})
		
	}
}
