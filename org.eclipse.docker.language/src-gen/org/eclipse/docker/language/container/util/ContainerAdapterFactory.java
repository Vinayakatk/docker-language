/**
 */
package org.eclipse.docker.language.container.util;

import org.eclipse.docker.language.container.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.docker.language.container.ContainerPackage
 * @generated
 */
public class ContainerAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ContainerPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ContainerPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerSwitch<Adapter> modelSwitch =
    new ContainerSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocker(Docker object)
      {
        return createDockerAdapter();
      }
      @Override
      public Adapter caseContainerSection(ContainerSection object)
      {
        return createContainerSectionAdapter();
      }
      @Override
      public Adapter caseImageSection(ImageSection object)
      {
        return createImageSectionAdapter();
      }
      @Override
      public Adapter caseImage(Image object)
      {
        return createImageAdapter();
      }
      @Override
      public Adapter caseBuildArgs(BuildArgs object)
      {
        return createBuildArgsAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseVolumesFrom(VolumesFrom object)
      {
        return createVolumesFromAdapter();
      }
      @Override
      public Adapter caseRestartPolicy(RestartPolicy object)
      {
        return createRestartPolicyAdapter();
      }
      @Override
      public Adapter casePortBinding(PortBinding object)
      {
        return createPortBindingAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseUlimit(Ulimit object)
      {
        return createUlimitAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseExposedPort(ExposedPort object)
      {
        return createExposedPortAdapter();
      }
      @Override
      public Adapter caseDevice(Device object)
      {
        return createDeviceAdapter();
      }
      @Override
      public Adapter caseBind(Bind object)
      {
        return createBindAdapter();
      }
      @Override
      public Adapter caseVolume(Volume object)
      {
        return createVolumeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Docker <em>Docker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Docker
   * @generated
   */
  public Adapter createDockerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.ContainerSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.ContainerSection
   * @generated
   */
  public Adapter createContainerSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.ImageSection <em>Image Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.ImageSection
   * @generated
   */
  public Adapter createImageSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Image
   * @generated
   */
  public Adapter createImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.BuildArgs <em>Build Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.BuildArgs
   * @generated
   */
  public Adapter createBuildArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.VolumesFrom <em>Volumes From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.VolumesFrom
   * @generated
   */
  public Adapter createVolumesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.RestartPolicy <em>Restart Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.RestartPolicy
   * @generated
   */
  public Adapter createRestartPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.PortBinding <em>Port Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.PortBinding
   * @generated
   */
  public Adapter createPortBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Ulimit <em>Ulimit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Ulimit
   * @generated
   */
  public Adapter createUlimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.ExposedPort <em>Exposed Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.ExposedPort
   * @generated
   */
  public Adapter createExposedPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Device
   * @generated
   */
  public Adapter createDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Bind
   * @generated
   */
  public Adapter createBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.docker.language.container.Volume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.docker.language.container.Volume
   * @generated
   */
  public Adapter createVolumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ContainerAdapterFactory
