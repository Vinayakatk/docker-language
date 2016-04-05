package org.eclipse.docker.language.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class RunContainerLauncher implements ILaunchShortcut, 
ILaunchShortcut2, ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		System.out.println("called launch");
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		System.out.println("called selected launch configuration");
		
		return null;
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		System.out.println("called editor launch configuration");
		return null;
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		System.out.println("called selectable resource");
		if (selection instanceof IStructuredSelection) {
			for (final Object element : ((IStructuredSelection) selection).toArray()) {
				if (element instanceof IFile)
					return (IResource) element;
			}
		}

	
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editorpart) {
		final IEditorInput input = editorpart.getEditorInput();
		if (input instanceof FileEditorInput)
			return ((FileEditorInput) input).getFile();

	
		return null;
	}

	@Override
	public void launch(ISelection selection, String mode) {
		System.out.println("called selected launch ");
		//do magic
		
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		System.out.println("called editor launch ");
		// do magoic
		
	} 
}
