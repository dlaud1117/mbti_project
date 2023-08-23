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

class MainActivity5 : ComponentActivity() {
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
                        painter = painterResource(id = R.drawable.entp),
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
                    Text(text = "지적 도전을 즐기는 영리하고 호기심이 많은 사색가입니다.\n", fontSize = 20.sp)
                    Text(text = "성격 유형: 변론가\n", fontSize = 24.sp)
                    Text(
                        text = "변론가(ENTP)는 두뇌 회전이 빠르고 대담한 성격으로 현재 상황에 이의를 제기하는 데 거리낌이 없습니다. 변론가는 어떤 의견이나 사람에 반대하는 일을 두려워하지 않으며, 논란이 될 만한 주제에 대해 격렬하게 논쟁하는 일을 즐깁니다.\n" +
                                "\n" +
                                "그렇다고 변론가가 반론을 제기하는 데만 관심이 있거나 악의를 지닌 것은 아닙니다. 사실 변론가는 지식이 풍부하고 호기심이 넘치며 활기찬 유머 감각으로 다른 사람을 즐겁게 할 수 있는 성격입니다. 다만 대부분의 성격과 달리 논쟁에서 즐거움을 찾는 성향이 있을 뿐입니다."
                    )
                }
            }
        }
    }
}
