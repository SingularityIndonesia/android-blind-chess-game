package com.singularityindonesia.convention.features

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class FeatureJetpackCompose : Plugin<Project> {

    private val KOTLIN_COMPILER_EXTENSION_VERSION = "1.5.1"

    override fun apply(target: Project) {
        with(target) {

            extensions.configure<LibraryExtension> {
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