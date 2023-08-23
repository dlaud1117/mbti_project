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

class MainActivity8 : ComponentActivity() {
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
                        painter = painterResource(id = R.drawable.enfj),
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
                    Text(text = "청중을 사로잡고 의욕을 불어넣는 카리스마 넘치는 지도자입니다.\n", fontSize = 20.sp)
                    Text(text = "성격 유형: 선도자\n", fontSize = 24.sp)
                    Text(text = "선도자(ENFJ)는 삶에서 위대한 사명을 위해 힘써야 한다는 느낌을 받곤 합니다. 사려 깊고 이상주의적 성향을 지닌 선도자는 다른 사람과 주변 세상에 긍정적인 영향력을 발휘하기 위해 최선을 다하며, 어려운 상황에서도 올바른 일을 할 기회를 마다하지 않습니다.")
                }
            }
        }
    }
}
