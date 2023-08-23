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

class MainActivity15 : ComponentActivity() {
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
                        painter = painterResource(id = R.drawable.isfp),
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
                    Text(text = "항상 새로운 경험을 추구하는 유연하고 매력 넘치는 예술가입니다.\n", fontSize = 20.sp)
                    Text(text = "성격 유형: 모험가\n", fontSize = 24.sp)
                    Text(
                        text = "모험가(ISFP)는 진정한 의미의 예술가라고 할 수 있습니다. 하지만 모험가라고 반드시 예술 업계에만 종사하는 것은 아닙니다. 이들에게는 삶 자체가 자신을 표현하기 위한 캔버스이기 때문입니다. 이들은 입는 옷부터 여가 시간을 보내는 방식까지 다양한 측면에서 자신의 독특한 개성을 생생히 드러냅니다.\n" +
                                "\n" +
                                "모든 모험가는 각자 독특한 성격을 지니고 있습니다. 이들은 호기심이 많고 새로운 것을 추구하는 성격으로 다양한 분야에 관심과 열정을 보일 때가 많습니다. 모험가는 탐험가적 성향과 일상 생활에서 즐거움을 찾을 수 있는 능력을 지니고 있는 매우 흥미로운 성격이라고 할 수 있습니다. 그러나 보통 자신의 놀라운 개성에 자만하는 대신 자신이 하고 싶은 일을 할 뿐이라고 겸손하게 생각하곤 합니다."
                    )
                }
            }
        }
    }
}
