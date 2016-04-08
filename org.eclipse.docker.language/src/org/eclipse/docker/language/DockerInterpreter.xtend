package org.eclipse.docker.language

import org.eclipse.emf.ecore.resource.Resource

interface DockerInterpreter {
	def void interpret(Resource resource);
}