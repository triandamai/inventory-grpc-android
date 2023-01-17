pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "inventory-grpc-client-android"

include(":protos")
include(":stub")
include(":app-module")