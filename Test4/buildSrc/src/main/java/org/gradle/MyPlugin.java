package org.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("hi", HiTask.class, (task) -> {
            task.setMessage("Hello,my dear friend");
            task.setRecipient("this is beautiful (no) gradle");
        });
    }
}