plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.plugins.aps"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:main"))
    implementation(project(":core:interfaces"))
    implementation(project(":core:nssdk"))
    implementation(project(":core:utils"))
    implementation(project(":core:ui"))
    implementation(project(":core:validators"))
    implementation(project(":implementation"))

    testImplementation(project(":pump:virtual"))
    testImplementation(project(":shared:tests"))

    api(Libs.AndroidX.appCompat)
    api(Libs.AndroidX.swipeRefreshLayout)
    api(Libs.AndroidX.gridLayout)

    // APS
    api(Libs.Mozilla.rhino)

    //Logger
    api(Libs.Logging.slf4jApi)

    kapt(Libs.Dagger.androidProcessor)
}