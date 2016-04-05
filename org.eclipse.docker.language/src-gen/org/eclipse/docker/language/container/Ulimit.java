/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ulimit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Ulimit#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Ulimit#getSoft <em>Soft</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Ulimit#getHard <em>Hard</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getUlimit()
 * @model
 * @generated
 */
public interface Ulimit extends EObject
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
   * @see org.eclipse.docker.language.container.ContainerPackage#getUlimit_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Ulimit#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Soft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Soft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Soft</em>' attribute.
   * @see #setSoft(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getUlimit_Soft()
   * @model
   * @generated
   */
  int getSoft();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Ulimit#getSoft <em>Soft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Soft</em>' attribute.
   * @see #getSoft()
   * @generated
   */
  void setSoft(int value);

  /**
   * Returns the value of the '<em><b>Hard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hard</em>' attribute.
   * @see #setHard(int)
   * @see org.eclipse.docker.language.container.ContainerPackage#getUlimit_Hard()
   * @model
   * @generated
   */
  int getHard();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Ulimit#getHard <em>Hard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hard</em>' attribute.
   * @see #getHard()
   * @generated
   */
  void setHard(int value);

} // Ulimit
