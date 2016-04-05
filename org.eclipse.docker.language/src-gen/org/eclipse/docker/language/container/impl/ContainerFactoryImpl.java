/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerFactoryImpl extends EFactoryImpl implements ContainerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ContainerFactory init()
  {
    try
    {
      ContainerFactory theContainerFactory = (ContainerFactory)EPackage.Registry.INSTANCE.getEFactory(ContainerPackage.eNS_URI);
      if (theContainerFactory != null)
      {
        return theContainerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ContainerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ContainerPackage.DOCKER: return createDocker();
      case ContainerPackage.IMAGE: return createImage();
      case ContainerPackage.BUILD_ARGS: return createBuildArgs();
      case ContainerPackage.CONTAINER: return createContainer();
      case ContainerPackage.VOLUMES_FROM: return createVolumesFrom();
      case ContainerPackage.RESTART_POLICY: return createRestartPolicy();
      case ContainerPackage.PORT_BINDING: return createPortBinding();
      case ContainerPackage.BINDING: return createBinding();
      case ContainerPackage.LINK: return createLink();
      case ContainerPackage.ULIMIT: return createUlimit();
      case ContainerPackage.LABEL: return createLabel();
      case ContainerPackage.EXPOSED_PORT: return createExposedPort();
      case ContainerPackage.DEVICE: return createDevice();
      case ContainerPackage.BIND: return createBind();
      case ContainerPackage.VOLUME: return createVolume();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ContainerPackage.INTERNAL_PROTOCOL:
        return createInternalProtocolFromString(eDataType, initialValue);
      case ContainerPackage.ACCESS_MODE:
        return createAccessModeFromString(eDataType, initialValue);
      case ContainerPackage.CAPABILITY:
        return createCapabilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ContainerPackage.INTERNAL_PROTOCOL:
        return convertInternalProtocolToString(eDataType, instanceValue);
      case ContainerPackage.ACCESS_MODE:
        return convertAccessModeToString(eDataType, instanceValue);
      case ContainerPackage.CAPABILITY:
        return convertCapabilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Docker createDocker()
  {
    DockerImpl docker = new DockerImpl();
    return docker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildArgs createBuildArgs()
  {
    BuildArgsImpl buildArgs = new BuildArgsImpl();
    return buildArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.docker.language.container.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VolumesFrom createVolumesFrom()
  {
    VolumesFromImpl volumesFrom = new VolumesFromImpl();
    return volumesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestartPolicy createRestartPolicy()
  {
    RestartPolicyImpl restartPolicy = new RestartPolicyImpl();
    return restartPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortBinding createPortBinding()
  {
    PortBindingImpl portBinding = new PortBindingImpl();
    return portBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ulimit createUlimit()
  {
    UlimitImpl ulimit = new UlimitImpl();
    return ulimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedPort createExposedPort()
  {
    ExposedPortImpl exposedPort = new ExposedPortImpl();
    return exposedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bind createBind()
  {
    BindImpl bind = new BindImpl();
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Volume createVolume()
  {
    VolumeImpl volume = new VolumeImpl();
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalProtocol createInternalProtocolFromString(EDataType eDataType, String initialValue)
  {
    InternalProtocol result = InternalProtocol.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInternalProtocolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue)
  {
    AccessMode result = AccessMode.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessModeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability createCapabilityFromString(EDataType eDataType, String initialValue)
  {
    Capability result = Capability.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCapabilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerPackage getContainerPackage()
  {
    return (ContainerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ContainerPackage getPackage()
  {
    return ContainerPackage.eINSTANCE;
  }

} //ContainerFactoryImpl
