package com.example.minhaescolhaaleatoria.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavBar(
    selectedTab: Int, // 0 = Refeição, 1 = Treino, 2 = Desafio
    onTabSelected: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF14161B))
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val items = listOf(
            Triple(0, "🍽️", "Refeição"),
            Triple(1, "🏋️", "Treino"),
            Triple(2, "🔥", "Desafio")
        )

        items.forEach { (index, emoji, label) ->
            val isSelected = index == selectedTab
            val color = if (isSelected) Color(0xFFC6FF3D) else Color(0xFF8B93A1)

            Column(
                modifier = Modifier
                    .clickable { onTabSelected(index) }
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = emoji, fontSize = 18.sp)
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = label,
                    color = color,
                    fontSize = 11.sp,
                    fontFamily = if (isSelected) interbold else interregular
                )
            }
        }
    }
}
