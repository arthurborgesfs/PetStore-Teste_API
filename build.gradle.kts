plugins {
    id("java")
}

group = "br.com.iterasys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
// https://mvnrepository.com/artifact/org.testng/testng
    testImplementation group: 'org.testng', name: 'testng', version: '7.7.1'
// https://mvnrepository.com/artifact/io.rest-assured/rest-assured
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.3.0'
}

tasks.test {
    useJUnitPlatform()
}