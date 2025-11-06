package com.julhdev.phoneintentapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.julhdev.phoneintentapp.views.EmailView
import com.julhdev.phoneintentapp.views.HomeView
import com.julhdev.phoneintentapp.views.PhoneView
import com.julhdev.phoneintentapp.views.SmsView


/**
 * NavControllores es un composable que gestiona la navegación entre las diferentes pantallas de la aplicación.
 * @param navHost El controlador de navegación utilizado para gestionar las rutas.
 * @usage Utilizar este composable para definir las rutas y las pantallas asociadas en la aplicación.
 */
@Composable
fun NavController(navController: NavHostController) {

  NavHost(
    navController = navController,
    startDestination = Routes.HOME
  ) {
    NavRoutes.forEach { item ->
      composable(item.route) {
        when (item.route) {
          Routes.HOME -> HomeView()
          Routes.PHONE -> PhoneView()
          Routes.SMS -> SmsView()
          Routes.EMAIL -> EmailView()
        }
      }
    }
  }
}