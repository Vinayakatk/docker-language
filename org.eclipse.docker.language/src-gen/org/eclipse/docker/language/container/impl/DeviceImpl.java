/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Device;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.DeviceImpl#getCGroupPermissions <em>CGroup Permissions</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DeviceImpl#getPathOnHost <em>Path On Host</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DeviceImpl#getPathInContainer <em>Path In Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device
{
  /**
   * The default value of the '{@link #getCGroupPermissions() <em>CGroup Permissions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCGroupPermissions()
   * @generated
   * @ordered
   */
  protected static final String CGROUP_PERMISSIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCGroupPermissions() <em>CGroup Permissions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCGroupPermissions()
   * @generated
   * @ordered
   */
  protected String cGroupPermissions = CGROUP_PERMISSIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getPathOnHost() <em>Path On Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathOnHost()
   * @generated
   * @ordered
   */
  protected static final String PATH_ON_HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPathOnHost() <em>Path On Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathOnHost()
   * @generated
   * @ordered
   */
  protected String pathOnHost = PATH_ON_HOST_EDEFAULT;

  /**
   * The default value of the '{@link #getPathInContainer() <em>Path In Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathInContainer()
   * @generated
   * @ordered
   */
  protected static final String PATH_IN_CONTAINER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPathInContainer() <em>Path In Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathInContainer()
   * @generated
   * @ordered
   */
  protected String pathInContainer = PATH_IN_CONTAINER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
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
    return ContainerPackage.Literals.DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCGroupPermissions()
  {
    return cGroupPermissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCGroupPermissions(String newCGroupPermissions)
  {
    String oldCGroupPermissions = cGroupPermissions;
    cGroupPermissions = newCGroupPermissions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DEVICE__CGROUP_PERMISSIONS, oldCGroupPermissions, cGroupPermissions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPathOnHost()
  {
    return pathOnHost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathOnHost(String newPathOnHost)
  {
    String oldPathOnHost = pathOnHost;
    pathOnHost = newPathOnHost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DEVICE__PATH_ON_HOST, oldPathOnHost, pathOnHost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPathInContainer()
  {
    return pathInContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathInContainer(String newPathInContainer)
  {
    String oldPathInContainer = pathInContainer;
    pathInContainer = newPathInContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DEVICE__PATH_IN_CONTAINER, oldPathInContainer, pathInContainer));
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
      case ContainerPackage.DEVICE__CGROUP_PERMISSIONS:
        return getCGroupPermissions();
      case ContainerPackage.DEVICE__PATH_ON_HOST:
        return getPathOnHost();
      case ContainerPackage.DEVICE__PATH_IN_CONTAINER:
        return getPathInContainer();
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
      case ContainerPackage.DEVICE__CGROUP_PERMISSIONS:
        setCGroupPermissions((String)newValue);
        return;
      case ContainerPackage.DEVICE__PATH_ON_HOST:
        setPathOnHost((String)newValue);
        return;
      case ContainerPackage.DEVICE__PATH_IN_CONTAINER:
        setPathInContainer((String)newValue);
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
      case ContainerPackage.DEVICE__CGROUP_PERMISSIONS:
        setCGroupPermissions(CGROUP_PERMISSIONS_EDEFAULT);
        return;
      case ContainerPackage.DEVICE__PATH_ON_HOST:
        setPathOnHost(PATH_ON_HOST_EDEFAULT);
        return;
      case ContainerPackage.DEVICE__PATH_IN_CONTAINER:
        setPathInContainer(PATH_IN_CONTAINER_EDEFAULT);
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
      case ContainerPackage.DEVICE__CGROUP_PERMISSIONS:
        return CGROUP_PERMISSIONS_EDEFAULT == null ? cGroupPermissions != null : !CGROUP_PERMISSIONS_EDEFAULT.equals(cGroupPermissions);
      case ContainerPackage.DEVICE__PATH_ON_HOST:
        return PATH_ON_HOST_EDEFAULT == null ? pathOnHost != null : !PATH_ON_HOST_EDEFAULT.equals(pathOnHost);
      case ContainerPackage.DEVICE__PATH_IN_CONTAINER:
        return PATH_IN_CONTAINER_EDEFAULT == null ? pathInContainer != null : !PATH_IN_CONTAINER_EDEFAULT.equals(pathInContainer);
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
    result.append(" (cGroupPermissions: ");
    result.append(cGroupPermissions);
    result.append(", pathOnHost: ");
    result.append(pathOnHost);
    result.append(", pathInContainer: ");
    result.append(pathInContainer);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
