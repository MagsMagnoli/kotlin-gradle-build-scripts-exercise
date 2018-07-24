package com.mikemagss.kotlingradlebuildscriptsexercise

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * A custom task that warmly greets you.
 */
open class MyTask : DefaultTask() {

    /**
     * The name of the developer. This will be used for greeting.
     */
    var yourName = "developer"

    @TaskAction
    fun greet() {
        logger.lifecycle("Hello, $yourName! I warmly greet you.")
    }
}