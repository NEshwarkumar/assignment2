plugins {
    id ("java")
}

repositories {
    mavenCentral()
}

dependencies {

    implementation ("com.fasterxml.jackson.core:jackson-databind:2.14.0")
    implementation ("org.springframework.boot:spring-boot-starter:2.7.5")
    compileOnly ("org.projectlombok:lombok:1.18.24")
    annotationProcessor ("org.projectlombok:lombok:1.18.24")

    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation ("org.springframework.boot:spring-boot-starter-test:2.7.5")
}

tasks.test {
    useJUnitPlatform()
}
