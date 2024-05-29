package com.test.testcmake.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.test.cppapplication.ui.theme.CPPApplicationTheme
import com.test.testcmake.layout.MainLayout

class MainActivity : ComponentActivity() {
    private val mainVM : MainVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CPPApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    MainScreen(viewModel = mainVM)
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainVM){
    val counter by viewModel.counter.collectAsState()
    MainLayout(counter, onBtnClick = {
        viewModel.incrementCounter()
    })
}