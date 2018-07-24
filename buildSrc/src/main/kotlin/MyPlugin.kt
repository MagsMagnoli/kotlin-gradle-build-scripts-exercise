package com.mikemagss.kotlingradlebuildscriptsexercise

import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.logger.lifecycle("MyPlugin was successfully applied " +
                "to your project named '${target.name}'!")
    }
}

/**
 * Access the `android` extension of this project. If the project is not an
 * Android app or library module, this method will throw.
 */
val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
            ?: error("Project '$name' is not an Android module. Can't " +
                    "access 'android' extension.")

/**
 * Accesses the app module-specific extensions of an Android module.
 */
val BaseExtension.app: AppExtension
    get() = this as? AppExtension
            ?: error("Android module is not an app module. Can't " +
                    "access 'android' app extension.")