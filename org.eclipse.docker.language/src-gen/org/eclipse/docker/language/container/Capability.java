/**
 */
package org.eclipse.docker.language.container;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Capability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.docker.language.container.ContainerPackage#getCapability()
 * @model
 * @generated
 */
public enum Capability implements Enumerator
{
  /**
   * The '<em><b>ALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_VALUE
   * @generated
   * @ordered
   */
  ALL(0, "ALL", "ALL"),

  /**
   * The '<em><b>AUDIT CONTROL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUDIT_CONTROL_VALUE
   * @generated
   * @ordered
   */
  AUDIT_CONTROL(1, "AUDIT_CONTROL", "AUDIT_CONTROL"),

  /**
   * The '<em><b>AUDIT WRITE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUDIT_WRITE_VALUE
   * @generated
   * @ordered
   */
  AUDIT_WRITE(2, "AUDIT_WRITE", "AUDIT_WRITE"),

  /**
   * The '<em><b>BLOCK SUSPEND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLOCK_SUSPEND_VALUE
   * @generated
   * @ordered
   */
  BLOCK_SUSPEND(3, "BLOCK_SUSPEND", "BLOCK_SUSPEND"),

  /**
   * The '<em><b>CHOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHOWN_VALUE
   * @generated
   * @ordered
   */
  CHOWN(4, "CHOWN", "CHOWN"),

  /**
   * The '<em><b>DAC OVERRIDE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAC_OVERRIDE_VALUE
   * @generated
   * @ordered
   */
  DAC_OVERRIDE(5, "DAC_OVERRIDE", "DAC_OVERRIDE"),

  /**
   * The '<em><b>DAC READ SEARCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAC_READ_SEARCH_VALUE
   * @generated
   * @ordered
   */
  DAC_READ_SEARCH(6, "DAC_READ_SEARCH", "DAC_READ_SEARCH"),

  /**
   * The '<em><b>FOWNER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOWNER_VALUE
   * @generated
   * @ordered
   */
  FOWNER(7, "FOWNER", "FOWNER"),

  /**
   * The '<em><b>FSETID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FSETID_VALUE
   * @generated
   * @ordered
   */
  FSETID(8, "FSETID", "FSETID"),

  /**
   * The '<em><b>IPC LOCK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IPC_LOCK_VALUE
   * @generated
   * @ordered
   */
  IPC_LOCK(9, "IPC_LOCK", "IPC_LOCK"),

  /**
   * The '<em><b>IPC OWNER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IPC_OWNER_VALUE
   * @generated
   * @ordered
   */
  IPC_OWNER(10, "IPC_OWNER", "IPC_OWNER"),

  /**
   * The '<em><b>KILL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #KILL_VALUE
   * @generated
   * @ordered
   */
  KILL(11, "KILL", "KILL"),

  /**
   * The '<em><b>LEASE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEASE_VALUE
   * @generated
   * @ordered
   */
  LEASE(12, "LEASE", "LEASE"),

  /**
   * The '<em><b>LINUX IMMUTABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LINUX_IMMUTABLE_VALUE
   * @generated
   * @ordered
   */
  LINUX_IMMUTABLE(13, "LINUX_IMMUTABLE", "LINUX_IMMUTABLE"),

  /**
   * The '<em><b>MAC ADMIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAC_ADMIN_VALUE
   * @generated
   * @ordered
   */
  MAC_ADMIN(14, "MAC_ADMIN", "MAC_ADMIN"),

  /**
   * The '<em><b>MAC OVERRIDE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAC_OVERRIDE_VALUE
   * @generated
   * @ordered
   */
  MAC_OVERRIDE(15, "MAC_OVERRIDE", "MAC_OVERRIDE"),

  /**
   * The '<em><b>MKNOD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MKNOD_VALUE
   * @generated
   * @ordered
   */
  MKNOD(16, "MKNOD", "MKNOD"),

  /**
   * The '<em><b>NET ADMIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NET_ADMIN_VALUE
   * @generated
   * @ordered
   */
  NET_ADMIN(17, "NET_ADMIN", "NET_ADMIN"),

  /**
   * The '<em><b>NET BIND SERVICE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NET_BIND_SERVICE_VALUE
   * @generated
   * @ordered
   */
  NET_BIND_SERVICE(18, "NET_BIND_SERVICE", "NET_BIND_SERVICE"),

  /**
   * The '<em><b>NET BROADCAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NET_BROADCAST_VALUE
   * @generated
   * @ordered
   */
  NET_BROADCAST(19, "NET_BROADCAST", "NET_BROADCAST"),

  /**
   * The '<em><b>NET RAW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NET_RAW_VALUE
   * @generated
   * @ordered
   */
  NET_RAW(20, "NET_RAW", "NET_RAW"),

