package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import screens.LoginScreen
import screens.SignupScreen

@Composable
fun LoginSignupScreen() {
    var currentScreen by remember { mutableStateOf(Screen.LogIn) }
     when (currentScreen){
        Screen.LogIn -> LoginScreen (
            onNavigateToSignup = { currentScreen = Screen.SignUp }
        )
        Screen.SignUp -> SignupScreen (
            onNavigateToLogin = { currentScreen = Screen.LogIn }
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginSignupScreenPreview() {
    LoginSignupScreen()
}

//<-----ENUM class to represent the login and signup screens------
enum class Screen{
    SignUp,
    LogIn
}