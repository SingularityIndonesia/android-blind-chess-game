package com.singularityindonesia.convention.features

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.singularityindonesia.convention.companion.kotlinCompile
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class FeatureContextReceiver : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            setupExtension<ApplicationExtension>()
            setupExtension<LibraryExtension>()
        }
    }

    private inline fun <reified T : CommonExtension<*, *, *, *, *>> Project.setupExtension() {
        runCatching {
            kotlinCompile {
                kotlinOptions {
                    freeCompilerArgs += "-Xcontext-receivers"
                }
            }
        }
    }
}