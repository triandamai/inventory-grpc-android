plugins {
    id("com.android.application")
    id("com.google.dagger.hilt.android")
    id("io.gitlab.arturbosch.detekt")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = AppConfig.nameSpace
    compileSdk = 33

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = GlobalVersion.composeVersion
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

    implementation(project(":stub"))
    implementation(kotlin("stdlib"))
    runtimeOnly("io.grpc:grpc-okhttp:1.50.2")

    implementation(Deps.AndroidX.Core.coreKtx)
    implementation(Deps.AndroidX.Lifecycle.runtimeLifecycleKtx)
    implementation(Deps.AndroidX.Activity.activityCompose)
    implementation(Deps.AndroidX.Multidex.multidex)
    with(Deps.AndroidX.Compose) {
        implementation(platform(composeBom))
        androidTestImplementation(platform(composeBom))
        implementation(material3)
        implementation(ui)
        implementation(uiToolingPreview)
        debugImplementation(uiTooling)
        androidTestImplementation(uiTestJunit4)
        debugImplementation(uiTestManifest)
        implementation(materialIconExtended)
        implementation(materialWindowSizeClass)
    }
    with(Deps.Com.Google.Accompanist) {
        implementation(pager)
        implementation(pagerIndicator)
        implementation(flowLayout)
    }
    implementation(Deps.AndroidX.Compose.composeRuntimeLiveData)
    with(Deps.Com.Google.Dagger) {
        implementation(hiltAndroid)
        kapt(hiltAndroidCompiler)
    }
    implementation(Deps.AndroidX.Hilt.hiltNavigationCompose)
    implementation(Deps.AndroidX.Navigation.navigationCompose)
    implementation(Deps.AndroidX.Work.workRuntime)
    implementation(Deps.AndroidX.Hilt.hiltWork)
    kapt(Deps.AndroidX.Hilt.hiltCompiler)

    with(Deps.AndroidX.Room) {
        implementation(roomRuntime)
        kapt(roomCompiler)
        implementation(roomKtx)
        implementation(roomPaging)
        testImplementation(roomTesting)
    }
    implementation(Deps.Org.Jetbrains.Kotlinx.kotlinxCoroutineAndroid)

    testImplementation(Deps.Junit.jUnit)
    androidTestImplementation(Deps.AndroidX.Test.extJunit)
    androidTestImplementation(Deps.AndroidX.Test.espressoCore)
}
// Allow references to generated code
kapt {
    correctErrorTypes = true
}
