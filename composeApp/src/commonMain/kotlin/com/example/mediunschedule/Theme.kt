package com.example.mediunschedule

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val PrimaryBlue = Color(0xFF4894FE)
private val SecondaryBlue = Color(0xFF63B4FF)
private val OutlineGray = Color(0xFF8696BB)
private val BackgroundWhite = Color(0xFFFFFFFF)
private val TextOnBackground = Color(0xFF0D1B34)

private val LightColors: ColorScheme = lightColorScheme(
    primary = PrimaryBlue,
    onPrimary = Color.White,
    secondary = SecondaryBlue,
    onSecondary = Color.White,
    background = BackgroundWhite,
    onBackground = TextOnBackground,
    surface = BackgroundWhite,
    onSurface = TextOnBackground,
    outline = OutlineGray
)

@Composable
fun MediunScheduleTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        content = content
    )
}


