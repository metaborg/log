rootProject.name = "log.root"

dependencyResolutionManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
        gradlePluginPortal()
    }
}

plugins {
    id("org.metaborg.convention.settings") version "0.8.1"
}


include(":log.api")
include(":log.backend.logback")
include(":log.backend.slf4j")
include(":log.dagger")
