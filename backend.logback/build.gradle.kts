plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(project(":log.api"))
  api("ch.qos.logback:logback-classic:1.2.3")
  compileOnly("org.checkerframework:checker-qual-android:2.6.0") // Use android version: annotation retention policy is class instead of runtime.
}
