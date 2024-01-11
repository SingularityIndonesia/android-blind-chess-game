plugins {
    `kotlin-dsl`
}

group = "com.singularityindonesia.convention"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    implementation("com.android.tools.build:gradle:8.2.1")
    /*implementation(libs.ksp.gradle.plugin)
    implementation(libs.detekt.plugin)
    implementation(libs.javapoet.plugin)
    implementation(libs.navigation.safeargs.plugin)
    implementation(libs.kotlinx.kover.plugin)*/
}

gradlePlugin {
    plugins {
        register("AppConventionV1") {
            id = "AppConventionV1"
            implementationClass = "com.singularityindonesia.convention.AppConventionV1"
        }
        register("LibraryConventionV1") {
            id = "LibraryConventionV1"
            implementationClass = "com.singularityindonesia.convention.LibraryConventionV1"
        }
        register("FeatureAppJetpackCompose") {
            id = "FeatureAppJetpackCompose"
            implementationClass = "com.singularityindonesia.convention.features.FeatureAppJetpackCompose"
        }
        register("FeatureJetpackCompose") {
            id = "FeatureJetpackCompose"
            implementationClass = "com.singularityindonesia.convention.features.FeatureJetpackCompose"
        }
        register("FeatureAppContextReceiver") {
            id = "FeatureAppContextReceiver"
            implementationClass = "com.singularityindonesia.convention.features.FeatureAppContextReceiver"
        }
        register("FeatureContextReceiver") {
            id = "FeatureContextReceiver"
            implementationClass = "com.singularityindonesia.convention.features.FeatureContextReceiver"
        }
    }
}
