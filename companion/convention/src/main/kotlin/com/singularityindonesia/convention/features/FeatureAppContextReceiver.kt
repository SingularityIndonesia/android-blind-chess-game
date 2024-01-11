package com.singularityindonesia.convention.features

import com.android.build.api.dsl.ApplicationExtension
import com.singularityindonesia.convention.companion.kotlinCompile
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class FeatureAppContextReceiver : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {

            extensions.configure<ApplicationExtension> {
                kotlinCompile {
                    kotlinOptions {
                        freeCompilerArgs += "-Xcontext-receivers"
                    }
                }
            }
        }
    }
}