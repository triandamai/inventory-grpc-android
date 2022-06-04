import org.jetbrains.kotlin.kapt.cli.main

plugins {
    id("com.android.application")
    id("kotlin-android")
}


android {
    compileSdk =31

    defaultConfig {
        applicationId= "app.trian.grpcandroid"
        minSdk= 21
        targetSdk =30
        versionCode= 1
        versionName ="1.0"

        testInstrumentationRunner= "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    signingConfigs{
        create("release"){

        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled= false
           // proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
val composeVersion = "1.1.1"
val navVersion = "2.4.2"
dependencies {

    implementation(project(":stub-android"))
    implementation(kotlin("stdlib"))
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.appcompat:appcompat:1.4.1")

    implementation("androidx.compose.foundation:foundation-layout:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.runtime:runtime:$composeVersion")
    implementation("androidx.compose.ui:ui:$composeVersion")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$composeVersion")
    implementation("androidx.navigation:navigation-compose:$navVersion")


    runtimeOnly("io.grpc:grpc-okhttp:1.46.0")
}