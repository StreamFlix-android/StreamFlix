package com.micahnyabuto.streamflix.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){
    Box (
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("HomeScreen")
    }
}