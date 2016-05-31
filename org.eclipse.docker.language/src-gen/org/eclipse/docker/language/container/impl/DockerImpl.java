/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ContainerSection;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.ImageSection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getContainerRegion <em>Container Region</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getImageRegion <em>Image Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerImpl extends MinimalEObjectImpl.Container implements Docker
{
  /**
   * The cached value of the '{@link #getContainerRegion() <em>Container Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerRegion()
   * @generated
   * @ordered
   */
  protected ContainerSection containerRegion;

  /**
   * The cached value of the '{@link #getImageRegion() <em>Image Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageRegion()
   * @generated
   * @ordered
   */
  protected ImageSection imageRegion;

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
  public ContainerSection getContainerRegion()
  {
    return containerRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainerRegion(ContainerSection newContainerRegion, NotificationChain msgs)
  {
    ContainerSection oldContainerRegion = containerRegion;
    containerRegion = newContainerRegion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__CONTAINER_REGION, oldContainerRegion, newContainerRegion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerRegion(ContainerSection newContainerRegion)
  {
    if (newContainerRegion != containerRegion)
    {
      NotificationChain msgs = null;
      if (containerRegion != null)
        msgs = ((InternalEObject)containerRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__CONTAINER_REGION, null, msgs);
      if (newContainerRegion != null)
        msgs = ((InternalEObject)newContainerRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__CONTAINER_REGION, null, msgs);
      msgs = basicSetContainerRegion(newContainerRegion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__CONTAINER_REGION, newContainerRegion, newContainerRegion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageSection getImageRegion()
  {
    return imageRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImageRegion(ImageSection newImageRegion, NotificationChain msgs)
  {
    ImageSection oldImageRegion = imageRegion;
    imageRegion = newImageRegion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__IMAGE_REGION, oldImageRegion, newImageRegion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageRegion(ImageSection newImageRegion)
  {
    if (newImageRegion != imageRegion)
    {
      NotificationChain msgs = null;
      if (imageRegion != null)
        msgs = ((InternalEObject)imageRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__IMAGE_REGION, null, msgs);
      if (newImageRegion != null)
        msgs = ((InternalEObject)newImageRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__IMAGE_REGION, null, msgs);
      msgs = basicSetImageRegion(newImageRegion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__IMAGE_REGION, newImageRegion, newImageRegion));
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
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return basicSetContainerRegion(null, msgs);
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return basicSetImageRegion(null, msgs);
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
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return getContainerRegion();
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return getImageRegion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        setContainerRegion((ContainerSection)newValue);
        return;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        setImageRegion((ImageSection)newValue);
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
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        setContainerRegion((ContainerSection)null);
        return;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        setImageRegion((ImageSection)null);
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
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return containerRegion != null;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return imageRegion != null;
    }
    return super.eIsSet(featureID);
  }

} //DockerImpl
