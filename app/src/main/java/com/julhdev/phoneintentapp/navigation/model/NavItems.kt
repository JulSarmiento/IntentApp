package com.julhdev.phoneintentapp.navigation.model

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Data class que representa un elemento de navegación en la aplicación.
 * @property route La ruta de navegación asociada al elemento.
 * @property icon El recurso de ícono asociado al elemento.
 * @property title El título del elemento de navegación.
 * @usage Utilizar esta clase para definir los elementos del menú de navegación.
 */
data class NavItems(
    val route: String,
    val icon: ImageVector,
    val title: String
)
