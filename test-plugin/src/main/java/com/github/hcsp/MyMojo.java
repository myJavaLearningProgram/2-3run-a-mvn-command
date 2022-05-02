package com.github.hcsp;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

/**
 * Goal which touches a timestamp file.
 */
@Mojo(name = "answer", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class MyMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        getLog().warn("The answer is: " + new String(Base64.getEncoder().encode("hardcore space".getBytes())));
        getLog().warn("答案是： " + new String(Base64.getEncoder().encode("hardcore space".getBytes())));
    }
}
