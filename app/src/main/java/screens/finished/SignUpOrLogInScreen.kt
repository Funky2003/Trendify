package screens.finished

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import backgrounds.AnimateTheCircle

@Composable
fun SignupOrLoginScreen() {
    Surface( color = Color(0xFF80ED99))
    {
        AnimateTheCircle()
    }
}

@Preview
@Composable
fun SignupOrLoginScreenPreview() {
    SignupOrLoginScreen()
}