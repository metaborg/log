plugins {
    `java-platform`
    `maven-publish`
}

val checkerframeworkVersion = "3.16.0"

val daggerVersion = "2.41"

dependencies {
    constraints {
        api("org.checkerframework:checker-qual-android:$checkerframeworkVersion") // Use android version: annotation retention policy is class instead of runtime.

        api("com.google.dagger:dagger:$daggerVersion")
        api("com.google.dagger:dagger-compiler:$daggerVersion")
    }
}

publishing {
    publications {
        create<MavenPublication>("JavaPlatform") {
            from(components["javaPlatform"])
        }
    }
}
