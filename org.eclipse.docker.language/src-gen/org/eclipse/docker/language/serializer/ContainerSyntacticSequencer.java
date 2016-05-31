package org.eclipse.docker.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.docker.language.services.ContainerGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ContainerSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ContainerGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_0_3_BindsKeyword_5_0_0_LeftCurlyBracketKeyword_5_0_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_10_2_DnsKeyword_5_10_0__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_11_3_DnsSearchKeyword_5_11_0_LeftCurlyBracketKeyword_5_11_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_13_3_EntrypointKeyword_5_13_0_LeftCurlyBracketKeyword_5_13_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_14_3_EnvKeyword_5_14_0_LeftCurlyBracketKeyword_5_14_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_15_3_ExposedPortsKeyword_5_15_0_LeftCurlyBracketKeyword_5_15_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_16_3_ExtraHostsKeyword_5_16_0_LeftCurlyBracketKeyword_5_16_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_17_3_LabelsKeyword_5_17_0_LeftCurlyBracketKeyword_5_17_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_18_3_LinksKeyword_5_18_0_LeftCurlyBracketKeyword_5_18_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_1_3_CapabilityAddKeyword_5_1_0_LeftCurlyBracketKeyword_5_1_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_24_3_PortBindingsKeyword_5_24_0_LeftCurlyBracketKeyword_5_24_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_2_3_CapabilityDropKeyword_5_2_0_LeftCurlyBracketKeyword_5_2_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_33_3_VolumesKeyword_5_33_0_LeftCurlyBracketKeyword_5_33_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_34_3_VolumesFromKeyword_5_34_0_LeftCurlyBracketKeyword_5_34_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_35_3_UlimitsKeyword_5_35_0_LeftCurlyBracketKeyword_5_35_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_3_3_CommandsKeyword_5_3_0_LeftCurlyBracketKeyword_5_3_1__q;
	protected AbstractElementAlias match_Container___RightCurlyBracketKeyword_5_9_3_DevicesKeyword_5_9_0_LeftCurlyBracketKeyword_5_9_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ContainerGrammarAccess) access;
		match_Container___RightCurlyBracketKeyword_5_0_3_BindsKeyword_5_0_0_LeftCurlyBracketKeyword_5_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_0_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getBindsKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_0_1()));
		match_Container___RightCurlyBracketKeyword_5_10_2_DnsKeyword_5_10_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_10_2()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getDnsKeyword_5_10_0()));
		match_Container___RightCurlyBracketKeyword_5_11_3_DnsSearchKeyword_5_11_0_LeftCurlyBracketKeyword_5_11_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_11_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getDnsSearchKeyword_5_11_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_11_1()));
		match_Container___RightCurlyBracketKeyword_5_13_3_EntrypointKeyword_5_13_0_LeftCurlyBracketKeyword_5_13_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_13_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getEntrypointKeyword_5_13_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_13_1()));
		match_Container___RightCurlyBracketKeyword_5_14_3_EnvKeyword_5_14_0_LeftCurlyBracketKeyword_5_14_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_14_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getEnvKeyword_5_14_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_14_1()));
		match_Container___RightCurlyBracketKeyword_5_15_3_ExposedPortsKeyword_5_15_0_LeftCurlyBracketKeyword_5_15_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_15_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getExposedPortsKeyword_5_15_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_15_1()));
		match_Container___RightCurlyBracketKeyword_5_16_3_ExtraHostsKeyword_5_16_0_LeftCurlyBracketKeyword_5_16_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_16_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getExtraHostsKeyword_5_16_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_16_1()));
		match_Container___RightCurlyBracketKeyword_5_17_3_LabelsKeyword_5_17_0_LeftCurlyBracketKeyword_5_17_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_17_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLabelsKeyword_5_17_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_17_1()));
		match_Container___RightCurlyBracketKeyword_5_18_3_LinksKeyword_5_18_0_LeftCurlyBracketKeyword_5_18_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_18_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLinksKeyword_5_18_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_18_1()));
		match_Container___RightCurlyBracketKeyword_5_1_3_CapabilityAddKeyword_5_1_0_LeftCurlyBracketKeyword_5_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_1_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getCapabilityAddKeyword_5_1_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_1_1()));
		match_Container___RightCurlyBracketKeyword_5_24_3_PortBindingsKeyword_5_24_0_LeftCurlyBracketKeyword_5_24_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_24_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getPortBindingsKeyword_5_24_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_24_1()));
		match_Container___RightCurlyBracketKeyword_5_2_3_CapabilityDropKeyword_5_2_0_LeftCurlyBracketKeyword_5_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_2_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getCapabilityDropKeyword_5_2_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_2_1()));
		match_Container___RightCurlyBracketKeyword_5_33_3_VolumesKeyword_5_33_0_LeftCurlyBracketKeyword_5_33_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_33_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getVolumesKeyword_5_33_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_33_1()));
		match_Container___RightCurlyBracketKeyword_5_34_3_VolumesFromKeyword_5_34_0_LeftCurlyBracketKeyword_5_34_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_34_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getVolumesFromKeyword_5_34_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_34_1()));
		match_Container___RightCurlyBracketKeyword_5_35_3_UlimitsKeyword_5_35_0_LeftCurlyBracketKeyword_5_35_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_35_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getUlimitsKeyword_5_35_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_35_1()));
		match_Container___RightCurlyBracketKeyword_5_3_3_CommandsKeyword_5_3_0_LeftCurlyBracketKeyword_5_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_3_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getCommandsKeyword_5_3_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_3_1()));
		match_Container___RightCurlyBracketKeyword_5_9_3_DevicesKeyword_5_9_0_LeftCurlyBracketKeyword_5_9_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5_9_3()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getDevicesKeyword_5_9_0()), new TokenAlias(false, false, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_5_9_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Container___RightCurlyBracketKeyword_5_0_3_BindsKeyword_5_0_0_LeftCurlyBracketKeyword_5_0_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_0_3_BindsKeyword_5_0_0_LeftCurlyBracketKeyword_5_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_10_2_DnsKeyword_5_10_0__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_10_2_DnsKeyword_5_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_11_3_DnsSearchKeyword_5_11_0_LeftCurlyBracketKeyword_5_11_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_11_3_DnsSearchKeyword_5_11_0_LeftCurlyBracketKeyword_5_11_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_13_3_EntrypointKeyword_5_13_0_LeftCurlyBracketKeyword_5_13_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_13_3_EntrypointKeyword_5_13_0_LeftCurlyBracketKeyword_5_13_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_14_3_EnvKeyword_5_14_0_LeftCurlyBracketKeyword_5_14_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_14_3_EnvKeyword_5_14_0_LeftCurlyBracketKeyword_5_14_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_15_3_ExposedPortsKeyword_5_15_0_LeftCurlyBracketKeyword_5_15_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_15_3_ExposedPortsKeyword_5_15_0_LeftCurlyBracketKeyword_5_15_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_16_3_ExtraHostsKeyword_5_16_0_LeftCurlyBracketKeyword_5_16_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_16_3_ExtraHostsKeyword_5_16_0_LeftCurlyBracketKeyword_5_16_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_17_3_LabelsKeyword_5_17_0_LeftCurlyBracketKeyword_5_17_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_17_3_LabelsKeyword_5_17_0_LeftCurlyBracketKeyword_5_17_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_18_3_LinksKeyword_5_18_0_LeftCurlyBracketKeyword_5_18_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_18_3_LinksKeyword_5_18_0_LeftCurlyBracketKeyword_5_18_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_1_3_CapabilityAddKeyword_5_1_0_LeftCurlyBracketKeyword_5_1_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_1_3_CapabilityAddKeyword_5_1_0_LeftCurlyBracketKeyword_5_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_24_3_PortBindingsKeyword_5_24_0_LeftCurlyBracketKeyword_5_24_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_24_3_PortBindingsKeyword_5_24_0_LeftCurlyBracketKeyword_5_24_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_2_3_CapabilityDropKeyword_5_2_0_LeftCurlyBracketKeyword_5_2_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_2_3_CapabilityDropKeyword_5_2_0_LeftCurlyBracketKeyword_5_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_33_3_VolumesKeyword_5_33_0_LeftCurlyBracketKeyword_5_33_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_33_3_VolumesKeyword_5_33_0_LeftCurlyBracketKeyword_5_33_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_34_3_VolumesFromKeyword_5_34_0_LeftCurlyBracketKeyword_5_34_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_34_3_VolumesFromKeyword_5_34_0_LeftCurlyBracketKeyword_5_34_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_35_3_UlimitsKeyword_5_35_0_LeftCurlyBracketKeyword_5_35_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_35_3_UlimitsKeyword_5_35_0_LeftCurlyBracketKeyword_5_35_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_3_3_CommandsKeyword_5_3_0_LeftCurlyBracketKeyword_5_3_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_3_3_CommandsKeyword_5_3_0_LeftCurlyBracketKeyword_5_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Container___RightCurlyBracketKeyword_5_9_3_DevicesKeyword_5_9_0_LeftCurlyBracketKeyword_5_9_1__q.equals(syntax))
				emit_Container___RightCurlyBracketKeyword_5_9_3_DevicesKeyword_5_9_0_LeftCurlyBracketKeyword_5_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('}' 'binds' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_0_3_BindsKeyword_5_0_0_LeftCurlyBracketKeyword_5_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'dns')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_10_2_DnsKeyword_5_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'dnsSearch' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_11_3_DnsSearchKeyword_5_11_0_LeftCurlyBracketKeyword_5_11_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'entrypoint' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_13_3_EntrypointKeyword_5_13_0_LeftCurlyBracketKeyword_5_13_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'env' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_14_3_EnvKeyword_5_14_0_LeftCurlyBracketKeyword_5_14_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'exposedPorts' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_15_3_ExposedPortsKeyword_5_15_0_LeftCurlyBracketKeyword_5_15_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'extraHosts' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_16_3_ExtraHostsKeyword_5_16_0_LeftCurlyBracketKeyword_5_16_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'labels' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_17_3_LabelsKeyword_5_17_0_LeftCurlyBracketKeyword_5_17_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'links' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_18_3_LinksKeyword_5_18_0_LeftCurlyBracketKeyword_5_18_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'capabilityAdd' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_1_3_CapabilityAddKeyword_5_1_0_LeftCurlyBracketKeyword_5_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'portBindings' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_24_3_PortBindingsKeyword_5_24_0_LeftCurlyBracketKeyword_5_24_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'capabilityDrop' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_2_3_CapabilityDropKeyword_5_2_0_LeftCurlyBracketKeyword_5_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'volumes' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_33_3_VolumesKeyword_5_33_0_LeftCurlyBracketKeyword_5_33_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'volumesFrom' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_34_3_VolumesFromKeyword_5_34_0_LeftCurlyBracketKeyword_5_34_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'ulimits' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_35_3_UlimitsKeyword_5_35_0_LeftCurlyBracketKeyword_5_35_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'commands' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_3_3_CommandsKeyword_5_3_0_LeftCurlyBracketKeyword_5_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' 'devices' '{')?
	 */
	protected void emit_Container___RightCurlyBracketKeyword_5_9_3_DevicesKeyword_5_9_0_LeftCurlyBracketKeyword_5_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
