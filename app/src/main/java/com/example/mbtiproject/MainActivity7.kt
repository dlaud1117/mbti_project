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

class MainActivity7 : ComponentActivity() {
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
                        painter = painterResource(id = R.drawable.infp),
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
                    Text(text = "항상 선을 행할 준비가 되어 있는 부드럽고 친절한 이타주의자입니다.\n", fontSize = 20.sp)
                    Text(text = "성격 유형: 중재자\n", fontSize = 24.sp)
                    Text(
                        text = "중재자(INFP)는 언뜻 보기에 조용하고 자신을 내세우지 않는 것처럼 보이지만, 사실은 에너지와 열정이 넘치는 마음을 지닌 성격입니다. 이들은 창의적이고 상상력이 뛰어나며 몽상을 즐기는 성격으로, 머릿속에서 수많은 이야기를 만들어 내곤 합니다. 또한 음악과 예술과 자연에 대한 감수성이 뛰어나며 다른 사람의 감정을 빠르게 알아차리곤 합니다.\n" +
                                "\n" +
                                "중재자는 이상주의적이고 공감 능력이 높으며, 깊고 의미 있는 관계를 원하고 다른 사람을 도와야 한다는 사명감을 느끼곤 합니다. 그러나 전체 인구에서 큰 비중을 차지하지 않는 성격이기 때문에 외로움을 느끼거나 존재감을 드러내지 못하는 때가 있으며, 자신의 독특한 강점을 인정하지 않는 세상에서 방황하는 느낌을 받을 수도 있습니다."
                    )
                }
            }
        }
    }
}
