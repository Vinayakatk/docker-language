package org.eclipse.docker.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.docker.language.container.Bind;
import org.eclipse.docker.language.container.Binding;
import org.eclipse.docker.language.container.BuildArgs;
import org.eclipse.docker.language.container.Container;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ContainerSection;
import org.eclipse.docker.language.container.Device;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.ExposedPort;
import org.eclipse.docker.language.container.Image;
import org.eclipse.docker.language.container.ImageSection;
import org.eclipse.docker.language.container.Label;
import org.eclipse.docker.language.container.Link;
import org.eclipse.docker.language.container.PortBinding;
import org.eclipse.docker.language.container.RestartPolicy;
import org.eclipse.docker.language.container.Ulimit;
import org.eclipse.docker.language.container.Volume;
import org.eclipse.docker.language.container.VolumesFrom;
import org.eclipse.docker.language.services.ContainerGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ContainerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContainerGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ContainerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ContainerPackage.BIND:
				if(context == grammarAccess.getBindRule()) {
					sequence_Bind(context, (Bind) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.BINDING:
				if(context == grammarAccess.getBindingRule()) {
					sequence_Binding(context, (Binding) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.BUILD_ARGS:
				if(context == grammarAccess.getBuildArgsRule()) {
					sequence_BuildArgs(context, (BuildArgs) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.CONTAINER:
				if(context == grammarAccess.getContainerRule()) {
					sequence_Container(context, (Container) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.CONTAINER_SECTION:
				if(context == grammarAccess.getContainerSectionRule()) {
					sequence_ContainerSection(context, (ContainerSection) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.DEVICE:
				if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.DOCKER:
				if(context == grammarAccess.getDockerRule()) {
					sequence_Docker(context, (Docker) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.EXPOSED_PORT:
				if(context == grammarAccess.getExposedPortRule()) {
					sequence_ExposedPort(context, (ExposedPort) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.IMAGE:
				if(context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.IMAGE_SECTION:
				if(context == grammarAccess.getImageSectionRule()) {
					sequence_ImageSection(context, (ImageSection) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.LINK:
				if(context == grammarAccess.getLinkRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.PORT_BINDING:
				if(context == grammarAccess.getPortBindingRule()) {
					sequence_PortBinding(context, (PortBinding) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.RESTART_POLICY:
				if(context == grammarAccess.getRestartPolicyRule()) {
					sequence_RestartPolicy(context, (RestartPolicy) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.ULIMIT:
				if(context == grammarAccess.getUlimitRule()) {
					sequence_Ulimit(context, (Ulimit) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.VOLUME:
				if(context == grammarAccess.getVolumeRule()) {
					sequence_Volume(context, (Volume) semanticObject); 
					return; 
				}
				else break;
			case ContainerPackage.VOLUMES_FROM:
				if(context == grammarAccess.getVolumesFromRule()) {
					sequence_VolumesFrom(context, (VolumesFrom) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (location=STRING volume=Volume accessMode1=AccessMode?)
	 */
	protected void sequence_Bind(EObject context, Bind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (hostIP=STRING hostPort=INT)
	 */
	protected void sequence_Binding(EObject context, Binding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.BINDING__HOST_IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.BINDING__HOST_IP));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.BINDING__HOST_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.BINDING__HOST_PORT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBindingAccess().getHostIPSTRINGTerminalRuleCall_1_0(), semanticObject.getHostIP());
		feeder.accept(grammarAccess.getBindingAccess().getHostPortINTTerminalRuleCall_3_0(), semanticObject.getHostPort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_BuildArgs(EObject context, BuildArgs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.BUILD_ARGS__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.BUILD_ARGS__KEY));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.BUILD_ARGS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.BUILD_ARGS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBuildArgsAccess().getKeySTRINGTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getBuildArgsAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Container-Section' containers+=Container*)
	 */
	protected void sequence_ContainerSection(EObject context, ContainerSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         image=STRING 
	 *         binds+=Bind* 
	 *         capabilityAdd+=Capability* 
	 *         capabilityDrop+=Capability* 
	 *         commands+=STRING* 
	 *         containerIDFile=STRING? 
	 *         cpuPeriod=INT? 
	 *         cpusetCpus=STRING? 
	 *         cpusetMems=STRING? 
	 *         cpuShares=INT? 
	 *         devices+=Device* 
	 *         dns+=STRING* 
	 *         dnsSearch+=STRING* 
	 *         domainName=STRING? 
	 *         entrypoint+=STRING* 
	 *         env+=STRING* 
	 *         exposedPorts+=ExposedPort* 
	 *         extraHosts+=STRING* 
	 *         labels+=Label* 
	 *         links+=Link* 
	 *         macAddress=STRING? 
	 *         memory=Elong? 
	 *         memorySwap=Elong? 
	 *         disableNetwork=EBoolean? 
	 *         networkMode=STRING? 
	 *         portBindings+=PortBinding* 
	 *         privileged=EBoolean? 
	 *         publishAllPorts=EBoolean? 
	 *         readonlyRootfs=EBoolean? 
	 *         pidMode=STRING? 
	 *         workingDir=STRING? 
	 *         user=STRING? 
	 *         tty=EBoolean? 
	 *         restartPolicy=RestartPolicy? 
	 *         volumes+=Volume* 
	 *         volumesFrom+=VolumesFrom* 
	 *         ulimits+=Ulimit*
	 *     )
	 */
	protected void sequence_Container(EObject context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cGroupPermissions=STRING pathOnHost=STRING pathInContainer=STRING)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.DEVICE__CGROUP_PERMISSIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.DEVICE__CGROUP_PERMISSIONS));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.DEVICE__PATH_ON_HOST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.DEVICE__PATH_ON_HOST));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.DEVICE__PATH_IN_CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.DEVICE__PATH_IN_CONTAINER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceAccess().getCGroupPermissionsSTRINGTerminalRuleCall_1_0(), semanticObject.getCGroupPermissions());
		feeder.accept(grammarAccess.getDeviceAccess().getPathOnHostSTRINGTerminalRuleCall_2_0(), semanticObject.getPathOnHost());
		feeder.accept(grammarAccess.getDeviceAccess().getPathInContainerSTRINGTerminalRuleCall_3_0(), semanticObject.getPathInContainer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (containerRegion=ContainerSection? imageRegion=ImageSection?)
	 */
	protected void sequence_Docker(EObject context, Docker semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (port=STRING protocol=InternalProtocol)
	 */
	protected void sequence_ExposedPort(EObject context, ExposedPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.EXPOSED_PORT__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.EXPOSED_PORT__PORT));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.EXPOSED_PORT__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.EXPOSED_PORT__PROTOCOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExposedPortAccess().getPortSTRINGTerminalRuleCall_1_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getExposedPortAccess().getProtocolInternalProtocolEnumRuleCall_3_0(), semanticObject.getProtocol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Image-Section' images+=Image*)
	 */
	protected void sequence_ImageSection(EObject context, ImageSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         tag=STRING? 
	 *         dockerFilelocation=STRING? 
	 *         forceRM=EBoolean? 
	 *         noCache=EBoolean? 
	 *         memory=Elong? 
	 *         memswap=Elong? 
	 *         cpusetcpus=STRING? 
	 *         cpushares=STRING? 
	 *         remove=EBoolean? 
	 *         quiet=EBoolean? 
	 *         pull=EBoolean?
	 *     )
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.LABEL__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.LABEL__KEY));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.LABEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.LABEL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (containerLink=STRING alias=STRING?)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (binding=Binding exposedPort=[ExposedPort|STRING])
	 */
	protected void sequence_PortBinding(EObject context, PortBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.PORT_BINDING__BINDING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.PORT_BINDING__BINDING));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.PORT_BINDING__EXPOSED_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.PORT_BINDING__EXPOSED_PORT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortBindingAccess().getBindingBindingParserRuleCall_1_0(), semanticObject.getBinding());
		feeder.accept(grammarAccess.getPortBindingAccess().getExposedPortExposedPortSTRINGTerminalRuleCall_2_0_1(), semanticObject.getExposedPort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='always' | maximumRetryCount=INT)?
	 */
	protected void sequence_RestartPolicy(EObject context, RestartPolicy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING soft=INT hard=INT)
	 */
	protected void sequence_Ulimit(EObject context, Ulimit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.ULIMIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.ULIMIT__NAME));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.ULIMIT__SOFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.ULIMIT__SOFT));
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.ULIMIT__HARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.ULIMIT__HARD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUlimitAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUlimitAccess().getSoftINTTerminalRuleCall_2_0(), semanticObject.getSoft());
		feeder.accept(grammarAccess.getUlimitAccess().getHardINTTerminalRuleCall_3_0(), semanticObject.getHard());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_Volume(EObject context, Volume semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContainerPackage.Literals.VOLUME__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContainerPackage.Literals.VOLUME__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVolumeAccess().getPathSTRINGTerminalRuleCall_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (container=STRING accessMode=AccessMode?)
	 */
	protected void sequence_VolumesFrom(EObject context, VolumesFrom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
