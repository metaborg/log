plugins {
    id("org.metaborg.gradle.config.java-library")
}

dependencies {
    api(project(":log.api"))

    api(libs.slf4j.api)

    compileOnly(libs.checkerframework.android)
}
