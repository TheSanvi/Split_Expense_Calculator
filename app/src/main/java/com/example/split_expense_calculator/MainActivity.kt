package com.example.split_expense_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.split_expense_calculator.ui.theme.Split_Expense_CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp {
                Text(text = "Hello")
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    Split_Expense_CalculatorTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    } // This closing bracket was missing
}


@Preview
@Composable
fun TopHeader(){


    androidx.compose.material3.Surface(modifier =Modifier.fillMaxWidth().height(150.dp)

        .clip(shape = CircleShape.copy(all = CornerSize(12.dp)))
    ) {
        Column() {

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Split_Expense_CalculatorTheme {
        MyApp {
            Text(text = "hello")
        }
    }
}

