plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "eu.kanade.tachiyomi.animeextension.es.samatoden"
    compileSdk = 34

    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.animeextension.es.samatoden"
        minSdk = 21
        targetSdk = 34
        versionCode = 2
        versionName = "14.2"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    packaging {
        resources {
            excludes += "kotlin-tooling-metadata.json"
        }
    }
}

dependencies {
    compileOnly("com.github.aniyomiorg:extensions-lib:14")
    compileOnly("com.squareup.okhttp3:okhttp:5.1.0")
}
