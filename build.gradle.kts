plugins {
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    java
}

val group = "me.savcheg"
val version = "0.0.1-SNAPSHOT"
val sourceCompatibility = "17"

tasks.jar {
    enabled = false
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-maven-plugin:2.6.4")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework:spring-jdbc:5.3.17")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.thymeleaf:thymeleaf-spring5:3.0.15.RELEASE")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    runtimeOnly("com.h2database:h2:2.1.210")
    implementation(group = "org.postgresql" , name = "postgresql", version = "42.3.3")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
