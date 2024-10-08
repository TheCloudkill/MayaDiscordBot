import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// Uncomment this block if you want to use your preferred logging library instead of slf4j-simple
/*configurations {
    implementation {
        exclude("org.slf4j", "slf4j-simple")
    }
}*/

dependencies {
    implementation("com.jessecorbett:diskord-bot:5.4.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "21"
}

application {
    mainClass.set("com.example.MainKt")
}
