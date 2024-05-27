plugins {
    id("org.metaborg.gradle.config.java-library")
}

dependencies {
    api(platform(project(":log.depconstraints")))
    annotationProcessor(platform(project(":log.depconstraints")))

    api(project(":log.api"))
    api("com.google.dagger:dagger")

    annotationProcessor("com.google.dagger:dagger-compiler")
    compileOnly("org.checkerframework:checker-qual-android")
}
