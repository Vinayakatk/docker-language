/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Docker#getContainerRegion <em>Container Region</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Docker#getImageRegion <em>Image Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getDocker()
 * @model
 * @generated
 */
public interface Docker extends EObject
{
  /**
   * Returns the value of the '<em><b>Container Region</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Region</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Region</em>' containment reference.
   * @see #setContainerRegion(ContainerSection)
   * @see org.eclipse.docker.language.container.ContainerPackage#getDocker_ContainerRegion()
   * @model containment="true"
   * @generated
   */
  ContainerSection getContainerRegion();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Docker#getContainerRegion <em>Container Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Region</em>' containment reference.
   * @see #getContainerRegion()
   * @generated
   */
  void setContainerRegion(ContainerSection value);

  /**
   * Returns the value of the '<em><b>Image Region</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Region</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Region</em>' containment reference.
   * @see #setImageRegion(ImageSection)
   * @see org.eclipse.docker.language.container.ContainerPackage#getDocker_ImageRegion()
   * @model containment="true"
   * @generated
   */
  ImageSection getImageRegion();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Docker#getImageRegion <em>Image Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Region</em>' containment reference.
   * @see #getImageRegion()
   * @generated
   */
  void setImageRegion(ImageSection value);

} // Docker
