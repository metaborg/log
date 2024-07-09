rootProject.name = "log.root"

// This allows us to use plugins from Metaborg Artifacts
pluginManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
}

// This allows us to use the catalog in dependencies
dependencyResolutionManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
    versionCatalogs {
        create("libs") {
            from("org.metaborg.spoofax3:catalog:0.3.3")
        }
    }
}

// This downloads an appropriate JVM if not already available
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}


fun includeProject(path: String, id: String = "log.${path.replace('/', '.')}") {
    include(id)
    project(":$id").projectDir = file(path)
}

includeProject("depconstraints")
includeProject("api")
includeProject("backend.logback")
includeProject("backend.slf4j")
includeProject("dagger")
