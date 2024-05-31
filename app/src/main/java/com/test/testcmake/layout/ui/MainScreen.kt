package com.test.testcmake.layout.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.testcmake.main.MainVM


@Composable
fun MainScreen(viewModel: MainVM){
    val counterState = viewModel.counter.collectAsState()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) { Modifier.padding(16.dp)
        Text(
            text = "Hello ${counterState.value}",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Button(
                modifier = Modifier
                    .padding(19.dp)
                    .weight(1f),
                shape = RoundedCornerShape(12.dp),
                onClick = { viewModel.incrementCounter()}) {
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = "Button"
                )
            }
        }
    }

}