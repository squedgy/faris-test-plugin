/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.squedgy.test.gradle.plugin;

import org.gradle.api.*;
import org.gradle.api.tasks.testing.logging.TestLogging;

public class App implements Plugin<Project>{


    @Override
    public void apply(Project project) {
        project
            .configure(
                project.getTasksByName("test", false),
                t -> {
                    ((TestLogging)t.property("testLogging")).setShowStandardStreams(true);
                }
            );
//        project.getTasks().getByName("test").doFirst(t -> {
//            t.setProperty("showStandardStreams", true);
//        });
    }
}