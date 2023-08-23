package com.example.mbtiproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbtiproject.ui.theme.MbtiProjectTheme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiProjectTheme {
                val context = LocalContext.current
                val cyanAndYellow = listOf(Color.Cyan, Color.Yellow)
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.linearGradient(
                                colors = cyanAndYellow,
                                start = Offset.Zero,
                                end = Offset.Infinite
                            ), shape = RectangleShape,
                            alpha = 0.3f
                        )
                ) {
                    var imageSize by remember { mutableStateOf(150.dp) }
                    val imageModifier = Modifier
                        .size(imageSize)
                        .clip(CircleShape)
                        .border(BorderStroke(1.dp, Color.Black))
                        .background(Color.Yellow)
                        .align(alignment = Alignment.BottomCenter)
                        .clickable {
                            imageSize =
                                if (imageSize == 150.dp) 500.dp else 150.dp // 이미지 클릭 시 크기 토글
                        }

                    Image(
                        painter = painterResource(id = R.drawable.entj),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = imageModifier


                    )

                    Button(
                        onClick = {
                            val intent = Intent(context, MainActivity::class.java)
                            context.startActivity(intent)
                        },
                        modifier = Modifier.align(Alignment.BottomEnd),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                    ) {
                        Text(text = "뒤로가기")
                    }
                }
                Column {
                    Text(
                        text = "항상 문제 해결 방법을 찾아내는 성격으로, 대담하고 상상력이 풍부하며 의지가 강력한 지도자입니다.\n",
                        fontSize = 20.sp
                    )
                    Text(text = "성격 유형: 통솔자\n", fontSize = 24.sp)
                    Text(text = "통솔자(ENTJ)는 타고난 지도자라고 할 수 있습니다. 이들은 카리스마와 자신감을 지니고 있으며 자신의 권한을 이용해 사람들이 공통된 목표를 위해 함께 노력하도록 이끕니다. 또한 이들은 냉철한 이성을 지닌 것으로 유명하며, 자신이 원하는 것을 성취하기 위해 열정과 결단력과 날카로운 지적 능력을 활용합니다. 이들은 전체 인구의 3%에 불과하지만 다른 많은 성격을 압도하는 존재감을 뽐내며, 많은 비즈니스와 단체를 이끄는 역할을 할 때가 많습니다.")
                }
            }
        }
    }
}

