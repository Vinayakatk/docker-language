/*
 * generated by Xtext
 */
package org.eclipse.docker.language.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.docker.language.ui.internal.ContainerActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ContainerExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ContainerActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ContainerActivator.getInstance().getInjector(ContainerActivator.ORG_ECLIPSE_DOCKER_LANGUAGE_CONTAINER);
	}
	
}
