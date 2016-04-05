/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.LinkImpl#getContainerLink <em>Container Link</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.LinkImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link
{
  /**
   * The cached value of the '{@link #getContainerLink() <em>Container Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerLink()
   * @generated
   * @ordered
   */
  protected org.eclipse.docker.language.container.Container containerLink;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
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
    return ContainerPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.docker.language.container.Container getContainerLink()
  {
    if (containerLink != null && containerLink.eIsProxy())
    {
      InternalEObject oldContainerLink = (InternalEObject)containerLink;
      containerLink = (org.eclipse.docker.language.container.Container)eResolveProxy(oldContainerLink);
      if (containerLink != oldContainerLink)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainerPackage.LINK__CONTAINER_LINK, oldContainerLink, containerLink));
      }
    }
    return containerLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.docker.language.container.Container basicGetContainerLink()
  {
    return containerLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerLink(org.eclipse.docker.language.container.Container newContainerLink)
  {
    org.eclipse.docker.language.container.Container oldContainerLink = containerLink;
    containerLink = newContainerLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.LINK__CONTAINER_LINK, oldContainerLink, containerLink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.LINK__ALIAS, oldAlias, alias));
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
      case ContainerPackage.LINK__CONTAINER_LINK:
        if (resolve) return getContainerLink();
        return basicGetContainerLink();
      case ContainerPackage.LINK__ALIAS:
        return getAlias();
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
      case ContainerPackage.LINK__CONTAINER_LINK:
        setContainerLink((org.eclipse.docker.language.container.Container)newValue);
        return;
      case ContainerPackage.LINK__ALIAS:
        setAlias((String)newValue);
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
      case ContainerPackage.LINK__CONTAINER_LINK:
        setContainerLink((org.eclipse.docker.language.container.Container)null);
        return;
      case ContainerPackage.LINK__ALIAS:
        setAlias(ALIAS_EDEFAULT);
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
      case ContainerPackage.LINK__CONTAINER_LINK:
        return containerLink != null;
      case ContainerPackage.LINK__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
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
    result.append(" (alias: ");
    result.append(alias);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
