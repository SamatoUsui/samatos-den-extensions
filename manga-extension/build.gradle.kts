plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.es.samatoden"
    compileSdk = 34

    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.extension.es.samatoden"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.4.1"
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
    compileOnly(project(":keiyoushi-lib"))
    compileOnly("com.squareup.okhttp3:okhttp:5.1.0")
}
