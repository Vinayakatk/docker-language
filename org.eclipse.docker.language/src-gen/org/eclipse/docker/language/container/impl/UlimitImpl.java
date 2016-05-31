/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Ulimit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ulimit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.UlimitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.UlimitImpl#getSoft <em>Soft</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.UlimitImpl#getHard <em>Hard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UlimitImpl extends MinimalEObjectImpl.Container implements Ulimit
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSoft() <em>Soft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoft()
   * @generated
   * @ordered
   */
  protected static final int SOFT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSoft() <em>Soft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoft()
   * @generated
   * @ordered
   */
  protected int soft = SOFT_EDEFAULT;

  /**
   * The default value of the '{@link #getHard() <em>Hard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHard()
   * @generated
   * @ordered
   */
  protected static final int HARD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHard() <em>Hard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHard()
   * @generated
   * @ordered
   */
  protected int hard = HARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UlimitImpl()
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
    return ContainerPackage.Literals.ULIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.ULIMIT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSoft()
  {
    return soft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSoft(int newSoft)
  {
    int oldSoft = soft;
    soft = newSoft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.ULIMIT__SOFT, oldSoft, soft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHard()
  {
    return hard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHard(int newHard)
  {
    int oldHard = hard;
    hard = newHard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.ULIMIT__HARD, oldHard, hard));
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
      case ContainerPackage.ULIMIT__NAME:
        return getName();
      case ContainerPackage.ULIMIT__SOFT:
        return getSoft();
      case ContainerPackage.ULIMIT__HARD:
        return getHard();
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
      case ContainerPackage.ULIMIT__NAME:
        setName((String)newValue);
        return;
      case ContainerPackage.ULIMIT__SOFT:
        setSoft((Integer)newValue);
        return;
      case ContainerPackage.ULIMIT__HARD:
        setHard((Integer)newValue);
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
      case ContainerPackage.ULIMIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ContainerPackage.ULIMIT__SOFT:
        setSoft(SOFT_EDEFAULT);
        return;
      case ContainerPackage.ULIMIT__HARD:
        setHard(HARD_EDEFAULT);
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
      case ContainerPackage.ULIMIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ContainerPackage.ULIMIT__SOFT:
        return soft != SOFT_EDEFAULT;
      case ContainerPackage.ULIMIT__HARD:
        return hard != HARD_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", soft: ");
    result.append(soft);
    result.append(", hard: ");
    result.append(hard);
    result.append(')');
    return result.toString();
  }

} //UlimitImpl
