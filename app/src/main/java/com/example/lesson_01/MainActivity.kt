package com.example.lesson_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.lesson_01.navigation.AppNavigation

/**
 * Главная Activity приложения.
 * Управляет глобальной темой (сиренево-розовая светлая/тёмная).
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkTheme = rememberSaveable { mutableStateOf(false) }
            val colorScheme = if (isDarkTheme.value) DarkLilacScheme else LightLilacScheme

            MaterialTheme(colorScheme = colorScheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(
                        isDarkTheme = isDarkTheme.value,
                        onThemeToggle = { isDarkTheme.value = it }
                    )
                }
            }
        }
    }
}

// Сиренево-розовая светлая тема
private val LightLilacScheme = lightColorScheme(
    primary = Color(0xFFBA68C8),
    secondary = Color(0xFFEF5350),
    background = Color(0xFFFCE4EC),
    surface = Color.White,
    onPrimary = Color.White,
    onBackground = Color(0xFF4A148C)
)

// Сиренево-розовая тёмная тема
private val DarkLilacScheme = darkColorScheme(
    primary = Color(0xFFCE93D8),
    secondary = Color(0xFFEF5350),
    background = Color(0xFF2D1B2E),
    surface = Color(0xFF3E1B3F),
    onPrimary = Color(0xFF2D1B2E),
    onBackground = Color(0xFFFCE4EC)
)