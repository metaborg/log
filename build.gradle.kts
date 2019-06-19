plugins {
  id("org.metaborg.gradle.config.root-project") version "0.3.8"
  id("org.metaborg.gitonium") version "0.1.2"
}

subprojects {
  metaborg {
    configureSubProject()
  }
}
