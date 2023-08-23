package com.example.mbtiproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mbtiproject.ui.theme.MbtiProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val cyanAndBlue = listOf(Color.Cyan, Color.Blue)
                    Column(
                        Modifier.background(
                            brush = Brush.linearGradient(
                                colors = cyanAndBlue,
                                start = Offset.Zero,
                                end = Offset.Infinite
                            ), shape = RectangleShape, alpha = 0.3f
                        ), horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(440.dp))
                        Row1()
                        Spacer(modifier = Modifier.height(10.dp))
                        Row2()
                        Spacer(modifier = Modifier.height(10.dp))
                        Row3()
                        Spacer(modifier = Modifier.height(10.dp))
                        Row4()
                    }



                    Box(modifier = Modifier.fillMaxSize()) {

                        Text(
                            text = "MBTI 유형",
                            fontSize = 66.sp,
                            modifier = Modifier.align(Alignment.TopCenter)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Row1() {
    val context = LocalContext.current
    Row {
        Button(
            onClick = {
                val intent = Intent(context, MainActivity2::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "INTJ")
        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity3::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "INTP")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity4::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ENTJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity5::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ENTP")
        }
    }
}

@Composable
fun Row2() {
    val context = LocalContext.current
    Row {
        Button(
            onClick = {
                val intent = Intent(context, MainActivity6::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "INFJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity7::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "INFP")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity8::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ENFJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity9::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ENFP")
        }

    }

}

@Composable
fun Row3() {
    val context = LocalContext.current
    Row {
        Button(
            onClick = {
                val intent = Intent(context, MainActivity10::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ISTJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity11::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "ISFJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity12::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ESTJ")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity13::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ESFJ")
        }

    }
}

@Composable
fun Row4() {
    val context = LocalContext.current
    Row {
        Button(
            onClick = {
                val intent = Intent(context, MainActivity14::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ISTP")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity15::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ISFP")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity16::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ESTP")

        }
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, MainActivity17::class.java)
                context.startActivity(intent)
            }, modifier = Modifier
                .width(90.dp)
                .height(90.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text(text = "ESFP")
        }
    }
}
