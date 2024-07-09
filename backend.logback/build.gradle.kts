plugins {
    `java-library`
    id("org.metaborg.convention.java")
}

group = "org.metaborg"

dependencies {
    api(project(":log.api"))
    api(libs.logback)

    compileOnly(libs.checkerframework.android)
}
