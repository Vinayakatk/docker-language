package org.eclipse.docker.language;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.InspectContainerResponse.ContainerState;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.api.model.PullResponseItem;
import com.github.dockerjava.api.model.Statistics;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.async.ResultCallbackTemplate;
import com.github.dockerjava.core.command.EventsResultCallback;
import com.github.dockerjava.core.command.PullImageResultCallback;

public class test {
	public static void main(String[] args) throws IOException, InterruptedException {
		DockerClientConfig build = DockerClientConfig.createDefaultConfigBuilder()
				.withDockerCertPath("C:\\Users\\vinio\\.docker\\machine\\certs").
				withUri("https://192.168.99.100:2376")
				.build();
		
		// DockerClient build2 =
		// DockerClientBuilder.getInstance("http:/).build();
		DockerClient build2 = DockerClientBuilder.getInstance(build).build();
//		build2.
		ListImagesCmd withShowAll = build2.listImagesCmd().withShowAll(true);
		// withShowAll.exec().forEach(y->System.out.println(y.getId()));
		// CreateContainerResponse exec = build2.createContainerCmd("vinayaka").
		// withAttachStderr(true).withAttachStdin(true).
		// withAttachStdout(true).withCmd("--name=\"loper\"").
		// withName("lope").withImage("busybox").withCmd("sh").withExposedPorts(ExposedPort.tcp(90)).exec();
		// InspectContainerResponse r =
		// build2.inspectContainerCmd(exec.getId()).exec();
		// ObjectMapper k = new ObjectMapper();
		//
		// JsonNode ll =
		// k.readValue(k.writerWithDefaultPrettyPrinter().writeValueAsString(r).getBytes(),
		// JsonNode.class);
		// System.out.println(ll.textValue());
		// System.out.println(k.writerWithDefaultPrettyPrinter().writeValueAsString(r));
		//// System.out.println(string);
		List<Container> exec = build2.listContainersCmd().withShowAll(true).exec();
		for (Container container : exec) {
			String[] names = container.getNames();
//			System.out.println(names.length);
//			for (String string : names) {
				System.out.println(container.getNames()[0].toString()+"    "+ container.getStatus().split(" ")[0] +"    "+build2.inspectContainerCmd(container.getId()).exec().getState().isRunning());
			
		}
		InspectContainerResponse ee = build2.inspectContainerCmd("vini2").exec();
		ContainerState state = ee.getState();
		System.out.println(ee.getId());
//		build2.pullImageCmd("tomcat").exec(new PullImageResultCallback(){
//			@Override
//			public void onNext(PullResponseItem item) {
//				System.out.println(item);
//				super.onNext(item);
//			}
//			@Override
//			public void onComplete() {
//				System.out.println("complete");
//				super.onComplete();
//			}
//		});
//	
		build2.createContainerCmd("tom").withImage("tomcat").exec();
//			System.out.println("did something");
////		}
//			EventsResultCallback exec3 = build2.eventsCmd().exec(new EventsResultCallback(){
//				@Override
//				public void onNext(Event item) {
//					if(item!=null) System.out.println(item.getStatus());
//					super.onNext(item);
//				}
//			});
//			exec3.awaitCompletion(10000, TimeUnit.DAYS);
//		CountDownLatch countDownLatch = new CountDownLatch(5);
//		StatsCallbackTest exec2 = build2.statsCmd().withContainerId("deae342579c3").exec(new test.StatsCallbackTest(countDownLatch));	
////	      countDownLatch.await(9, TimeUnit.SECONDS);
//	        Boolean gotStats = exec2.gotStats();
//	        exec2.close();
//	}
//	 static class StatsCallbackTest extends ResultCallbackTemplate<StatsCallbackTest, Statistics> {
//        private final CountDownLatch countDownLatch;
//
//        private Boolean gotStats = false;
//        private int prevcpu =0;
//        private float prevsyscpu =0.0f;
//        private float prevPerc=0.0f;
//
//        public StatsCallbackTest(CountDownLatch countDownLatch) {
//            this.countDownLatch = countDownLatch;
//        }
//
//        @Override
//        public void onNext(Statistics stats) {
////        Collection<Object> values = stats.getNetworks().values();
////		LinkedHashMap p =(LinkedHashMap)values.iterator().next();
////        Object object3 = p.get("rx_bytes");
////		System.out.println(object3.toString());
////        Object object = p.get("tx_bytes");
////        System.out.println(object.toString());
//////        	System.out.println(x);
//        	if (stats != null) {
//                LinkedHashMap object = (LinkedHashMap) stats.getCpuStats().get("cpu_usage");
////				System.out.println(object.get("total_usage"));
////				System.out.println(stats.getCpuStats().get("system_cpu_usage"));
//				Object object2 = stats.getCpuStats().get("system_cpu_usage");
//				Long sys = new Long((Long) object2);
//				Object object3 = object.get("total_usage");
//				Integer cpu = new Integer((Integer) object3);
//				float perc =0.0f;
//				float sysDelta = sys-prevsyscpu;
//				int cpuDelat = cpu - prevcpu;
//				if(sysDelta>0.0&& cpuDelat >0.0){
//					prevcpu = cpu;
//					prevsyscpu=sys;
//					perc = (cpuDelat/sysDelta) *(((List)object.get("percpu_usage")).size()) *100 ;
//				}
//				prevcpu = cpu;
//				prevsyscpu=sys;
//				if(prevPerc!=perc){prevPerc=perc;
//				System.out.println(BigDecimal.valueOf(perc).setScale(2, RoundingMode.HALF_UP) +"%");}
////                System.out.println(stats.getMemoryStats().values().toString());
//            } 	
//        }
//
//        public Boolean gotStats() {
//            return gotStats;
//        }
    }
}
