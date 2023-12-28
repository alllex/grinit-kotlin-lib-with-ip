
pluginManagement {
    includeBuild("build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "grinit-kotlin-lib-with-ip"
include("app", "list", "utilities")
