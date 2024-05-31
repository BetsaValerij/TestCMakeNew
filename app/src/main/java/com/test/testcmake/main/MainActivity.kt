package com.test.testcmake.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test.cppapplication.ui.theme.TestCMakeTheme
import com.test.testcmake.layout.ui.MainScreen

class MainActivity : ComponentActivity() {
    private val viewModel: MainVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestCMakeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(viewModel = viewModel)
                }
            }
        }
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    TestCMakeTheme {
        val previewViewModel = MainVM()
        MainScreen(viewModel = previewViewModel)
    }
}


