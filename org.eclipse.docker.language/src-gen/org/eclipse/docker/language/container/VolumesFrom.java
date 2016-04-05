/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumes From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.VolumesFrom#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.VolumesFrom#getAccessMode <em>Access Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getVolumesFrom()
 * @model
 * @generated
 */
public interface VolumesFrom extends EObject
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' reference.
   * @see #setContainer(Container)
   * @see org.eclipse.docker.language.container.ContainerPackage#getVolumesFrom_Container()
   * @model
   * @generated
   */
  Container getContainer();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.VolumesFrom#getContainer <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Container value);

  /**
   * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.docker.language.container.AccessMode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Mode</em>' attribute.
   * @see org.eclipse.docker.language.container.AccessMode
   * @see #setAccessMode(AccessMode)
   * @see org.eclipse.docker.language.container.ContainerPackage#getVolumesFrom_AccessMode()
   * @model
   * @generated
   */
  AccessMode getAccessMode();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.VolumesFrom#getAccessMode <em>Access Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Mode</em>' attribute.
   * @see org.eclipse.docker.language.container.AccessMode
   * @see #getAccessMode()
   * @generated
   */
  void setAccessMode(AccessMode value);

} // VolumesFrom
