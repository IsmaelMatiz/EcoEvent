plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.training.retojhonf"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.training.retojhonf"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    //Authentication dependencies
    //implementation("com.google.android.gms:play-services-auth:19.2.0")
    //implementation("com.facebook.android:facebook-android-sdk:5,6)")
    //implementation("com.apple.android:sign-in:1.0.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}