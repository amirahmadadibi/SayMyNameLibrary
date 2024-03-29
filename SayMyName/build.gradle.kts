plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    id("maven-publish")

}

android {
    namespace = "amirahmadadibi.projects.saymyname"
    compileSdk = 34


//    publishing {
////        singleVariant("release") {
////            withSourcesJar()
////        }
//
//        publications {
//            register<MavenPublication>("release") {
//                groupId = "com.my-company"
//                artifactId = "my-library"
//                version = "1.0"
//
//                afterEvaluate {
//                    from(components["release"])
//                }
//            }
//        }
//
//    }

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 29
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}