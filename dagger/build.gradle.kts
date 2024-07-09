plugins {
    `java-library`
    id("org.metaborg.convention.java")
}

group = "org.metaborg"

dependencies {
    api(project(":log.api"))
    api(libs.dagger)

    annotationProcessor(libs.dagger.compiler)
    compileOnly(libs.checkerframework.android)
}
