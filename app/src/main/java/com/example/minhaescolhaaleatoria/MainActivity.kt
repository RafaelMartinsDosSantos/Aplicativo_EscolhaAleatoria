package com.example.minhaescolhaaleatoria

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.minhaescolhaaleatoria.ui.theme.MinhaEscolhaAleatoriaTheme
import com.example.minhaescolhaaleatoria.ui.theme.corbackground1
import com.example.minhaescolhaaleatoria.ui.theme.corbackground2
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.minhaescolhaaleatoria.ui.theme.interbold
import com.example.minhaescolhaaleatoria.ui.theme.interextrabold
import com.example.minhaescolhaaleatoria.ui.theme.interregular


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinhaEscolhaAleatoriaTheme {
                }
            }
        }
    }

@Composable
fun Greeting() {
    val emojistelainicial = listOf("\uD83C\uDF57", "\uD83C\uDFCB\uFE0F", "\uD83D\uDD25")
    Box(
        modifier = Modifier.fillMaxSize().background(
            brush = Brush.verticalGradient(
                colorStops = arrayOf(
                    0.0f to corbackground1,
                    0.55f to corbackground2
                )
            )
        )
    )

    Box(
        modifier = Modifier.offset(
            x = 130.dp, y = 50.dp).size(
                130.dp
            ).graphicsLayer(
                rotationZ = -6f
            ).background(
                color = Color(0xFFC6FF3D),
                shape = RoundedCornerShape(30.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "\uD83C\uDFB2",
            fontSize = 55.sp
        )
    }

    Column(
        modifier = Modifier.offset(
            x = 150.dp, y = 200.dp
        ).size(
        130.dp
        )
    ) {
        Text(
            text = "Sorteia Fit",
            color = Color(0xFFC6FF3D),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = interbold,
            letterSpacing = 2.0.sp
        )
    }

    Column(
        modifier = Modifier.offset(
            x = 80.dp, y = 220.dp
        )
    ) {
        Text(
            text = "Sem decisão.\n" +
                    "Só resultado.",
            color = Color.White,
            fontSize = 38.sp,
            fontFamily = interextrabold
        )
    }
    
    Column(
        modifier = Modifier.offset(
        x = 48.dp, y = 320.dp
        )
    ) {
        Text(
            text = "Deixe a sorte escolher sua refeição, seu treino e\n" +
                    "                        seu desafio do dia.",
            color = Color(0xFF8B93A1),
            fontFamily = interregular
        )
    }

    Row(modifier = Modifier.offset(
        x = 70.dp, y = 380.dp
    ),
        horizontalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        emojistelainicial.forEach { emojistelainicial ->
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(
                        color = Color(0xFF1A1D24),
                        shape = RoundedCornerShape(20.dp)

                    ),
                contentAlignment = Alignment.Center

            ) {
                Text(
                    text = emojistelainicial,
                    fontSize = 30.sp
                )
            }
        }
    }

}

@Preview
@Composable
fun GreetingPreview() {
Greeting()
}