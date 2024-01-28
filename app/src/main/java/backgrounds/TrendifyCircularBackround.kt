package backgrounds

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Down
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Up
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.togetherWith
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
    screen: Screen
) {
    AnimatedContent(
        targetState = screen,
        label = "",
        transitionSpec = {
            slideIntoContainer(
                animationSpec = tween(3000, easing = EaseIn),
                towards = Up
            ).togetherWith(
                slideOutOfContainer(
                    animationSpec = tween(3000, easing = EaseOut),
                    towards = Down
                )
            )

        }
    ) {
        
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TrendidyCircularBackgroundPreview() {
    TrendifyCircularBackground(200, 280, 0xFF57CC99)
}