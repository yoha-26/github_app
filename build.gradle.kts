// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}


buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Dagger Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}
task<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}
