plugins {
    `java-library`
    `maven-publish`
    id("org.metaborg.convention.java")
    id("org.metaborg.convention.maven-publish")
}

group = "org.metaborg"

dependencies {
    api(project(":log.api"))
    api(libs.dagger)

    annotationProcessor(libs.dagger.compiler)
    compileOnly(libs.checkerframework.android)
}

mavenPublishConvention {
    repoOwner.set("metaborg")
    repoName.set("log")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
