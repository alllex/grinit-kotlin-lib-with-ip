
dependencyResolutionManagement {
    versionCatalogs {
        create("libs", { from(files("../gradle/libs.versions.toml")) })
    }
}

rootProject.name = "grinit-kotlin-lib-with-ip-build-logic"
