rootProject.name = "grpc-learn-client-android"

include(":protos")
include(":stub-android")
include(":grpc-android")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}