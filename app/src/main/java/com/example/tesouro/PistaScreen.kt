package com.example.tesouro

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PistaScreen(navController: NavController, pistaNumber: Int) {
    val pistaText = when (pistaNumber) {
        1 -> "Eu sou pequeno e redondo, uso para jogar e sou chutado. Quem sou eu?"
        2 -> "Tenho asas, mas não sou avião. Pouso nas flores e trago polinização. Quem sou eu?"
        3 -> "Eu moro no céu e brilho à noite. Quem sou eu?"
        else -> ""
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pista $pistaNumber")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = pistaText)
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Button(onClick = { navController.navigate("pista${pistaNumber + 1}") }) {
                Text(text = "Próxima Pista")
            }
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Voltar")
            }
        }
    }
}
