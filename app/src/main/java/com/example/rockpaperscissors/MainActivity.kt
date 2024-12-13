package com.example.rockpaperscissors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rockpaperscissors.ui.theme.RockPaperScissorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RockPaperScissorsApp()
                }
            }
        }
    }
}

@Composable
fun RockPaperScissorsApp() {
    val options = listOf("Rock", "Paper", "Scissors")
    var userChoice by remember { mutableStateOf<String?>(null) }
    var gameChoice by remember { mutableStateOf<String?>(null) }
    var result by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Rock, Paper, Scissors", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Choose your move:")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            options.forEach { option ->
                Button(onClick = {
                    userChoice = option
                    gameChoice = options.random()
                    result = getResult(userChoice!!, gameChoice!!)
                }) {
                    Text(text = option)
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        if (userChoice != null && gameChoice != null && result != null) {
            Text(text = "You chose: $userChoice")
            Text(text = "Game chose: $gameChoice")
            Text(text = "Result: $result", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

fun getResult(userChoice: String, gameChoice: String): String {
    return if (userChoice == gameChoice) {
        "It's a Tie!"
    } else if (
        (userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) {
        "You Win!"
    } else {
        "You Lose!"
    }
}


@Preview(showBackground = true)
@Composable
fun RockPaperScissorsPreview() {
    RockPaperScissorsTheme {
        RockPaperScissorsApp()
    }
}