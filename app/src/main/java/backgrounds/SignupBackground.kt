package backgrounds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
        Column (
            modifier,
            verticalArrangement = Arrangement.Bottom
        ){
            Box (
                modifier = modifier
                    .background(color = Color(0xFF57CC99), shape = RoundedCornerShape(topEndPercent = 15, topStartPercent = 15))
                    .height(300.dp)
                    .fillMaxWidth(),
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupBackgroundPreview() {
    SignupBackground()
}