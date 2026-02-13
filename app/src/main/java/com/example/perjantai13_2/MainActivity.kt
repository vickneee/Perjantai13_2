package com.example.perjantai13_2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.perjantai13_2.ui.theme.Perjantai13_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Perjantai13_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var c by remember {
        mutableIntStateOf(0)
    }
    Log.d("XYZ", "Greeting(): c = $c")
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

        Button({
            c++
            Log.d("XYZ", "onClick, $c")
        }) {
            Text("Klick!")
        }
        Text("c = $c", fontSize = 62.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Perjantai13_2Theme {
        Greeting("Android")
    }
}