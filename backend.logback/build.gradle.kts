plugins {
    id("org.metaborg.gradle.config.java-library")
}

dependencies {
    api(project(":log.api"))

    api(libs.logback)

    compileOnly(libs.checkerframework.android)
}
