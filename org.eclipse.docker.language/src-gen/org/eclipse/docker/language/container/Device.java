/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Device#getCGroupPermissions <em>CGroup Permissions</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Device#getPathOnHost <em>Path On Host</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Device#getPathInContainer <em>Path In Container</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
{
  /**
   * Returns the value of the '<em><b>CGroup Permissions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CGroup Permissions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CGroup Permissions</em>' attribute.
   * @see #setCGroupPermissions(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getDevice_CGroupPermissions()
   * @model
   * @generated
   */
  String getCGroupPermissions();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Device#getCGroupPermissions <em>CGroup Permissions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CGroup Permissions</em>' attribute.
   * @see #getCGroupPermissions()
   * @generated
   */
  void setCGroupPermissions(String value);

  /**
   * Returns the value of the '<em><b>Path On Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path On Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path On Host</em>' attribute.
   * @see #setPathOnHost(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getDevice_PathOnHost()
   * @model
   * @generated
   */
  String getPathOnHost();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Device#getPathOnHost <em>Path On Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path On Host</em>' attribute.
   * @see #getPathOnHost()
   * @generated
   */
  void setPathOnHost(String value);

  /**
   * Returns the value of the '<em><b>Path In Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path In Container</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path In Container</em>' attribute.
   * @see #setPathInContainer(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getDevice_PathInContainer()
   * @model
   * @generated
   */
  String getPathInContainer();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Device#getPathInContainer <em>Path In Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path In Container</em>' attribute.
   * @see #getPathInContainer()
   * @generated
   */
  void setPathInContainer(String value);

} // Device
