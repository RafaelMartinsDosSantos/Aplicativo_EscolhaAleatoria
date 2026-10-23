package com.example.minhaescolhaaleatoria

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.minhaescolhaaleatoria.ui.theme.corbackground1
import com.example.minhaescolhaaleatoria.ui.theme.corbackground2
import com.example.minhaescolhaaleatoria.ui.theme.interbold
import com.example.minhaescolhaaleatoria.ui.theme.interextrabold
import com.example.minhaescolhaaleatoria.ui.theme.interregular

@Composable
fun PrimeiraTela(onAvancarClick: () -> Unit) {
    val emojistelainicial = listOf("\uD83C\uDF57", "\uD83C\uDFCB\uFE0F", "\uD83D\uDD25")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colorStops = arrayOf(
                        0.0f to corbackground1,
                        0.55f to corbackground2
                    )
                )
            )
            .padding(horizontal = 24.dp, vertical = 32.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .graphicsLayer(rotationZ = -6f)
                        .background(
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

                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = "Sorteia Fit",
                    color = Color(0xFFC6FF3D),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = interbold,
                    letterSpacing = 2.0.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Sem decisão.\nSó resultado.",
                    color = Color.White,
                    fontSize = 36.sp,
                    fontFamily = interextrabold,
                    textAlign = TextAlign.Center,
                    lineHeight = 42.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Deixe a sorte escolher sua refeição, seu treino e seu desafio do dia.",
                    color = Color(0xFF8B93A1),
                    fontSize = 15.sp,
                    fontFamily = interregular,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    emojistelainicial.forEach { emoji ->
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
                                text = emoji,
                                fontSize = 30.sp
                            )
                        }
                    }
                }
            }

            Button(
                onClick = onAvancarClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFC6FF3D),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text(
                    text = "Começar",
                    fontSize = 20.sp,
                    fontFamily = interextrabold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaPreview() {
    PrimeiraTela(onAvancarClick = {})
}
