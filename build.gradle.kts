plugins {
    kotlin("jvm") version "2.0.20"
    id("java")
    id("info.solidsoft.pitest") version "1.15.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}

pitest {
    pitestVersion.set("1.3.2")
    targetClasses.set(listOf("com.example.Math"))
    targetTests.set(listOf("com.example.MathTest"))
    outputFormats.set(listOf("HTML"))
    timestampedReports.set(true)
    reportDir.set(file("build/pitest"))
    mutators.set(listOf("ALL"))
    threads.set(4)
}