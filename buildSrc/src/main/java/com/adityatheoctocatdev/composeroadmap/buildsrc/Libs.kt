package com.adityatheoctocatdev.composeroadmap.buildsrc

object Libs {
    object Android {
        const val androidGradlePlugin =
            "com.android.tools.build:gradle:${Versions.Android.androidGradlePlugin}"
    }

    object Kotlin {
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlinVersion}"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlinVersion}"
    }

    object Google {
        const val materialComponents =
            "com.google.android.material:material:${Versions.Google.materialComponents}"
    }

    object AndroidX {
        object Core {
            const val coreKtx = "androidx.core:core-ktx:1.3.2"
        }

        object AppCompat {
            const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        }

        object Compose {
            object UI {
                const val ui = "androidx.compose.ui:ui:1.0.0-beta05"
                const val uiTooling = "androidx.compose.ui:ui-tooling:1.0.0-beta05"
                const val uiTestingJUnit4 = "androidx.compose.ui:ui-test-junit4:1.0.0-beta05"
            }

            object Material {
                const val material = "androidx.compose.material:material:1.0.0-beta05"
            }
        }

        object Lifecycle {
            const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        }

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha07"
        }

        object Test {
            object Ext {
                const val jUnit = "androidx.test.ext:junit:1.1.2"
            }

            object Espresso {
                const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
            }
        }
    }

    object JUnit {
        const val jUnit = "junit:junit:4.13.2"
    }
}