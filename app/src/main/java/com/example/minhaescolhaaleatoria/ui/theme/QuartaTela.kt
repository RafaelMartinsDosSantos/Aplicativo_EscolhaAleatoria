package com.example.minhaescolhaaleatoria.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuartaTela(
    onNavigateToRefeicao: () -> Unit = {},
    onNavigateToTreino: () -> Unit = {}
) {
    var itemSorteado by remember { mutableStateOf<String?>(null) }

    val telaemojis = listOf(
        "🧘 Prancha",
        "💪 30",
        "🦵 20",
        "🔥 10",
        "🏃 100"
    )
    val telaemojis2 = listOf("🤸 Escalador")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF0F1115))
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 12.dp)
            ) {

                Text(
                    text = "DESAFIO DO DIA",
                    color = Color(0xFFC6FF3D),
                    fontSize = 13.sp,
                    fontFamily = interbold,
                    letterSpacing = 2.0.sp
                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Topa um desafio rápido?",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontFamily = interextrabold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Um mini exercício surpresa, em qualquer lugar.",
                    color = Color(0xFF8B93A1),
                    fontSize = 14.sp,
                    fontFamily = interregular
                )

                Spacer(modifier = Modifier.height(16.dp))


                val (emojiCentral, tituloResultado, subtextoResultado) = when (itemSorteado) {
                    "🧘 Prancha" -> Triple("🧘", "Prancha", "Segure 1 minuto sem pausar")
                    "💪 30" -> Triple("💪", "30 Flexões", "30 repetições diretas")
                    "🦵 20" -> Triple("🦵", "20 Agachamentos", "20 repetições profundas")
                    "🔥 10" -> Triple("🔥", "10 Burpees", "10 saltos explosivos")
                    "🏃 100" -> Triple("🏃", "100 Polichinelos", "100 saltos rápidos")
                    "🤸 Escalador" -> Triple("🤸", "Escalador", "45 segundos sem parar")
                    else -> Triple("🎲", "Sorteia Fit", "Toque em girar para sortear")
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(280.dp)
                        .background(
                            shape = RoundedCornerShape(24.dp),
                            brush = Brush.radialGradient(
                                colorStops = arrayOf(
                                    0.3f to corbackgroundtela22.copy(alpha = 0.6f),
                                    1.5f to corbackgroundtela21
                                )
                            )
                        )
                        .padding(16.dp)
                ) {


                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = emojiCentral,
                            fontSize = 80.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = tituloResultado,
                            color = Color.White,
                            fontSize = 22.sp,
                            fontFamily = interextrabold
                        )

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = subtextoResultado,
                            color = Color(0xFF8B93A1),
                            fontSize = 13.sp,
                            fontFamily = interregular
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    telaemojis.forEach { item ->
                        val isSelected = (item == itemSorteado)
                        val bgColor = if (isSelected) Color(0xFFC6FF3D) else Color(0xFF232731)
                        val textColor = if (isSelected) Color.Black else Color(0xFF8B93A1)

                        Box(
                            modifier = Modifier
                                .background(bgColor, shape = RoundedCornerShape(20.dp))
                                .clickable { itemSorteado = item }
                                .padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = item,
                                color = textColor,
                                fontSize = 12.sp,
                                fontFamily = interbold
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    telaemojis2.forEach { item ->
                        val isSelected = (item == itemSorteado)
                        val bgColor = if (isSelected) Color(0xFFC6FF3D) else Color(0xFF232731)
                        val textColor = if (isSelected) Color.Black else Color(0xFF8B93A1)

                        Box(
                            modifier = Modifier
                                .background(bgColor, shape = RoundedCornerShape(20.dp))
                                .clickable { itemSorteado = item }
                                .padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = item,
                                color = textColor,
                                fontSize = 12.sp,
                                fontFamily = interbold
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))


                Button(
                    onClick = {
                        val todasAsOpcoes = telaemojis + telaemojis2
                        itemSorteado = todasAsOpcoes.random()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFC6FF3D),
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(54.dp)
                ) {
                    Text(
                        text = "Girar desafio",
                        fontSize = 18.sp,
                        fontFamily = interextrabold
                    )
                }
            }


            BottomNavBar(
                selectedTab = 2,
                onTabSelected = { tab ->
                    when (tab) {
                        0 -> onNavigateToRefeicao()
                        1 -> onNavigateToTreino()
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuartaTelaPreview() {
    QuartaTela()
}
