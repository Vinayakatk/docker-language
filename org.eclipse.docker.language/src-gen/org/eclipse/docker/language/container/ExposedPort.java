/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposed Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.ExposedPort#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.ExposedPort#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getExposedPort()
 * @model
 * @generated
 */
public interface ExposedPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getExposedPort_Port()
   * @model
   * @generated
   */
  String getPort();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.ExposedPort#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(String value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.docker.language.container.InternalProtocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see org.eclipse.docker.language.container.InternalProtocol
   * @see #setProtocol(InternalProtocol)
   * @see org.eclipse.docker.language.container.ContainerPackage#getExposedPort_Protocol()
   * @model
   * @generated
   */
  InternalProtocol getProtocol();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.ExposedPort#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see org.eclipse.docker.language.container.InternalProtocol
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(InternalProtocol value);

} // ExposedPort
