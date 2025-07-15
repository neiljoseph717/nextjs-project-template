package com.makecents.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.makecents.app.ui.screens.WelcomeScreen
import com.makecents.app.ui.screens.FeaturesScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            WelcomeScreen(
                onNextClick = {
                    navController.navigate("features")
                }
            )
        }
        composable("features") {
            FeaturesScreen(
                onGetStartedClick = {
                    // Handle get started action
                    // This could navigate to main app or show registration
                }
            )
        }
    }
}
