/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.ImageSection#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.ImageSection#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getImageSection()
 * @model
 * @generated
 */
public interface ImageSection extends EObject
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
   * @see org.eclipse.docker.language.container.ContainerPackage#getImageSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.ImageSection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.eclipse.docker.language.container.ContainerPackage#getImageSection_Images()
   * @model containment="true"
   * @generated
   */
  EList<Image> getImages();

} // ImageSection
