/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ExposedPort;
import org.eclipse.docker.language.container.InternalProtocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exposed Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.ExposedPortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ExposedPortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExposedPortImpl extends MinimalEObjectImpl.Container implements ExposedPort
{
  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final InternalProtocol PROTOCOL_EDEFAULT = InternalProtocol.TCP;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected InternalProtocol protocol = PROTOCOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExposedPortImpl()
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
    return ContainerPackage.Literals.EXPOSED_PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.EXPOSED_PORT__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalProtocol getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(InternalProtocol newProtocol)
  {
    InternalProtocol oldProtocol = protocol;
    protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.EXPOSED_PORT__PROTOCOL, oldProtocol, protocol));
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
      case ContainerPackage.EXPOSED_PORT__PORT:
        return getPort();
      case ContainerPackage.EXPOSED_PORT__PROTOCOL:
        return getProtocol();
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
      case ContainerPackage.EXPOSED_PORT__PORT:
        setPort((String)newValue);
        return;
      case ContainerPackage.EXPOSED_PORT__PROTOCOL:
        setProtocol((InternalProtocol)newValue);
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
      case ContainerPackage.EXPOSED_PORT__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case ContainerPackage.EXPOSED_PORT__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
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
      case ContainerPackage.EXPOSED_PORT__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
      case ContainerPackage.EXPOSED_PORT__PROTOCOL:
        return protocol != PROTOCOL_EDEFAULT;
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
    result.append(" (port: ");
    result.append(port);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(')');
    return result.toString();
  }

} //ExposedPortImpl
