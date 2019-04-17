plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(platform(project(":depconstraints")))

  api(project(":log.api"))

  api("org.slf4j:slf4j-api:1.7.25")

  compileOnly("org.checkerframework:checker-qual-android")
}
