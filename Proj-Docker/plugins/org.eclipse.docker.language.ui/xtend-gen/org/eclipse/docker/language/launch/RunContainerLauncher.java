package org.eclipse.docker.language.launch;

import com.google.common.collect.Iterators;
import com.google.inject.Injector;
import java.util.Iterator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.docker.language.DockerInterpreterImpl;
import org.eclipse.docker.language.container.Image;
import org.eclipse.docker.language.ui.internal.ContainerActivator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class RunContainerLauncher implements ILaunchShortcut, ILaunchShortcut2, ILaunchConfigurationDelegate {
  @Override
  public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
    System.out.println("called launch");
  }
  
  @Override
  public ILaunchConfiguration[] getLaunchConfigurations(final ISelection selection) {
    System.out.println("called selected launch configuration");
    return null;
  }
  
  @Override
  public ILaunchConfiguration[] getLaunchConfigurations(final IEditorPart editorpart) {
    System.out.println("called editor launch configuration");
    return null;
  }
  
  @Override
  public IResource getLaunchableResource(final ISelection selection) {
    System.out.println("called selectable resource");
    if ((selection instanceof IStructuredSelection)) {
      Object[] _array = ((IStructuredSelection) selection).toArray();
      for (final Object element : _array) {
        if ((element instanceof IFile)) {
          return ((IResource) element);
        }
      }
    }
    return null;
  }
  
  @Override
  public IResource getLaunchableResource(final IEditorPart editorpart) {
    final IEditorInput input = editorpart.getEditorInput();
    if ((input instanceof FileEditorInput)) {
      return ((FileEditorInput) input).getFile();
    }
    return null;
  }
  
  @Override
  public void launch(final ISelection selection, final String mode) {
    System.out.println("called selected launch ");
    Display _current = Display.getCurrent();
    _current.asyncExec(new Runnable() {
      @Override
      public void run() {
        if ((selection instanceof IStructuredSelection)) {
          Object element = ((IStructuredSelection) selection).getFirstElement();
          if ((element instanceof IFile)) {
            IFile f = ((IFile) element);
            ContainerActivator _instance = ContainerActivator.getInstance();
            Injector injector = _instance.getInjector(
              ContainerActivator.ORG_ECLIPSE_DOCKER_LANGUAGE_CONTAINER);
            ResourceSet instance = injector.<ResourceSet>getInstance(ResourceSet.class);
            IPath _location = f.getLocation();
            String _oSString = _location.toOSString();
            final URI createURI = URI.createFileURI(_oSString);
            Resource resource = instance.getResource(createURI, true);
            TreeIterator<EObject> _allContents = resource.getAllContents();
            final Iterator<Image> images = Iterators.<Image>filter(_allContents, Image.class);
            final Procedure1<Image> _function = (Image it) -> {
              String _name = it.getName();
              InputOutput.<String>print(_name);
            };
            IteratorExtensions.<Image>forEach(images, _function);
            DockerInterpreterImpl _dockerInterpreterImpl = new DockerInterpreterImpl();
            Image _head = IteratorExtensions.<Image>head(images);
            _dockerInterpreterImpl.interpretImage(_head);
          }
        }
      }
    });
  }
  
  @Override
  public void launch(final IEditorPart editor, final String mode) {
    System.out.println("called editor launch ");
  }
}
