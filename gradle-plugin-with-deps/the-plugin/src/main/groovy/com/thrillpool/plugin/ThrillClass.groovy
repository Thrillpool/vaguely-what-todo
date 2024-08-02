package com.thrillpool.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import com.thrillpool.inter.ThrillInt
import org.gradle.api.tasks.Input

class ThrillClass extends DefaultTask {

    @Input
    def fancyCp = null

    @TaskAction
    def generate() {
        def classLoader = new URLClassLoader(fancyCp()*.toURI()*.toURL() as URL[], this.class.classLoader)
        def loader = ServiceLoader.load(ThrillInt, classLoader)

        // but I just want the first one, oh well
        for (ThrillInt thrillint: loader) {
            thrillint.run()
        }
    }
}