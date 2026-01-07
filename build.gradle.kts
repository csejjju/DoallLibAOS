import org.gradle.internal.impldep.jcifs.util.LogStream.level

buildscript {
    dependencies {
        classpath(libs.android.maven.gradle.plugin)

    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.lib) apply false
}
