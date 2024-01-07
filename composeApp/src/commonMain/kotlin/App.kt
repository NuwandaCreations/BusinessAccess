import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxSize()) {
            Box(
                Modifier.fillMaxWidth().weight(1f).background(Color.Cyan), Alignment.Center
            ) {
                Text("Ejemplo 1")
            }
            VerticalSpacer(10)
            Row(
                Modifier.fillMaxWidth().weight(1f)
            ) {
                Box(Modifier.fillMaxHeight().weight(1f).background(Color.Red), Alignment.Center) {
                    Text("Ejemplo 2")
                }
                HorizontalSpacer(10)
                Box(
                    Modifier.fillMaxHeight().weight(1f).background(Color.Green), Alignment.Center
                ) {
                    Text("Ejemplo 3")
                }
            }
            VerticalSpacer(10)
            Box(
                Modifier.fillMaxWidth().weight(1f).background(Color.Magenta),
                Alignment.BottomCenter
            ) {
                Text("Ejemplo 4")
            }
        }
    }
}

@Composable
fun VerticalSpacer(size: Int) {
    Spacer(Modifier.height(size.dp))
}

@Composable
fun HorizontalSpacer(size: Int) {
    Spacer(Modifier.width(size.dp))
}