object Versions{
    const val androidCompileSdk = 29
    const val androidMinSdk = 24
    const val androidTargetSdk = 29

    const val appCompat = "1.1.0"
    const val core = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val design = "29.0.0"
    const val recylerView = "29.0.0"
    const val dagger = "2.25.4"

    const val jUnit = "4.12"
    const val runner = "1.2.0"
    const val espresso = "3.2.0"
    const val mockito = "3.0.0"
    const val junitExt = "1.1.1"

}

object AppDependencies{
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val design = "com.android.support:design:${Versions.design}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.recylerView}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object TestDependencies{
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espressoCore= "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}:"
    const val rule = "androidx.test:rules:${Versions.runner}"
    const val truth = "androidx.test.ext:truth:${Versions.runner}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
}