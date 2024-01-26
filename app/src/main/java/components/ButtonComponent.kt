package components

import android.content.res.Resources
import android.graphics.drawable.ColorDrawable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trendify.R
import com.example.trendify.R.color.trendify_dark

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    btnActionText: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors( containerColor = Color(trendify_dark))
    ) {
        Text(
            text = btnActionText,
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier.padding(vertical = 8.dp)
        )
    }
}

@Composable
fun StatelessButtonComponent() {
    ButtonComponent(
        onClick = {},
        btnActionText = "Login",
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonComponentPreview() {
    StatelessButtonComponent()
}