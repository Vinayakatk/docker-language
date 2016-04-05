//package org.eclipse.docker.language
//
//import com.google.common.io.Resources
//import java.util.Properties
//import org.eclipse.core.runtime.FileLocator
//import java.io.IOException
//import java.net.URL
//
//class DockerConfig {
//     String version;
//     String uri;
//     String username;
//     String password;
//     String email;
//     String serverAddress;
//     String dockerCertPath;
//     String propertiesFileFullPath;
//
//    public new() {
//        var url = Resources.getResource(DockerConstants.p);
//        var Properties properties = readPropertyFile(url);
//        
//        
//        version = properties.getProperty(DockerConstants.PROPERTY_DOCKER_API_VERSION);
//        uri = properties.getProperty(DockerConstants.PROPERTY_DOCKER_URI);
//        username = properties.getProperty(DockerConstants.PROPERTY_USERNAME);
//        password = properties.getProperty(DockerConstants.PROPERTY_PASSWORD);
//        email = properties.getProperty(DockerConstants.PROPERTY_EMAIL);
//        serverAddress = properties
//                .getProperty(DockerConstants.PROPERTY_DOCKER_SERVER_ADDRESS);
//        dockerCertPath = properties
//                .getProperty(DockerConstants.PROPERTY_DOCKER_CERT_PATH);
//
//        var URL fullUrl = null;
//        try {
//            fullUrl = FileLocator.resolve(url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////         fullUrl == null ? null : fullUrl.getPath();
////    propertiesFileFullPath =fullUrl
//    }
//
//    def private hockeropertyFile(URL url) {
//        var  ByteSource byteSource = Resources.asByteSource(url);
//       var  Properties properties = new Properties();
//        InputStream inputStream = null;
//        try {
//            inputStream = byteSource.openBufferedStream();
//            properties.load(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (final IOException ioException) {
//                    ioException.printStackTrace();
//                }
//            }
//        }
//        return properties;
//    }
//
//    def public String getVersion() {
//        return version;
//    }
//
//    def public String getUri() {
//        return uri;
//    }
//
//    def public String getUsername() {
//        return username;
//    }
//
//    def public String getPassword() {
//        return password;
//    }
//
//    def public String getEmail() {
//        return email;
//    }
//
//    def public String getServerAddress() {
//        return serverAddress;
//    }
//
//    def public String getDockerCertPath() {
//        return dockerCertPath;
//    }
//
//    def public String getPropertiesFileFullPath() {
//        return propertiesFileFullPath;
//    }
//	
//}