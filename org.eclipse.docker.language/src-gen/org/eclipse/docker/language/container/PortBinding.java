/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.PortBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.PortBinding#getExposedPort <em>Exposed Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getPortBinding()
 * @model
 * @generated
 */
public interface PortBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Binding)
   * @see org.eclipse.docker.language.container.ContainerPackage#getPortBinding_Binding()
   * @model containment="true"
   * @generated
   */
  Binding getBinding();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.PortBinding#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Binding value);

  /**
   * Returns the value of the '<em><b>Exposed Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposed Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exposed Port</em>' reference.
   * @see #setExposedPort(ExposedPort)
   * @see org.eclipse.docker.language.container.ContainerPackage#getPortBinding_ExposedPort()
   * @model
   * @generated
   */
  ExposedPort getExposedPort();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.PortBinding#getExposedPort <em>Exposed Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exposed Port</em>' reference.
   * @see #getExposedPort()
   * @generated
   */
  void setExposedPort(ExposedPort value);

} // PortBinding
