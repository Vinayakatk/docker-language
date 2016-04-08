package org.eclipse.docker.language;

import java.io.File;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.BuildResponseItem;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.BuildImageResultCallback;

public class time {
public static void main(String[] args) throws InterruptedException {
	DockerClientConfig build = DockerClientConfig.createDefaultConfigBuilder().withDockerCertPath("C:\\Users\\vinio\\.docker\\machine\\certs").withUri("https://192.168.99.100:2376").build();
//	DockerClient build2 = DockerClientBuilder.getInstance("http:/).build();
	DockerClient build2 = DockerClientBuilder.getInstance(build).build();
//	build2.buildImageCmd().withDockerfile(new File("d/Dockerfile")).withTag("vinin:yy").exec(new BuildImageResultCallback(){
//	@Override
//	public void onNext(BuildResponseItem item) {
//		System.out.println("current "+item.getProgressDetail().getCurrent() +"  total"+item.getProgressDetail().getTotal()+" start"+item.getProgressDetail().getStart());
//		super.onNext(item);
//	}
//}).awaitCompletion();
	File baseDir = new File(".");

	BuildImageResultCallback callback = new BuildImageResultCallback() {
	    @Override
	    public void onNext(BuildResponseItem item) {
	       System.out.println("" + item);
	       System.out.println("current "+item.getProgressDetail().getCurrent() +"  total"+item.getProgressDetail().getTotal()+" start"+item.getProgressDetail().getStart());
			
	       super.onNext(item);
	    }
	};
//
//	build2.buildImageCmd().withDockerfile(baseDir).exec(callback).awaitImageId();
	try{
		BuildImageResultCallback exec = build2.buildImageCmd().withDockerfile(new File("d/Dockerfile")).exec(new BuildImageResultCallback(){
			@Override
			public void onNext(BuildResponseItem item) {
				System.out.println("current "+item.getProgressDetail().getCurrent() +"  total"+item.getProgressDetail().getTotal()+" start"+item.getProgressDetail().getStart());
				super.onNext(item);
			}
		});
		}
		catch(Exception b){
			System.out.println(b);
		}

try{
build2.buildImageCmd().withDockerfile(baseDir).exec(
		callback);
}
catch(Exception b){
	System.out.println(b);
}
}
}
