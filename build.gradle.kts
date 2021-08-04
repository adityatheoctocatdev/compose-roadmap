buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        dependabot/gradle/org.jetbrains.kotlin-kotlin-gradle-plugin-1.5.10
        classpath("com.android.tools.build:gradle:7.1.0-alpha01")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}