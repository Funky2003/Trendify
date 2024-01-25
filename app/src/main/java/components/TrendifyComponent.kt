package components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TrendifyComponent(
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Text(
            text = "Trendify!",
            style = MaterialTheme.typography.displayLarge,
            color = Color(0xFF22577A)
        )
        ShowText(modifier, "Explore the latest stocks & track it", color = Color.Black)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TrendifyComponentPreview() {
    TrendifyComponent()
}