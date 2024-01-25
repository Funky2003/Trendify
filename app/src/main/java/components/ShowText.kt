package components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ShowText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(color = color),
        textAlign = TextAlign.Start,
    )
}