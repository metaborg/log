plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(project(":log.api"))
  api("org.slf4j:slf4j-api:1.7.25")
  compileOnly("org.checkerframework:checker-qual-android:2.6.0") // Use android version: annotation retention policy is class instead of runtime.
}
