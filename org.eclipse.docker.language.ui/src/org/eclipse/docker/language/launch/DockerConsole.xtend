package org.eclipse.docker.language.launch

import com.google.inject.Singleton
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.IConsole
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.console.IConsoleConstants
import org.eclipse.ui.console.IConsoleView
import org.eclipse.ui.console.MessageConsoleStream

@Singleton 
	class DockerConsole {
	var MessageConsoleStream str = null

	new() {
		var conole = new MessageConsole("DockerConsole", null)
		str = conole.newMessageStream
		str.activateOnWrite=true
		var man = ConsolePlugin.^default.consoleManager
		var IConsole[] consoles = #{conole}
		man.addConsoles(consoles)

		var view = PlatformUI.workbench.activeWorkbenchWindow.activePage.showView(
			IConsoleConstants.ID_CONSOLE_VIEW) as IConsoleView
		view.display(conole)
	}

	def void write(String text) {
		
		str.println(text)
		str.flush
	}
}
