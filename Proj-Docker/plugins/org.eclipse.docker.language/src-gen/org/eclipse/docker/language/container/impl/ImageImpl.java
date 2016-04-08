/**
 */
package org.eclipse.docker.language.container.impl;

import org.eclipse.docker.language.container.BuildArgs;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.Image;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getDockerFilelocation <em>Docker Filelocation</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getBuildargs <em>Buildargs</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#isNoCache <em>No Cache</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getMemswap <em>Memswap</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getCpusetcpus <em>Cpusetcpus</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#getCpushares <em>Cpushares</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#isRemove <em>Remove</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#isQuiet <em>Quiet</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.ImageImpl#isPull <em>Pull</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends MinimalEObjectImpl.Container implements Image
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * The default value of the '{@link #getDockerFilelocation() <em>Docker Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDockerFilelocation()
   * @generated
   * @ordered
   */
  protected static final String DOCKER_FILELOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDockerFilelocation() <em>Docker Filelocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDockerFilelocation()
   * @generated
   * @ordered
   */
  protected String dockerFilelocation = DOCKER_FILELOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBuildargs() <em>Buildargs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildargs()
   * @generated
   * @ordered
   */
  protected BuildArgs buildargs;

  /**
   * The default value of the '{@link #isNoCache() <em>No Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoCache()
   * @generated
   * @ordered
   */
  protected static final boolean NO_CACHE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoCache() <em>No Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoCache()
   * @generated
   * @ordered
   */
  protected boolean noCache = NO_CACHE_EDEFAULT;

  /**
   * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected static final long MEMORY_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemory()
   * @generated
   * @ordered
   */
  protected long memory = MEMORY_EDEFAULT;

  /**
   * The default value of the '{@link #getMemswap() <em>Memswap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemswap()
   * @generated
   * @ordered
   */
  protected static final long MEMSWAP_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getMemswap() <em>Memswap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemswap()
   * @generated
   * @ordered
   */
  protected long memswap = MEMSWAP_EDEFAULT;

  /**
   * The default value of the '{@link #getCpusetcpus() <em>Cpusetcpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetcpus()
   * @generated
   * @ordered
   */
  protected static final String CPUSETCPUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCpusetcpus() <em>Cpusetcpus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpusetcpus()
   * @generated
   * @ordered
   */
  protected String cpusetcpus = CPUSETCPUS_EDEFAULT;

  /**
   * The default value of the '{@link #getCpushares() <em>Cpushares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpushares()
   * @generated
   * @ordered
   */
  protected static final String CPUSHARES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCpushares() <em>Cpushares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpushares()
   * @generated
   * @ordered
   */
  protected String cpushares = CPUSHARES_EDEFAULT;

  /**
   * The default value of the '{@link #isRemove() <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRemove()
   * @generated
   * @ordered
   */
  protected static final boolean REMOVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRemove() <em>Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRemove()
   * @generated
   * @ordered
   */
  protected boolean remove = REMOVE_EDEFAULT;

  /**
   * The default value of the '{@link #isQuiet() <em>Quiet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuiet()
   * @generated
   * @ordered
   */
  protected static final boolean QUIET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQuiet() <em>Quiet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuiet()
   * @generated
   * @ordered
   */
  protected boolean quiet = QUIET_EDEFAULT;

  /**
   * The default value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected static final boolean PULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPull() <em>Pull</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPull()
   * @generated
   * @ordered
   */
  protected boolean pull = PULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ContainerPackage.Literals.IMAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__TAG, oldTag, tag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDockerFilelocation()
  {
    return dockerFilelocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDockerFilelocation(String newDockerFilelocation)
  {
    String oldDockerFilelocation = dockerFilelocation;
    dockerFilelocation = newDockerFilelocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__DOCKER_FILELOCATION, oldDockerFilelocation, dockerFilelocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildArgs getBuildargs()
  {
    return buildargs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuildargs(BuildArgs newBuildargs, NotificationChain msgs)
  {
    BuildArgs oldBuildargs = buildargs;
    buildargs = newBuildargs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__BUILDARGS, oldBuildargs, newBuildargs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuildargs(BuildArgs newBuildargs)
  {
    if (newBuildargs != buildargs)
    {
      NotificationChain msgs = null;
      if (buildargs != null)
        msgs = ((InternalEObject)buildargs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.IMAGE__BUILDARGS, null, msgs);
      if (newBuildargs != null)
        msgs = ((InternalEObject)newBuildargs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.IMAGE__BUILDARGS, null, msgs);
      msgs = basicSetBuildargs(newBuildargs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__BUILDARGS, newBuildargs, newBuildargs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoCache()
  {
    return noCache;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoCache(boolean newNoCache)
  {
    boolean oldNoCache = noCache;
    noCache = newNoCache;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__NO_CACHE, oldNoCache, noCache));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getMemory()
  {
    return memory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemory(long newMemory)
  {
    long oldMemory = memory;
    memory = newMemory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__MEMORY, oldMemory, memory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getMemswap()
  {
    return memswap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemswap(long newMemswap)
  {
    long oldMemswap = memswap;
    memswap = newMemswap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__MEMSWAP, oldMemswap, memswap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCpusetcpus()
  {
    return cpusetcpus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpusetcpus(String newCpusetcpus)
  {
    String oldCpusetcpus = cpusetcpus;
    cpusetcpus = newCpusetcpus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__CPUSETCPUS, oldCpusetcpus, cpusetcpus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCpushares()
  {
    return cpushares;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCpushares(String newCpushares)
  {
    String oldCpushares = cpushares;
    cpushares = newCpushares;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__CPUSHARES, oldCpushares, cpushares));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemove()
  {
    return remove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemove(boolean newRemove)
  {
    boolean oldRemove = remove;
    remove = newRemove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__REMOVE, oldRemove, remove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQuiet()
  {
    return quiet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuiet(boolean newQuiet)
  {
    boolean oldQuiet = quiet;
    quiet = newQuiet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__QUIET, oldQuiet, quiet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPull()
  {
    return pull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPull(boolean newPull)
  {
    boolean oldPull = pull;
    pull = newPull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.IMAGE__PULL, oldPull, pull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ContainerPackage.IMAGE__BUILDARGS:
        return basicSetBuildargs(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ContainerPackage.IMAGE__NAME:
        return getName();
      case ContainerPackage.IMAGE__TAG:
        return getTag();
      case ContainerPackage.IMAGE__DOCKER_FILELOCATION:
        return getDockerFilelocation();
      case ContainerPackage.IMAGE__BUILDARGS:
        return getBuildargs();
      case ContainerPackage.IMAGE__NO_CACHE:
        return isNoCache();
      case ContainerPackage.IMAGE__MEMORY:
        return getMemory();
      case ContainerPackage.IMAGE__MEMSWAP:
        return getMemswap();
      case ContainerPackage.IMAGE__CPUSETCPUS:
        return getCpusetcpus();
      case ContainerPackage.IMAGE__CPUSHARES:
        return getCpushares();
      case ContainerPackage.IMAGE__REMOVE:
        return isRemove();
      case ContainerPackage.IMAGE__QUIET:
        return isQuiet();
      case ContainerPackage.IMAGE__PULL:
        return isPull();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContainerPackage.IMAGE__NAME:
        setName((String)newValue);
        return;
      case ContainerPackage.IMAGE__TAG:
        setTag((String)newValue);
        return;
      case ContainerPackage.IMAGE__DOCKER_FILELOCATION:
        setDockerFilelocation((String)newValue);
        return;
      case ContainerPackage.IMAGE__BUILDARGS:
        setBuildargs((BuildArgs)newValue);
        return;
      case ContainerPackage.IMAGE__NO_CACHE:
        setNoCache((Boolean)newValue);
        return;
      case ContainerPackage.IMAGE__MEMORY:
        setMemory((Long)newValue);
        return;
      case ContainerPackage.IMAGE__MEMSWAP:
        setMemswap((Long)newValue);
        return;
      case ContainerPackage.IMAGE__CPUSETCPUS:
        setCpusetcpus((String)newValue);
        return;
      case ContainerPackage.IMAGE__CPUSHARES:
        setCpushares((String)newValue);
        return;
      case ContainerPackage.IMAGE__REMOVE:
        setRemove((Boolean)newValue);
        return;
      case ContainerPackage.IMAGE__QUIET:
        setQuiet((Boolean)newValue);
        return;
      case ContainerPackage.IMAGE__PULL:
        setPull((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ContainerPackage.IMAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__TAG:
        setTag(TAG_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__DOCKER_FILELOCATION:
        setDockerFilelocation(DOCKER_FILELOCATION_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__BUILDARGS:
        setBuildargs((BuildArgs)null);
        return;
      case ContainerPackage.IMAGE__NO_CACHE:
        setNoCache(NO_CACHE_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__MEMORY:
        setMemory(MEMORY_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__MEMSWAP:
        setMemswap(MEMSWAP_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__CPUSETCPUS:
        setCpusetcpus(CPUSETCPUS_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__CPUSHARES:
        setCpushares(CPUSHARES_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__REMOVE:
        setRemove(REMOVE_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__QUIET:
        setQuiet(QUIET_EDEFAULT);
        return;
      case ContainerPackage.IMAGE__PULL:
        setPull(PULL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ContainerPackage.IMAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ContainerPackage.IMAGE__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
      case ContainerPackage.IMAGE__DOCKER_FILELOCATION:
        return DOCKER_FILELOCATION_EDEFAULT == null ? dockerFilelocation != null : !DOCKER_FILELOCATION_EDEFAULT.equals(dockerFilelocation);
      case ContainerPackage.IMAGE__BUILDARGS:
        return buildargs != null;
      case ContainerPackage.IMAGE__NO_CACHE:
        return noCache != NO_CACHE_EDEFAULT;
      case ContainerPackage.IMAGE__MEMORY:
        return memory != MEMORY_EDEFAULT;
      case ContainerPackage.IMAGE__MEMSWAP:
        return memswap != MEMSWAP_EDEFAULT;
      case ContainerPackage.IMAGE__CPUSETCPUS:
        return CPUSETCPUS_EDEFAULT == null ? cpusetcpus != null : !CPUSETCPUS_EDEFAULT.equals(cpusetcpus);
      case ContainerPackage.IMAGE__CPUSHARES:
        return CPUSHARES_EDEFAULT == null ? cpushares != null : !CPUSHARES_EDEFAULT.equals(cpushares);
      case ContainerPackage.IMAGE__REMOVE:
        return remove != REMOVE_EDEFAULT;
      case ContainerPackage.IMAGE__QUIET:
        return quiet != QUIET_EDEFAULT;
      case ContainerPackage.IMAGE__PULL:
        return pull != PULL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", tag: ");
    result.append(tag);
    result.append(", dockerFilelocation: ");
    result.append(dockerFilelocation);
    result.append(", noCache: ");
    result.append(noCache);
    result.append(", memory: ");
    result.append(memory);
    result.append(", memswap: ");
    result.append(memswap);
    result.append(", cpusetcpus: ");
    result.append(cpusetcpus);
    result.append(", cpushares: ");
    result.append(cpushares);
    result.append(", remove: ");
    result.append(remove);
    result.append(", quiet: ");
    result.append(quiet);
    result.append(", pull: ");
    result.append(pull);
    result.append(')');
    return result.toString();
  }

} //ImageImpl
