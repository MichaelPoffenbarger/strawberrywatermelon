package com.example.strawberrrywatermelon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.strawberrrywatermelon.androidlarge1.grandHotel
import com.example.strawberrrywatermelon.androidlarge1.inter
import com.example.strawberrrywatermelon.ui.theme.StrawberrrywatermelonTheme
import com.google.relay.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StrawberrrywatermelonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AndroidLarge1()
                }
            }
        }
    }
}

@Composable
fun AndroidLarge1(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Button1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 22.0.dp,
                    y = 690.0.dp
                )
            )
        )
        TextView1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 114.0.dp,
                    y = 701.0.dp
                )
            )
        )
        BtnLike(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 37.0.dp,
                    y = 623.0.dp
                )
            )
        )
        BtnDislike(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 114.0.dp,
                    y = 623.0.dp
                )
            )
        )
        BtnDownload(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 271.0.dp,
                    y = 623.0.dp
                )
            )
        )
        BtnRefresh(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 192.0.dp,
                    y = 623.0.dp
                )
            )
        )
        Vector(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 50.0.dp,
                    y = 635.0.dp
                )
            )
        )
        Vector1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 205.0.dp,
                    y = 635.0.dp
                )
            )
        )
        Vector2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 127.0.dp,
                    y = 635.0.dp
                )
            )
        )
        Vector3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 284.0.dp,
                    y = 635.0.dp
                )
            )
        )
        TextView2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 37.0.dp,
                    y = 400.0.dp
                )
            )
        )
        InfoText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 50.0.dp,
                    y = 400.0.dp
                )
            )
        )
        ImageWatermelon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 22.0.dp,
                    y = 11.0.dp
                )
            )
        )
        ImageSmoothies(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 22.0.dp,
                    y = 170.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun AndroidLarge1Preview() {
    MaterialTheme {
        RelayContainer {
            com.example.strawberrrywatermelon.androidlarge1.AndroidLarge1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Button1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_button1),
        modifier = modifier.requiredWidth(315.0.dp).requiredHeight(42.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 15.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun TextView1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Click Here Please",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 137,
            green = 2,
            blue = 62
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun BtnLike(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_btn_like),
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun BtnDislike(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_btn_dislike),
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun BtnDownload(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_btn_download),
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun BtnRefresh(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_btn_refresh),
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_vector),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_vector1),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_vector2),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_vector3),
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TextView2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.android_large_1_text_view2),
        modifier = modifier.requiredWidth(284.0.dp).requiredHeight(210.0.dp)
    )
}

@Composable
fun InfoText(modifier: Modifier = Modifier) {
    RelayText(
        content = "This box is used for informational\ntext purposes here I am using \ntext to display in the box that is \nused for displaying text about \nthings what things those are \nnobody knows just yet.",
        fontSize = 24.0.sp,
        fontFamily = grandHotel,
        color = Color(
            alpha = 255,
            red = 137,
            green = 2,
            blue = 62
        ),
        height = 1.3583984375.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(259.0.dp).requiredHeight(172.0.dp)
    )
}

@Composable
fun ImageWatermelon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.android_large_1_image_watermelon),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(315.0.dp).requiredHeight(151.0.dp)
    )
}

@Composable
fun ImageSmoothies(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.android_large_1_image_smoothies),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(315.0.dp).requiredHeight(210.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 217,
            blue = 218
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
