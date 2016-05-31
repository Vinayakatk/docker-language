/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.RestartPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restart Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.RestartPolicyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.RestartPolicyImpl#getMaximumRetryCount <em>Maximum Retry Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestartPolicyImpl extends MinimalEObjectImpl.Container implements RestartPolicy
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaximumRetryCount() <em>Maximum Retry Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximumRetryCount()
   * @generated
   * @ordered
   */
  protected static final int MAXIMUM_RETRY_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaximumRetryCount() <em>Maximum Retry Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximumRetryCount()
   * @generated
   * @ordered
   */
  protected int maximumRetryCount = MAXIMUM_RETRY_COUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestartPolicyImpl()
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
    return ContainerPackage.Literals.RESTART_POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.RESTART_POLICY__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaximumRetryCount()
  {
    return maximumRetryCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaximumRetryCount(int newMaximumRetryCount)
  {
    int oldMaximumRetryCount = maximumRetryCount;
    maximumRetryCount = newMaximumRetryCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.RESTART_POLICY__MAXIMUM_RETRY_COUNT, oldMaximumRetryCount, maximumRetryCount));
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
      case ContainerPackage.RESTART_POLICY__VALUE:
        return getValue();
      case ContainerPackage.RESTART_POLICY__MAXIMUM_RETRY_COUNT:
        return getMaximumRetryCount();
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
      case ContainerPackage.RESTART_POLICY__VALUE:
        setValue((String)newValue);
        return;
      case ContainerPackage.RESTART_POLICY__MAXIMUM_RETRY_COUNT:
        setMaximumRetryCount((Integer)newValue);
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
      case ContainerPackage.RESTART_POLICY__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ContainerPackage.RESTART_POLICY__MAXIMUM_RETRY_COUNT:
        setMaximumRetryCount(MAXIMUM_RETRY_COUNT_EDEFAULT);
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
      case ContainerPackage.RESTART_POLICY__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ContainerPackage.RESTART_POLICY__MAXIMUM_RETRY_COUNT:
        return maximumRetryCount != MAXIMUM_RETRY_COUNT_EDEFAULT;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", maximumRetryCount: ");
    result.append(maximumRetryCount);
    result.append(')');
    return result.toString();
  }

} //RestartPolicyImpl
