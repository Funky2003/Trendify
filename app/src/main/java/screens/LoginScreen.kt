package screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import components.ButtonComponent
import components.ShowText
import components.StatefulTextFiledComponent
import components.TrendifyComponent

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Box {
            Column {
                ShowText(modifier,"Welcome to")
                TrendifyComponent()
            }
        }

        Box {
            Column {
                StatefulTextFiledComponent(modifier, "Enter email")
                Spacer(modifier = modifier.padding(vertical = 8.dp))
                StatefulTextFiledComponent(modifier, "Enter password")
            }
        }

        Box {
            Column {
                ButtonComponent(modifier, "Login" ) {}
            }
        }

        Row (
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            ShowText(
                modifier,
                "Terms and conditions apply"
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}