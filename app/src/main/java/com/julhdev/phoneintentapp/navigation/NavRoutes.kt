package com.julhdev.phoneintentapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import com.julhdev.phoneintentapp.navigation.model.NavItems

/**
 * Lista de rutas de navegación para la aplicación.
 * @usage Utilizar esta lista para configurar el menú de navegación en la interfaz de usuario.
 */
val NavRoutes = listOf(
  NavItems(
    route = Routes.HOME,
    title = "Home",
    icon = Icons.Default.Home
  ),

  NavItems(
    route = Routes.PHONE,
    title = "Phone",
    icon = Icons.Default.Phone
  ),

  NavItems(
    route = Routes.EMAIL,
    title = "Email",
    icon = Icons.Default.Email
  ),

  NavItems(
    route = Routes.SMS,
    title = "SMS",
    icon = Icons.AutoMirrored.Filled.Message
  )
)