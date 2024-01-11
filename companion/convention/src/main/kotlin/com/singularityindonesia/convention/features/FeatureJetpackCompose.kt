package com.singularityindonesia.convention.features

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class FeatureJetpackCompose : Plugin<Project> {

    private val KOTLIN_COMPILER_EXTENSION_VERSION = "1.5.1"

    override fun apply(target: Project) {
        with(target) {
            setupExtension<ApplicationExtension>()
            setupExtension<LibraryExtension>()
        }
    }

    private inline fun <reified T : CommonExtension<*, *, *, *, *>> Project.setupExtension() {
        runCatching {
            extensions.configure<T> {
                buildFeatures {
                    compose = true
                }

                composeOptions {
                    kotlinCompilerExtensionVersion = KOTLIN_COMPILER_EXTENSION_VERSION
                }
            }
        }
    }
}