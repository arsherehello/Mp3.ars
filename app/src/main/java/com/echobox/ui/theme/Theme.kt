package com.echobox.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val EchoBackground = Color(0xFF0F1115)
val EchoSurface = Color(0xFF181B22)
val EchoSurfaceHigh = Color(0xFF222630)
val EchoPrimary = Color(0xFF9D86FF)
val EchoOnPrimary = Color(0xFF1B0F4D)
val EchoSecondary = Color(0xFF4FD8C4)
val EchoText = Color(0xFFE6E8EE)
val EchoTextMuted = Color(0xFF9AA0AE)

private val EchoDarkColors = darkColorScheme(
    primary = EchoPrimary,
    onPrimary = EchoOnPrimary,
    primaryContainer = EchoSurfaceHigh,
    onPrimaryContainer = EchoText,
    secondary = EchoSecondary,
    background = EchoBackground,
    onBackground = EchoText,
    surface = EchoSurface,
    onSurface = EchoText,
    surfaceVariant = EchoSurfaceHigh,
    onSurfaceVariant = EchoTextMuted,
)

// EchoBox is dark-only by design.
@Composable
fun EchoBoxTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = EchoDarkColors,
        content = content,
    )
}
