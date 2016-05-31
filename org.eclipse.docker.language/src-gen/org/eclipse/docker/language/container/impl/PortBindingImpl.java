/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.Binding;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ExposedPort;
import org.eclipse.docker.language.container.PortBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.PortBindingImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.PortBindingImpl#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortBindingImpl extends MinimalEObjectImpl.Container implements PortBinding
{
  /**
   * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinding()
   * @generated
   * @ordered
   */
  protected Binding binding;

  /**
   * The cached value of the '{@link #getExposedPort() <em>Exposed Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposedPort()
   * @generated
   * @ordered
   */
  protected ExposedPort exposedPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortBindingImpl()
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
    return ContainerPackage.Literals.PORT_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding getBinding()
  {
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs)
  {
    Binding oldBinding = binding;
    binding = newBinding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.PORT_BINDING__BINDING, oldBinding, newBinding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinding(Binding newBinding)
  {
    if (newBinding != binding)
    {
      NotificationChain msgs = null;
      if (binding != null)
        msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.PORT_BINDING__BINDING, null, msgs);
      if (newBinding != null)
        msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.PORT_BINDING__BINDING, null, msgs);
      msgs = basicSetBinding(newBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.PORT_BINDING__BINDING, newBinding, newBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedPort getExposedPort()
  {
    if (exposedPort != null && exposedPort.eIsProxy())
    {
      InternalEObject oldExposedPort = (InternalEObject)exposedPort;
      exposedPort = (ExposedPort)eResolveProxy(oldExposedPort);
      if (exposedPort != oldExposedPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerPackage.PORT_BINDING__EXPOSED_PORT, oldExposedPort, exposedPort));
      }
    }
    return exposedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedPort basicGetExposedPort()
  {
    return exposedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExposedPort(ExposedPort newExposedPort)
  {
    ExposedPort oldExposedPort = exposedPort;
    exposedPort = newExposedPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.PORT_BINDING__EXPOSED_PORT, oldExposedPort, exposedPort));
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
      case ContainerPackage.PORT_BINDING__BINDING:
        return basicSetBinding(null, msgs);
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
      case ContainerPackage.PORT_BINDING__BINDING:
        return getBinding();
      case ContainerPackage.PORT_BINDING__EXPOSED_PORT:
        if (resolve) return getExposedPort();
        return basicGetExposedPort();
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
      case ContainerPackage.PORT_BINDING__BINDING:
        setBinding((Binding)newValue);
        return;
      case ContainerPackage.PORT_BINDING__EXPOSED_PORT:
        setExposedPort((ExposedPort)newValue);
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
      case ContainerPackage.PORT_BINDING__BINDING:
        setBinding((Binding)null);
        return;
      case ContainerPackage.PORT_BINDING__EXPOSED_PORT:
        setExposedPort((ExposedPort)null);
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
      case ContainerPackage.PORT_BINDING__BINDING:
        return binding != null;
      case ContainerPackage.PORT_BINDING__EXPOSED_PORT:
        return exposedPort != null;
    }
    return super.eIsSet(featureID);
  }

} //PortBindingImpl
