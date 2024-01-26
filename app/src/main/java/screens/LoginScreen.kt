package screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.ButtonComponent
import backgrounds.LoginBackground
import components.ShowText
import components.StatefulTextFiledComponent
import components.TextButtonComponent
import components.TrendifyComponent

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onNavigateToSignup: () -> Unit
) {
    LoginBackground()
    Column(
        modifier = modifier
            .fillMaxHeight()
            .verticalScroll(state = ScrollState(0))
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {

        //<----The welcome composable implementation----
        Box {
            Column {
                ShowText(modifier,"Welcome to", Color.Black, FontWeight(600), 18.sp)
                TrendifyComponent()
            }
        }

        //<----Email and password textField composable implementation----
        Box {
            Column {
                StatefulTextFiledComponent(modifier, "Enter email", KeyboardType.Email)
                Spacer(modifier = modifier.padding(vertical = 8.dp))
                StatefulTextFiledComponent(modifier, "Enter password", KeyboardType.Password)
            }
        }


        //<----Forgot password, login button and signup text button composable implementation----
        Box {
            Column (
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TextButtonComponent(actionText = "Forgot password") {}
                ButtonComponent(modifier, "Log In") {}
                TextButtonComponent(actionText = "or signup", onClick = onNavigateToSignup)
            }
        }

        //<----Terms and condition composable implementation----
        Row (
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            ShowText( modifier, "Terms & conditions apply", Color(0xFF22577A))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(onNavigateToSignup = {})
}