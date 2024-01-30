package components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextButtonComponent(
    modifier: Modifier = Modifier,
    actionText: String,
    onClick: () -> Unit,
    animate: () -> Unit
) {
    Box {
        TextButton(
            modifier = modifier,
            onClick = {
                onClick()
                animate()
            }
        ) {
            Text(
                text = actionText,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color.Black
                )
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextButtonComponentPreview() {
    Column {
        TextButtonComponent(actionText = "forgot password", onClick = {}, animate = {})
//        TextButtonComponent(actionText = "or signup") {}
    }
}