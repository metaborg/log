plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(platform(project(":depconstraints")))

  api(project(":log.api"))

  compileOnly("org.checkerframework:checker-qual-android")
}
