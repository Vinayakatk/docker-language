package org.eclipse.docker.language.launch;

import com.google.inject.Singleton;
import java.util.Collections;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Singleton
@SuppressWarnings("all")
public class DockerConsole {
  private MessageConsoleStream str = null;
  
  public DockerConsole() {
    try {
      MessageConsole conole = new MessageConsole("DockerConsole", null);
      MessageConsoleStream _newMessageStream = conole.newMessageStream();
      this.str = _newMessageStream;
      this.str.setActivateOnWrite(true);
      ConsolePlugin _default = ConsolePlugin.getDefault();
      IConsoleManager man = _default.getConsoleManager();
      IConsole[] consoles = ((IConsole[])Conversions.unwrapArray(Collections.<MessageConsole>unmodifiableSet(CollectionLiterals.<MessageConsole>newHashSet(conole)), IConsole.class));
      man.addConsoles(consoles);
      IWorkbench _workbench = PlatformUI.getWorkbench();
      IWorkbenchWindow _activeWorkbenchWindow = _workbench.getActiveWorkbenchWindow();
      IWorkbenchPage _activePage = _activeWorkbenchWindow.getActivePage();
      IViewPart _showView = _activePage.showView(
        IConsoleConstants.ID_CONSOLE_VIEW);
      IConsoleView view = ((IConsoleView) _showView);
      view.display(conole);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void write(final String text) {
    try {
      this.str.println(text);
      this.str.flush();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