  /**
   * The '<em><b>SETFCAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETFCAP_VALUE
   * @generated
   * @ordered
   */
  SETFCAP(21, "SETFCAP", "SETFCAP"),

  /**
   * The '<em><b>SETGID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETGID_VALUE
   * @generated
   * @ordered
   */
  SETGID(22, "SETGID", "SETGID"),

  /**
   * The '<em><b>SETPCAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETPCAP_VALUE
   * @generated
   * @ordered
   */
  SETPCAP(23, "SETPCAP", "SETPCAP"),

  /**
   * The '<em><b>SETUID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETUID_VALUE
   * @generated
   * @ordered
   */
  SETUID(24, "SETUID", "SETUID"),

  /**
   * The '<em><b>SYS ADMIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_ADMIN_VALUE
   * @generated
   * @ordered
   */
  SYS_ADMIN(25, "SYS_ADMIN", "SYS_ADMIN"),

  /**
   * The '<em><b>SYS BOOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_BOOT_VALUE
   * @generated
   * @ordered
   */
  SYS_BOOT(26, "SYS_BOOT", "SYS_BOOT"),

  /**
   * The '<em><b>SYS CHROOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_CHROOT_VALUE
   * @generated
   * @ordered
   */
  SYS_CHROOT(27, "SYS_CHROOT", "SYS_CHROOT"),

  /**
   * The '<em><b>SYSLOG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYSLOG_VALUE
   * @generated
   * @ordered
   */
  SYSLOG(28, "SYSLOG", "SYSLOG"),

  /**
   * The '<em><b>SYS MODULE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_MODULE_VALUE
   * @generated
   * @ordered
   */
  SYS_MODULE(29, "SYS_MODULE", "SYS_MODULE"),

  /**
   * The '<em><b>SYS NICE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_NICE_VALUE
   * @generated
   * @ordered
   */
  SYS_NICE(30, "SYS_NICE", "SYS_NICE"),

  /**
   * The '<em><b>SYS PACCT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_PACCT_VALUE
   * @generated
   * @ordered
   */
  SYS_PACCT(31, "SYS_PACCT", "SYS_PACCT"),

  /**
   * The '<em><b>SYS PTRACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_PTRACE_VALUE
   * @generated
   * @ordered
   */
  SYS_PTRACE(32, "SYS_PTRACE", "SYS_PTRACE"),

  /**
   * The '<em><b>SYS RAWIO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_RAWIO_VALUE
   * @generated
   * @ordered
   */
  SYS_RAWIO(33, "SYS_RAWIO", "SYS_RAWIO"),

  /**
   * The '<em><b>SYS RESOURCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_RESOURCE_VALUE
   * @generated
   * @ordered
   */
  SYS_RESOURCE(34, "SYS_RESOURCE", "SYS_RESOURCE"),

  /**
   * The '<em><b>SYS TIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_TIME_VALUE
   * @generated
   * @ordered
   */
  SYS_TIME(35, "SYS_TIME", "SYS_TIME"),

  /**
   * The '<em><b>SYS TTY CONFIG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYS_TTY_CONFIG_VALUE
   * @generated
   * @ordered
   */
  SYS_TTY_CONFIG(36, "SYS_TTY_CONFIG", "SYS_TTY_CONFIG"),

  /**
   * The '<em><b>WAKE ALARM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WAKE_ALARM_VALUE
   * @generated
   * @ordered
   */
  WAKE_ALARM(37, "WAKE_ALARM", "WAKE_ALARM");

  /**
   * The '<em><b>ALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL
   * @model
   * @generated
   * @ordered
   */
  public static final int ALL_VALUE = 0;

  /**
   * The '<em><b>AUDIT CONTROL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUDIT CONTROL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUDIT_CONTROL
   * @model
   * @generated
   * @ordered
   */
  public static final int AUDIT_CONTROL_VALUE = 1;

  /**
   * The '<em><b>AUDIT WRITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUDIT WRITE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUDIT_WRITE
   * @model
   * @generated
   * @ordered
   */
  public static final int AUDIT_WRITE_VALUE = 2;

  /**
   * The '<em><b>BLOCK SUSPEND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLOCK SUSPEND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLOCK_SUSPEND
   * @model
   * @generated
   * @ordered
   */
  public static final int BLOCK_SUSPEND_VALUE = 3;

  /**
   * The '<em><b>CHOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHOWN
   * @model
   * @generated
   * @ordered
   */
  public static final int CHOWN_VALUE = 4;

  /**
   * The '<em><b>DAC OVERRIDE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAC OVERRIDE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAC_OVERRIDE
   * @model
   * @generated
   * @ordered
   */
  public static final int DAC_OVERRIDE_VALUE = 5;

