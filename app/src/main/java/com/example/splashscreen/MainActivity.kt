package com.example.splashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashscreen.components.Screen
import com.example.splashscreen.screens.HomeScreen
import com.example.splashscreen.screens.SplashScreen
import com.example.splashscreen.ui.theme.SplashScreenTheme
import kotlinx.coroutines.DelicateCoroutinesApi

class MainActivity : ComponentActivity() {
    @DelicateCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }
}

@DelicateCoroutinesApi
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) { SplashScreen(navController = navController) }
        composable(Screen.HomeScreen.route) { HomeScreen(navController = navController) }
    }
}

