package com.example.minhaescolhaaleatoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.minhaescolhaaleatoria.ui.theme.MinhaEscolhaAleatoriaTheme
import com.example.minhaescolhaaleatoria.ui.theme.TelaDeNavegacao

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinhaEscolhaAleatoriaTheme {
                TelaDeNavegacao()
            }
        }
    }
}
