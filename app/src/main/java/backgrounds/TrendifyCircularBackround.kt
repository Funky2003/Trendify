package backgrounds

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TrendifyCircularBackground(
    x: Int,
    y: Int,
    color: Long
) {
    Canvas(
        modifier = Modifier.fillMaxSize(),
        onDraw = {
             drawCircle(
                 Color(color),
                 radius = 350.dp.toPx(),
                 Offset(x.dp.toPx(), y.dp.toPx())
             )
        },
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TrendidyCircularBackgroundPreview() {
    TrendifyCircularBackground(200, 280, 0xFF57CC99)
}