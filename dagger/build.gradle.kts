plugins {
    id("org.metaborg.gradle.config.java-library")
}

dependencies {
    api(project(":log.api"))
    api(libs.dagger)

    annotationProcessor(libs.dagger.compiler)
    compileOnly(libs.checkerframework.android)
}
