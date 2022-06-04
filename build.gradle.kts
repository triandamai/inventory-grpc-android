import com.google.protobuf.gradle.*;
buildscript {
	dependencies {
		classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
		classpath("com.google.protobuf:protobuf-gradle-plugin:0.8.18")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

plugins{
	id("com.android.application") version "7.2.1" apply false
	kotlin("jvm") version "1.5.31"
	id("com.google.protobuf") version "0.8.13" apply false
	id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
}


allprojects{
	repositories{
		mavenLocal()
		mavenCentral()
		google()
	}
}