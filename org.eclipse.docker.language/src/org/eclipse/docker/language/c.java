package org.eclipse.docker.language;

import java.util.List;

import org.eclipse.docker.language.container.Container;
import org.eclipse.docker.language.util.ContainerUtil;

import com.github.dockerjava.api.DockerClient;
import com.google.common.eventbus.EventBus;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class c {
	public static void main(String[] args) {
		Injector createInjector = Guice.createInjector(new ContainerRuntimeModule());
		Provider<DockerClient> instance = createInjector.getProvider(DockerClient.class);
		DockerClient x = instance.get();
		System.out.println(x);
		
		List<Container> runningContainers = createInjector.getInstance(ContainerUtil.class).getRunningContainers();
		System.out.println(runningContainers);
		EventBus instance2 = createInjector.getInstance(EventBus.class);
		EventBus instance3 = createInjector.getInstance(EventBus.class);
		System.out.println(instance2);
		System.out.println(instance3);
	}

}
