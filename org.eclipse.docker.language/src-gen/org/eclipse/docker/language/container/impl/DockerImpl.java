/**
 */
package org.eclipse.docker.language.container.impl;

import java.util.Collection;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.Image;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getImages <em>Images</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImpl extends MinimalEObjectImpl.Container implements Docker
{
  /**
   * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainers()
   * @generated
   * @ordered
   */
  protected EList<org.eclipse.docker.language.container.Container> containers;

  /**
   * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImages()
   * @generated
   * @ordered
   */
  protected EList<Image> images;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DockerImpl()
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
    return ContainerPackage.Literals.DOCKER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.eclipse.docker.language.container.Container> getContainers()
  {
    if (containers == null)
    {
      containers = new EObjectContainmentEList<org.eclipse.docker.language.container.Container>(org.eclipse.docker.language.container.Container.class, this, ContainerPackage.DOCKER__CONTAINERS);
    }
    return containers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Image> getImages()
  {
    if (images == null)
    {
      images = new EObjectContainmentEList<Image>(Image.class, this, ContainerPackage.DOCKER__IMAGES);
    }
    return images;
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
      case ContainerPackage.DOCKER__CONTAINERS:
        return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
      case ContainerPackage.DOCKER__IMAGES:
        return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
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
      case ContainerPackage.DOCKER__CONTAINERS:
        return getContainers();
      case ContainerPackage.DOCKER__IMAGES:
        return getImages();
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
      case ContainerPackage.DOCKER__CONTAINERS:
        getContainers().clear();
        getContainers().addAll((Collection<? extends org.eclipse.docker.language.container.Container>)newValue);
        return;
      case ContainerPackage.DOCKER__IMAGES:
        getImages().clear();
        getImages().addAll((Collection<? extends Image>)newValue);
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
      case ContainerPackage.DOCKER__CONTAINERS:
        getContainers().clear();
        return;
      case ContainerPackage.DOCKER__IMAGES:
        getImages().clear();
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
      case ContainerPackage.DOCKER__CONTAINERS:
        return containers != null && !containers.isEmpty();
      case ContainerPackage.DOCKER__IMAGES:
        return images != null && !images.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DockerImpl
