plugins {
    java
    id("io.qameta.allure") version "2.8.1"
}
dependencies {
    implementation(platform("org.junit:junit-bom:5.9.3"))
    implementation(platform("io.cucumber:cucumber-bom:7.12.1"))
    implementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
    implementation("io.cucumber:cucumber-spring:7.12.1")
    implementation("io.qameta.allure:allure-cucumber7-jvm:2.21.0")


    implementation("io.cucumber:cucumber-java")
    implementation("io.cucumber:cucumber-junit-platform-engine")
    implementation("org.junit.platform:junit-platform-suite")
    implementation("org.junit.jupiter:junit-jupiter")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
