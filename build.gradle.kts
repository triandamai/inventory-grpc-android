
plugins{
	id("com.google.protobuf") version "0.8.13" apply false
	id("com.android.application") version "7.3.1" apply false
	id("com.android.library") version "7.3.1" apply false
	id("com.google.dagger.hilt.android") version "2.44" apply false
	id("io.gitlab.arturbosch.detekt") version "1.22.0" apply false
	kotlin("android") version "1.6.10" apply false
}
extensions.findByName("buildScan")?.withGroovyBuilder {
	setProperty("termsOfServiceUrl", "https://gradle.com/terms-of-service")
	setProperty("termsOfServiceAgree", "yes")
}
tasks.create<Delete>("cleanRp"){
	delete(
		rootProject.buildDir
	)
}