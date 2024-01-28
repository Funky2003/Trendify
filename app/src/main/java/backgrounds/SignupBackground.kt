package backgrounds

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import navigation.Screen

@Composable
fun SignupBackground(
    modifier: Modifier = Modifier
) {
    Surface (
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        color = Color( 0xFF80ED99)
    ){
//        TrendifyCircularBackground(x = 200, y = 870, color = 0xFF57CC99)
        AnimateCircularBackground(Screen.SignUp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupBackgroundPreview() {
    SignupBackground()
}