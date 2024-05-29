package com.test.testcmake.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.material3.Text

@Composable
fun MainLayout(counter: Int, onBtnClick: ()-> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) { Modifier.padding(16.dp)
        Text(
            text = "Hello $counter",
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
                onClick = { onBtnClick()}) {
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = "Button"
                )
            }
        }
    }
}

