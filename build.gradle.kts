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
        val commonMain by getting {
            dependencies {
                implementation(libs.tg.bot)
            }
        }
        val linuxX64Main by getting
        val mingwX64Main by getting
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    add("kspCommonMainMetadata", libs.tg.ksp)
    add("kspLinuxX64", libs.tg.ksp)
}

kotlin.targets.withType<KotlinNativeTarget> {
    binaries.all {
        freeCompilerArgs += "-Xdisable-phases=EscapeAnalysis"
    }
}
