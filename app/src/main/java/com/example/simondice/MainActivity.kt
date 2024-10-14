package com.example.simondice

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simondice.ui.theme.SimonDiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimonDiceTheme {
                SimonGameScreen()
                }
        }
    }
}


@Composable
fun SimonGameScreen() {
    var sequenceUser by remember { mutableStateOf(mutableListOf<SimonColor>()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Botones()
    }
}

@Composable
fun BotonVerde(/*onColorClick: (SimonColor) -> Unit*/){
    Button(onClick = { /*onColorClick(SimonColor.Yellow)*/ },
        modifier = Modifier
            .padding(16.dp)
            .width(125.dp)
            .height(125.dp)

        ,shape = CutCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Green)) {

    }
}

@Composable
fun BotonRojo(/*onColorClick: (SimonColor) -> Unit*/){
    Button(onClick = { /*onColorClick(SimonColor.Yellow)*/ },
        modifier = Modifier
            .padding(16.dp)
            .width(125.dp)
            .height(125.dp)

        ,shape = CutCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

    ) {

    }
}

@Composable
fun BotonAzul(/*onColorClick: (SimonColor) -> Unit*/){
    Button(onClick = {/*onColorClick(SimonColor.Yellow)*/ },

        modifier = Modifier
            .padding(16.dp)
            .width(125.dp)
            .height(125.dp)

        ,shape = CutCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
    ) {

    }
}

@Composable
fun BotonAmarillo(/*onColorClick: (SimonColor) -> Unit*/){
    Button(onClick = {/*onColorClick(SimonColor.Yellow)*/ },
        modifier = Modifier
            .padding(16.dp)
            .width(125.dp)
            .height(125.dp)

        ,shape = CutCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
    ) {

    }
}

@Composable
fun Botones(){
    Column {
        Row {
            BotonVerde()
            BotonRojo()
        }
        Row {
            BotonAzul()
            BotonAmarillo()
        }
    }

}


@Preview
@Preview(showBackground=true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewBotones(){
    Botones()
}


