/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.AccessMode;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.VolumesFrom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumes From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.VolumesFromImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.VolumesFromImpl#getAccessMode <em>Access Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VolumesFromImpl extends MinimalEObjectImpl.Container implements VolumesFrom
{
  /**
   * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected String container = CONTAINER_EDEFAULT;

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
  public String getContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(String newContainer)
  {
    String oldContainer = container;
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
        return getContainer();
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
        setContainer((String)newValue);
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
        setContainer(CONTAINER_EDEFAULT);
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
        return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
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
    result.append(" (container: ");
    result.append(container);
    result.append(", accessMode: ");
    result.append(accessMode);
    result.append(')');
    return result.toString();
  }

} //VolumesFromImpl