  /**
   * The '<em><b>DAC READ SEARCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAC READ SEARCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAC_READ_SEARCH
   * @model
   * @generated
   * @ordered
   */
  public static final int DAC_READ_SEARCH_VALUE = 6;

  /**
   * The '<em><b>FOWNER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FOWNER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOWNER
   * @model
   * @generated
   * @ordered
   */
  public static final int FOWNER_VALUE = 7;

  /**
   * The '<em><b>FSETID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FSETID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FSETID
   * @model
   * @generated
   * @ordered
   */
  public static final int FSETID_VALUE = 8;

  /**
   * The '<em><b>IPC LOCK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IPC LOCK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IPC_LOCK
   * @model
   * @generated
   * @ordered
   */
  public static final int IPC_LOCK_VALUE = 9;

  /**
   * The '<em><b>IPC OWNER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IPC OWNER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IPC_OWNER
   * @model
   * @generated
   * @ordered
   */
  public static final int IPC_OWNER_VALUE = 10;

  /**
   * The '<em><b>KILL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>KILL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #KILL
   * @model
   * @generated
   * @ordered
   */
  public static final int KILL_VALUE = 11;

  /**
   * The '<em><b>LEASE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEASE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEASE
   * @model
   * @generated
   * @ordered
   */
  public static final int LEASE_VALUE = 12;

  /**
   * The '<em><b>LINUX IMMUTABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LINUX IMMUTABLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LINUX_IMMUTABLE
   * @model
   * @generated
   * @ordered
   */
  public static final int LINUX_IMMUTABLE_VALUE = 13;

  /**
   * The '<em><b>MAC ADMIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAC ADMIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAC_ADMIN
   * @model
   * @generated
   * @ordered
   */
  public static final int MAC_ADMIN_VALUE = 14;

  /**
   * The '<em><b>MAC OVERRIDE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAC OVERRIDE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAC_OVERRIDE
   * @model
   * @generated
   * @ordered
   */
  public static final int MAC_OVERRIDE_VALUE = 15;

  /**
   * The '<em><b>MKNOD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MKNOD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MKNOD
   * @model
   * @generated
   * @ordered
   */
  public static final int MKNOD_VALUE = 16;

  /**
   * The '<em><b>NET ADMIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NET ADMIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NET_ADMIN
   * @model
   * @generated
   * @ordered
   */
  public static final int NET_ADMIN_VALUE = 17;

  /**
   * The '<em><b>NET BIND SERVICE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NET BIND SERVICE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NET_BIND_SERVICE
   * @model
   * @generated
   * @ordered
   */
  public static final int NET_BIND_SERVICE_VALUE = 18;

  /**
   * The '<em><b>NET BROADCAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NET BROADCAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NET_BROADCAST
   * @model
   * @generated
   * @ordered
   */
  public static final int NET_BROADCAST_VALUE = 19;

  /**
   * The '<em><b>NET RAW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NET RAW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NET_RAW
   * @model
   * @generated
   * @ordered
   */
  public static final int NET_RAW_VALUE = 20;

  /**
   * The '<em><b>SETFCAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SETFCAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETFCAP
   * @model
   * @generated
   * @ordered
   */
  public static final int SETFCAP_VALUE = 21;

  /**
   * The '<em><b>SETGID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SETGID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETGID
   * @model
   * @generated
   * @ordered
   */
  public static final int SETGID_VALUE = 22;

  /**
   * The '<em><b>SETPCAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SETPCAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETPCAP
   * @model
   * @generated
   * @ordered
   */
  public static final int SETPCAP_VALUE = 23;

  /**
   * The '<em><b>SETUID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SETUID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETUID
   * @model
   * @generated
   * @ordered
   */
  public static final int SETUID_VALUE = 24;

  /**
   * The '<em><b>SYS ADMIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS ADMIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_ADMIN
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_ADMIN_VALUE = 25;

  /**
   * The '<em><b>SYS BOOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS BOOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_BOOT
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_BOOT_VALUE = 26;

  /**
   * The '<em><b>SYS CHROOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS CHROOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_CHROOT
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_CHROOT_VALUE = 27;

  /**
   * The '<em><b>SYSLOG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYSLOG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYSLOG
   * @model
   * @generated
   * @ordered
   */
  public static final int SYSLOG_VALUE = 28;

