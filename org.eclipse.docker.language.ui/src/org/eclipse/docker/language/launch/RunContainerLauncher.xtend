package org.eclipse.docker.language.launch

import com.google.inject.Injector
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.debug.ui.ILaunchShortcut2
import org.eclipse.docker.language.container.Image
import org.eclipse.docker.language.ui.internal.ContainerActivator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.part.FileEditorInput
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.util.UriUtil
import org.eclipse.docker.language.DockerInterpreterImpl
import org.eclipse.swt.widgets.Display

class RunContainerLauncher implements ILaunchShortcut, ILaunchShortcut2, ILaunchConfigurationDelegate {
	override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
		IProgressMonitor monitor) throws CoreException {
		System::out.println("called launch")
	}
 
	override ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		System::out.println("called selected launch configuration")
		return null
	}

	override ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		System::out.println("called editor launch configuration")
		return null
	}

	override IResource getLaunchableResource(ISelection selection) {
		System::out.println("called selectable resource")
		if (selection instanceof IStructuredSelection) {
			for (Object element : ((selection as IStructuredSelection)).toArray()) {
				if(element instanceof IFile) return (element as IResource)
			}
		}
		return null
	}

	override IResource getLaunchableResource(IEditorPart editorpart) {
		val IEditorInput input = editorpart.getEditorInput()
		if(input instanceof FileEditorInput) return ((input as FileEditorInput)).getFile()
		return null
	}

	override void launch(ISelection selection, String mode) {
		System::out.println("called selected launch ")
		Display.current.asyncExec(new Runnable(){
			
			override run() {
				if (selection instanceof IStructuredSelection) {
			var Object element = ((selection as IStructuredSelection)).getFirstElement()
			if (element instanceof IFile) {
				var IFile f = (element as IFile)
				var Injector injector = ContainerActivator::getInstance().getInjector(
					ContainerActivator::ORG_ECLIPSE_DOCKER_LANGUAGE_CONTAINER)
				var ResourceSet instance = injector.getInstance(typeof(ResourceSet))
				val createURI = URI::createFileURI(f.location.toOSString)
				var Resource resource = instance.getResource(createURI, true)
				val images = resource.allContents.filter(Image)
				images.forEach[print(it.name)]
				new DockerInterpreterImpl().interpretImage(images.head)
				
			}
		}
			}
			
		})
		
		// do magic
		
	}

	override void launch(IEditorPart editor, String mode) {
		System::out.println("called editor launch ") // do magoic
	}
}
