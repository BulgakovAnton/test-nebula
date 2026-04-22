plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.jetbrains.nebula"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}


tasks.test {
    useJUnitPlatform()
    jvmArgs("-Xmx2g")
}

kotlin {
    jvmToolchain(21)
}