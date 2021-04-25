import com.adityatheoctocatdev.composeroadmap.buildsrc.*

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 30
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.adityatheoctocatdev.composeroadmap"
        minSdk = 24
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        useIR = true
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.AndroidX.Compose.composeVersion
    }
}

dependencies {
    implementation(Libs.Kotlin.stdlib)

    implementation(Libs.Google.materialComponents)

    implementation(Libs.AndroidX.Core.coreKtx)
    implementation(Libs.AndroidX.AppCompat.appcompat)
    implementation(Libs.AndroidX.Compose.UI.ui)
    implementation(Libs.AndroidX.Compose.Material.material)
    implementation(Libs.AndroidX.Compose.UI.uiTooling)
    implementation(Libs.AndroidX.Lifecycle.lifecycleRuntimeKtx)
    implementation(Libs.AndroidX.Activity.activityCompose)

    testImplementation(Libs.JUnit.jUnit)

    androidTestImplementation(Libs.AndroidX.Test.Ext.jUnit)
    androidTestImplementation(Libs.AndroidX.Test.Espresso.espressoCore)
    androidTestImplementation(Libs.AndroidX.Compose.UI.uiTestingJUnit4)
}