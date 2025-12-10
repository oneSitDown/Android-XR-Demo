plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.ffalcon.androidxrdemo"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.ffalcon.androidxrdemo"
        minSdk = 34
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose)
    implementation(libs.androidx.runtime)
    implementation(libs.androidx.scenecore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

//    implementation("androidx.xr.runtime:runtime:1.0.0-alpha09")
    implementation("androidx.xr.scenecore:scenecore:1.0.0-alpha6")
////    implementation("androidx.xr.compose:compose:1.0.0-alpha09")
////    implementation("androidx.xr.compose.material3:material3:1.0.0-alpha13")
//    implementation("androidx.xr.arcore:arcore:1.0.0-alpha09")
//
//    // For compatibility with guava, use these dependencies:
//    implementation("androidx.xr.arcore:arcore-guava:1.0.0-alpha09")
//    implementation("androidx.xr.runtime:runtime-guava:1.0.0-alpha05")
//    implementation("androidx.xr.scenecore:scenecore-guava:1.0.0-alpha10")
//
//    // For compatibility with rxjava3, use these dependencies:
//    implementation("androidx.xr.arcore:arcore-rxjava3:1.0.0-alpha09")
//    implementation("androidx.xr.runtime:runtime-rxjava3:1.0.0-alpha09")
}