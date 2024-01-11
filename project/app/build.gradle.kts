plugins {
    id("AppConventionV1")
    id("FeatureAppJetpackCompose")
}

android {
    namespace = "com.singularityindonesia.android.blindchess"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)

    implementation(libs.activity.compose)
    implementation(libs.ui.android)
    implementation(libs.ui.graphics.android)
    implementation(libs.ui.tooling.preview.android)
    implementation(libs.material3.android)

    implementation(project(":project:libs:theme"))

    testImplementation(libs.junit)

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ui.test.junit4)

    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}