package com.example.lesson_01.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Экран профиля (второй экран в навигации).
 * Показывает дополнительную информацию и кнопку «Назад».
 */
@Composable
fun DetailsScreen(
    onNavigateBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Борисова Влада",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "DevOps-инженер",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Опыт работы
        Text(
            text = "Опыт работы:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "3 года 5 месяцев",
            fontSize = 18.sp
        )
        Text(
            text = "Сбербанк • Газпромбанк • ФарПост",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Навыки
        Text(
            text = "Навыки:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Linux, Docker, Kubernetes, CI/CD,",
            fontSize = 18.sp
        )
        Text(
            text = "Ansible, Terraform, Grafana, Jenkins,",
            fontSize = 18.sp
        )
        Text(
            text = "Python, C/C++, Bash, Git, Helm, Vault",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Образование
        Text(
            text = "Образование:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "ДВФУ, Информационная безопасность",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(32.dp))

        // Достижения
        Text(
            text = "Достижения:",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "🏆 Именная стипендия Президента РФ",
            fontSize = 18.sp
        )
        Text(
            text = "🏆 Именная стипендия Газпромбанка",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onNavigateBack,
            modifier = Modifier.height(56.dp)
        ) {
            Text("Назад", fontSize = 18.sp, fontWeight = FontWeight.Medium)
        }
    }
}