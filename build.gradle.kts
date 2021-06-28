import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
    application
}

group = "me.jstuy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.cloud:google-cloud-storage")
    implementation(kotlin("stdlib-jdk8"))
    implementation(platform("com.google.cloud:libraries-bom:20.7.0"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}

tasks.withType<Wrapper> {
    // https://gradle.org/releases/
    gradleVersion = "6.9"
    distributionType = Wrapper.DistributionType.ALL
}
