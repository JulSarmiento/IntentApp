package com.julhdev.phoneintentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.julhdev.phoneintentapp.components.BottomNav
import com.julhdev.phoneintentapp.navigation.NavController
import com.julhdev.phoneintentapp.navigation.NavRoutes
import com.julhdev.phoneintentapp.ui.theme.PhoneIntentAppTheme
import com.julhdev.phoneintentapp.views.HomeView

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      PhoneIntentAppTheme {
        val navController = rememberNavController()
        Scaffold(
          bottomBar = {
            BottomNav(
              navHost = navController,
              routes = NavRoutes,
            )
          }
        ) { innerPadding ->
          Column(
            modifier = Modifier
              .padding(innerPadding)
          ) {
            NavController(navController)
          }
        }
      }
    }
  }
}
