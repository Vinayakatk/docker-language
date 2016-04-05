package org.eclipse.docker.language;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.eclipse.docker.language.DockerInterpreter;
import org.eclipse.docker.language.container.Bind;
import org.eclipse.docker.language.container.Capability;
import org.eclipse.docker.language.container.Container;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Device;
import org.eclipse.docker.language.container.ExposedPort;
import org.eclipse.docker.language.container.Image;
import org.eclipse.docker.language.container.Label;
import org.eclipse.docker.language.container.Link;
import org.eclipse.docker.language.container.PortBinding;
import org.eclipse.docker.language.container.RestartPolicy;
import org.eclipse.docker.language.container.Ulimit;
import org.eclipse.docker.language.container.Volume;
import org.eclipse.docker.language.container.VolumesFrom;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class DockerInterpreterImpl implements DockerInterpreter {
  private String DOCKER_CERT = "";
  
  private String Docker_uri = "";
  
  private DockerClient dockerClient;
  
  public DockerInterpreterImpl() {
    DockerClientConfig.DockerClientConfigBuilder _createDefaultConfigBuilder = DockerClientConfig.createDefaultConfigBuilder();
    DockerClientConfig.DockerClientConfigBuilder _withUri = _createDefaultConfigBuilder.withUri(this.Docker_uri);
    DockerClientConfig.DockerClientConfigBuilder _withDockerCertPath = _withUri.withDockerCertPath(this.DOCKER_CERT);
    DockerClientConfig dockerClientConfig = _withDockerCertPath.build();
    DockerClientBuilder _instance = DockerClientBuilder.getInstance(dockerClientConfig);
    DockerClient _build = _instance.build();
    this.dockerClient = _build;
  }
  
  @Override
  public void interpret(final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    Iterable<Container> containers = Iterables.<Container>filter(_contents, Container.class);
    final Consumer<Container> _function = (Container it) -> {
      this.interpret(it);
    };
    containers.forEach(_function);
  }
  
  protected void _interpret(final Container container) {
    Image _image = container.getImage();
    String _name = _image.getName();
    CreateContainerCmd command = this.dockerClient.createContainerCmd(_name);
    EReference _container_Image = ContainerPackage.eINSTANCE.getContainer_Image();
    Object _eGet = container.eGet(_container_Image);
    boolean _notEquals = (!Objects.equal(_eGet, null));
    if (_notEquals) {
      Image _image_1 = container.getImage();
      this.interpretImage(_image_1);
    }
    EReference _container_Binds = ContainerPackage.eINSTANCE.getContainer_Binds();
    Object _eGet_1 = container.eGet(_container_Binds);
    boolean _notEquals_1 = (!Objects.equal(_eGet_1, null));
    if (_notEquals_1) {
      EList<Bind> _binds = container.getBinds();
      this.interpretBinds(_binds);
    }
    EAttribute _container_CapabilityAdd = ContainerPackage.eINSTANCE.getContainer_CapabilityAdd();
    Object _eGet_2 = container.eGet(_container_CapabilityAdd);
    boolean _notEquals_2 = (!Objects.equal(_eGet_2, null));
    if (_notEquals_2) {
      EList<Capability> _capabilityAdd = container.getCapabilityAdd();
      this.interpretCapAdd(_capabilityAdd);
    }
    EAttribute _container_CapabilityDrop = ContainerPackage.eINSTANCE.getContainer_CapabilityDrop();
    Object _eGet_3 = container.eGet(_container_CapabilityDrop);
    boolean _notEquals_3 = (!Objects.equal(_eGet_3, null));
    if (_notEquals_3) {
      EList<Capability> _capabilityDrop = container.getCapabilityDrop();
      this.interpretCapDrop(_capabilityDrop);
    }
    EAttribute _container_Commands = ContainerPackage.eINSTANCE.getContainer_Commands();
    Object _eGet_4 = container.eGet(_container_Commands);
    boolean _notEquals_4 = (!Objects.equal(_eGet_4, null));
    if (_notEquals_4) {
      EList<String> _commands = container.getCommands();
      this.getInterpretCommands(_commands);
    }
    EAttribute _container_ContainerIDFile = ContainerPackage.eINSTANCE.getContainer_ContainerIDFile();
    Object _eGet_5 = container.eGet(_container_ContainerIDFile);
    boolean _notEquals_5 = (!Objects.equal(_eGet_5, null));
    if (_notEquals_5) {
      String _containerIDFile = container.getContainerIDFile();
      this.interpretContainerIDFile(_containerIDFile);
    }
    EAttribute _container_CpusetCpus = ContainerPackage.eINSTANCE.getContainer_CpusetCpus();
    Object _eGet_6 = container.eGet(_container_CpusetCpus);
    boolean _notEquals_6 = (!Objects.equal(_eGet_6, null));
    if (_notEquals_6) {
      int _cpusetCpus = container.getCpusetCpus();
      this.interpretCpusetCpus(_cpusetCpus);
    }
    EAttribute _container_CpuPeriod = ContainerPackage.eINSTANCE.getContainer_CpuPeriod();
    Object _eGet_7 = container.eGet(_container_CpuPeriod);
    boolean _notEquals_7 = (!Objects.equal(_eGet_7, null));
    if (_notEquals_7) {
      int _cpuPeriod = container.getCpuPeriod();
      this.intrepretCpuPeriod(_cpuPeriod);
    }
    EAttribute _container_CpusetMems = ContainerPackage.eINSTANCE.getContainer_CpusetMems();
    Object _eGet_8 = container.eGet(_container_CpusetMems);
    boolean _notEquals_8 = (!Objects.equal(_eGet_8, null));
    if (_notEquals_8) {
      String _cpusetMems = container.getCpusetMems();
      this.interpretCpusetMems(_cpusetMems);
    }
    EAttribute _container_CpuShares = ContainerPackage.eINSTANCE.getContainer_CpuShares();
    Object _eGet_9 = container.eGet(_container_CpuShares);
    boolean _notEquals_9 = (!Objects.equal(_eGet_9, null));
    if (_notEquals_9) {
      int _cpuShares = container.getCpuShares();
      this.interpretCpuShares(_cpuShares);
    }
    EReference _container_Devices = ContainerPackage.eINSTANCE.getContainer_Devices();
    Object _eGet_10 = container.eGet(_container_Devices);
    boolean _notEquals_10 = (!Objects.equal(_eGet_10, null));
    if (_notEquals_10) {
      EList<Device> _devices = container.getDevices();
      this.interpretDevices(_devices);
    }
    EAttribute _container_Dns = ContainerPackage.eINSTANCE.getContainer_Dns();
    Object _eGet_11 = container.eGet(_container_Dns);
    boolean _notEquals_11 = (!Objects.equal(_eGet_11, null));
    if (_notEquals_11) {
      EList<String> _dns = container.getDns();
      this.interpretDns(_dns);
    }
    EAttribute _container_DnsSearch = ContainerPackage.eINSTANCE.getContainer_DnsSearch();
    Object _eGet_12 = container.eGet(_container_DnsSearch);
    boolean _notEquals_12 = (!Objects.equal(_eGet_12, null));
    if (_notEquals_12) {
      EList<String> _dnsSearch = container.getDnsSearch();
      this.interpretDnsSearch(_dnsSearch);
    }
    EAttribute _container_DomainName = ContainerPackage.eINSTANCE.getContainer_DomainName();
    Object _eGet_13 = container.eGet(_container_DomainName);
    boolean _notEquals_13 = (!Objects.equal(_eGet_13, null));
    if (_notEquals_13) {
      String _domainName = container.getDomainName();
      this.interpretDomainName(_domainName);
    }
    EAttribute _container_Entrypoint = ContainerPackage.eINSTANCE.getContainer_Entrypoint();
    Object _eGet_14 = container.eGet(_container_Entrypoint);
    boolean _notEquals_14 = (!Objects.equal(_eGet_14, null));
    if (_notEquals_14) {
      EList<String> _entrypoint = container.getEntrypoint();
      this.interpretEntryPOint(_entrypoint);
    }
    EAttribute _container_Env = ContainerPackage.eINSTANCE.getContainer_Env();
    Object _eGet_15 = container.eGet(_container_Env);
    boolean _notEquals_15 = (!Objects.equal(_eGet_15, null));
    if (_notEquals_15) {
      EList<String> _env = container.getEnv();
      this.interpretEnv(_env);
    }
    EReference _container_ExposedPorts = ContainerPackage.eINSTANCE.getContainer_ExposedPorts();
    Object _eGet_16 = container.eGet(_container_ExposedPorts);
    boolean _notEquals_16 = (!Objects.equal(_eGet_16, null));
    if (_notEquals_16) {
      EList<ExposedPort> _exposedPorts = container.getExposedPorts();
      this.interpretExposedPOrts(_exposedPorts);
    }
    EAttribute _container_ExtraHosts = ContainerPackage.eINSTANCE.getContainer_ExtraHosts();
    Object _eGet_17 = container.eGet(_container_ExtraHosts);
    boolean _notEquals_17 = (!Objects.equal(_eGet_17, null));
    if (_notEquals_17) {
      EList<String> _extraHosts = container.getExtraHosts();
      this.interpretExtraHosts(_extraHosts);
    }
    EReference _container_Labels = ContainerPackage.eINSTANCE.getContainer_Labels();
    Object _eGet_18 = container.eGet(_container_Labels);
    boolean _notEquals_18 = (!Objects.equal(_eGet_18, null));
    if (_notEquals_18) {
      EList<Label> _labels = container.getLabels();
      this.interpretLabels(_labels);
    }
    EReference _container_Links = ContainerPackage.eINSTANCE.getContainer_Links();
    Object _eGet_19 = container.eGet(_container_Links);
    boolean _notEquals_19 = (!Objects.equal(_eGet_19, null));
    if (_notEquals_19) {
      EList<Link> _links = container.getLinks();
      this.interpretLinks(_links);
    }
    EAttribute _container_MacAddress = ContainerPackage.eINSTANCE.getContainer_MacAddress();
    Object _eGet_20 = container.eGet(_container_MacAddress);
    boolean _notEquals_20 = (!Objects.equal(_eGet_20, null));
    if (_notEquals_20) {
      String _macAddress = container.getMacAddress();
      this.interpretMac(_macAddress);
    }
    EAttribute _container_Memory = ContainerPackage.eINSTANCE.getContainer_Memory();
    Object _eGet_21 = container.eGet(_container_Memory);
    boolean _notEquals_21 = (!Objects.equal(_eGet_21, null));
    if (_notEquals_21) {
      long _memory = container.getMemory();
      this.interpretMemory(_memory);
    }
    EAttribute _container_MemorySwap = ContainerPackage.eINSTANCE.getContainer_MemorySwap();
    Object _eGet_22 = container.eGet(_container_MemorySwap);
    boolean _notEquals_22 = (!Objects.equal(_eGet_22, null));
    if (_notEquals_22) {
      long _memorySwap = container.getMemorySwap();
      this.interpretMemorySwap(_memorySwap);
    }
    EAttribute _container_DisableNetwork = ContainerPackage.eINSTANCE.getContainer_DisableNetwork();
    Object _eGet_23 = container.eGet(_container_DisableNetwork);
    boolean _notEquals_23 = (!Objects.equal(_eGet_23, null));
    if (_notEquals_23) {
      boolean _isDisableNetwork = container.isDisableNetwork();
      this.interpretDisableNetwork(_isDisableNetwork);
    }
    EAttribute _container_NetworkMode = ContainerPackage.eINSTANCE.getContainer_NetworkMode();
    Object _eGet_24 = container.eGet(_container_NetworkMode);
    boolean _notEquals_24 = (!Objects.equal(_eGet_24, null));
    if (_notEquals_24) {
      String _networkMode = container.getNetworkMode();
      this.interpretMode(_networkMode);
    }
    EReference _container_PortBindings = ContainerPackage.eINSTANCE.getContainer_PortBindings();
    Object _eGet_25 = container.eGet(_container_PortBindings);
    boolean _notEquals_25 = (!Objects.equal(_eGet_25, null));
    if (_notEquals_25) {
      EList<PortBinding> _portBindings = container.getPortBindings();
      this.interpretPortBindings(_portBindings);
    }
    EAttribute _container_Privileged = ContainerPackage.eINSTANCE.getContainer_Privileged();
    Object _eGet_26 = container.eGet(_container_Privileged);
    boolean _notEquals_26 = (!Objects.equal(_eGet_26, null));
    if (_notEquals_26) {
      boolean _isPrivileged = container.isPrivileged();
      this.intrepretPrivileged(_isPrivileged);
    }
    EAttribute _container_PublishAllPorts = ContainerPackage.eINSTANCE.getContainer_PublishAllPorts();
    Object _eGet_27 = container.eGet(_container_PublishAllPorts);
    boolean _notEquals_27 = (!Objects.equal(_eGet_27, null));
    if (_notEquals_27) {
      boolean _isPublishAllPorts = container.isPublishAllPorts();
      this.interpretPublishAllPorts(_isPublishAllPorts);
    }
    EAttribute _container_ReadonlyRootfs = ContainerPackage.eINSTANCE.getContainer_ReadonlyRootfs();
    Object _eGet_28 = container.eGet(_container_ReadonlyRootfs);
    boolean _notEquals_28 = (!Objects.equal(_eGet_28, null));
    if (_notEquals_28) {
      boolean _isReadonlyRootfs = container.isReadonlyRootfs();
      this.interpretReadonlyRootfs(_isReadonlyRootfs);
    }
    EAttribute _container_PidMode = ContainerPackage.eINSTANCE.getContainer_PidMode();
    Object _eGet_29 = container.eGet(_container_PidMode);
    boolean _notEquals_29 = (!Objects.equal(_eGet_29, null));
    if (_notEquals_29) {
      String _pidMode = container.getPidMode();
      this.interpretPidMode(_pidMode);
    }
    EAttribute _container_CgroupParent = ContainerPackage.eINSTANCE.getContainer_CgroupParent();
    Object _eGet_30 = container.eGet(_container_CgroupParent);
    boolean _notEquals_30 = (!Objects.equal(_eGet_30, null));
    if (_notEquals_30) {
      String _cgroupParent = container.getCgroupParent();
      this.interpretCgroupParent(_cgroupParent);
    }
    EAttribute _container_WorkingDir = ContainerPackage.eINSTANCE.getContainer_WorkingDir();
    Object _eGet_31 = container.eGet(_container_WorkingDir);
    boolean _notEquals_31 = (!Objects.equal(_eGet_31, null));
    if (_notEquals_31) {
      String _workingDir = container.getWorkingDir();
      this.interpretWorkingDir(_workingDir);
    }
    EAttribute _container_User = ContainerPackage.eINSTANCE.getContainer_User();
    Object _eGet_32 = container.eGet(_container_User);
    boolean _notEquals_32 = (!Objects.equal(_eGet_32, null));
    if (_notEquals_32) {
      String _user = container.getUser();
      this.interpretUser(_user);
    }
    EAttribute _container_Tty = ContainerPackage.eINSTANCE.getContainer_Tty();
    Object _eGet_33 = container.eGet(_container_Tty);
    boolean _notEquals_33 = (!Objects.equal(_eGet_33, null));
    if (_notEquals_33) {
      boolean _isTty = container.isTty();
      this.interpretTTy(_isTty);
    }
    EReference _container_RestartPolicy = ContainerPackage.eINSTANCE.getContainer_RestartPolicy();
    Object _eGet_34 = container.eGet(_container_RestartPolicy);
    boolean _notEquals_34 = (!Objects.equal(_eGet_34, null));
    if (_notEquals_34) {
      RestartPolicy _restartPolicy = container.getRestartPolicy();
      this.interpretRestartPolicy(_restartPolicy);
    }
    EReference _container_Volumes = ContainerPackage.eINSTANCE.getContainer_Volumes();
    Object _eGet_35 = container.eGet(_container_Volumes);
    boolean _notEquals_35 = (!Objects.equal(_eGet_35, null));
    if (_notEquals_35) {
      EList<Volume> _volumes = container.getVolumes();
      this.interpretVolumes(_volumes);
    }
    EReference _container_VolumesFrom = ContainerPackage.eINSTANCE.getContainer_VolumesFrom();
    Object _eGet_36 = container.eGet(_container_VolumesFrom);
    boolean _notEquals_36 = (!Objects.equal(_eGet_36, null));
    if (_notEquals_36) {
      EList<VolumesFrom> _volumesFrom = container.getVolumesFrom();
      this.interpretVolumesFrom(_volumesFrom);
    }
    EReference _container_Ulimits = ContainerPackage.eINSTANCE.getContainer_Ulimits();
    Object _eGet_37 = container.eGet(_container_Ulimits);
    boolean _notEquals_37 = (!Objects.equal(_eGet_37, null));
    if (_notEquals_37) {
      EList<Ulimit> _ulimits = container.getUlimits();
      this.interpretULimits(_ulimits);
    }
    CreateContainerCmd _createContainerCmd = this.dockerClient.createContainerCmd("");
    _createContainerCmd.exec();
  }
  
  public void interpretCpusetMems(final String value) {
  }
  
  public void interpretDevices(final EList<Device> list) {
  }
  
  public void interpretDns(final EList<String> list) {
  }
  
  public void interpretDnsSearch(final EList<String> list) {
  }
  
  public Object interpretDomainName(final String string) {
    return null;
  }
  
  public void interpretCpuShares(final int value) {
  }
  
  public void interpretEntryPOint(final EList<String> list) {
  }
  
  public void interpretEnv(final EList<String> list) {
  }
  
  public void interpretExposedPOrts(final EList<ExposedPort> list) {
  }
  
  public void interpretExtraHosts(final EList<String> list) {
  }
  
  public void interpretLabels(final EList<Label> list) {
  }
  
  public void interpretLinks(final EList<Link> list) {
  }
  
  public void interpretMac(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretMemory(final long value) {
  }
  
  public void interpretMemorySwap(final long value) {
  }
  
  public void interpretDisableNetwork(final boolean value) {
  }
  
  public void interpretMode(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretPortBindings(final EList<PortBinding> list) {
  }
  
  public void intrepretPrivileged(final boolean value) {
  }
  
  public void interpretReadonlyRootfs(final boolean value) {
  }
  
  public void interpretPidMode(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretCgroupParent(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretWorkingDir(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretUser(final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void interpretPublishAllPorts(final boolean value) {
  }
  
  public void interpretTTy(final boolean tty) {
  }
  
  public void interpretRestartPolicy(final RestartPolicy policy) {
  }
  
  public void interpretVolumes(final EList<Volume> list) {
  }
  
  public void interpretVolumesFrom(final EList<VolumesFrom> list) {
  }
  
  public void interpretULimits(final EList<Ulimit> list) {
  }
  
  public void interpretCapDrop(final EList<Capability> list) {
  }
  
  public void interpretCapAdd(final EList<Capability> list) {
  }
  
  public Object interpretContainerIDFile(final String string) {
    return null;
  }
  
  public void intrepretCpuPeriod(final int cpuPeriod) {
  }
  
  public void getInterpretCommands(final EList<String> list) {
  }
  
  public void interpretImage(final Image image) {
    EAttribute _image_Tag = ContainerPackage.eINSTANCE.getImage_Tag();
    Object _eGet = image.eGet(_image_Tag);
    boolean _notEquals = (!Objects.equal(_eGet, null));
    if (_notEquals) {
    }
    EAttribute _image_Cpusetcpus = ContainerPackage.eINSTANCE.getImage_Cpusetcpus();
    Object _eGet_1 = image.eGet(_image_Cpusetcpus);
    boolean _notEquals_1 = (!Objects.equal(_eGet_1, null));
    if (_notEquals_1) {
    }
    EAttribute _image_Cpushares = ContainerPackage.eINSTANCE.getImage_Cpushares();
    Object _eGet_2 = image.eGet(_image_Cpushares);
    boolean _notEquals_2 = (!Objects.equal(_eGet_2, null));
    if (_notEquals_2) {
    }
    EAttribute _image_DockerFileDir = ContainerPackage.eINSTANCE.getImage_DockerFileDir();
    Object _eGet_3 = image.eGet(_image_DockerFileDir);
    boolean _notEquals_3 = (!Objects.equal(_eGet_3, null));
    if (_notEquals_3) {
    }
    EAttribute _image_Memory = ContainerPackage.eINSTANCE.getImage_Memory();
    Object _eGet_4 = image.eGet(_image_Memory);
    boolean _notEquals_4 = (!Objects.equal(_eGet_4, null));
    if (_notEquals_4) {
    }
    EAttribute _image_Memswap = ContainerPackage.eINSTANCE.getImage_Memswap();
    Object _eGet_5 = image.eGet(_image_Memswap);
    boolean _notEquals_5 = (!Objects.equal(_eGet_5, null));
    if (_notEquals_5) {
    }
    EAttribute _image_NoCache = ContainerPackage.eINSTANCE.getImage_NoCache();
    Object _eGet_6 = image.eGet(_image_NoCache);
    boolean _notEquals_6 = (!Objects.equal(_eGet_6, null));
    if (_notEquals_6) {
    }
    EAttribute _image_Name = ContainerPackage.eINSTANCE.getImage_Name();
    Object _eGet_7 = image.eGet(_image_Name);
    boolean _notEquals_7 = (!Objects.equal(_eGet_7, null));
    if (_notEquals_7) {
    }
    EAttribute _image_Pull = ContainerPackage.eINSTANCE.getImage_Pull();
    Object _eGet_8 = image.eGet(_image_Pull);
    boolean _notEquals_8 = (!Objects.equal(_eGet_8, null));
    if (_notEquals_8) {
    }
    EAttribute _image_Quiet = ContainerPackage.eINSTANCE.getImage_Quiet();
    Object _eGet_9 = image.eGet(_image_Quiet);
    boolean _notEquals_9 = (!Objects.equal(_eGet_9, null));
    if (_notEquals_9) {
    }
    EAttribute _image_Remove = ContainerPackage.eINSTANCE.getImage_Remove();
    Object _eGet_10 = image.eGet(_image_Remove);
    boolean _notEquals_10 = (!Objects.equal(_eGet_10, null));
    if (_notEquals_10) {
    }
    EReference _image_Buildargs = ContainerPackage.eINSTANCE.getImage_Buildargs();
    Object _eGet_11 = image.eGet(_image_Buildargs);
    boolean _notEquals_11 = (!Objects.equal(_eGet_11, null));
    if (_notEquals_11) {
    }
  }
  
  public void interpretAdd(final EList<Capability> list) {
  }
  
  public void interpretBinds(final EList<Bind> list) {
  }
  
  public void interpretCpusetCpus(final int cpusetCpus) {
  }
  
  public void interpret(final Container container) {
    _interpret(container);
    return;
  }
}
