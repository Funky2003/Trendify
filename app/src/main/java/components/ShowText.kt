package components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun ShowText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    weight: FontWeight = FontWeight.Normal,
    size: TextUnit = 12.sp
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(color = color),
        textAlign = TextAlign.Start,
        fontWeight = weight,
        fontSize = size
    )
}