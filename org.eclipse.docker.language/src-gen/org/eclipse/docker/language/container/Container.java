/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getBinds <em>Binds</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCapabilityAdd <em>Capability Add</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCapabilityDrop <em>Capability Drop</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getContainerIDFile <em>Container ID File</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCpuPeriod <em>Cpu Period</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCpusetCpus <em>Cpuset Cpus</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCpusetMems <em>Cpuset Mems</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCpuShares <em>Cpu Shares</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getDns <em>Dns</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getDnsSearch <em>Dns Search</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getEnv <em>Env</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getExposedPorts <em>Exposed Ports</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getExtraHosts <em>Extra Hosts</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getMemorySwap <em>Memory Swap</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#isDisableNetwork <em>Disable Network</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#isPrivileged <em>Privileged</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#isPublishAllPorts <em>Publish All Ports</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#isReadonlyRootfs <em>Readonly Rootfs</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getPidMode <em>Pid Mode</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getCgroupParent <em>Cgroup Parent</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getWorkingDir <em>Working Dir</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#isTty <em>Tty</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getVolumesFrom <em>Volumes From</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Container#getUlimits <em>Ulimits</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' reference.
   * @see #setImage(Image)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Image()
   * @model
   * @generated
   */
  Image getImage();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getImage <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' reference.
   * @see #getImage()
   * @generated
   */
  void setImage(Image value);

  /**
   * Returns the value of the '<em><b>Binds</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Bind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binds</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Binds()
   * @model containment="true"
   * @generated
   */
  EList<Bind> getBinds();

  /**
   * Returns the value of the '<em><b>Capability Add</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Capability}.
   * The literals are from the enumeration {@link org.eclipse.docker.language.container.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capability Add</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability Add</em>' attribute list.
   * @see org.eclipse.docker.language.container.Capability
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CapabilityAdd()
   * @model unique="false"
   * @generated
   */
  EList<Capability> getCapabilityAdd();

  /**
   * Returns the value of the '<em><b>Capability Drop</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Capability}.
   * The literals are from the enumeration {@link org.eclipse.docker.language.container.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capability Drop</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability Drop</em>' attribute list.
   * @see org.eclipse.docker.language.container.Capability
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CapabilityDrop()
   * @model unique="false"
   * @generated
   */
  EList<Capability> getCapabilityDrop();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Commands()
   * @model unique="false"
   * @generated
   */
  EList<String> getCommands();

  /**
   * Returns the value of the '<em><b>Container ID File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container ID File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container ID File</em>' attribute.
   * @see #setContainerIDFile(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_ContainerIDFile()
   * @model
   * @generated
   */
  String getContainerIDFile();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getContainerIDFile <em>Container ID File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container ID File</em>' attribute.
   * @see #getContainerIDFile()
   * @generated
   */
  void setContainerIDFile(String value);

  /**
   * Returns the value of the '<em><b>Cpu Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpu Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpu Period</em>' attribute.
   * @see #setCpuPeriod(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CpuPeriod()
   * @model
   * @generated
   */
  int getCpuPeriod();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getCpuPeriod <em>Cpu Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpu Period</em>' attribute.
   * @see #getCpuPeriod()
   * @generated
   */
  void setCpuPeriod(int value);

  /**
   * Returns the value of the '<em><b>Cpuset Cpus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpuset Cpus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpuset Cpus</em>' attribute.
   * @see #setCpusetCpus(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CpusetCpus()
   * @model
   * @generated
   */
  int getCpusetCpus();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getCpusetCpus <em>Cpuset Cpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpuset Cpus</em>' attribute.
   * @see #getCpusetCpus()
   * @generated
   */
  void setCpusetCpus(int value);

  /**
   * Returns the value of the '<em><b>Cpuset Mems</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpuset Mems</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpuset Mems</em>' attribute.
   * @see #setCpusetMems(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CpusetMems()
   * @model
   * @generated
   */
  String getCpusetMems();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getCpusetMems <em>Cpuset Mems</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpuset Mems</em>' attribute.
   * @see #getCpusetMems()
   * @generated
   */
  void setCpusetMems(String value);

  /**
   * Returns the value of the '<em><b>Cpu Shares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpu Shares</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpu Shares</em>' attribute.
   * @see #setCpuShares(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CpuShares()
   * @model
   * @generated
   */
  int getCpuShares();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getCpuShares <em>Cpu Shares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpu Shares</em>' attribute.
   * @see #getCpuShares()
   * @generated
   */
  void setCpuShares(int value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

  /**
   * Returns the value of the '<em><b>Dns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dns</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Dns()
   * @model unique="false"
   * @generated
   */
  EList<String> getDns();

  /**
   * Returns the value of the '<em><b>Dns Search</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dns Search</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dns Search</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_DnsSearch()
   * @model unique="false"
   * @generated
   */
  EList<String> getDnsSearch();

  /**
   * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Name</em>' attribute.
   * @see #setDomainName(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_DomainName()
   * @model
   * @generated
   */
  String getDomainName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getDomainName <em>Domain Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Name</em>' attribute.
   * @see #getDomainName()
   * @generated
   */
  void setDomainName(String value);

  /**
   * Returns the value of the '<em><b>Entrypoint</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entrypoint</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entrypoint</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Entrypoint()
   * @model unique="false"
   * @generated
   */
  EList<String> getEntrypoint();

  /**
   * Returns the value of the '<em><b>Env</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Env()
   * @model unique="false"
   * @generated
   */
  EList<String> getEnv();

  /**
   * Returns the value of the '<em><b>Exposed Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.ExposedPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposed Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exposed Ports</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_ExposedPorts()
   * @model containment="true"
   * @generated
   */
  EList<ExposedPort> getExposedPorts();

  /**
   * Returns the value of the '<em><b>Extra Hosts</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extra Hosts</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Hosts</em>' attribute list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_ExtraHosts()
   * @model unique="false"
   * @generated
   */
  EList<String> getExtraHosts();

  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Labels()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabels();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

  /**
   * Returns the value of the '<em><b>Mac Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mac Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mac Address</em>' attribute.
   * @see #setMacAddress(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_MacAddress()
   * @model
   * @generated
   */
  String getMacAddress();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getMacAddress <em>Mac Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mac Address</em>' attribute.
   * @see #getMacAddress()
   * @generated
   */
  void setMacAddress(String value);

  /**
   * Returns the value of the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memory</em>' attribute.
   * @see #setMemory(long)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Memory()
   * @model
   * @generated
   */
  long getMemory();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getMemory <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memory</em>' attribute.
   * @see #getMemory()
   * @generated
   */
  void setMemory(long value);

  /**
   * Returns the value of the '<em><b>Memory Swap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memory Swap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memory Swap</em>' attribute.
   * @see #setMemorySwap(long)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_MemorySwap()
   * @model
   * @generated
   */
  long getMemorySwap();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getMemorySwap <em>Memory Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memory Swap</em>' attribute.
   * @see #getMemorySwap()
   * @generated
   */
  void setMemorySwap(long value);

  /**
   * Returns the value of the '<em><b>Disable Network</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disable Network</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disable Network</em>' attribute.
   * @see #setDisableNetwork(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_DisableNetwork()
   * @model
   * @generated
   */
  boolean isDisableNetwork();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#isDisableNetwork <em>Disable Network</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disable Network</em>' attribute.
   * @see #isDisableNetwork()
   * @generated
   */
  void setDisableNetwork(boolean value);

  /**
   * Returns the value of the '<em><b>Network Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Network Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Network Mode</em>' attribute.
   * @see #setNetworkMode(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_NetworkMode()
   * @model
   * @generated
   */
  String getNetworkMode();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getNetworkMode <em>Network Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Network Mode</em>' attribute.
   * @see #getNetworkMode()
   * @generated
   */
  void setNetworkMode(String value);

  /**
   * Returns the value of the '<em><b>Port Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.PortBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Bindings</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_PortBindings()
   * @model containment="true"
   * @generated
   */
  EList<PortBinding> getPortBindings();

  /**
   * Returns the value of the '<em><b>Privileged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Privileged</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Privileged</em>' attribute.
   * @see #setPrivileged(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Privileged()
   * @model
   * @generated
   */
  boolean isPrivileged();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#isPrivileged <em>Privileged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Privileged</em>' attribute.
   * @see #isPrivileged()
   * @generated
   */
  void setPrivileged(boolean value);

  /**
   * Returns the value of the '<em><b>Publish All Ports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publish All Ports</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Publish All Ports</em>' attribute.
   * @see #setPublishAllPorts(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_PublishAllPorts()
   * @model
   * @generated
   */
  boolean isPublishAllPorts();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#isPublishAllPorts <em>Publish All Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Publish All Ports</em>' attribute.
   * @see #isPublishAllPorts()
   * @generated
   */
  void setPublishAllPorts(boolean value);

  /**
   * Returns the value of the '<em><b>Readonly Rootfs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readonly Rootfs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readonly Rootfs</em>' attribute.
   * @see #setReadonlyRootfs(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_ReadonlyRootfs()
   * @model
   * @generated
   */
  boolean isReadonlyRootfs();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#isReadonlyRootfs <em>Readonly Rootfs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readonly Rootfs</em>' attribute.
   * @see #isReadonlyRootfs()
   * @generated
   */
  void setReadonlyRootfs(boolean value);

  /**
   * Returns the value of the '<em><b>Pid Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pid Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pid Mode</em>' attribute.
   * @see #setPidMode(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_PidMode()
   * @model
   * @generated
   */
  String getPidMode();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getPidMode <em>Pid Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pid Mode</em>' attribute.
   * @see #getPidMode()
   * @generated
   */
  void setPidMode(String value);

  /**
   * Returns the value of the '<em><b>Cgroup Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cgroup Parent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cgroup Parent</em>' attribute.
   * @see #setCgroupParent(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_CgroupParent()
   * @model
   * @generated
   */
  String getCgroupParent();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getCgroupParent <em>Cgroup Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cgroup Parent</em>' attribute.
   * @see #getCgroupParent()
   * @generated
   */
  void setCgroupParent(String value);

  /**
   * Returns the value of the '<em><b>Working Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Working Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Working Dir</em>' attribute.
   * @see #setWorkingDir(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_WorkingDir()
   * @model
   * @generated
   */
  String getWorkingDir();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getWorkingDir <em>Working Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Working Dir</em>' attribute.
   * @see #getWorkingDir()
   * @generated
   */
  void setWorkingDir(String value);

  /**
   * Returns the value of the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' attribute.
   * @see #setUser(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_User()
   * @model
   * @generated
   */
  String getUser();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getUser <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' attribute.
   * @see #getUser()
   * @generated
   */
  void setUser(String value);

  /**
   * Returns the value of the '<em><b>Tty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tty</em>' attribute.
   * @see #setTty(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Tty()
   * @model
   * @generated
   */
  boolean isTty();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#isTty <em>Tty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tty</em>' attribute.
   * @see #isTty()
   * @generated
   */
  void setTty(boolean value);

  /**
   * Returns the value of the '<em><b>Restart Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restart Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restart Policy</em>' containment reference.
   * @see #setRestartPolicy(RestartPolicy)
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_RestartPolicy()
   * @model containment="true"
   * @generated
   */
  RestartPolicy getRestartPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Container#getRestartPolicy <em>Restart Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restart Policy</em>' containment reference.
   * @see #getRestartPolicy()
   * @generated
   */
  void setRestartPolicy(RestartPolicy value);

  /**
   * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Volume}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volumes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volumes</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Volumes()
   * @model containment="true"
   * @generated
   */
  EList<Volume> getVolumes();

  /**
   * Returns the value of the '<em><b>Volumes From</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.VolumesFrom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volumes From</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volumes From</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_VolumesFrom()
   * @model containment="true"
   * @generated
   */
  EList<VolumesFrom> getVolumesFrom();

  /**
   * Returns the value of the '<em><b>Ulimits</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Ulimit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ulimits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ulimits</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getContainer_Ulimits()
   * @model containment="true"
   * @generated
   */
  EList<Ulimit> getUlimits();

} // Container
