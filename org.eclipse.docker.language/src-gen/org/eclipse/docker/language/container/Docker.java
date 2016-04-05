/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Docker#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Docker#getImages <em>Images</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends EObject
{
  /**
   * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Container}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containers</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getDocker_Containers()
   * @model containment="true"
   * @generated
   */
  EList<Container> getContainers();

  /**
   * Returns the value of the '<em><b>Images</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.docker.language.container.Image}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images</em>' containment reference list.
   * @see org.eclipse.docker.language.container.ContainerPackage#getDocker_Images()
   * @model containment="true"
   * @generated
   */
  EList<Image> getImages();

} // Docker
