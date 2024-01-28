package backgrounds

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import navigation.Screen

@Composable
fun TrendifyCircularBackground(
    x: Int,
    y: Int,
    color: Long,
    dampingRatio: Float = Spring.DampingRatioMediumBouncy,
    stiffness: Float = Spring.StiffnessLow
    ) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = dampingRatio,
                    stiffness = stiffness
                )
            ),
        onDraw = {
             drawCircle(
                 Color(color),
                 radius = 400.dp.toPx(),
                 Offset(x.dp.toPx(), y.dp.toPx())
             )
        },
    )
}

@Composable
fun AnimateCircularBackground(
    selectedScreen: Screen
) {
    AnimatedContent(
        targetState = selectedScreen,
        label = "",
        ) {
        targetState -> when(targetState){
            Screen.LogIn -> TrendifyCircularBackground(
                200, 280, 0xFF57CC99
            )
            Screen.SignUp -> TrendifyCircularBackground(
                200, 870, color = 0xFF57CC99
            )
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TrendidyCircularBackgroundPreview() {
    TrendifyCircularBackground(200, 280, 0xFF57CC99)
}