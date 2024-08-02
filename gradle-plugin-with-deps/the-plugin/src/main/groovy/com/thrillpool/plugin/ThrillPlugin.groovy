package com.thrillpool.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ThrillPlugin implements Plugin<Project> {
    void apply(Project project) {
        def fancyConf = project.configurations.create("fancy")
        project.dependencies.add("fancy", "com.thrillpool:impl-thing")
        project.tasks.register("thrillTask", ThrillClass) {
            fancyCp = { project.configurations.fancy.files }
        }
    }
}