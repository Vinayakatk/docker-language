/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.Binding;
import org.eclipse.docker.language.container.ContainerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.BindingImpl#getHostIP <em>Host IP</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.BindingImpl#getHostPort <em>Host Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The default value of the '{@link #getHostIP() <em>Host IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostIP()
   * @generated
   * @ordered
   */
  protected static final String HOST_IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostIP() <em>Host IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostIP()
   * @generated
   * @ordered
   */
  protected String hostIP = HOST_IP_EDEFAULT;

  /**
   * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostPort()
   * @generated
   * @ordered
   */
  protected static final int HOST_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostPort()
   * @generated
   * @ordered
   */
  protected int hostPort = HOST_PORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return ContainerPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHostIP()
  {
    return hostIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostIP(String newHostIP)
  {
    String oldHostIP = hostIP;
    hostIP = newHostIP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.BINDING__HOST_IP, oldHostIP, hostIP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHostPort()
  {
    return hostPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostPort(int newHostPort)
  {
    int oldHostPort = hostPort;
    hostPort = newHostPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.BINDING__HOST_PORT, oldHostPort, hostPort));
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
      case ContainerPackage.BINDING__HOST_IP:
        return getHostIP();
      case ContainerPackage.BINDING__HOST_PORT:
        return getHostPort();
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
      case ContainerPackage.BINDING__HOST_IP:
        setHostIP((String)newValue);
        return;
      case ContainerPackage.BINDING__HOST_PORT:
        setHostPort((Integer)newValue);
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
      case ContainerPackage.BINDING__HOST_IP:
        setHostIP(HOST_IP_EDEFAULT);
        return;
      case ContainerPackage.BINDING__HOST_PORT:
        setHostPort(HOST_PORT_EDEFAULT);
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
      case ContainerPackage.BINDING__HOST_IP:
        return HOST_IP_EDEFAULT == null ? hostIP != null : !HOST_IP_EDEFAULT.equals(hostIP);
      case ContainerPackage.BINDING__HOST_PORT:
        return hostPort != HOST_PORT_EDEFAULT;
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
    result.append(" (hostIP: ");
    result.append(hostIP);
    result.append(", hostPort: ");
    result.append(hostPort);
    result.append(')');
    return result.toString();
  }

} //BindingImpl
