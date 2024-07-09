plugins {
    `java-library`
    id("org.metaborg.convention.java")
}

group = "org.metaborg"

dependencies {
    compileOnly(libs.checkerframework.android)
}
