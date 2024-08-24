package com.practice.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.practice.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame(){
        val treasuresFound by remember { mutableStateOf(0)}
        // val: 참조 자체가 변경되지 않음을 의미
        // 한 번 참조한 mutableStateOf 객체를 다른 객체로 변경할 수 없음
        // mutableStateOf: 상태 값을 포함하고 있으며, 그 상태 값이 변경될 때 Compose가 UI를 다시 그리도록 트리거
        val direction = remember { mutableStateOf("North") }
        val stormOrTreasure = remember { mutableStateOf("") }
        
        Column {
            Text(text = "Treasures Found: ${treasuresFound}")
            Text(text = "Current Direction: ${direction.value}")
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
//                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a Treasure"
                } else {
                    stormOrTreasure.value = "Storm Ahead"
                }
            }) {
                Text(text = "Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
//                    treasuresFound.value += 2
                    stormOrTreasure.value = "Found a Treasure"
                } else {
                    stormOrTreasure.value = "Storm Ahead"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
//                    treasuresFound.value += 3
                    stormOrTreasure.value = "Found a Treasure"
                } else {
                    stormOrTreasure.value = "Storm Ahead"
                }
            }) {
                Text(text = "Sail South")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
//                    treasuresFound.value += 4
                    stormOrTreasure.value = "Found a Treasure"
                } else {
                    stormOrTreasure.value = "Storm Ahead"
                }
            }) {
                Text(text = "Sail North")
            }

            Text(text = "Storm or Treasure: ${stormOrTreasure.value}")
        }
    }
}
