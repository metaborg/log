plugins {
    id("org.metaborg.gradle.config.java-library")
}

dependencies {
    api(platform(project(":log.depconstraints")))

    api(project(":log.api"))

    api("ch.qos.logback:logback-classic:1.2.3")

    compileOnly("org.checkerframework:checker-qual-android")
}
