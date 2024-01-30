package backgrounds

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Down
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Up
import androidx.compose.animation.core.Ease
import androidx.compose.animation.core.tween
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import navigation.LoginSignupScreen


@Composable
fun CircleCanvas(
    y: Int
) {

    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        drawCircle(
            color = Color(0xFF57CC99),
            radius = 400.dp.toPx(),
            center = Offset(200.dp.toPx(), y.dp.toPx())
        )
    }
}

@Composable
fun AnimateTheCircle(
    isAnimate: MutableState<Boolean> = remember { mutableStateOf(true) }
) {
    AnimatedContent(
        targetState = isAnimate.value,
        label = "",
        contentAlignment = Alignment.Center,
        transitionSpec = {
            slideIntoContainer(
                towards = Up,
                tween(1000, easing = Ease)
            ).togetherWith(
                slideOutOfContainer(
                    towards = Down,
                    tween(1000, easing = Ease)
                )
            )
        }
    ) {
        targetState -> if (targetState){
            CircleCanvas(250)
        } else{
            CircleCanvas(870)
        }
    }
    LoginSignupScreen( animateScreen = { isAnimate.value = !isAnimate.value })
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CircleCanvasPreview() {
        AnimateTheCircle()
}