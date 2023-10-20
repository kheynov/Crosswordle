plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.ksp)
    kotlin("kapt")
    id("kotlinx-serialization")
    alias(libs.plugins.navigationSafeArgs)
    alias(libs.plugins.detekt)
    alias(libs.plugins.firebaseCrashlytics)
    alias(libs.plugins.gms)
}

android {
    namespace = "ru.kheynov.crosswordle"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.kheynov.crosswordle"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugar.jdk.libs)
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material)
    implementation(libs.app.compat)

    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.runtime.compose)
    implementation(libs.lifecycle.extensions)
    implementation(libs.fragment.ktx)

    implementation(libs.dagger)
    kapt(libs.dagger.compiler)

    implementation(libs.serialization.core)
    implementation(libs.serialization.json)

    implementation(libs.retrofit.serializer)
    implementation(libs.retrofit)
    implementation(libs.okhttp)

    implementation(libs.room)
    ksp(libs.room.compiler)
    implementation(libs.room.ktx)

    implementation(libs.coroutines.android)

    implementation(libs.navigation.ui.ktx)
    implementation(libs.navigation.fragment.ktx)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics.ktx)
    implementation(libs.firebase.messaging.ktx)
    implementation(libs.legacy.support.v4)
    implementation(libs.lifecycle.livedata.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}