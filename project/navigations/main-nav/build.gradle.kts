@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("LibraryConventionV1")
    id("FeatureJetpackCompose")
}

android {
    namespace = "com.singularityindonesia.android.main_nav"
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)

    implementation(libs.activity.compose)
    implementation(libs.ui.android)
    implementation(libs.ui.graphics.android)
    implementation(libs.ui.tooling.preview.android)
    implementation(libs.material3.android)
    implementation(libs.navigation.compose)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}