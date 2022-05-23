import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("groovy")
    id("jacoco")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.codehaus.groovy:groovy:3.0.6")
    testImplementation("org.spockframework:spock-bom:2.0-M3-groovy-3.0")
    testImplementation("org.spockframework:spock-core:2.0-M3-groovy-3.0")
    testImplementation("org.spockframework:spock-spring:2.0-M3-groovy-3.0")
    testImplementation("org.spockframework:spock-junit4:2.0-M3-groovy-3.0")

}
jacoco{
    toolVersion = "0.8.7"
}

tasks{
    test {
        useJUnitPlatform()
    }

    jacocoTestReport {
        reports {
            csv.isEnabled = false
            html.destination = file("$buildDir/jacocoHtml")
            xml.isEnabled = false
        }
    }

    withType<Test> {
        finalizedBy(jacocoTestReport)
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}