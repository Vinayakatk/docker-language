package org.eclipse.docker.language

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.core.DockerClientConfig
import org.eclipse.docker.language.container.Bind
import org.eclipse.docker.language.container.Capability
import org.eclipse.docker.language.container.Container
import org.eclipse.docker.language.container.ContainerPackage
import org.eclipse.docker.language.container.Device
import org.eclipse.docker.language.container.ExposedPort
import org.eclipse.docker.language.container.Image
import org.eclipse.docker.language.container.Label
import org.eclipse.docker.language.container.Link
import org.eclipse.docker.language.container.PortBinding
import org.eclipse.docker.language.container.RestartPolicy
import org.eclipse.docker.language.container.Ulimit
import org.eclipse.docker.language.container.Volume
import org.eclipse.docker.language.container.VolumesFrom
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource

class DockerInterpreterImpl implements DockerInterpreter{
	private String DOCKER_CERT = ""
	private String Docker_uri=""
	
	DockerClient dockerClient
	
	public new(){
		   var dockerClientConfig = DockerClientConfig.createDefaultConfigBuilder()
                .withUri(Docker_uri).withDockerCertPath(DOCKER_CERT).build();

        dockerClient = DockerClientBuilder.getInstance(dockerClientConfig).build();
	}
	override interpret(Resource resource) {
		var containers = resource.contents.filter(Container)
		containers.forEach[it.interpret]
	}
	def dispatch void interpret(Container container){
		
		var command = dockerClient.createContainerCmd(container.image.name)
		if (container.eGet(ContainerPackage.eINSTANCE.container_Image)!=null) {
			container.image.interpretImage
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Binds)!=null) {
			container.binds.interpretBinds
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CapabilityAdd)!=null) {
			container.capabilityAdd.interpretCapAdd
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CapabilityDrop)!=null) {
			container.capabilityDrop.interpretCapDrop
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Commands)!=null) {
			container.commands.interpretCommands
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_ContainerIDFile)!=null) {
			container.containerIDFile.interpretContainerIDFile
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CpusetCpus)!=null) {
			container.cpusetCpus.interpretCpusetCpus
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CpuPeriod)!=null) {
			container.cpuPeriod.intrepretCpuPeriod
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CpusetMems)!=null) {
			container.cpusetMems.interpretCpusetMems
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CpuShares)!=null) {
			container.cpuShares.interpretCpuShares
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Devices)!=null) {
			container.devices.interpretDevices
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Dns)!=null) {
			container.dns.interpretDns
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_DnsSearch)!=null) {
			container.dnsSearch.interpretDnsSearch
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_DomainName)!=null) {
			container.domainName.interpretDomainName
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Entrypoint)!=null) {
			container.entrypoint.interpretEntryPOint
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Env)!=null) {
			container.env.interpretEnv
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_ExposedPorts)!=null) {
			container.exposedPorts.interpretExposedPOrts
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_ExtraHosts)!=null) {
			container.extraHosts.interpretExtraHosts
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Labels)!=null) {
			container.labels.interpretLabels
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Links)!=null) {
			container.links.interpretLinks
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_MacAddress)!=null) {
			container.macAddress.interpretMac
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Memory)!=null) {
			container.memory.interpretMemory
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_MemorySwap)!=null) {
			container.memorySwap.interpretMemorySwap
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_DisableNetwork)!=null) {
			container.disableNetwork.interpretDisableNetwork
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_NetworkMode)!=null) {
			container.networkMode.interpretMode
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_PortBindings)!=null) {
			container.portBindings.interpretPortBindings
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Privileged)!=null) {
			container.privileged.intrepretPrivileged
		}
		
		if (container.eGet(ContainerPackage.eINSTANCE.container_PublishAllPorts)!=null) {
			container.publishAllPorts.interpretPublishAllPorts
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_ReadonlyRootfs)!=null) {
			container.readonlyRootfs.interpretReadonlyRootfs
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_PidMode)!=null) {
			container.pidMode.interpretPidMode
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_CgroupParent)!=null) {
			container.cgroupParent.interpretCgroupParent
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_WorkingDir)!=null) {
			container.workingDir.interpretWorkingDir
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_User)!=null) {
			container.user.interpretUser
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Tty)!=null) {
			container.tty.interpretTTy
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_RestartPolicy)!=null) {
			container.restartPolicy.interpretRestartPolicy
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Volumes)!=null) {
			container.volumes.interpretVolumes
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_VolumesFrom)!=null) {
			container.volumesFrom.interpretVolumesFrom
		}
		if (container.eGet(ContainerPackage.eINSTANCE.container_Ulimits)!=null) {
			container.ulimits.interpretULimits
		}
		dockerClient.createContainerCmd("").exec
		
	}
	def void interpretCpusetMems(String value){}
	def void interpretDevices(EList<Device> list){}
	
	def void interpretDns(EList<String> list){}
	
	def void interpretDnsSearch(EList<String> list){}
	
	def interpretDomainName(String string) {
		
	}
	def void interpretCpuShares(int value){}
	def void interpretEntryPOint(EList<String> list){}
	
	def void interpretEnv(EList<String> list){}
	
	def void interpretExposedPOrts(EList<ExposedPort> list){}
	
	def void interpretExtraHosts(EList<String> list){}
	
	def void interpretLabels(EList<Label> list){}
	
	def void interpretLinks(EList<Link> list){}
	
	def interpretMac(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def void interpretMemory(long value){}
	def void interpretMemorySwap(long value){}
	def void interpretDisableNetwork(boolean value){
		
	}
	def interpretMode(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def void interpretPortBindings(EList<PortBinding> list){}
	
	def void intrepretPrivileged(boolean value){}
	def void interpretReadonlyRootfs(boolean value){}
	
	def interpretPidMode(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def interpretCgroupParent(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def interpretWorkingDir(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def interpretUser(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def void interpretPublishAllPorts(boolean value){}
	def void interpretTTy(boolean tty){}
	
	def void interpretRestartPolicy(RestartPolicy policy){}
	
	def void interpretVolumes(EList<Volume> list){}
	
	def void interpretVolumesFrom(EList<VolumesFrom> list){}
	
	def void interpretULimits(EList<Ulimit> list){}
	
	def void interpretCapDrop(EList<Capability> list){}
	
	def void interpretCapAdd(EList<Capability> list){}
	
	def interpretContainerIDFile(String string) {
	}
	def void intrepretCpuPeriod(int cpuPeriod)	{}
	def void getInterpretCommands(EList<String> list){}
	
	def void interpretImage(Image image){
		if(image.eGet(ContainerPackage.eINSTANCE.image_Tag)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Cpusetcpus)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Cpushares)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_DockerFileDir)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Memory)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Memswap)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_NoCache)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Name)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Pull)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Quiet)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Remove)!=null){
			
		}
		if(image.eGet(ContainerPackage.eINSTANCE.image_Buildargs)!=null){
			
		}
		
	}
	
	def void interpretAdd(EList<Capability> list){}
	
	def void interpretBinds(EList<Bind> list){}
	
	def void interpretCpusetCpus(int cpusetCpus){}
	
}