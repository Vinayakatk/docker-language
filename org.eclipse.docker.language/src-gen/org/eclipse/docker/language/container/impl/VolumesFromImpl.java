/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.AccessMode;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.VolumesFrom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumes From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.VolumesFromImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.VolumesFromImpl#getAccessMode <em>Access Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumesFromImpl extends MinimalEObjectImpl.Container implements VolumesFrom
{
  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected org.eclipse.docker.language.container.Container container;

  /**
   * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessMode()
   * @generated
   * @ordered
   */
  protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.RW;

  /**
   * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessMode()
   * @generated
   * @ordered
   */
  protected AccessMode accessMode = ACCESS_MODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VolumesFromImpl()
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
    return ContainerPackage.Literals.VOLUMES_FROM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.docker.language.container.Container getContainer()
  {
    if (container != null && container.eIsProxy())
    {
      InternalEObject oldContainer = (InternalEObject)container;
      container = (org.eclipse.docker.language.container.Container)eResolveProxy(oldContainer);
      if (container != oldContainer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerPackage.VOLUMES_FROM__CONTAINER, oldContainer, container));
      }
    }
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.docker.language.container.Container basicGetContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(org.eclipse.docker.language.container.Container newContainer)
  {
    org.eclipse.docker.language.container.Container oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.VOLUMES_FROM__CONTAINER, oldContainer, container));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessMode getAccessMode()
  {
    return accessMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMode(AccessMode newAccessMode)
  {
    AccessMode oldAccessMode = accessMode;
    accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.VOLUMES_FROM__ACCESS_MODE, oldAccessMode, accessMode));
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
      case ContainerPackage.VOLUMES_FROM__CONTAINER:
        if (resolve) return getContainer();
        return basicGetContainer();
      case ContainerPackage.VOLUMES_FROM__ACCESS_MODE:
        return getAccessMode();
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
      case ContainerPackage.VOLUMES_FROM__CONTAINER:
        setContainer((org.eclipse.docker.language.container.Container)newValue);
        return;
      case ContainerPackage.VOLUMES_FROM__ACCESS_MODE:
        setAccessMode((AccessMode)newValue);
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
      case ContainerPackage.VOLUMES_FROM__CONTAINER:
        setContainer((org.eclipse.docker.language.container.Container)null);
        return;
      case ContainerPackage.VOLUMES_FROM__ACCESS_MODE:
        setAccessMode(ACCESS_MODE_EDEFAULT);
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
      case ContainerPackage.VOLUMES_FROM__CONTAINER:
        return container != null;
      case ContainerPackage.VOLUMES_FROM__ACCESS_MODE:
        return accessMode != ACCESS_MODE_EDEFAULT;
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
    result.append(" (accessMode: ");
    result.append(accessMode);
    result.append(')');
    return result.toString();
  }

} //VolumesFromImpl
