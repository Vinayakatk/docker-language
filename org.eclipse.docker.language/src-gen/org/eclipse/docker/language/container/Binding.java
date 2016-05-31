/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Binding#getHostIP <em>Host IP</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Binding#getHostPort <em>Host Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Host IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host IP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host IP</em>' attribute.
   * @see #setHostIP(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getBinding_HostIP()
   * @model
   * @generated
   */
  String getHostIP();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Binding#getHostIP <em>Host IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host IP</em>' attribute.
   * @see #getHostIP()
   * @generated
   */
  void setHostIP(String value);

  /**
   * Returns the value of the '<em><b>Host Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Port</em>' attribute.
   * @see #setHostPort(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getBinding_HostPort()
   * @model
   * @generated
   */
  int getHostPort();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Binding#getHostPort <em>Host Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host Port</em>' attribute.
   * @see #getHostPort()
   * @generated
   */
  void setHostPort(int value);

} // Binding
