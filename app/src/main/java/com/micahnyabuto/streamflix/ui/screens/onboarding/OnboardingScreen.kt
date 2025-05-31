package com.micahnyabuto.streamflix.ui.screens.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.micahnyabuto.streamflix.ui.navigation.Destinations

@Composable
fun OnboardingScreen(
    navController: NavController
){
    Box(
        Modifier.fillMaxSize()
            .background(Color(0xFF64B5F7)),
        contentAlignment = Alignment.Center
    ){
        Column {
            Text("Watch all your Favourite Movies")
            Spacer(Modifier.height(4.dp))
            Text("and Shows in a single Platform")
        }

    }
    Box(
        Modifier.fillMaxSize()
            .padding(bottom = 100.dp),
        contentAlignment = Alignment.BottomCenter
    ){
        Button(onClick = {
            navController.navigate(Destinations.Home)
        },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffffffff),
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray
            )
        ) {
            Icon(
                imageVector = Icons.Default.NavigateNext,
                contentDescription = "Next"
            )
        }
    }
}
