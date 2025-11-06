package com.julhdev.phoneintentapp.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.julhdev.phoneintentapp.navigation.model.NavItems

/**
 * Retorna la ruta actual del NavHostController proporcionado.
 * @param navHost El NavHostController del cual obtener la ruta actual.
 * @return La ruta actual como una cadena de texto.
 * @usage Utilizar esta función para determinar la pantalla actual en la navegación.
 */
@Composable
fun currentRoute(navHost: NavHostController): String {
  val current by navHost.currentBackStackEntryAsState()
  return current?.destination?.route ?: ""
}

@Composable
fun BottomNav(
  navHost: NavHostController,
  routes: List<NavItems>
) {
  BottomAppBar() {
    NavigationBar(
      containerColor = Color.Black
    ) {
      val currentRoute = currentRoute(navHost)
      routes.forEach { items ->
        NavigationBarItem(
          selected = currentRoute == items.route,
          onClick = {navHost.navigate(items.route) },
          icon = {
            Icon(
              imageVector = items.icon,
              contentDescription = items.title,
              tint = Color.White
            )
          }
        )
      }
    }
  }
}