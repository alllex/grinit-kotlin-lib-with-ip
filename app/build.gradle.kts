
plugins {
    id("buildlogic.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    mainClass = "org.example.app.AppKt"
}
