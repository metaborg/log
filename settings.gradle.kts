rootProject.name = "log.root"

pluginManagement {
    repositories {
        maven("https://artifacts.metaborg.org/content/groups/public/")
    }
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
