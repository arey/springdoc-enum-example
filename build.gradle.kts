plugins {
    id("org.springframework.boot") version "2.6.8"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("java")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    // Change version to 1.6.7 or 1.6.13 to test problem with enum in swagger ui
    implementation("org.springdoc:springdoc-openapi-ui:1.6.6")
    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.6")

//    implementation("org.springdoc:springdoc-openapi-ui:1.6.7")
//    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.7")

//    implementation("org.springdoc:springdoc-openapi-ui:1.6.13")
//    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.13")
}
