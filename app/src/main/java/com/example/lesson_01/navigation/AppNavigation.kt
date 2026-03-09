package com.example.lesson_01.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lesson_01.screens.HomeScreen
import com.example.lesson_01.screens.DetailsScreen

/**
 * Маршруты приложения для навигации между экранами.
 */
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details")
}

/**
 * Главный граф навигации: два экрана — Home и Details.
 * Демонстрирует базовую настройку Jetpack Navigation Compose.
 */
@Composable
fun AppNavigation(
    isDarkTheme: Boolean,
    onThemeToggle: (Boolean) -> Unit
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToDetails = {
                    navController.navigate(Screen.Details.route)
                },
                isDarkTheme = isDarkTheme,
                onThemeToggle = onThemeToggle
            )
        }
        composable(Screen.Details.route) {
            DetailsScreen(
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}