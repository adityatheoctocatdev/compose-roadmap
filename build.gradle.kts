buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(com.adityatheoctocatdev.composeroadmap.buildsrc.Libs.Android.androidGradlePlugin)
        classpath(com.adityatheoctocatdev.composeroadmap.buildsrc.Libs.Kotlin.kotlinGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}