/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.AccessMode;
import org.eclipse.docker.language.container.Bind;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Volume;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.BindImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.BindImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.BindImpl#getAccessMode1 <em>Access Mode1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindImpl extends MinimalEObjectImpl.Container implements Bind
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected Volume volume;

  /**
   * The default value of the '{@link #getAccessMode1() <em>Access Mode1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessMode1()
   * @generated
   * @ordered
   */
  protected static final AccessMode ACCESS_MODE1_EDEFAULT = AccessMode.RW;

  /**
   * The cached value of the '{@link #getAccessMode1() <em>Access Mode1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessMode1()
   * @generated
   * @ordered
   */
  protected AccessMode accessMode1 = ACCESS_MODE1_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindImpl()
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
    return ContainerPackage.Literals.BIND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.BIND__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Volume getVolume()
  {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVolume(Volume newVolume, NotificationChain msgs)
  {
    Volume oldVolume = volume;
    volume = newVolume;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.BIND__VOLUME, oldVolume, newVolume);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(Volume newVolume)
  {
    if (newVolume != volume)
    {
      NotificationChain msgs = null;
      if (volume != null)
        msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.BIND__VOLUME, null, msgs);
      if (newVolume != null)
        msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.BIND__VOLUME, null, msgs);
      msgs = basicSetVolume(newVolume, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.BIND__VOLUME, newVolume, newVolume));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessMode getAccessMode1()
  {
    return accessMode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMode1(AccessMode newAccessMode1)
  {
    AccessMode oldAccessMode1 = accessMode1;
    accessMode1 = newAccessMode1 == null ? ACCESS_MODE1_EDEFAULT : newAccessMode1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.BIND__ACCESS_MODE1, oldAccessMode1, accessMode1));
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
      case ContainerPackage.BIND__VOLUME:
        return basicSetVolume(null, msgs);
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
      case ContainerPackage.BIND__LOCATION:
        return getLocation();
      case ContainerPackage.BIND__VOLUME:
        return getVolume();
      case ContainerPackage.BIND__ACCESS_MODE1:
        return getAccessMode1();
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
      case ContainerPackage.BIND__LOCATION:
        setLocation((String)newValue);
        return;
      case ContainerPackage.BIND__VOLUME:
        setVolume((Volume)newValue);
        return;
      case ContainerPackage.BIND__ACCESS_MODE1:
        setAccessMode1((AccessMode)newValue);
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
      case ContainerPackage.BIND__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case ContainerPackage.BIND__VOLUME:
        setVolume((Volume)null);
        return;
      case ContainerPackage.BIND__ACCESS_MODE1:
        setAccessMode1(ACCESS_MODE1_EDEFAULT);
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
      case ContainerPackage.BIND__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case ContainerPackage.BIND__VOLUME:
        return volume != null;
      case ContainerPackage.BIND__ACCESS_MODE1:
        return accessMode1 != ACCESS_MODE1_EDEFAULT;
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
    result.append(" (location: ");
    result.append(location);
    result.append(", accessMode1: ");
    result.append(accessMode1);
    result.append(')');
    return result.toString();
  }

} //BindImpl
