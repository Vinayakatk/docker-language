/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Bind#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Bind#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Bind#getAccessMode1 <em>Access Mode1</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getBind()
 * @model
 * @generated
 */
public interface Bind extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getBind_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Bind#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Volume</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volume</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volume</em>' containment reference.
   * @see #setVolume(Volume)
   * @see org.eclipse.docker.language.container.ContainerPackage#getBind_Volume()
   * @model containment="true"
   * @generated
   */
  Volume getVolume();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Bind#getVolume <em>Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volume</em>' containment reference.
   * @see #getVolume()
   * @generated
   */
  void setVolume(Volume value);

  /**
   * Returns the value of the '<em><b>Access Mode1</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.docker.language.container.AccessMode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Mode1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Mode1</em>' attribute.
   * @see org.eclipse.docker.language.container.AccessMode
   * @see #setAccessMode1(AccessMode)
   * @see org.eclipse.docker.language.container.ContainerPackage#getBind_AccessMode1()
   * @model
   * @generated
   */
  AccessMode getAccessMode1();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Bind#getAccessMode1 <em>Access Mode1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Mode1</em>' attribute.
   * @see org.eclipse.docker.language.container.AccessMode
   * @see #getAccessMode1()
   * @generated
   */
  void setAccessMode1(AccessMode value);

} // Bind
