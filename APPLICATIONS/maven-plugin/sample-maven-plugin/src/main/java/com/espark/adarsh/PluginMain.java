package com.espark.adarsh;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sample-message", defaultPhase = LifecyclePhase.COMPILE)
public class PluginMain extends AbstractMojo {


    @Parameter(property = "sample-message.greeting", defaultValue = "welcome_to_espark" )
    private String greeting;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Sample message plugin "+greeting);
    }
}