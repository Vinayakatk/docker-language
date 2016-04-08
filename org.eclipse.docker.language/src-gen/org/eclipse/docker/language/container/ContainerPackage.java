/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.docker.language.container.ContainerFactory
 * @model kind="package"
 * @generated
 */
public interface ContainerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "container";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/docker/language/Container";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "container";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContainerPackage eINSTANCE = org.eclipse.docker.language.container.impl.ContainerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.DockerImpl <em>Docker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.DockerImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getDocker()
   * @generated
   */
  int DOCKER = 0;

  /**
   * The feature id for the '<em><b>Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCKER__CONTAINERS = 0;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCKER__IMAGES = 1;

  /**
   * The number of structural features of the '<em>Docker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCKER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.ImageImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__TAG = 1;

  /**
   * The feature id for the '<em><b>Docker Filelocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__DOCKER_FILELOCATION = 2;

  /**
   * The feature id for the '<em><b>Buildargs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__BUILDARGS = 3;

  /**
   * The feature id for the '<em><b>No Cache</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__NO_CACHE = 4;

  /**
   * The feature id for the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__MEMORY = 5;

  /**
   * The feature id for the '<em><b>Memswap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__MEMSWAP = 6;

  /**
   * The feature id for the '<em><b>Cpusetcpus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CPUSETCPUS = 7;

  /**
   * The feature id for the '<em><b>Cpushares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CPUSHARES = 8;

  /**
   * The feature id for the '<em><b>Remove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__REMOVE = 9;

  /**
   * The feature id for the '<em><b>Quiet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__QUIET = 10;

  /**
   * The feature id for the '<em><b>Pull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__PULL = 11;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.BuildArgsImpl <em>Build Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.BuildArgsImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBuildArgs()
   * @generated
   */
  int BUILD_ARGS = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_ARGS__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_ARGS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Build Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_ARGS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.ContainerImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = 0;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__IMAGE = 1;

  /**
   * The feature id for the '<em><b>Binds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__BINDS = 2;

  /**
   * The feature id for the '<em><b>Capability Add</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CAPABILITY_ADD = 3;

  /**
   * The feature id for the '<em><b>Capability Drop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CAPABILITY_DROP = 4;

  /**
   * The feature id for the '<em><b>Commands</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__COMMANDS = 5;

  /**
   * The feature id for the '<em><b>Container ID File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONTAINER_ID_FILE = 6;

  /**
   * The feature id for the '<em><b>Cpu Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CPU_PERIOD = 7;

  /**
   * The feature id for the '<em><b>Cpuset Cpus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CPUSET_CPUS = 8;

  /**
   * The feature id for the '<em><b>Cpuset Mems</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CPUSET_MEMS = 9;

  /**
   * The feature id for the '<em><b>Cpu Shares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CPU_SHARES = 10;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DEVICES = 11;

  /**
   * The feature id for the '<em><b>Dns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DNS = 12;

  /**
   * The feature id for the '<em><b>Dns Search</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DNS_SEARCH = 13;

  /**
   * The feature id for the '<em><b>Domain Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOMAIN_NAME = 14;

  /**
   * The feature id for the '<em><b>Entrypoint</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ENTRYPOINT = 15;

  /**
   * The feature id for the '<em><b>Env</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ENV = 16;

  /**
   * The feature id for the '<em><b>Exposed Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__EXPOSED_PORTS = 17;

  /**
   * The feature id for the '<em><b>Extra Hosts</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__EXTRA_HOSTS = 18;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__LABELS = 19;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__LINKS = 20;

  /**
   * The feature id for the '<em><b>Mac Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__MAC_ADDRESS = 21;

  /**
   * The feature id for the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__MEMORY = 22;

  /**
   * The feature id for the '<em><b>Memory Swap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__MEMORY_SWAP = 23;

  /**
   * The feature id for the '<em><b>Disable Network</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DISABLE_NETWORK = 24;

  /**
   * The feature id for the '<em><b>Network Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NETWORK_MODE = 25;

  /**
   * The feature id for the '<em><b>Port Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PORT_BINDINGS = 26;

  /**
   * The feature id for the '<em><b>Privileged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PRIVILEGED = 27;

  /**
   * The feature id for the '<em><b>Publish All Ports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PUBLISH_ALL_PORTS = 28;

  /**
   * The feature id for the '<em><b>Readonly Rootfs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__READONLY_ROOTFS = 29;

  /**
   * The feature id for the '<em><b>Pid Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PID_MODE = 30;

  /**
   * The feature id for the '<em><b>Working Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__WORKING_DIR = 31;

  /**
   * The feature id for the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__USER = 32;

  /**
   * The feature id for the '<em><b>Tty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__TTY = 33;

  /**
   * The feature id for the '<em><b>Restart Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__RESTART_POLICY = 34;

  /**
   * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__VOLUMES = 35;

  /**
   * The feature id for the '<em><b>Volumes From</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__VOLUMES_FROM = 36;

  /**
   * The feature id for the '<em><b>Ulimits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ULIMITS = 37;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 38;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.VolumesFromImpl <em>Volumes From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.VolumesFromImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getVolumesFrom()
   * @generated
   */
  int VOLUMES_FROM = 4;

  /**
   * The feature id for the '<em><b>Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUMES_FROM__CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Access Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUMES_FROM__ACCESS_MODE = 1;

  /**
   * The number of structural features of the '<em>Volumes From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUMES_FROM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.RestartPolicyImpl <em>Restart Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.RestartPolicyImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getRestartPolicy()
   * @generated
   */
  int RESTART_POLICY = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTART_POLICY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Maximum Retry Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTART_POLICY__MAXIMUM_RETRY_COUNT = 1;

  /**
   * The number of structural features of the '<em>Restart Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTART_POLICY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.PortBindingImpl <em>Port Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.PortBindingImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getPortBinding()
   * @generated
   */
  int PORT_BINDING = 6;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_BINDING__BINDING = 0;

  /**
   * The feature id for the '<em><b>Exposed Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_BINDING__EXPOSED_PORT = 1;

  /**
   * The number of structural features of the '<em>Port Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.BindingImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 7;

  /**
   * The feature id for the '<em><b>Host IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__HOST_IP = 0;

  /**
   * The feature id for the '<em><b>Host Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__HOST_PORT = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.LinkImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getLink()
   * @generated
   */
  int LINK = 8;

  /**
   * The feature id for the '<em><b>Container Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__CONTAINER_LINK = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.UlimitImpl <em>Ulimit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.UlimitImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getUlimit()
   * @generated
   */
  int ULIMIT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULIMIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Soft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULIMIT__SOFT = 1;

  /**
   * The feature id for the '<em><b>Hard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULIMIT__HARD = 2;

  /**
   * The number of structural features of the '<em>Ulimit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULIMIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.LabelImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 10;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.ExposedPortImpl <em>Exposed Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.ExposedPortImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getExposedPort()
   * @generated
   */
  int EXPOSED_PORT = 11;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPOSED_PORT__PORT = 0;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPOSED_PORT__PROTOCOL = 1;

  /**
   * The number of structural features of the '<em>Exposed Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPOSED_PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.DeviceImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 12;

  /**
   * The feature id for the '<em><b>CGroup Permissions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__CGROUP_PERMISSIONS = 0;

  /**
   * The feature id for the '<em><b>Path On Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__PATH_ON_HOST = 1;

  /**
   * The feature id for the '<em><b>Path In Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__PATH_IN_CONTAINER = 2;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.BindImpl <em>Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.BindImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBind()
   * @generated
   */
  int BIND = 13;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__LOCATION = 0;

  /**
   * The feature id for the '<em><b>Volume</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__VOLUME = 1;

  /**
   * The feature id for the '<em><b>Access Mode1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__ACCESS_MODE1 = 2;

  /**
   * The number of structural features of the '<em>Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.impl.VolumeImpl <em>Volume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.impl.VolumeImpl
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getVolume()
   * @generated
   */
  int VOLUME = 14;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__PATH = 0;

  /**
   * The number of structural features of the '<em>Volume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.InternalProtocol <em>Internal Protocol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.InternalProtocol
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getInternalProtocol()
   * @generated
   */
  int INTERNAL_PROTOCOL = 15;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.AccessMode <em>Access Mode</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.AccessMode
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getAccessMode()
   * @generated
   */
  int ACCESS_MODE = 16;

  /**
   * The meta object id for the '{@link org.eclipse.docker.language.container.Capability <em>Capability</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.docker.language.container.Capability
   * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 17;


  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Docker <em>Docker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Docker</em>'.
   * @see org.eclipse.docker.language.container.Docker
   * @generated
   */
  EClass getDocker();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Docker#getContainers <em>Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containers</em>'.
   * @see org.eclipse.docker.language.container.Docker#getContainers()
   * @see #getDocker()
   * @generated
   */
  EReference getDocker_Containers();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Docker#getImages <em>Images</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Images</em>'.
   * @see org.eclipse.docker.language.container.Docker#getImages()
   * @see #getDocker()
   * @generated
   */
  EReference getDocker_Images();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.eclipse.docker.language.container.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.docker.language.container.Image#getName()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see org.eclipse.docker.language.container.Image#getTag()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Tag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getDockerFilelocation <em>Docker Filelocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Docker Filelocation</em>'.
   * @see org.eclipse.docker.language.container.Image#getDockerFilelocation()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_DockerFilelocation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.docker.language.container.Image#getBuildargs <em>Buildargs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Buildargs</em>'.
   * @see org.eclipse.docker.language.container.Image#getBuildargs()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Buildargs();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#isNoCache <em>No Cache</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Cache</em>'.
   * @see org.eclipse.docker.language.container.Image#isNoCache()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_NoCache();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getMemory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory</em>'.
   * @see org.eclipse.docker.language.container.Image#getMemory()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Memory();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getMemswap <em>Memswap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memswap</em>'.
   * @see org.eclipse.docker.language.container.Image#getMemswap()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Memswap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getCpusetcpus <em>Cpusetcpus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpusetcpus</em>'.
   * @see org.eclipse.docker.language.container.Image#getCpusetcpus()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Cpusetcpus();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#getCpushares <em>Cpushares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpushares</em>'.
   * @see org.eclipse.docker.language.container.Image#getCpushares()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Cpushares();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#isRemove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove</em>'.
   * @see org.eclipse.docker.language.container.Image#isRemove()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Remove();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#isQuiet <em>Quiet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quiet</em>'.
   * @see org.eclipse.docker.language.container.Image#isQuiet()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Quiet();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Image#isPull <em>Pull</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pull</em>'.
   * @see org.eclipse.docker.language.container.Image#isPull()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Pull();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.BuildArgs <em>Build Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Args</em>'.
   * @see org.eclipse.docker.language.container.BuildArgs
   * @generated
   */
  EClass getBuildArgs();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.BuildArgs#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.docker.language.container.BuildArgs#getKey()
   * @see #getBuildArgs()
   * @generated
   */
  EAttribute getBuildArgs_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.BuildArgs#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.docker.language.container.BuildArgs#getValue()
   * @see #getBuildArgs()
   * @generated
   */
  EAttribute getBuildArgs_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.eclipse.docker.language.container.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.docker.language.container.Container#getName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see org.eclipse.docker.language.container.Container#getImage()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Image();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getBinds <em>Binds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binds</em>'.
   * @see org.eclipse.docker.language.container.Container#getBinds()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Binds();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getCapabilityAdd <em>Capability Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Capability Add</em>'.
   * @see org.eclipse.docker.language.container.Container#getCapabilityAdd()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CapabilityAdd();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getCapabilityDrop <em>Capability Drop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Capability Drop</em>'.
   * @see org.eclipse.docker.language.container.Container#getCapabilityDrop()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CapabilityDrop();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Commands</em>'.
   * @see org.eclipse.docker.language.container.Container#getCommands()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Commands();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getContainerIDFile <em>Container ID File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container ID File</em>'.
   * @see org.eclipse.docker.language.container.Container#getContainerIDFile()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_ContainerIDFile();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getCpuPeriod <em>Cpu Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpu Period</em>'.
   * @see org.eclipse.docker.language.container.Container#getCpuPeriod()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CpuPeriod();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getCpusetCpus <em>Cpuset Cpus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpuset Cpus</em>'.
   * @see org.eclipse.docker.language.container.Container#getCpusetCpus()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CpusetCpus();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getCpusetMems <em>Cpuset Mems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpuset Mems</em>'.
   * @see org.eclipse.docker.language.container.Container#getCpusetMems()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CpusetMems();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getCpuShares <em>Cpu Shares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpu Shares</em>'.
   * @see org.eclipse.docker.language.container.Container#getCpuShares()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_CpuShares();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see org.eclipse.docker.language.container.Container#getDevices()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Devices();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getDns <em>Dns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dns</em>'.
   * @see org.eclipse.docker.language.container.Container#getDns()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Dns();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getDnsSearch <em>Dns Search</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dns Search</em>'.
   * @see org.eclipse.docker.language.container.Container#getDnsSearch()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_DnsSearch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getDomainName <em>Domain Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain Name</em>'.
   * @see org.eclipse.docker.language.container.Container#getDomainName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_DomainName();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getEntrypoint <em>Entrypoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Entrypoint</em>'.
   * @see org.eclipse.docker.language.container.Container#getEntrypoint()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Entrypoint();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getEnv <em>Env</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Env</em>'.
   * @see org.eclipse.docker.language.container.Container#getEnv()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Env();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getExposedPorts <em>Exposed Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exposed Ports</em>'.
   * @see org.eclipse.docker.language.container.Container#getExposedPorts()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_ExposedPorts();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.docker.language.container.Container#getExtraHosts <em>Extra Hosts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Extra Hosts</em>'.
   * @see org.eclipse.docker.language.container.Container#getExtraHosts()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_ExtraHosts();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see org.eclipse.docker.language.container.Container#getLabels()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Labels();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see org.eclipse.docker.language.container.Container#getLinks()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Links();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getMacAddress <em>Mac Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mac Address</em>'.
   * @see org.eclipse.docker.language.container.Container#getMacAddress()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_MacAddress();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getMemory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory</em>'.
   * @see org.eclipse.docker.language.container.Container#getMemory()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Memory();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getMemorySwap <em>Memory Swap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory Swap</em>'.
   * @see org.eclipse.docker.language.container.Container#getMemorySwap()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_MemorySwap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#isDisableNetwork <em>Disable Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disable Network</em>'.
   * @see org.eclipse.docker.language.container.Container#isDisableNetwork()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_DisableNetwork();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getNetworkMode <em>Network Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Network Mode</em>'.
   * @see org.eclipse.docker.language.container.Container#getNetworkMode()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_NetworkMode();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getPortBindings <em>Port Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Port Bindings</em>'.
   * @see org.eclipse.docker.language.container.Container#getPortBindings()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_PortBindings();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#isPrivileged <em>Privileged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Privileged</em>'.
   * @see org.eclipse.docker.language.container.Container#isPrivileged()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Privileged();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#isPublishAllPorts <em>Publish All Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publish All Ports</em>'.
   * @see org.eclipse.docker.language.container.Container#isPublishAllPorts()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_PublishAllPorts();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#isReadonlyRootfs <em>Readonly Rootfs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly Rootfs</em>'.
   * @see org.eclipse.docker.language.container.Container#isReadonlyRootfs()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_ReadonlyRootfs();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getPidMode <em>Pid Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pid Mode</em>'.
   * @see org.eclipse.docker.language.container.Container#getPidMode()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_PidMode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getWorkingDir <em>Working Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Working Dir</em>'.
   * @see org.eclipse.docker.language.container.Container#getWorkingDir()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_WorkingDir();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User</em>'.
   * @see org.eclipse.docker.language.container.Container#getUser()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_User();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Container#isTty <em>Tty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tty</em>'.
   * @see org.eclipse.docker.language.container.Container#isTty()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Tty();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.docker.language.container.Container#getRestartPolicy <em>Restart Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Restart Policy</em>'.
   * @see org.eclipse.docker.language.container.Container#getRestartPolicy()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_RestartPolicy();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getVolumes <em>Volumes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Volumes</em>'.
   * @see org.eclipse.docker.language.container.Container#getVolumes()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Volumes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getVolumesFrom <em>Volumes From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Volumes From</em>'.
   * @see org.eclipse.docker.language.container.Container#getVolumesFrom()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_VolumesFrom();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.docker.language.container.Container#getUlimits <em>Ulimits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ulimits</em>'.
   * @see org.eclipse.docker.language.container.Container#getUlimits()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Ulimits();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.VolumesFrom <em>Volumes From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Volumes From</em>'.
   * @see org.eclipse.docker.language.container.VolumesFrom
   * @generated
   */
  EClass getVolumesFrom();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.VolumesFrom#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container</em>'.
   * @see org.eclipse.docker.language.container.VolumesFrom#getContainer()
   * @see #getVolumesFrom()
   * @generated
   */
  EAttribute getVolumesFrom_Container();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.VolumesFrom#getAccessMode <em>Access Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access Mode</em>'.
   * @see org.eclipse.docker.language.container.VolumesFrom#getAccessMode()
   * @see #getVolumesFrom()
   * @generated
   */
  EAttribute getVolumesFrom_AccessMode();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.RestartPolicy <em>Restart Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restart Policy</em>'.
   * @see org.eclipse.docker.language.container.RestartPolicy
   * @generated
   */
  EClass getRestartPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.RestartPolicy#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.docker.language.container.RestartPolicy#getValue()
   * @see #getRestartPolicy()
   * @generated
   */
  EAttribute getRestartPolicy_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.RestartPolicy#getMaximumRetryCount <em>Maximum Retry Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maximum Retry Count</em>'.
   * @see org.eclipse.docker.language.container.RestartPolicy#getMaximumRetryCount()
   * @see #getRestartPolicy()
   * @generated
   */
  EAttribute getRestartPolicy_MaximumRetryCount();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.PortBinding <em>Port Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port Binding</em>'.
   * @see org.eclipse.docker.language.container.PortBinding
   * @generated
   */
  EClass getPortBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.docker.language.container.PortBinding#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.eclipse.docker.language.container.PortBinding#getBinding()
   * @see #getPortBinding()
   * @generated
   */
  EReference getPortBinding_Binding();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.docker.language.container.PortBinding#getExposedPort <em>Exposed Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exposed Port</em>'.
   * @see org.eclipse.docker.language.container.PortBinding#getExposedPort()
   * @see #getPortBinding()
   * @generated
   */
  EReference getPortBinding_ExposedPort();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.eclipse.docker.language.container.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Binding#getHostIP <em>Host IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host IP</em>'.
   * @see org.eclipse.docker.language.container.Binding#getHostIP()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_HostIP();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Binding#getHostPort <em>Host Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Port</em>'.
   * @see org.eclipse.docker.language.container.Binding#getHostPort()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_HostPort();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.eclipse.docker.language.container.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Link#getContainerLink <em>Container Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container Link</em>'.
   * @see org.eclipse.docker.language.container.Link#getContainerLink()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_ContainerLink();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Link#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipse.docker.language.container.Link#getAlias()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Alias();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Ulimit <em>Ulimit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ulimit</em>'.
   * @see org.eclipse.docker.language.container.Ulimit
   * @generated
   */
  EClass getUlimit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Ulimit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.docker.language.container.Ulimit#getName()
   * @see #getUlimit()
   * @generated
   */
  EAttribute getUlimit_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Ulimit#getSoft <em>Soft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soft</em>'.
   * @see org.eclipse.docker.language.container.Ulimit#getSoft()
   * @see #getUlimit()
   * @generated
   */
  EAttribute getUlimit_Soft();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Ulimit#getHard <em>Hard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hard</em>'.
   * @see org.eclipse.docker.language.container.Ulimit#getHard()
   * @see #getUlimit()
   * @generated
   */
  EAttribute getUlimit_Hard();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.eclipse.docker.language.container.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Label#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.docker.language.container.Label#getKey()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Label#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.docker.language.container.Label#getValue()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.ExposedPort <em>Exposed Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exposed Port</em>'.
   * @see org.eclipse.docker.language.container.ExposedPort
   * @generated
   */
  EClass getExposedPort();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.ExposedPort#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.eclipse.docker.language.container.ExposedPort#getPort()
   * @see #getExposedPort()
   * @generated
   */
  EAttribute getExposedPort_Port();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.ExposedPort#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see org.eclipse.docker.language.container.ExposedPort#getProtocol()
   * @see #getExposedPort()
   * @generated
   */
  EAttribute getExposedPort_Protocol();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see org.eclipse.docker.language.container.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Device#getCGroupPermissions <em>CGroup Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CGroup Permissions</em>'.
   * @see org.eclipse.docker.language.container.Device#getCGroupPermissions()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_CGroupPermissions();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Device#getPathOnHost <em>Path On Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path On Host</em>'.
   * @see org.eclipse.docker.language.container.Device#getPathOnHost()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_PathOnHost();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Device#getPathInContainer <em>Path In Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path In Container</em>'.
   * @see org.eclipse.docker.language.container.Device#getPathInContainer()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_PathInContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind</em>'.
   * @see org.eclipse.docker.language.container.Bind
   * @generated
   */
  EClass getBind();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Bind#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.docker.language.container.Bind#getLocation()
   * @see #getBind()
   * @generated
   */
  EAttribute getBind_Location();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.docker.language.container.Bind#getVolume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Volume</em>'.
   * @see org.eclipse.docker.language.container.Bind#getVolume()
   * @see #getBind()
   * @generated
   */
  EReference getBind_Volume();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Bind#getAccessMode1 <em>Access Mode1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access Mode1</em>'.
   * @see org.eclipse.docker.language.container.Bind#getAccessMode1()
   * @see #getBind()
   * @generated
   */
  EAttribute getBind_AccessMode1();

  /**
   * Returns the meta object for class '{@link org.eclipse.docker.language.container.Volume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Volume</em>'.
   * @see org.eclipse.docker.language.container.Volume
   * @generated
   */
  EClass getVolume();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.docker.language.container.Volume#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.eclipse.docker.language.container.Volume#getPath()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Path();

  /**
   * Returns the meta object for enum '{@link org.eclipse.docker.language.container.InternalProtocol <em>Internal Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Internal Protocol</em>'.
   * @see org.eclipse.docker.language.container.InternalProtocol
   * @generated
   */
  EEnum getInternalProtocol();

  /**
   * Returns the meta object for enum '{@link org.eclipse.docker.language.container.AccessMode <em>Access Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Mode</em>'.
   * @see org.eclipse.docker.language.container.AccessMode
   * @generated
   */
  EEnum getAccessMode();

  /**
   * Returns the meta object for enum '{@link org.eclipse.docker.language.container.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Capability</em>'.
   * @see org.eclipse.docker.language.container.Capability
   * @generated
   */
  EEnum getCapability();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ContainerFactory getContainerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.DockerImpl <em>Docker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.DockerImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getDocker()
     * @generated
     */
    EClass DOCKER = eINSTANCE.getDocker();

    /**
     * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCKER__CONTAINERS = eINSTANCE.getDocker_Containers();

    /**
     * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCKER__IMAGES = eINSTANCE.getDocker_Images();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.ImageImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__TAG = eINSTANCE.getImage_Tag();

    /**
     * The meta object literal for the '<em><b>Docker Filelocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__DOCKER_FILELOCATION = eINSTANCE.getImage_DockerFilelocation();

    /**
     * The meta object literal for the '<em><b>Buildargs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__BUILDARGS = eINSTANCE.getImage_Buildargs();

    /**
     * The meta object literal for the '<em><b>No Cache</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__NO_CACHE = eINSTANCE.getImage_NoCache();

    /**
     * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__MEMORY = eINSTANCE.getImage_Memory();

    /**
     * The meta object literal for the '<em><b>Memswap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__MEMSWAP = eINSTANCE.getImage_Memswap();

    /**
     * The meta object literal for the '<em><b>Cpusetcpus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__CPUSETCPUS = eINSTANCE.getImage_Cpusetcpus();

    /**
     * The meta object literal for the '<em><b>Cpushares</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__CPUSHARES = eINSTANCE.getImage_Cpushares();

    /**
     * The meta object literal for the '<em><b>Remove</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__REMOVE = eINSTANCE.getImage_Remove();

    /**
     * The meta object literal for the '<em><b>Quiet</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__QUIET = eINSTANCE.getImage_Quiet();

    /**
     * The meta object literal for the '<em><b>Pull</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__PULL = eINSTANCE.getImage_Pull();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.BuildArgsImpl <em>Build Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.BuildArgsImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBuildArgs()
     * @generated
     */
    EClass BUILD_ARGS = eINSTANCE.getBuildArgs();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_ARGS__KEY = eINSTANCE.getBuildArgs_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_ARGS__VALUE = eINSTANCE.getBuildArgs_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.ContainerImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

    /**
     * The meta object literal for the '<em><b>Binds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__BINDS = eINSTANCE.getContainer_Binds();

    /**
     * The meta object literal for the '<em><b>Capability Add</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CAPABILITY_ADD = eINSTANCE.getContainer_CapabilityAdd();

    /**
     * The meta object literal for the '<em><b>Capability Drop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CAPABILITY_DROP = eINSTANCE.getContainer_CapabilityDrop();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__COMMANDS = eINSTANCE.getContainer_Commands();

    /**
     * The meta object literal for the '<em><b>Container ID File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CONTAINER_ID_FILE = eINSTANCE.getContainer_ContainerIDFile();

    /**
     * The meta object literal for the '<em><b>Cpu Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CPU_PERIOD = eINSTANCE.getContainer_CpuPeriod();

    /**
     * The meta object literal for the '<em><b>Cpuset Cpus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CPUSET_CPUS = eINSTANCE.getContainer_CpusetCpus();

    /**
     * The meta object literal for the '<em><b>Cpuset Mems</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CPUSET_MEMS = eINSTANCE.getContainer_CpusetMems();

    /**
     * The meta object literal for the '<em><b>Cpu Shares</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__CPU_SHARES = eINSTANCE.getContainer_CpuShares();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__DEVICES = eINSTANCE.getContainer_Devices();

    /**
     * The meta object literal for the '<em><b>Dns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DNS = eINSTANCE.getContainer_Dns();

    /**
     * The meta object literal for the '<em><b>Dns Search</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DNS_SEARCH = eINSTANCE.getContainer_DnsSearch();

    /**
     * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DOMAIN_NAME = eINSTANCE.getContainer_DomainName();

    /**
     * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__ENTRYPOINT = eINSTANCE.getContainer_Entrypoint();

    /**
     * The meta object literal for the '<em><b>Env</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__ENV = eINSTANCE.getContainer_Env();

    /**
     * The meta object literal for the '<em><b>Exposed Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__EXPOSED_PORTS = eINSTANCE.getContainer_ExposedPorts();

    /**
     * The meta object literal for the '<em><b>Extra Hosts</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__EXTRA_HOSTS = eINSTANCE.getContainer_ExtraHosts();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__LABELS = eINSTANCE.getContainer_Labels();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__LINKS = eINSTANCE.getContainer_Links();

    /**
     * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__MAC_ADDRESS = eINSTANCE.getContainer_MacAddress();

    /**
     * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__MEMORY = eINSTANCE.getContainer_Memory();

    /**
     * The meta object literal for the '<em><b>Memory Swap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__MEMORY_SWAP = eINSTANCE.getContainer_MemorySwap();

    /**
     * The meta object literal for the '<em><b>Disable Network</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DISABLE_NETWORK = eINSTANCE.getContainer_DisableNetwork();

    /**
     * The meta object literal for the '<em><b>Network Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__NETWORK_MODE = eINSTANCE.getContainer_NetworkMode();

    /**
     * The meta object literal for the '<em><b>Port Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__PORT_BINDINGS = eINSTANCE.getContainer_PortBindings();

    /**
     * The meta object literal for the '<em><b>Privileged</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__PRIVILEGED = eINSTANCE.getContainer_Privileged();

    /**
     * The meta object literal for the '<em><b>Publish All Ports</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__PUBLISH_ALL_PORTS = eINSTANCE.getContainer_PublishAllPorts();

    /**
     * The meta object literal for the '<em><b>Readonly Rootfs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__READONLY_ROOTFS = eINSTANCE.getContainer_ReadonlyRootfs();

    /**
     * The meta object literal for the '<em><b>Pid Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__PID_MODE = eINSTANCE.getContainer_PidMode();

    /**
     * The meta object literal for the '<em><b>Working Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__WORKING_DIR = eINSTANCE.getContainer_WorkingDir();

    /**
     * The meta object literal for the '<em><b>User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__USER = eINSTANCE.getContainer_User();

    /**
     * The meta object literal for the '<em><b>Tty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__TTY = eINSTANCE.getContainer_Tty();

    /**
     * The meta object literal for the '<em><b>Restart Policy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__RESTART_POLICY = eINSTANCE.getContainer_RestartPolicy();

    /**
     * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

    /**
     * The meta object literal for the '<em><b>Volumes From</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__VOLUMES_FROM = eINSTANCE.getContainer_VolumesFrom();

    /**
     * The meta object literal for the '<em><b>Ulimits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__ULIMITS = eINSTANCE.getContainer_Ulimits();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.VolumesFromImpl <em>Volumes From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.VolumesFromImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getVolumesFrom()
     * @generated
     */
    EClass VOLUMES_FROM = eINSTANCE.getVolumesFrom();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUMES_FROM__CONTAINER = eINSTANCE.getVolumesFrom_Container();

    /**
     * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUMES_FROM__ACCESS_MODE = eINSTANCE.getVolumesFrom_AccessMode();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.RestartPolicyImpl <em>Restart Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.RestartPolicyImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getRestartPolicy()
     * @generated
     */
    EClass RESTART_POLICY = eINSTANCE.getRestartPolicy();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTART_POLICY__VALUE = eINSTANCE.getRestartPolicy_Value();

    /**
     * The meta object literal for the '<em><b>Maximum Retry Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTART_POLICY__MAXIMUM_RETRY_COUNT = eINSTANCE.getRestartPolicy_MaximumRetryCount();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.PortBindingImpl <em>Port Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.PortBindingImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getPortBinding()
     * @generated
     */
    EClass PORT_BINDING = eINSTANCE.getPortBinding();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_BINDING__BINDING = eINSTANCE.getPortBinding_Binding();

    /**
     * The meta object literal for the '<em><b>Exposed Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT_BINDING__EXPOSED_PORT = eINSTANCE.getPortBinding_ExposedPort();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.BindingImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Host IP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__HOST_IP = eINSTANCE.getBinding_HostIP();

    /**
     * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__HOST_PORT = eINSTANCE.getBinding_HostPort();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.LinkImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Container Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__CONTAINER_LINK = eINSTANCE.getLink_ContainerLink();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__ALIAS = eINSTANCE.getLink_Alias();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.UlimitImpl <em>Ulimit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.UlimitImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getUlimit()
     * @generated
     */
    EClass ULIMIT = eINSTANCE.getUlimit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ULIMIT__NAME = eINSTANCE.getUlimit_Name();

    /**
     * The meta object literal for the '<em><b>Soft</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ULIMIT__SOFT = eINSTANCE.getUlimit_Soft();

    /**
     * The meta object literal for the '<em><b>Hard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ULIMIT__HARD = eINSTANCE.getUlimit_Hard();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.LabelImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__KEY = eINSTANCE.getLabel_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__VALUE = eINSTANCE.getLabel_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.ExposedPortImpl <em>Exposed Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.ExposedPortImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getExposedPort()
     * @generated
     */
    EClass EXPOSED_PORT = eINSTANCE.getExposedPort();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPOSED_PORT__PORT = eINSTANCE.getExposedPort_Port();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPOSED_PORT__PROTOCOL = eINSTANCE.getExposedPort_Protocol();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.DeviceImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>CGroup Permissions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__CGROUP_PERMISSIONS = eINSTANCE.getDevice_CGroupPermissions();

    /**
     * The meta object literal for the '<em><b>Path On Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__PATH_ON_HOST = eINSTANCE.getDevice_PathOnHost();

    /**
     * The meta object literal for the '<em><b>Path In Container</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__PATH_IN_CONTAINER = eINSTANCE.getDevice_PathInContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.BindImpl <em>Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.BindImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getBind()
     * @generated
     */
    EClass BIND = eINSTANCE.getBind();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND__LOCATION = eINSTANCE.getBind_Location();

    /**
     * The meta object literal for the '<em><b>Volume</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND__VOLUME = eINSTANCE.getBind_Volume();

    /**
     * The meta object literal for the '<em><b>Access Mode1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND__ACCESS_MODE1 = eINSTANCE.getBind_AccessMode1();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.impl.VolumeImpl <em>Volume</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.impl.VolumeImpl
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getVolume()
     * @generated
     */
    EClass VOLUME = eINSTANCE.getVolume();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__PATH = eINSTANCE.getVolume_Path();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.InternalProtocol <em>Internal Protocol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.InternalProtocol
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getInternalProtocol()
     * @generated
     */
    EEnum INTERNAL_PROTOCOL = eINSTANCE.getInternalProtocol();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.AccessMode <em>Access Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.AccessMode
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getAccessMode()
     * @generated
     */
    EEnum ACCESS_MODE = eINSTANCE.getAccessMode();

    /**
     * The meta object literal for the '{@link org.eclipse.docker.language.container.Capability <em>Capability</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.docker.language.container.Capability
     * @see org.eclipse.docker.language.container.impl.ContainerPackageImpl#getCapability()
     * @generated
     */
    EEnum CAPABILITY = eINSTANCE.getCapability();

  }

} //ContainerPackage
