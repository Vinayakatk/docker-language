/**
 */
package org.eclipse.docker.language.container.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.docker.language.container.Container;
import org.eclipse.docker.language.container.ContainerFactory;
import org.eclipse.docker.language.container.ContainerPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.docker.language.container.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addCapabilityAddPropertyDescriptor(object);
			addCapabilityDropPropertyDescriptor(object);
			addCommandsPropertyDescriptor(object);
			addContainerIDFilePropertyDescriptor(object);
			addCpuPeriodPropertyDescriptor(object);
			addCpusetCpusPropertyDescriptor(object);
			addCpusetMemsPropertyDescriptor(object);
			addCpuSharesPropertyDescriptor(object);
			addDnsPropertyDescriptor(object);
			addDnsSearchPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addEntrypointPropertyDescriptor(object);
			addEnvPropertyDescriptor(object);
			addExtraHostsPropertyDescriptor(object);
			addMacAddressPropertyDescriptor(object);
			addMemoryPropertyDescriptor(object);
			addMemorySwapPropertyDescriptor(object);
			addDisableNetworkPropertyDescriptor(object);
			addNetworkModePropertyDescriptor(object);
			addPrivilegedPropertyDescriptor(object);
			addPublishAllPortsPropertyDescriptor(object);
			addReadonlyRootfsPropertyDescriptor(object);
			addPidModePropertyDescriptor(object);
			addWorkingDirPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addTtyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_name_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_image_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capability Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_capabilityAdd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_capabilityAdd_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CAPABILITY_ADD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capability Drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityDropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_capabilityDrop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_capabilityDrop_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CAPABILITY_DROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commands feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_commands_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_commands_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__COMMANDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container ID File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerIDFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_containerIDFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_containerIDFile_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CONTAINER_ID_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuPeriod_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CPU_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpuset Cpus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpusetCpusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpusetCpus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpusetCpus_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CPUSET_CPUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpuset Mems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpusetMemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpusetMems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpusetMems_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CPUSET_MEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Shares feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuSharesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuShares_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuShares_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__CPU_SHARES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dns_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__DNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns Search feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsSearchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dnsSearch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dnsSearch_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__DNS_SEARCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_domainName_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entrypoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntrypointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_entrypoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_entrypoint_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__ENTRYPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Env feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_env_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__ENV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extra Hosts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtraHostsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_extraHosts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_extraHosts_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__EXTRA_HOSTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mac Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMacAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_macAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_macAddress_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__MAC_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memory_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Swap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySwapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memorySwap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memorySwap_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__MEMORY_SWAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable Network feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableNetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_disableNetwork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_disableNetwork_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__DISABLE_NETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_networkMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_networkMode_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__NETWORK_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Privileged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivilegedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_privileged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_privileged_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__PRIVILEGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publish All Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishAllPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_publishAllPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_publishAllPorts_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__PUBLISH_ALL_PORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Readonly Rootfs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadonlyRootfsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_readonlyRootfs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_readonlyRootfs_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__READONLY_ROOTFS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pid Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPidModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_pidMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_pidMode_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__PID_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Working Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkingDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_workingDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_workingDir_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__WORKING_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_user_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTtyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_tty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_tty_feature", "_UI_Container_type"),
				 ContainerPackage.Literals.CONTAINER__TTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__BINDS);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__DEVICES);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__EXPOSED_PORTS);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__LABELS);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__LINKS);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__PORT_BINDINGS);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__RESTART_POLICY);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__VOLUMES);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__VOLUMES_FROM);
			childrenFeatures.add(ContainerPackage.Literals.CONTAINER__ULIMITS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Container)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Container.class)) {
			case ContainerPackage.CONTAINER__NAME:
			case ContainerPackage.CONTAINER__IMAGE:
			case ContainerPackage.CONTAINER__CAPABILITY_ADD:
			case ContainerPackage.CONTAINER__CAPABILITY_DROP:
			case ContainerPackage.CONTAINER__COMMANDS:
			case ContainerPackage.CONTAINER__CONTAINER_ID_FILE:
			case ContainerPackage.CONTAINER__CPU_PERIOD:
			case ContainerPackage.CONTAINER__CPUSET_CPUS:
			case ContainerPackage.CONTAINER__CPUSET_MEMS:
			case ContainerPackage.CONTAINER__CPU_SHARES:
			case ContainerPackage.CONTAINER__DNS:
			case ContainerPackage.CONTAINER__DNS_SEARCH:
			case ContainerPackage.CONTAINER__DOMAIN_NAME:
			case ContainerPackage.CONTAINER__ENTRYPOINT:
			case ContainerPackage.CONTAINER__ENV:
			case ContainerPackage.CONTAINER__EXTRA_HOSTS:
			case ContainerPackage.CONTAINER__MAC_ADDRESS:
			case ContainerPackage.CONTAINER__MEMORY:
			case ContainerPackage.CONTAINER__MEMORY_SWAP:
			case ContainerPackage.CONTAINER__DISABLE_NETWORK:
			case ContainerPackage.CONTAINER__NETWORK_MODE:
			case ContainerPackage.CONTAINER__PRIVILEGED:
			case ContainerPackage.CONTAINER__PUBLISH_ALL_PORTS:
			case ContainerPackage.CONTAINER__READONLY_ROOTFS:
			case ContainerPackage.CONTAINER__PID_MODE:
			case ContainerPackage.CONTAINER__WORKING_DIR:
			case ContainerPackage.CONTAINER__USER:
			case ContainerPackage.CONTAINER__TTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContainerPackage.CONTAINER__BINDS:
			case ContainerPackage.CONTAINER__DEVICES:
			case ContainerPackage.CONTAINER__EXPOSED_PORTS:
			case ContainerPackage.CONTAINER__LABELS:
			case ContainerPackage.CONTAINER__LINKS:
			case ContainerPackage.CONTAINER__PORT_BINDINGS:
			case ContainerPackage.CONTAINER__RESTART_POLICY:
			case ContainerPackage.CONTAINER__VOLUMES:
			case ContainerPackage.CONTAINER__VOLUMES_FROM:
			case ContainerPackage.CONTAINER__ULIMITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__BINDS,
				 ContainerFactory.eINSTANCE.createBind()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__DEVICES,
				 ContainerFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__EXPOSED_PORTS,
				 ContainerFactory.eINSTANCE.createExposedPort()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__LABELS,
				 ContainerFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__LINKS,
				 ContainerFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__PORT_BINDINGS,
				 ContainerFactory.eINSTANCE.createPortBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__RESTART_POLICY,
				 ContainerFactory.eINSTANCE.createRestartPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__VOLUMES,
				 ContainerFactory.eINSTANCE.createVolume()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__VOLUMES_FROM,
				 ContainerFactory.eINSTANCE.createVolumesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(ContainerPackage.Literals.CONTAINER__ULIMITS,
				 ContainerFactory.eINSTANCE.createUlimit()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ContainerEditPlugin.INSTANCE;
	}

}
