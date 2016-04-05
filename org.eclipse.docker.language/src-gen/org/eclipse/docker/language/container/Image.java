/**
 */
package org.eclipse.docker.language.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.Image#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getDockerFileDir <em>Docker File Dir</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getBuildargs <em>Buildargs</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#isNoCache <em>No Cache</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getMemswap <em>Memswap</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getCpusetcpus <em>Cpusetcpus</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#getCpushares <em>Cpushares</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#isRemove <em>Remove</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#isQuiet <em>Quiet</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.Image#isPull <em>Pull</em>}</li>
 * </ul>
 *
 * @see org.eclipse.docker.language.container.ContainerPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject
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
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

  /**
   * Returns the value of the '<em><b>Docker File Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Docker File Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Docker File Dir</em>' attribute.
   * @see #setDockerFileDir(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_DockerFileDir()
   * @model
   * @generated
   */
  String getDockerFileDir();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getDockerFileDir <em>Docker File Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Docker File Dir</em>' attribute.
   * @see #getDockerFileDir()
   * @generated
   */
  void setDockerFileDir(String value);

  /**
   * Returns the value of the '<em><b>Buildargs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buildargs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buildargs</em>' containment reference.
   * @see #setBuildargs(BuildArgs)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Buildargs()
   * @model containment="true"
   * @generated
   */
  BuildArgs getBuildargs();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getBuildargs <em>Buildargs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buildargs</em>' containment reference.
   * @see #getBuildargs()
   * @generated
   */
  void setBuildargs(BuildArgs value);

  /**
   * Returns the value of the '<em><b>No Cache</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Cache</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Cache</em>' attribute.
   * @see #setNoCache(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_NoCache()
   * @model
   * @generated
   */
  boolean isNoCache();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#isNoCache <em>No Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Cache</em>' attribute.
   * @see #isNoCache()
   * @generated
   */
  void setNoCache(boolean value);

  /**
   * Returns the value of the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memory</em>' attribute.
   * @see #setMemory(long)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Memory()
   * @model
   * @generated
   */
  long getMemory();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getMemory <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memory</em>' attribute.
   * @see #getMemory()
   * @generated
   */
  void setMemory(long value);

  /**
   * Returns the value of the '<em><b>Memswap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memswap</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memswap</em>' attribute.
   * @see #setMemswap(long)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Memswap()
   * @model
   * @generated
   */
  long getMemswap();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getMemswap <em>Memswap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memswap</em>' attribute.
   * @see #getMemswap()
   * @generated
   */
  void setMemswap(long value);

  /**
   * Returns the value of the '<em><b>Cpusetcpus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpusetcpus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpusetcpus</em>' attribute.
   * @see #setCpusetcpus(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Cpusetcpus()
   * @model
   * @generated
   */
  String getCpusetcpus();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getCpusetcpus <em>Cpusetcpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpusetcpus</em>' attribute.
   * @see #getCpusetcpus()
   * @generated
   */
  void setCpusetcpus(String value);

  /**
   * Returns the value of the '<em><b>Cpushares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cpushares</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpushares</em>' attribute.
   * @see #setCpushares(String)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Cpushares()
   * @model
   * @generated
   */
  String getCpushares();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#getCpushares <em>Cpushares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cpushares</em>' attribute.
   * @see #getCpushares()
   * @generated
   */
  void setCpushares(String value);

  /**
   * Returns the value of the '<em><b>Remove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove</em>' attribute.
   * @see #setRemove(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Remove()
   * @model
   * @generated
   */
  boolean isRemove();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#isRemove <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove</em>' attribute.
   * @see #isRemove()
   * @generated
   */
  void setRemove(boolean value);

  /**
   * Returns the value of the '<em><b>Quiet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quiet</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quiet</em>' attribute.
   * @see #setQuiet(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Quiet()
   * @model
   * @generated
   */
  boolean isQuiet();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#isQuiet <em>Quiet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quiet</em>' attribute.
   * @see #isQuiet()
   * @generated
   */
  void setQuiet(boolean value);

  /**
   * Returns the value of the '<em><b>Pull</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pull</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pull</em>' attribute.
   * @see #setPull(boolean)
   * @see org.eclipse.docker.language.container.ContainerPackage#getImage_Pull()
   * @model
   * @generated
   */
  boolean isPull();

  /**
   * Sets the value of the '{@link org.eclipse.docker.language.container.Image#isPull <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pull</em>' attribute.
   * @see #isPull()
   * @generated
   */
  void setPull(boolean value);

} // Image
