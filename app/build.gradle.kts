plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.chingkhei.fresh"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.chingkhei.fresh"
        minSdk = 26  // Lowered to 26 for adaptive icons
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)  // Ensure no duplicate androidx libraries
    implementation(libs.material)   // Remove duplicate material library definition
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("com.jjoe64:graphview:4.2.2")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
