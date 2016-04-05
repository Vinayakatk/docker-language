/*
 * generated by Xtext
 */
package org.eclipse.docker.language.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.docker.language.services.ContainerGrammarAccess;

public class ContainerParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ContainerGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.docker.language.parser.antlr.internal.InternalContainerParser createParser(XtextTokenStream stream) {
		return new org.eclipse.docker.language.parser.antlr.internal.InternalContainerParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Docker";
	}
	
	public ContainerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ContainerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
