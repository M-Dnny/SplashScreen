package com.example.splashscreen.components

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash")
    object HomeScreen : Screen("home")
}