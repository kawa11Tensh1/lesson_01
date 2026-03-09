package com.example.lesson_01.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lesson_01.R

/**
 * Главный экран приложения.
 */
@Composable
fun HomeScreen(
    onNavigateToDetails: () -> Unit,
    isDarkTheme: Boolean,
    onThemeToggle: (Boolean) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Заголовок с приветствием
        Text(
            text = "Привет, я Влада!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(12.dp))

        // Роль
        Text(
            text = "DevOps-инженер",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Контакты
        Text(
            text = "VK: vk.com/kawa11_tensh1",
            fontSize = 18.sp,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Telegram: @kawa11_tensh1",
            fontSize = 18.sp,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Изображение
        Image(
            painter = painterResource(id = R.drawable.my_photo),
            contentDescription = "Фото Влады",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .border(
                    width = 4.dp,
                    color = MaterialTheme.colorScheme.primary,
                    shape = CircleShape
                )
        )
        Spacer(modifier = Modifier.height(40.dp))

        // Переключатель темы
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Светлая", fontSize = 16.sp, style = MaterialTheme.typography.bodyMedium)
            Switch(
                checked = isDarkTheme,
                onCheckedChange = onThemeToggle
            )
            Text("Тёмная", fontSize = 16.sp, style = MaterialTheme.typography.bodyMedium)
        }
        Spacer(modifier = Modifier.height(40.dp))

        // Кнопка "Подробнее"
        Button(
            onClick = onNavigateToDetails,
            modifier = Modifier.height(56.dp)
        ) {
            Text("Подробнее", fontSize = 18.sp, fontWeight = FontWeight.Medium)
        }
    }
}