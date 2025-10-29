package ru.ximelay.composeapp.ui.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.ximelay.composeapp.ui.theme.ComposeAppTheme

@Composable
fun AuthScreen(
    modifier: Modifier = Modifier,
    onNavigateToLogin : () -> Unit,
    onNavigateToSignUp : () -> Unit,
    onNavigateToPreview : () -> Unit,
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 28.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Button(onClick = onNavigateToLogin) {
                Text("LogIn")
            }

            Button(onClick = onNavigateToSignUp) {
                Text("SignUp")
            }

            OutlinedButton(onClick = onNavigateToPreview) {
                Text("Preview")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonsAuth() {
    ComposeAppTheme {
        AuthScreen(
            onNavigateToLogin = {},
            onNavigateToSignUp = {},
            onNavigateToPreview = {},
        )
    }
}