rootProject.name = "log.root"

pluginManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
}

plugins {
    id("org.metaborg.convention.settings") version "0.0.6"
}


include(":log.api")
include(":log.backend.logback")
include(":log.backend.slf4j")
include(":log.dagger")
