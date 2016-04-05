/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restart Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.RestartPolicy#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.RestartPolicy#getMaximumRetryCount <em>Maximum Retry Count</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getRestartPolicy()
 * @model
 * @generated
 */
public interface RestartPolicy extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getRestartPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.RestartPolicy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Maximum Retry Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum Retry Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Retry Count</em>' attribute.
   * @see #setMaximumRetryCount(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getRestartPolicy_MaximumRetryCount()
   * @model
   * @generated
   */
  int getMaximumRetryCount();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.RestartPolicy#getMaximumRetryCount <em>Maximum Retry Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum Retry Count</em>' attribute.
   * @see #getMaximumRetryCount()
   * @generated
   */
  void setMaximumRetryCount(int value);

} // RestartPolicy
