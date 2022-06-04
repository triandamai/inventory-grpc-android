import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc
import org.gradle.kotlin.dsl.main

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.google.protobuf")
}

dependencies {
    protobuf(project(":protos"))

    api(kotlin("stdlib"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")

    api("io.grpc:grpc-stub:1.46.0")
    api("io.grpc:grpc-protobuf-lite:1.46.0")
    api("io.grpc:grpc-kotlin-stub:1.3.0")
    api("com.google.protobuf:protobuf-kotlin-lite:3.20.1")
}

android {
    compileSdk = 31
    buildToolsVersion = "31.0.0"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    sourceSets {

        getByName("main") {

            jniLibs.srcDir("build/generated/source/proto/debug/grpc")
            jniLibs.srcDir("build/generated/source/proto/debug/java")
//            jniLibs.srcDir("build/generated/source/proto/release/grpc")
//            jniLibs.srcDir("build/generated/source/proto/release/java")
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.20.1"
    }
    plugins {
        id("java") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.46.0"
        }
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.46.0"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.3.0:jdk8@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("java") {
                    option("lite")
                }
                id("grpc") {
                    option("lite")
                }
                id("grpckt") {
                    option("lite")
                }
            }
            it.builtins {
                id("kotlin") {
                    option("lite")
                }
            }
        }
    }
}