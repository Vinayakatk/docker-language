package org.eclipse.docker.event;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

import org.eclipse.docker.language.launch.DockerConsole;
import org.eclipse.docker.language.ui.internal.ContainerActivator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.core.command.EventsResultCallback;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private EventsResultCallback callBack;
	private DockerConsole console;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Injector injector = ContainerActivator.getInstance().getInjector(ContainerActivator.ORG_ECLIPSE_DOCKER_LANGUAGE_CONTAINER);
		Provider<DockerClient> provider = injector.getProvider(DockerClient.class);
		console = injector.getInstance(DockerConsole.class); 
		DockerClient dockerClient = provider.get();
		
		callBack = dockerClient.eventsCmd().exec(new EventsResultCallback(){
			@Override
			public void onNext(Event item) {
				if(item!=null ) console.write(item.getStatus()+"  "+item.getId());
				super.onNext(item);
			}
			@Override
			public void onStart(Closeable stream) {
				System.out.println("started");
				super.onStart(stream);
			}
			@Override
			public void onComplete() {
			System.out.println("complete");
			}
			@Override
			public void onError(Throwable arg0) {
				try {
					throw arg0;
				} catch (Throwable e) {
					console.write(e.getMessage());
				}
			}
		});
		try {
			callBack.awaitCompletion(999999999, TimeUnit.DAYS);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		callBack.close();
	}

}