  /**
   * The '<em><b>SYS MODULE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS MODULE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_MODULE
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_MODULE_VALUE = 29;

  /**
   * The '<em><b>SYS NICE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS NICE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_NICE
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_NICE_VALUE = 30;

  /**
   * The '<em><b>SYS PACCT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS PACCT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_PACCT
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_PACCT_VALUE = 31;

  /**
   * The '<em><b>SYS PTRACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS PTRACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_PTRACE
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_PTRACE_VALUE = 32;

  /**
   * The '<em><b>SYS RAWIO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS RAWIO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_RAWIO
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_RAWIO_VALUE = 33;

  /**
   * The '<em><b>SYS RESOURCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS RESOURCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_RESOURCE
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_RESOURCE_VALUE = 34;

  /**
   * The '<em><b>SYS TIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS TIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_TIME
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_TIME_VALUE = 35;

  /**
   * The '<em><b>SYS TTY CONFIG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SYS TTY CONFIG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYS_TTY_CONFIG
   * @model
   * @generated
   * @ordered
   */
  public static final int SYS_TTY_CONFIG_VALUE = 36;

  /**
   * The '<em><b>WAKE ALARM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WAKE ALARM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WAKE_ALARM
   * @model
   * @generated
   * @ordered
   */
  public static final int WAKE_ALARM_VALUE = 37;

  /**
   * An array of all the '<em><b>Capability</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Capability[] VALUES_ARRAY =
    new Capability[]
    {
      ALL,
      AUDIT_CONTROL,
      AUDIT_WRITE,
      BLOCK_SUSPEND,
      CHOWN,
      DAC_OVERRIDE,
      DAC_READ_SEARCH,
      FOWNER,
      FSETID,
      IPC_LOCK,
      IPC_OWNER,
      KILL,
      LEASE,
      LINUX_IMMUTABLE,
      MAC_ADMIN,
      MAC_OVERRIDE,
      MKNOD,
      NET_ADMIN,
      NET_BIND_SERVICE,
      NET_BROADCAST,
      NET_RAW,
      SETFCAP,
      SETGID,
      SETPCAP,
      SETUID,
      SYS_ADMIN,
      SYS_BOOT,
      SYS_CHROOT,
      SYSLOG,
      SYS_MODULE,
      SYS_NICE,
      SYS_PACCT,
      SYS_PTRACE,
      SYS_RAWIO,
      SYS_RESOURCE,
      SYS_TIME,
      SYS_TTY_CONFIG,
      WAKE_ALARM,
    };

  /**
   * A public read-only list of all the '<em><b>Capability</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Capability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Capability</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Capability get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Capability result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Capability</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Capability getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Capability result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Capability</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Capability get(int value)
  {
    switch (value)
    {
      case ALL_VALUE: return ALL;
      case AUDIT_CONTROL_VALUE: return AUDIT_CONTROL;
      case AUDIT_WRITE_VALUE: return AUDIT_WRITE;
      case BLOCK_SUSPEND_VALUE: return BLOCK_SUSPEND;
      case CHOWN_VALUE: return CHOWN;
      case DAC_OVERRIDE_VALUE: return DAC_OVERRIDE;
      case DAC_READ_SEARCH_VALUE: return DAC_READ_SEARCH;
      case FOWNER_VALUE: return FOWNER;
      case FSETID_VALUE: return FSETID;
      case IPC_LOCK_VALUE: return IPC_LOCK;
      case IPC_OWNER_VALUE: return IPC_OWNER;
      case KILL_VALUE: return KILL;
      case LEASE_VALUE: return LEASE;
      case LINUX_IMMUTABLE_VALUE: return LINUX_IMMUTABLE;
      case MAC_ADMIN_VALUE: return MAC_ADMIN;
      case MAC_OVERRIDE_VALUE: return MAC_OVERRIDE;
      case MKNOD_VALUE: return MKNOD;
      case NET_ADMIN_VALUE: return NET_ADMIN;
      case NET_BIND_SERVICE_VALUE: return NET_BIND_SERVICE;
      case NET_BROADCAST_VALUE: return NET_BROADCAST;
      case NET_RAW_VALUE: return NET_RAW;
      case SETFCAP_VALUE: return SETFCAP;
      case SETGID_VALUE: return SETGID;
      case SETPCAP_VALUE: return SETPCAP;
      case SETUID_VALUE: return SETUID;
      case SYS_ADMIN_VALUE: return SYS_ADMIN;
      case SYS_BOOT_VALUE: return SYS_BOOT;
      case SYS_CHROOT_VALUE: return SYS_CHROOT;
      case SYSLOG_VALUE: return SYSLOG;
      case SYS_MODULE_VALUE: return SYS_MODULE;
      case SYS_NICE_VALUE: return SYS_NICE;
      case SYS_PACCT_VALUE: return SYS_PACCT;
      case SYS_PTRACE_VALUE: return SYS_PTRACE;
      case SYS_RAWIO_VALUE: return SYS_RAWIO;
      case SYS_RESOURCE_VALUE: return SYS_RESOURCE;
      case SYS_TIME_VALUE: return SYS_TIME;
      case SYS_TTY_CONFIG_VALUE: return SYS_TTY_CONFIG;
      case WAKE_ALARM_VALUE: return WAKE_ALARM;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Capability(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Capability
