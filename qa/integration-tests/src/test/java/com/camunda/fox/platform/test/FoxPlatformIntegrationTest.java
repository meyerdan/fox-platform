package com.camunda.fox.platform.test;

import java.io.File;

import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;

/**
 * 
 * @author Daniel Meyer
 *
 */
public abstract class FoxPlatformIntegrationTest {
  
  protected static File[] getFoxPlatformClient() {
    MavenDependencyResolver resolver = DependencyResolvers.use(MavenDependencyResolver.class).goOffline().loadMetadataFromPom("pom.xml");
    return resolver.artifact("com.camunda.fox:fox-platform-client").resolveAsFiles();
  }

}