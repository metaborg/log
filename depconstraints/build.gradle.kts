plugins {
  `java-platform`
  `maven-publish`
}

dependencies {
  constraints {
    api("org.checkerframework:checker-qual-android:2.6.0") // Use android version: annotation retention policy is class instead of runtime.
  }
}

publishing {
  publications {
    create<MavenPublication>("JavaPlatform") {
      from(components["javaPlatform"])
    }
  }
}
