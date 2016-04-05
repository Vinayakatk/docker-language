/**
 */
package org.eclipse.docker.language.container.impl;

import java.util.Collection;

import org.eclipse.docker.language.container.Bind;
import org.eclipse.docker.language.container.Capability;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getBinds <em>Binds</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCapabilityAdd <em>Capability Add</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCapabilityDrop <em>Capability Drop</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getContainerIDFile <em>Container ID File</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCpuPeriod <em>Cpu Period</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCpusetCpus <em>Cpuset Cpus</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCpusetMems <em>Cpuset Mems</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCpuShares <em>Cpu Shares</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getDnsSearch <em>Dns Search</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getExposedPorts <em>Exposed Ports</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getExtraHosts <em>Extra Hosts</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getMemorySwap <em>Memory Swap</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#isDisableNetwork <em>Disable Network</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#isPrivileged <em>Privileged</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#isPublishAllPorts <em>Publish All Ports</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#isReadonlyRootfs <em>Readonly Rootfs</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getPidMode <em>Pid Mode</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getCgroupParent <em>Cgroup Parent</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getWorkingDir <em>Working Dir</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#isTty <em>Tty</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getVolumesFrom <em>Volumes From</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ContainerImpl#getUlimits <em>Ulimits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements org.eclipse.docker.language.container.Container
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected Image image;

  /**
   * The cached value of the '{@link #getBinds() <em>Binds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinds()
   * @generated
   * @ordered
   */
  protected EList<Bind> binds;

  /**
   * The cached value of the '{@link #getCapabilityAdd() <em>Capability Add</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilityAdd()
   * @generated
   * @ordered
   */
  protected EList<Capability> capabilityAdd;

  /**
   * The cached value of the '{@link #getCapabilityDrop() <em>Capability Drop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilityDrop()
   * @generated
   * @ordered
   */
  protected EList<Capability> capabilityDrop;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<String> commands;

  /**
   * The default value of the '{@link #getContainerIDFile() <em>Container ID File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerIDFile()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_ID_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerIDFile() <em>Container ID File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerIDFile()
   * @generated
   * @ordered
   */
  protected String containerIDFile = CONTAINER_ID_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getCpuPeriod() <em>Cpu Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpuPeriod()
   * @generated
   * @ordered
   */
  protected static final int CPU_PERIOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCpuPeriod() <em>Cpu Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpuPeriod()
   * @generated
   * @ordered
   */
  protected int cpuPeriod = CPU_PERIOD_EDEFAULT;

  /**
   * The default value of the '{@link #getCpusetCpus() <em>Cpuset Cpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetCpus()
   * @generated
   * @ordered
   */
  protected static final int CPUSET_CPUS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCpusetCpus() <em>Cpuset Cpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetCpus()
   * @generated
   * @ordered
   */
  protected int cpusetCpus = CPUSET_CPUS_EDEFAULT;

  /**
   * The default value of the '{@link #getCpusetMems() <em>Cpuset Mems</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetMems()
   * @generated
   * @ordered
   */
  protected static final String CPUSET_MEMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCpusetMems() <em>Cpuset Mems</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetMems()
   * @generated
   * @ordered
   */
  protected String cpusetMems = CPUSET_MEMS_EDEFAULT;

  /**
   * The default value of the '{@link #getCpuShares() <em>Cpu Shares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpuShares()
   * @generated
   * @ordered
   */
  protected static final int CPU_SHARES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCpuShares() <em>Cpu Shares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpuShares()
   * @generated
   * @ordered
   */
  protected int cpuShares = CPU_SHARES_EDEFAULT;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * The cached value of the '{@link #getDns() <em>Dns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDns()
   * @generated
   * @ordered
   */
  protected EList<String> dns;

  /**
   * The cached value of the '{@link #getDnsSearch() <em>Dns Search</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDnsSearch()
   * @generated
   * @ordered
   */
  protected EList<String> dnsSearch;

  /**
   * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainName()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainName()
   * @generated
   * @ordered
   */
  protected String domainName = DOMAIN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntrypoint()
   * @generated
   * @ordered
   */
  protected EList<String> entrypoint;

  /**
   * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnv()
   * @generated
   * @ordered
   */
  protected EList<String> env;

  /**
   * The cached value of the '{@link #getExposedPorts() <em>Exposed Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposedPorts()
   * @generated
   * @ordered
   */
  protected EList<ExposedPort> exposedPorts;

  /**
   * The cached value of the '{@link #getExtraHosts() <em>Extra Hosts</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraHosts()
   * @generated
   * @ordered
   */
  protected EList<String> extraHosts;

  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected EList<Label> labels;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<Link> links;

  /**
   * The default value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacAddress()
   * @generated
   * @ordered
   */
  protected static final String MAC_ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacAddress()
   * @generated
   * @ordered
   */
  protected String macAddress = MAC_ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected static final long MEMORY_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected long memory = MEMORY_EDEFAULT;

  /**
   * The default value of the '{@link #getMemorySwap() <em>Memory Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemorySwap()
   * @generated
   * @ordered
   */
  protected static final long MEMORY_SWAP_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getMemorySwap() <em>Memory Swap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemorySwap()
   * @generated
   * @ordered
   */
  protected long memorySwap = MEMORY_SWAP_EDEFAULT;

  /**
   * The default value of the '{@link #isDisableNetwork() <em>Disable Network</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisableNetwork()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLE_NETWORK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisableNetwork() <em>Disable Network</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisableNetwork()
   * @generated
   * @ordered
   */
  protected boolean disableNetwork = DISABLE_NETWORK_EDEFAULT;

  /**
   * The default value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkMode()
   * @generated
   * @ordered
   */
  protected static final String NETWORK_MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkMode()
   * @generated
   * @ordered
   */
  protected String networkMode = NETWORK_MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPortBindings() <em>Port Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortBindings()
   * @generated
   * @ordered
   */
  protected EList<PortBinding> portBindings;

  /**
   * The default value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivileged()
   * @generated
   * @ordered
   */
  protected static final boolean PRIVILEGED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrivileged()
   * @generated
   * @ordered
   */
  protected boolean privileged = PRIVILEGED_EDEFAULT;

  /**
   * The default value of the '{@link #isPublishAllPorts() <em>Publish All Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPublishAllPorts()
   * @generated
   * @ordered
   */
  protected static final boolean PUBLISH_ALL_PORTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPublishAllPorts() <em>Publish All Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPublishAllPorts()
   * @generated
   * @ordered
   */
  protected boolean publishAllPorts = PUBLISH_ALL_PORTS_EDEFAULT;

  /**
   * The default value of the '{@link #isReadonlyRootfs() <em>Readonly Rootfs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonlyRootfs()
   * @generated
   * @ordered
   */
  protected static final boolean READONLY_ROOTFS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadonlyRootfs() <em>Readonly Rootfs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonlyRootfs()
   * @generated
   * @ordered
   */
  protected boolean readonlyRootfs = READONLY_ROOTFS_EDEFAULT;

  /**
   * The default value of the '{@link #getPidMode() <em>Pid Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPidMode()
   * @generated
   * @ordered
   */
  protected static final String PID_MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPidMode() <em>Pid Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPidMode()
   * @generated
   * @ordered
   */
  protected String pidMode = PID_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #getCgroupParent() <em>Cgroup Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCgroupParent()
   * @generated
   * @ordered
   */
  protected static final String CGROUP_PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCgroupParent() <em>Cgroup Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCgroupParent()
   * @generated
   * @ordered
   */
  protected String cgroupParent = CGROUP_PARENT_EDEFAULT;

  /**
   * The default value of the '{@link #getWorkingDir() <em>Working Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkingDir()
   * @generated
   * @ordered
   */
  protected static final String WORKING_DIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWorkingDir() <em>Working Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkingDir()
   * @generated
   * @ordered
   */
  protected String workingDir = WORKING_DIR_EDEFAULT;

  /**
   * The default value of the '{@link #getUser() <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected static final String USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected String user = USER_EDEFAULT;

  /**
   * The default value of the '{@link #isTty() <em>Tty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTty()
   * @generated
   * @ordered
   */
  protected static final boolean TTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTty() <em>Tty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTty()
   * @generated
   * @ordered
   */
  protected boolean tty = TTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestartPolicy()
   * @generated
   * @ordered
   */
  protected RestartPolicy restartPolicy;

  /**
   * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolumes()
   * @generated
   * @ordered
   */
  protected EList<Volume> volumes;

  /**
   * The cached value of the '{@link #getVolumesFrom() <em>Volumes From</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolumesFrom()
   * @generated
   * @ordered
   */
  protected EList<VolumesFrom> volumesFrom;

  /**
   * The cached value of the '{@link #getUlimits() <em>Ulimits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUlimits()
   * @generated
   * @ordered
   */
  protected EList<Ulimit> ulimits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ContainerPackage.Literals.CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image getImage()
  {
    if (image != null && image.eIsProxy())
    {
      InternalEObject oldImage = (InternalEObject)image;
      image = (Image)eResolveProxy(oldImage);
      if (image != oldImage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerPackage.CONTAINER__IMAGE, oldImage, image));
      }
    }
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image basicGetImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(Image newImage)
  {
    Image oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Bind> getBinds()
  {
    if (binds == null)
    {
      binds = new EObjectContainmentEList<Bind>(Bind.class, this, ContainerPackage.CONTAINER__BINDS);
    }
    return binds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getCapabilityAdd()
  {
    if (capabilityAdd == null)
    {
      capabilityAdd = new EDataTypeEList<Capability>(Capability.class, this, ContainerPackage.CONTAINER__CAPABILITY_ADD);
    }
    return capabilityAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getCapabilityDrop()
  {
    if (capabilityDrop == null)
    {
      capabilityDrop = new EDataTypeEList<Capability>(Capability.class, this, ContainerPackage.CONTAINER__CAPABILITY_DROP);
    }
    return capabilityDrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCommands()
  {
    if (commands == null)
    {
      commands = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerIDFile()
  {
    return containerIDFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerIDFile(String newContainerIDFile)
  {
    String oldContainerIDFile = containerIDFile;
    containerIDFile = newContainerIDFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CONTAINER_ID_FILE, oldContainerIDFile, containerIDFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCpuPeriod()
  {
    return cpuPeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpuPeriod(int newCpuPeriod)
  {
    int oldCpuPeriod = cpuPeriod;
    cpuPeriod = newCpuPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CPU_PERIOD, oldCpuPeriod, cpuPeriod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCpusetCpus()
  {
    return cpusetCpus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpusetCpus(int newCpusetCpus)
  {
    int oldCpusetCpus = cpusetCpus;
    cpusetCpus = newCpusetCpus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CPUSET_CPUS, oldCpusetCpus, cpusetCpus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCpusetMems()
  {
    return cpusetMems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpusetMems(String newCpusetMems)
  {
    String oldCpusetMems = cpusetMems;
    cpusetMems = newCpusetMems;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CPUSET_MEMS, oldCpusetMems, cpusetMems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCpuShares()
  {
    return cpuShares;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpuShares(int newCpuShares)
  {
    int oldCpuShares = cpuShares;
    cpuShares = newCpuShares;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CPU_SHARES, oldCpuShares, cpuShares));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Device>(Device.class, this, ContainerPackage.CONTAINER__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDns()
  {
    if (dns == null)
    {
      dns = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__DNS);
    }
    return dns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDnsSearch()
  {
    if (dnsSearch == null)
    {
      dnsSearch = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__DNS_SEARCH);
    }
    return dnsSearch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomainName()
  {
    return domainName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainName(String newDomainName)
  {
    String oldDomainName = domainName;
    domainName = newDomainName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__DOMAIN_NAME, oldDomainName, domainName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEntrypoint()
  {
    if (entrypoint == null)
    {
      entrypoint = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__ENTRYPOINT);
    }
    return entrypoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEnv()
  {
    if (env == null)
    {
      env = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__ENV);
    }
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExposedPort> getExposedPorts()
  {
    if (exposedPorts == null)
    {
      exposedPorts = new EObjectContainmentEList<ExposedPort>(ExposedPort.class, this, ContainerPackage.CONTAINER__EXPOSED_PORTS);
    }
    return exposedPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExtraHosts()
  {
    if (extraHosts == null)
    {
      extraHosts = new EDataTypeEList<String>(String.class, this, ContainerPackage.CONTAINER__EXTRA_HOSTS);
    }
    return extraHosts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLabels()
  {
    if (labels == null)
    {
      labels = new EObjectContainmentEList<Label>(Label.class, this, ContainerPackage.CONTAINER__LABELS);
    }
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Link> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<Link>(Link.class, this, ContainerPackage.CONTAINER__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMacAddress()
  {
    return macAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMacAddress(String newMacAddress)
  {
    String oldMacAddress = macAddress;
    macAddress = newMacAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__MAC_ADDRESS, oldMacAddress, macAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getMemory()
  {
    return memory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemory(long newMemory)
  {
    long oldMemory = memory;
    memory = newMemory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__MEMORY, oldMemory, memory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getMemorySwap()
  {
    return memorySwap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemorySwap(long newMemorySwap)
  {
    long oldMemorySwap = memorySwap;
    memorySwap = newMemorySwap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__MEMORY_SWAP, oldMemorySwap, memorySwap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisableNetwork()
  {
    return disableNetwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisableNetwork(boolean newDisableNetwork)
  {
    boolean oldDisableNetwork = disableNetwork;
    disableNetwork = newDisableNetwork;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__DISABLE_NETWORK, oldDisableNetwork, disableNetwork));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNetworkMode()
  {
    return networkMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNetworkMode(String newNetworkMode)
  {
    String oldNetworkMode = networkMode;
    networkMode = newNetworkMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__NETWORK_MODE, oldNetworkMode, networkMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PortBinding> getPortBindings()
  {
    if (portBindings == null)
    {
      portBindings = new EObjectContainmentEList<PortBinding>(PortBinding.class, this, ContainerPackage.CONTAINER__PORT_BINDINGS);
    }
    return portBindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrivileged()
  {
    return privileged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivileged(boolean newPrivileged)
  {
    boolean oldPrivileged = privileged;
    privileged = newPrivileged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__PRIVILEGED, oldPrivileged, privileged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPublishAllPorts()
  {
    return publishAllPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublishAllPorts(boolean newPublishAllPorts)
  {
    boolean oldPublishAllPorts = publishAllPorts;
    publishAllPorts = newPublishAllPorts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS, oldPublishAllPorts, publishAllPorts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadonlyRootfs()
  {
    return readonlyRootfs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadonlyRootfs(boolean newReadonlyRootfs)
  {
    boolean oldReadonlyRootfs = readonlyRootfs;
    readonlyRootfs = newReadonlyRootfs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__READONLY_ROOTFS, oldReadonlyRootfs, readonlyRootfs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPidMode()
  {
    return pidMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPidMode(String newPidMode)
  {
    String oldPidMode = pidMode;
    pidMode = newPidMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__PID_MODE, oldPidMode, pidMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCgroupParent()
  {
    return cgroupParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCgroupParent(String newCgroupParent)
  {
    String oldCgroupParent = cgroupParent;
    cgroupParent = newCgroupParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__CGROUP_PARENT, oldCgroupParent, cgroupParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWorkingDir()
  {
    return workingDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkingDir(String newWorkingDir)
  {
    String oldWorkingDir = workingDir;
    workingDir = newWorkingDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__WORKING_DIR, oldWorkingDir, workingDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(String newUser)
  {
    String oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__USER, oldUser, user));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTty()
  {
    return tty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTty(boolean newTty)
  {
    boolean oldTty = tty;
    tty = newTty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__TTY, oldTty, tty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestartPolicy getRestartPolicy()
  {
    return restartPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestartPolicy(RestartPolicy newRestartPolicy, NotificationChain msgs)
  {
    RestartPolicy oldRestartPolicy = restartPolicy;
    restartPolicy = newRestartPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__RESTART_POLICY, oldRestartPolicy, newRestartPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestartPolicy(RestartPolicy newRestartPolicy)
  {
    if (newRestartPolicy != restartPolicy)
    {
      NotificationChain msgs = null;
      if (restartPolicy != null)
        msgs = ((InternalEObject)restartPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.CONTAINER__RESTART_POLICY, null, msgs);
      if (newRestartPolicy != null)
        msgs = ((InternalEObject)newRestartPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.CONTAINER__RESTART_POLICY, null, msgs);
      msgs = basicSetRestartPolicy(newRestartPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.CONTAINER__RESTART_POLICY, newRestartPolicy, newRestartPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Volume> getVolumes()
  {
    if (volumes == null)
    {
      volumes = new EObjectContainmentEList<Volume>(Volume.class, this, ContainerPackage.CONTAINER__VOLUMES);
    }
    return volumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VolumesFrom> getVolumesFrom()
  {
    if (volumesFrom == null)
    {
      volumesFrom = new EObjectContainmentEList<VolumesFrom>(VolumesFrom.class, this, ContainerPackage.CONTAINER__VOLUMES_FROM);
    }
    return volumesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ulimit> getUlimits()
  {
    if (ulimits == null)
    {
      ulimits = new EObjectContainmentEList<Ulimit>(Ulimit.class, this, ContainerPackage.CONTAINER__ULIMITS);
    }
    return ulimits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ContainerPackage.CONTAINER__BINDS:
        return ((InternalEList<?>)getBinds()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__EXPOSED_PORTS:
        return ((InternalEList<?>)getExposedPorts()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__LABELS:
        return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__PORT_BINDINGS:
        return ((InternalEList<?>)getPortBindings()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__RESTART_POLICY:
        return basicSetRestartPolicy(null, msgs);
      case ContainerPackage.CONTAINER__VOLUMES:
        return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__VOLUMES_FROM:
        return ((InternalEList<?>)getVolumesFrom()).basicRemove(otherEnd, msgs);
      case ContainerPackage.CONTAINER__ULIMITS:
        return ((InternalEList<?>)getUlimits()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ContainerPackage.CONTAINER__NAME:
        return getName();
      case ContainerPackage.CONTAINER__IMAGE:
        if (resolve) return getImage();
        return basicGetImage();
      case ContainerPackage.CONTAINER__BINDS:
        return getBinds();
      case ContainerPackage.CONTAINER__CAPABILITY_ADD:
        return getCapabilityAdd();
      case ContainerPackage.CONTAINER__CAPABILITY_DROP:
        return getCapabilityDrop();
      case ContainerPackage.CONTAINER__COMMANDS:
        return getCommands();
      case ContainerPackage.CONTAINER__CONTAINER_ID_FILE:
        return getContainerIDFile();
      case ContainerPackage.CONTAINER__CPU_PERIOD:
        return getCpuPeriod();
      case ContainerPackage.CONTAINER__CPUSET_CPUS:
        return getCpusetCpus();
      case ContainerPackage.CONTAINER__CPUSET_MEMS:
        return getCpusetMems();
      case ContainerPackage.CONTAINER__CPU_SHARES:
        return getCpuShares();
      case ContainerPackage.CONTAINER__DEVICES:
        return getDevices();
      case ContainerPackage.CONTAINER__DNS:
        return getDns();
      case ContainerPackage.CONTAINER__DNS_SEARCH:
        return getDnsSearch();
      case ContainerPackage.CONTAINER__DOMAIN_NAME:
        return getDomainName();
      case ContainerPackage.CONTAINER__ENTRYPOINT:
        return getEntrypoint();
      case ContainerPackage.CONTAINER__ENV:
        return getEnv();
      case ContainerPackage.CONTAINER__EXPOSED_PORTS:
        return getExposedPorts();
      case ContainerPackage.CONTAINER__EXTRA_HOSTS:
        return getExtraHosts();
      case ContainerPackage.CONTAINER__LABELS:
        return getLabels();
      case ContainerPackage.CONTAINER__LINKS:
        return getLinks();
      case ContainerPackage.CONTAINER__MAC_ADDRESS:
        return getMacAddress();
      case ContainerPackage.CONTAINER__MEMORY:
        return getMemory();
      case ContainerPackage.CONTAINER__MEMORY_SWAP:
        return getMemorySwap();
      case ContainerPackage.CONTAINER__DISABLE_NETWORK:
        return isDisableNetwork();
      case ContainerPackage.CONTAINER__NETWORK_MODE:
        return getNetworkMode();
      case ContainerPackage.CONTAINER__PORT_BINDINGS:
        return getPortBindings();
      case ContainerPackage.CONTAINER__PRIVILEGED:
        return isPrivileged();
      case ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS:
        return isPublishAllPorts();
      case ContainerPackage.CONTAINER__READONLY_ROOTFS:
        return isReadonlyRootfs();
      case ContainerPackage.CONTAINER__PID_MODE:
        return getPidMode();
      case ContainerPackage.CONTAINER__CGROUP_PARENT:
        return getCgroupParent();
      case ContainerPackage.CONTAINER__WORKING_DIR:
        return getWorkingDir();
      case ContainerPackage.CONTAINER__USER:
        return getUser();
      case ContainerPackage.CONTAINER__TTY:
        return isTty();
      case ContainerPackage.CONTAINER__RESTART_POLICY:
        return getRestartPolicy();
      case ContainerPackage.CONTAINER__VOLUMES:
        return getVolumes();
      case ContainerPackage.CONTAINER__VOLUMES_FROM:
        return getVolumesFrom();
      case ContainerPackage.CONTAINER__ULIMITS:
        return getUlimits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContainerPackage.CONTAINER__NAME:
        setName((String)newValue);
        return;
      case ContainerPackage.CONTAINER__IMAGE:
        setImage((Image)newValue);
        return;
      case ContainerPackage.CONTAINER__BINDS:
        getBinds().clear();
        getBinds().addAll((Collection<? extends Bind>)newValue);
        return;
      case ContainerPackage.CONTAINER__CAPABILITY_ADD:
        getCapabilityAdd().clear();
        getCapabilityAdd().addAll((Collection<? extends Capability>)newValue);
        return;
      case ContainerPackage.CONTAINER__CAPABILITY_DROP:
        getCapabilityDrop().clear();
        getCapabilityDrop().addAll((Collection<? extends Capability>)newValue);
        return;
      case ContainerPackage.CONTAINER__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__CONTAINER_ID_FILE:
        setContainerIDFile((String)newValue);
        return;
      case ContainerPackage.CONTAINER__CPU_PERIOD:
        setCpuPeriod((Integer)newValue);
        return;
      case ContainerPackage.CONTAINER__CPUSET_CPUS:
        setCpusetCpus((Integer)newValue);
        return;
      case ContainerPackage.CONTAINER__CPUSET_MEMS:
        setCpusetMems((String)newValue);
        return;
      case ContainerPackage.CONTAINER__CPU_SHARES:
        setCpuShares((Integer)newValue);
        return;
      case ContainerPackage.CONTAINER__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
      case ContainerPackage.CONTAINER__DNS:
        getDns().clear();
        getDns().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__DNS_SEARCH:
        getDnsSearch().clear();
        getDnsSearch().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__DOMAIN_NAME:
        setDomainName((String)newValue);
        return;
      case ContainerPackage.CONTAINER__ENTRYPOINT:
        getEntrypoint().clear();
        getEntrypoint().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__ENV:
        getEnv().clear();
        getEnv().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__EXPOSED_PORTS:
        getExposedPorts().clear();
        getExposedPorts().addAll((Collection<? extends ExposedPort>)newValue);
        return;
      case ContainerPackage.CONTAINER__EXTRA_HOSTS:
        getExtraHosts().clear();
        getExtraHosts().addAll((Collection<? extends String>)newValue);
        return;
      case ContainerPackage.CONTAINER__LABELS:
        getLabels().clear();
        getLabels().addAll((Collection<? extends Label>)newValue);
        return;
      case ContainerPackage.CONTAINER__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends Link>)newValue);
        return;
      case ContainerPackage.CONTAINER__MAC_ADDRESS:
        setMacAddress((String)newValue);
        return;
      case ContainerPackage.CONTAINER__MEMORY:
        setMemory((Long)newValue);
        return;
      case ContainerPackage.CONTAINER__MEMORY_SWAP:
        setMemorySwap((Long)newValue);
        return;
      case ContainerPackage.CONTAINER__DISABLE_NETWORK:
        setDisableNetwork((Boolean)newValue);
        return;
      case ContainerPackage.CONTAINER__NETWORK_MODE:
        setNetworkMode((String)newValue);
        return;
      case ContainerPackage.CONTAINER__PORT_BINDINGS:
        getPortBindings().clear();
        getPortBindings().addAll((Collection<? extends PortBinding>)newValue);
        return;
      case ContainerPackage.CONTAINER__PRIVILEGED:
        setPrivileged((Boolean)newValue);
        return;
      case ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS:
        setPublishAllPorts((Boolean)newValue);
        return;
      case ContainerPackage.CONTAINER__READONLY_ROOTFS:
        setReadonlyRootfs((Boolean)newValue);
        return;
      case ContainerPackage.CONTAINER__PID_MODE:
        setPidMode((String)newValue);
        return;
      case ContainerPackage.CONTAINER__CGROUP_PARENT:
        setCgroupParent((String)newValue);
        return;
      case ContainerPackage.CONTAINER__WORKING_DIR:
        setWorkingDir((String)newValue);
        return;
      case ContainerPackage.CONTAINER__USER:
        setUser((String)newValue);
        return;
      case ContainerPackage.CONTAINER__TTY:
        setTty((Boolean)newValue);
        return;
      case ContainerPackage.CONTAINER__RESTART_POLICY:
        setRestartPolicy((RestartPolicy)newValue);
        return;
      case ContainerPackage.CONTAINER__VOLUMES:
        getVolumes().clear();
        getVolumes().addAll((Collection<? extends Volume>)newValue);
        return;
      case ContainerPackage.CONTAINER__VOLUMES_FROM:
        getVolumesFrom().clear();
        getVolumesFrom().addAll((Collection<? extends VolumesFrom>)newValue);
        return;
      case ContainerPackage.CONTAINER__ULIMITS:
        getUlimits().clear();
        getUlimits().addAll((Collection<? extends Ulimit>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ContainerPackage.CONTAINER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__IMAGE:
        setImage((Image)null);
        return;
      case ContainerPackage.CONTAINER__BINDS:
        getBinds().clear();
        return;
      case ContainerPackage.CONTAINER__CAPABILITY_ADD:
        getCapabilityAdd().clear();
        return;
      case ContainerPackage.CONTAINER__CAPABILITY_DROP:
        getCapabilityDrop().clear();
        return;
      case ContainerPackage.CONTAINER__COMMANDS:
        getCommands().clear();
        return;
      case ContainerPackage.CONTAINER__CONTAINER_ID_FILE:
        setContainerIDFile(CONTAINER_ID_FILE_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__CPU_PERIOD:
        setCpuPeriod(CPU_PERIOD_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__CPUSET_CPUS:
        setCpusetCpus(CPUSET_CPUS_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__CPUSET_MEMS:
        setCpusetMems(CPUSET_MEMS_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__CPU_SHARES:
        setCpuShares(CPU_SHARES_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__DEVICES:
        getDevices().clear();
        return;
      case ContainerPackage.CONTAINER__DNS:
        getDns().clear();
        return;
      case ContainerPackage.CONTAINER__DNS_SEARCH:
        getDnsSearch().clear();
        return;
      case ContainerPackage.CONTAINER__DOMAIN_NAME:
        setDomainName(DOMAIN_NAME_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__ENTRYPOINT:
        getEntrypoint().clear();
        return;
      case ContainerPackage.CONTAINER__ENV:
        getEnv().clear();
        return;
      case ContainerPackage.CONTAINER__EXPOSED_PORTS:
        getExposedPorts().clear();
        return;
      case ContainerPackage.CONTAINER__EXTRA_HOSTS:
        getExtraHosts().clear();
        return;
      case ContainerPackage.CONTAINER__LABELS:
        getLabels().clear();
        return;
      case ContainerPackage.CONTAINER__LINKS:
        getLinks().clear();
        return;
      case ContainerPackage.CONTAINER__MAC_ADDRESS:
        setMacAddress(MAC_ADDRESS_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__MEMORY:
        setMemory(MEMORY_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__MEMORY_SWAP:
        setMemorySwap(MEMORY_SWAP_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__DISABLE_NETWORK:
        setDisableNetwork(DISABLE_NETWORK_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__NETWORK_MODE:
        setNetworkMode(NETWORK_MODE_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__PORT_BINDINGS:
        getPortBindings().clear();
        return;
      case ContainerPackage.CONTAINER__PRIVILEGED:
        setPrivileged(PRIVILEGED_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS:
        setPublishAllPorts(PUBLISH_ALL_PORTS_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__READONLY_ROOTFS:
        setReadonlyRootfs(READONLY_ROOTFS_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__PID_MODE:
        setPidMode(PID_MODE_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__CGROUP_PARENT:
        setCgroupParent(CGROUP_PARENT_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__WORKING_DIR:
        setWorkingDir(WORKING_DIR_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__USER:
        setUser(USER_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__TTY:
        setTty(TTY_EDEFAULT);
        return;
      case ContainerPackage.CONTAINER__RESTART_POLICY:
        setRestartPolicy((RestartPolicy)null);
        return;
      case ContainerPackage.CONTAINER__VOLUMES:
        getVolumes().clear();
        return;
      case ContainerPackage.CONTAINER__VOLUMES_FROM:
        getVolumesFrom().clear();
        return;
      case ContainerPackage.CONTAINER__ULIMITS:
        getUlimits().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ContainerPackage.CONTAINER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ContainerPackage.CONTAINER__IMAGE:
        return image != null;
      case ContainerPackage.CONTAINER__BINDS:
        return binds != null && !binds.isEmpty();
      case ContainerPackage.CONTAINER__CAPABILITY_ADD:
        return capabilityAdd != null && !capabilityAdd.isEmpty();
      case ContainerPackage.CONTAINER__CAPABILITY_DROP:
        return capabilityDrop != null && !capabilityDrop.isEmpty();
      case ContainerPackage.CONTAINER__COMMANDS:
        return commands != null && !commands.isEmpty();
      case ContainerPackage.CONTAINER__CONTAINER_ID_FILE:
        return CONTAINER_ID_FILE_EDEFAULT == null ? containerIDFile != null : !CONTAINER_ID_FILE_EDEFAULT.equals(containerIDFile);
      case ContainerPackage.CONTAINER__CPU_PERIOD:
        return cpuPeriod != CPU_PERIOD_EDEFAULT;
      case ContainerPackage.CONTAINER__CPUSET_CPUS:
        return cpusetCpus != CPUSET_CPUS_EDEFAULT;
      case ContainerPackage.CONTAINER__CPUSET_MEMS:
        return CPUSET_MEMS_EDEFAULT == null ? cpusetMems != null : !CPUSET_MEMS_EDEFAULT.equals(cpusetMems);
      case ContainerPackage.CONTAINER__CPU_SHARES:
        return cpuShares != CPU_SHARES_EDEFAULT;
      case ContainerPackage.CONTAINER__DEVICES:
        return devices != null && !devices.isEmpty();
      case ContainerPackage.CONTAINER__DNS:
        return dns != null && !dns.isEmpty();
      case ContainerPackage.CONTAINER__DNS_SEARCH:
        return dnsSearch != null && !dnsSearch.isEmpty();
      case ContainerPackage.CONTAINER__DOMAIN_NAME:
        return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
      case ContainerPackage.CONTAINER__ENTRYPOINT:
        return entrypoint != null && !entrypoint.isEmpty();
      case ContainerPackage.CONTAINER__ENV:
        return env != null && !env.isEmpty();
      case ContainerPackage.CONTAINER__EXPOSED_PORTS:
        return exposedPorts != null && !exposedPorts.isEmpty();
      case ContainerPackage.CONTAINER__EXTRA_HOSTS:
        return extraHosts != null && !extraHosts.isEmpty();
      case ContainerPackage.CONTAINER__LABELS:
        return labels != null && !labels.isEmpty();
      case ContainerPackage.CONTAINER__LINKS:
        return links != null && !links.isEmpty();
      case ContainerPackage.CONTAINER__MAC_ADDRESS:
        return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
      case ContainerPackage.CONTAINER__MEMORY:
        return memory != MEMORY_EDEFAULT;
      case ContainerPackage.CONTAINER__MEMORY_SWAP:
        return memorySwap != MEMORY_SWAP_EDEFAULT;
      case ContainerPackage.CONTAINER__DISABLE_NETWORK:
        return disableNetwork != DISABLE_NETWORK_EDEFAULT;
      case ContainerPackage.CONTAINER__NETWORK_MODE:
        return NETWORK_MODE_EDEFAULT == null ? networkMode != null : !NETWORK_MODE_EDEFAULT.equals(networkMode);
      case ContainerPackage.CONTAINER__PORT_BINDINGS:
        return portBindings != null && !portBindings.isEmpty();
      case ContainerPackage.CONTAINER__PRIVILEGED:
        return privileged != PRIVILEGED_EDEFAULT;
      case ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS:
        return publishAllPorts != PUBLISH_ALL_PORTS_EDEFAULT;
      case ContainerPackage.CONTAINER__READONLY_ROOTFS:
        return readonlyRootfs != READONLY_ROOTFS_EDEFAULT;
      case ContainerPackage.CONTAINER__PID_MODE:
        return PID_MODE_EDEFAULT == null ? pidMode != null : !PID_MODE_EDEFAULT.equals(pidMode);
      case ContainerPackage.CONTAINER__CGROUP_PARENT:
        return CGROUP_PARENT_EDEFAULT == null ? cgroupParent != null : !CGROUP_PARENT_EDEFAULT.equals(cgroupParent);
      case ContainerPackage.CONTAINER__WORKING_DIR:
        return WORKING_DIR_EDEFAULT == null ? workingDir != null : !WORKING_DIR_EDEFAULT.equals(workingDir);
      case ContainerPackage.CONTAINER__USER:
        return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
      case ContainerPackage.CONTAINER__TTY:
        return tty != TTY_EDEFAULT;
      case ContainerPackage.CONTAINER__RESTART_POLICY:
        return restartPolicy != null;
      case ContainerPackage.CONTAINER__VOLUMES:
        return volumes != null && !volumes.isEmpty();
      case ContainerPackage.CONTAINER__VOLUMES_FROM:
        return volumesFrom != null && !volumesFrom.isEmpty();
      case ContainerPackage.CONTAINER__ULIMITS:
        return ulimits != null && !ulimits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", capabilityAdd: ");
    result.append(capabilityAdd);
    result.append(", capabilityDrop: ");
    result.append(capabilityDrop);
    result.append(", commands: ");
    result.append(commands);
    result.append(", containerIDFile: ");
    result.append(containerIDFile);
    result.append(", cpuPeriod: ");
    result.append(cpuPeriod);
    result.append(", cpusetCpus: ");
    result.append(cpusetCpus);
    result.append(", cpusetMems: ");
    result.append(cpusetMems);
    result.append(", cpuShares: ");
    result.append(cpuShares);
    result.append(", dns: ");
    result.append(dns);
    result.append(", dnsSearch: ");
    result.append(dnsSearch);
    result.append(", domainName: ");
    result.append(domainName);
    result.append(", entrypoint: ");
    result.append(entrypoint);
    result.append(", env: ");
    result.append(env);
    result.append(", extraHosts: ");
    result.append(extraHosts);
    result.append(", macAddress: ");
    result.append(macAddress);
    result.append(", memory: ");
    result.append(memory);
    result.append(", memorySwap: ");
    result.append(memorySwap);
    result.append(", disableNetwork: ");
    result.append(disableNetwork);
    result.append(", networkMode: ");
    result.append(networkMode);
    result.append(", privileged: ");
    result.append(privileged);
    result.append(", publishAllPorts: ");
    result.append(publishAllPorts);
    result.append(", readonlyRootfs: ");
    result.append(readonlyRootfs);
    result.append(", pidMode: ");
    result.append(pidMode);
    result.append(", cgroupParent: ");
    result.append(cgroupParent);
    result.append(", workingDir: ");
    result.append(workingDir);
    result.append(", user: ");
    result.append(user);
    result.append(", tty: ");
    result.append(tty);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl
