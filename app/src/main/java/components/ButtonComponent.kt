package components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    btnActionText: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth().padding(horizontal = 32.dp),
        onClick = onClick
    ) {
        Text(
            text = btnActionText,
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier.padding(vertical = 12.dp)
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