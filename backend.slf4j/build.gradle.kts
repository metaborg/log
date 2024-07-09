plugins {
    `java-library`
    id("org.metaborg.convention.java")
}

group = "org.metaborg"

dependencies {
    api(project(":log.api"))
    api(libs.slf4j.api)

    compileOnly(libs.checkerframework.android)
}
