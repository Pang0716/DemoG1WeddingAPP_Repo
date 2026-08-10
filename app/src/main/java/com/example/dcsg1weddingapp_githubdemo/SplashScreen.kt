package com.example.dcsg1weddingapp_githubdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dcsg1weddingapp_githubdemo.ui.theme.SplashBackground
import com.example.dcsg1weddingapp_githubdemo.ui.theme.SplashGold
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(1800)
        onTimeout()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SplashBackground),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // TODO: replace with your rings+heart icon (Image composable)
        Text(
            text = "Twogether",
            fontFamily = FontFamily.Serif,
            fontSize = 34.sp,
            color = SplashGold
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Plan • Connect • Celebrate",
            fontSize = 13.sp,
            color = SplashGold
        )
    }
}