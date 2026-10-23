package com.example.minhaescolhaaleatoria.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.minhaescolhaaleatoria.PrimeiraTela

@Composable
fun TelaDeNavegacao() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "primeira_tela") {
        composable("primeira_tela") {
            PrimeiraTela(onAvancarClick = { navController.navigate("segunda_tela") })
        }
        composable("segunda_tela") {
            SegundaTela(
                onNavigateToTreino = { navController.navigate("terceira_tela") },
                onNavigateToDesafio = { navController.navigate("quarta_tela") }
            )
        }
        composable("terceira_tela") {
            TerceiraTela(
                onNavigateToRefeicao = { navController.navigate("segunda_tela") },
                onNavigateToDesafio = { navController.navigate("quarta_tela") }
            )
        }
        composable("quarta_tela") {
            QuartaTela(
                onNavigateToRefeicao = { navController.navigate("segunda_tela") },
                onNavigateToTreino = { navController.navigate("terceira_tela") }
            )
        }
    }
}
