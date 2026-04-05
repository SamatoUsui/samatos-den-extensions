dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "aniyomi-samatoden"

include(":extension")
include(":manga-extension")
include(":keiyoushi-lib")

project(":keiyoushi-lib").projectDir = file("keiyoushi-extensions-lib/library")
