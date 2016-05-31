/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.AccessMode;
import org.eclipse.docker.language.container.Bind;
import org.eclipse.docker.language.container.Binding;
import org.eclipse.docker.language.container.BuildArgs;
import org.eclipse.docker.language.container.Capability;
import org.eclipse.docker.language.container.ContainerFactory;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ContainerSection;
import org.eclipse.docker.language.container.Device;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.ExposedPort;
import org.eclipse.docker.language.container.Image;
import org.eclipse.docker.language.container.ImageSection;
import org.eclipse.docker.language.container.InternalProtocol;
import org.eclipse.docker.language.container.Label;
import org.eclipse.docker.language.container.Link;
import org.eclipse.docker.language.container.PortBinding;
import org.eclipse.docker.language.container.RestartPolicy;
import org.eclipse.docker.language.container.Ulimit;
import org.eclipse.docker.language.container.Volume;
import org.eclipse.docker.language.container.VolumesFrom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerPackageImpl extends EPackageImpl implements ContainerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dockerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildArgsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass volumesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restartPolicyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ulimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exposedPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass volumeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum internalProtocolEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessModeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum capabilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.docker.language.container.ContainerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ContainerPackageImpl()
  {
    super(eNS_URI, ContainerFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ContainerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ContainerPackage init()
  {
    if (isInited) return (ContainerPackage)EPackage.Registry.INSTANCE.getEPackage(ContainerPackage.eNS_URI);

    // Obtain or create and register package
    ContainerPackageImpl theContainerPackage = (ContainerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContainerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContainerPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theContainerPackage.createPackageContents();

    // Initialize created meta-data
    theContainerPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theContainerPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ContainerPackage.eNS_URI, theContainerPackage);
    return theContainerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocker()
  {
    return dockerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocker_ContainerRegion()
  {
    return (EReference)dockerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocker_ImageRegion()
  {
    return (EReference)dockerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerSection()
  {
    return containerSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerSection_Name()
  {
    return (EAttribute)containerSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerSection_Containers()
  {
    return (EReference)containerSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageSection()
  {
    return imageSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageSection_Name()
  {
    return (EAttribute)imageSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageSection_Images()
  {
    return (EReference)imageSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Name()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Tag()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_DockerFilelocation()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_ForceRM()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_NoCache()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Memory()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Memswap()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Cpusetcpus()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Cpushares()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Remove()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Quiet()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Pull()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildArgs()
  {
    return buildArgsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildArgs_Key()
  {
    return (EAttribute)buildArgsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildArgs_Value()
  {
    return (EAttribute)buildArgsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Name()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Image()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Binds()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CapabilityAdd()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CapabilityDrop()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Commands()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_ContainerIDFile()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CpuPeriod()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CpusetCpus()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CpusetMems()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_CpuShares()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Devices()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Dns()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_DnsSearch()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_DomainName()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Entrypoint()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Env()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_ExposedPorts()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_ExtraHosts()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Labels()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Links()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_MacAddress()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Memory()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_MemorySwap()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_DisableNetwork()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_NetworkMode()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_PortBindings()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Privileged()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_PublishAllPorts()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_ReadonlyRootfs()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_PidMode()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_WorkingDir()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_User()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Tty()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_RestartPolicy()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Volumes()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_VolumesFrom()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Ulimits()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVolumesFrom()
  {
    return volumesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolumesFrom_Container()
  {
    return (EAttribute)volumesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolumesFrom_AccessMode()
  {
    return (EAttribute)volumesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestartPolicy()
  {
    return restartPolicyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestartPolicy_Value()
  {
    return (EAttribute)restartPolicyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestartPolicy_MaximumRetryCount()
  {
    return (EAttribute)restartPolicyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPortBinding()
  {
    return portBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPortBinding_Binding()
  {
    return (EReference)portBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPortBinding_ExposedPort()
  {
    return (EReference)portBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_HostIP()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinding_HostPort()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_ContainerLink()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Alias()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUlimit()
  {
    return ulimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUlimit_Name()
  {
    return (EAttribute)ulimitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUlimit_Soft()
  {
    return (EAttribute)ulimitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUlimit_Hard()
  {
    return (EAttribute)ulimitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Key()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Value()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExposedPort()
  {
    return exposedPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExposedPort_Port()
  {
    return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExposedPort_Protocol()
  {
    return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_CGroupPermissions()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_PathOnHost()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_PathInContainer()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBind()
  {
    return bindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBind_Location()
  {
    return (EAttribute)bindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBind_Volume()
  {
    return (EReference)bindEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBind_AccessMode1()
  {
    return (EAttribute)bindEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVolume()
  {
    return volumeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Path()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInternalProtocol()
  {
    return internalProtocolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessMode()
  {
    return accessModeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCapability()
  {
    return capabilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerFactory getContainerFactory()
  {
    return (ContainerFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dockerEClass = createEClass(DOCKER);
    createEReference(dockerEClass, DOCKER__CONTAINER_REGION);
    createEReference(dockerEClass, DOCKER__IMAGE_REGION);

    containerSectionEClass = createEClass(CONTAINER_SECTION);
    createEAttribute(containerSectionEClass, CONTAINER_SECTION__NAME);
    createEReference(containerSectionEClass, CONTAINER_SECTION__CONTAINERS);

    imageSectionEClass = createEClass(IMAGE_SECTION);
    createEAttribute(imageSectionEClass, IMAGE_SECTION__NAME);
    createEReference(imageSectionEClass, IMAGE_SECTION__IMAGES);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__NAME);
    createEAttribute(imageEClass, IMAGE__TAG);
    createEAttribute(imageEClass, IMAGE__DOCKER_FILELOCATION);
    createEAttribute(imageEClass, IMAGE__FORCE_RM);
    createEAttribute(imageEClass, IMAGE__NO_CACHE);
    createEAttribute(imageEClass, IMAGE__MEMORY);
    createEAttribute(imageEClass, IMAGE__MEMSWAP);
    createEAttribute(imageEClass, IMAGE__CPUSETCPUS);
    createEAttribute(imageEClass, IMAGE__CPUSHARES);
    createEAttribute(imageEClass, IMAGE__REMOVE);
    createEAttribute(imageEClass, IMAGE__QUIET);
    createEAttribute(imageEClass, IMAGE__PULL);

    buildArgsEClass = createEClass(BUILD_ARGS);
    createEAttribute(buildArgsEClass, BUILD_ARGS__KEY);
    createEAttribute(buildArgsEClass, BUILD_ARGS__VALUE);

    containerEClass = createEClass(CONTAINER);
    createEAttribute(containerEClass, CONTAINER__NAME);
    createEAttribute(containerEClass, CONTAINER__IMAGE);
    createEReference(containerEClass, CONTAINER__BINDS);
    createEAttribute(containerEClass, CONTAINER__CAPABILITY_ADD);
    createEAttribute(containerEClass, CONTAINER__CAPABILITY_DROP);
    createEAttribute(containerEClass, CONTAINER__COMMANDS);
    createEAttribute(containerEClass, CONTAINER__CONTAINER_ID_FILE);
    createEAttribute(containerEClass, CONTAINER__CPU_PERIOD);
    createEAttribute(containerEClass, CONTAINER__CPUSET_CPUS);
    createEAttribute(containerEClass, CONTAINER__CPUSET_MEMS);
    createEAttribute(containerEClass, CONTAINER__CPU_SHARES);
    createEReference(containerEClass, CONTAINER__DEVICES);
    createEAttribute(containerEClass, CONTAINER__DNS);
    createEAttribute(containerEClass, CONTAINER__DNS_SEARCH);
    createEAttribute(containerEClass, CONTAINER__DOMAIN_NAME);
    createEAttribute(containerEClass, CONTAINER__ENTRYPOINT);
    createEAttribute(containerEClass, CONTAINER__ENV);
    createEReference(containerEClass, CONTAINER__EXPOSED_PORTS);
    createEAttribute(containerEClass, CONTAINER__EXTRA_HOSTS);
    createEReference(containerEClass, CONTAINER__LABELS);
    createEReference(containerEClass, CONTAINER__LINKS);
    createEAttribute(containerEClass, CONTAINER__MAC_ADDRESS);
    createEAttribute(containerEClass, CONTAINER__MEMORY);
    createEAttribute(containerEClass, CONTAINER__MEMORY_SWAP);
    createEAttribute(containerEClass, CONTAINER__DISABLE_NETWORK);
    createEAttribute(containerEClass, CONTAINER__NETWORK_MODE);
    createEReference(containerEClass, CONTAINER__PORT_BINDINGS);
    createEAttribute(containerEClass, CONTAINER__PRIVILEGED);
    createEAttribute(containerEClass, CONTAINER__PUBLISH_ALL_PORTS);
    createEAttribute(containerEClass, CONTAINER__READONLY_ROOTFS);
    createEAttribute(containerEClass, CONTAINER__PID_MODE);
    createEAttribute(containerEClass, CONTAINER__WORKING_DIR);
    createEAttribute(containerEClass, CONTAINER__USER);
    createEAttribute(containerEClass, CONTAINER__TTY);
    createEReference(containerEClass, CONTAINER__RESTART_POLICY);
    createEReference(containerEClass, CONTAINER__VOLUMES);
    createEReference(containerEClass, CONTAINER__VOLUMES_FROM);
    createEReference(containerEClass, CONTAINER__ULIMITS);

    volumesFromEClass = createEClass(VOLUMES_FROM);
    createEAttribute(volumesFromEClass, VOLUMES_FROM__CONTAINER);
    createEAttribute(volumesFromEClass, VOLUMES_FROM__ACCESS_MODE);

    restartPolicyEClass = createEClass(RESTART_POLICY);
    createEAttribute(restartPolicyEClass, RESTART_POLICY__VALUE);
    createEAttribute(restartPolicyEClass, RESTART_POLICY__MAXIMUM_RETRY_COUNT);

    portBindingEClass = createEClass(PORT_BINDING);
    createEReference(portBindingEClass, PORT_BINDING__BINDING);
    createEReference(portBindingEClass, PORT_BINDING__EXPOSED_PORT);

    bindingEClass = createEClass(BINDING);
    createEAttribute(bindingEClass, BINDING__HOST_IP);
    createEAttribute(bindingEClass, BINDING__HOST_PORT);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__CONTAINER_LINK);
    createEAttribute(linkEClass, LINK__ALIAS);

    ulimitEClass = createEClass(ULIMIT);
    createEAttribute(ulimitEClass, ULIMIT__NAME);
    createEAttribute(ulimitEClass, ULIMIT__SOFT);
    createEAttribute(ulimitEClass, ULIMIT__HARD);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__KEY);
    createEAttribute(labelEClass, LABEL__VALUE);

    exposedPortEClass = createEClass(EXPOSED_PORT);
    createEAttribute(exposedPortEClass, EXPOSED_PORT__PORT);
    createEAttribute(exposedPortEClass, EXPOSED_PORT__PROTOCOL);

    deviceEClass = createEClass(DEVICE);
    createEAttribute(deviceEClass, DEVICE__CGROUP_PERMISSIONS);
    createEAttribute(deviceEClass, DEVICE__PATH_ON_HOST);
    createEAttribute(deviceEClass, DEVICE__PATH_IN_CONTAINER);

    bindEClass = createEClass(BIND);
    createEAttribute(bindEClass, BIND__LOCATION);
    createEReference(bindEClass, BIND__VOLUME);
    createEAttribute(bindEClass, BIND__ACCESS_MODE1);

    volumeEClass = createEClass(VOLUME);
    createEAttribute(volumeEClass, VOLUME__PATH);

    // Create enums
    internalProtocolEEnum = createEEnum(INTERNAL_PROTOCOL);
    accessModeEEnum = createEEnum(ACCESS_MODE);
    capabilityEEnum = createEEnum(CAPABILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(dockerEClass, Docker.class, "Docker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocker_ContainerRegion(), this.getContainerSection(), null, "containerRegion", null, 0, 1, Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocker_ImageRegion(), this.getImageSection(), null, "imageRegion", null, 0, 1, Docker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerSectionEClass, ContainerSection.class, "ContainerSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainerSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainerSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerSection_Containers(), this.getContainer(), null, "containers", null, 0, -1, ContainerSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageSectionEClass, ImageSection.class, "ImageSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageSection_Images(), this.getImage(), null, "images", null, 0, -1, ImageSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_DockerFilelocation(), ecorePackage.getEString(), "dockerFilelocation", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_ForceRM(), ecorePackage.getEBoolean(), "forceRM", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_NoCache(), ecorePackage.getEBoolean(), "noCache", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Memory(), ecorePackage.getELong(), "memory", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Memswap(), ecorePackage.getELong(), "memswap", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Cpusetcpus(), ecorePackage.getEString(), "cpusetcpus", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Cpushares(), ecorePackage.getEString(), "cpushares", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Remove(), ecorePackage.getEBoolean(), "remove", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Quiet(), ecorePackage.getEBoolean(), "quiet", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Pull(), ecorePackage.getEBoolean(), "pull", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildArgsEClass, BuildArgs.class, "BuildArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildArgs_Key(), ecorePackage.getEString(), "key", null, 0, 1, BuildArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildArgs_Value(), ecorePackage.getEString(), "value", null, 0, 1, BuildArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerEClass, org.eclipse.docker.language.container.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Image(), ecorePackage.getEString(), "image", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Binds(), this.getBind(), null, "binds", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CapabilityAdd(), this.getCapability(), "capabilityAdd", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CapabilityDrop(), this.getCapability(), "capabilityDrop", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Commands(), ecorePackage.getEString(), "commands", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_ContainerIDFile(), ecorePackage.getEString(), "containerIDFile", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CpuPeriod(), ecorePackage.getEInt(), "cpuPeriod", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CpusetCpus(), ecorePackage.getEString(), "cpusetCpus", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CpusetMems(), ecorePackage.getEString(), "cpusetMems", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_CpuShares(), ecorePackage.getEInt(), "cpuShares", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Devices(), this.getDevice(), null, "devices", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Dns(), ecorePackage.getEString(), "dns", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_DnsSearch(), ecorePackage.getEString(), "dnsSearch", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Entrypoint(), ecorePackage.getEString(), "entrypoint", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Env(), ecorePackage.getEString(), "env", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_ExposedPorts(), this.getExposedPort(), null, "exposedPorts", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_ExtraHosts(), ecorePackage.getEString(), "extraHosts", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Labels(), this.getLabel(), null, "labels", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Links(), this.getLink(), null, "links", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_MacAddress(), ecorePackage.getEString(), "macAddress", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Memory(), ecorePackage.getELong(), "memory", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_MemorySwap(), ecorePackage.getELong(), "memorySwap", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_DisableNetwork(), ecorePackage.getEBoolean(), "disableNetwork", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_NetworkMode(), ecorePackage.getEString(), "networkMode", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_PortBindings(), this.getPortBinding(), null, "portBindings", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Privileged(), ecorePackage.getEBoolean(), "privileged", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_PublishAllPorts(), ecorePackage.getEBoolean(), "publishAllPorts", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_ReadonlyRootfs(), ecorePackage.getEBoolean(), "readonlyRootfs", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_PidMode(), ecorePackage.getEString(), "pidMode", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_WorkingDir(), ecorePackage.getEString(), "workingDir", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_User(), ecorePackage.getEString(), "user", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Tty(), ecorePackage.getEBoolean(), "tty", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_RestartPolicy(), this.getRestartPolicy(), null, "restartPolicy", null, 0, 1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_VolumesFrom(), this.getVolumesFrom(), null, "volumesFrom", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Ulimits(), this.getUlimit(), null, "ulimits", null, 0, -1, org.eclipse.docker.language.container.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(volumesFromEClass, VolumesFrom.class, "VolumesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVolumesFrom_Container(), ecorePackage.getEString(), "container", null, 0, 1, VolumesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolumesFrom_AccessMode(), this.getAccessMode(), "accessMode", null, 0, 1, VolumesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restartPolicyEClass, RestartPolicy.class, "RestartPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRestartPolicy_Value(), ecorePackage.getEString(), "value", null, 0, 1, RestartPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRestartPolicy_MaximumRetryCount(), ecorePackage.getEInt(), "maximumRetryCount", null, 0, 1, RestartPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portBindingEClass, PortBinding.class, "PortBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPortBinding_Binding(), this.getBinding(), null, "binding", null, 0, 1, PortBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPortBinding_ExposedPort(), this.getExposedPort(), null, "exposedPort", null, 0, 1, PortBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinding_HostIP(), ecorePackage.getEString(), "hostIP", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinding_HostPort(), ecorePackage.getEInt(), "hostPort", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_ContainerLink(), ecorePackage.getEString(), "containerLink", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ulimitEClass, Ulimit.class, "Ulimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUlimit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ulimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUlimit_Soft(), ecorePackage.getEInt(), "soft", null, 0, 1, Ulimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUlimit_Hard(), ecorePackage.getEInt(), "hard", null, 0, 1, Ulimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Key(), ecorePackage.getEString(), "key", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exposedPortEClass, ExposedPort.class, "ExposedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExposedPort_Port(), ecorePackage.getEString(), "port", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExposedPort_Protocol(), this.getInternalProtocol(), "protocol", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_CGroupPermissions(), ecorePackage.getEString(), "cGroupPermissions", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDevice_PathOnHost(), ecorePackage.getEString(), "pathOnHost", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDevice_PathInContainer(), ecorePackage.getEString(), "pathInContainer", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindEClass, Bind.class, "Bind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBind_Location(), ecorePackage.getEString(), "location", null, 0, 1, Bind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBind_Volume(), this.getVolume(), null, "volume", null, 0, 1, Bind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBind_AccessMode1(), this.getAccessMode(), "accessMode1", null, 0, 1, Bind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVolume_Path(), ecorePackage.getEString(), "path", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(internalProtocolEEnum, InternalProtocol.class, "InternalProtocol");
    addEEnumLiteral(internalProtocolEEnum, InternalProtocol.TCP);
    addEEnumLiteral(internalProtocolEEnum, InternalProtocol.UDP);

    initEEnum(accessModeEEnum, AccessMode.class, "AccessMode");
    addEEnumLiteral(accessModeEEnum, AccessMode.RW);
    addEEnumLiteral(accessModeEEnum, AccessMode.RO);

    initEEnum(capabilityEEnum, Capability.class, "Capability");
    addEEnumLiteral(capabilityEEnum, Capability.ALL);
    addEEnumLiteral(capabilityEEnum, Capability.AUDIT_CONTROL);
    addEEnumLiteral(capabilityEEnum, Capability.AUDIT_WRITE);
    addEEnumLiteral(capabilityEEnum, Capability.BLOCK_SUSPEND);
    addEEnumLiteral(capabilityEEnum, Capability.CHOWN);
    addEEnumLiteral(capabilityEEnum, Capability.DAC_OVERRIDE);
    addEEnumLiteral(capabilityEEnum, Capability.DAC_READ_SEARCH);
    addEEnumLiteral(capabilityEEnum, Capability.FOWNER);
    addEEnumLiteral(capabilityEEnum, Capability.FSETID);
    addEEnumLiteral(capabilityEEnum, Capability.IPC_LOCK);
    addEEnumLiteral(capabilityEEnum, Capability.IPC_OWNER);
    addEEnumLiteral(capabilityEEnum, Capability.KILL);
    addEEnumLiteral(capabilityEEnum, Capability.LEASE);
    addEEnumLiteral(capabilityEEnum, Capability.LINUX_IMMUTABLE);
    addEEnumLiteral(capabilityEEnum, Capability.MAC_ADMIN);
    addEEnumLiteral(capabilityEEnum, Capability.MAC_OVERRIDE);
    addEEnumLiteral(capabilityEEnum, Capability.MKNOD);
    addEEnumLiteral(capabilityEEnum, Capability.NET_ADMIN);
    addEEnumLiteral(capabilityEEnum, Capability.NET_BIND_SERVICE);
    addEEnumLiteral(capabilityEEnum, Capability.NET_BROADCAST);
    addEEnumLiteral(capabilityEEnum, Capability.NET_RAW);
    addEEnumLiteral(capabilityEEnum, Capability.SETFCAP);
    addEEnumLiteral(capabilityEEnum, Capability.SETGID);
    addEEnumLiteral(capabilityEEnum, Capability.SETPCAP);
    addEEnumLiteral(capabilityEEnum, Capability.SETUID);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_ADMIN);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_BOOT);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_CHROOT);
    addEEnumLiteral(capabilityEEnum, Capability.SYSLOG);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_MODULE);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_NICE);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_PACCT);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_PTRACE);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_RAWIO);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_RESOURCE);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_TIME);
    addEEnumLiteral(capabilityEEnum, Capability.SYS_TTY_CONFIG);
    addEEnumLiteral(capabilityEEnum, Capability.WAKE_ALARM);

    // Create resource
    createResource(eNS_URI);
  }

} //ContainerPackageImpl
