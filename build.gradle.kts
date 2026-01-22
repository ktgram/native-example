import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.ksp)
}

group = "com.example.blank"
version = "0.0.1"

kotlin {
    linuxX64 { binaries.executable() }
    mingwX64 { binaries.executable() }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.tg.bot)
        }
    }
}

repositories {
    mavenCentral()
}

kotlin.targets.withType<KotlinNativeTarget> {
    binaries.all {
        freeCompilerArgs += "-Xdisable-phases=EscapeAnalysis"
    }
}
