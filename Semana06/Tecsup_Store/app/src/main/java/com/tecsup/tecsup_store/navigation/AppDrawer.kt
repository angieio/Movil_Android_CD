package com.tecsup.tecsup_store.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppDrawer(
    opcionSeleccionada: String,
    onOpcionClick: (String) -> Unit
) {
    ModalDrawerSheet {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .background(
                            Color(0xFFE1D5E7),
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "AV",
                        color = Color(0xFF4A148C)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "Angie Vasquez",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "angie.vasquez@tecsup.edu.pe",
                        color = Color.Gray
                    )
                }
            }
        }

        HorizontalDivider()

        Spacer(modifier = Modifier.height(10.dp))

        NavigationDrawerItem(
            label = { Text("Inicio") },
            icon = {
                Icon(
                    Icons.Default.Home,
                    contentDescription = null
                )
            },
            selected = opcionSeleccionada == "Inicio",
            onClick = { onOpcionClick("Inicio") },
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        NavigationDrawerItem(
            label = { Text("Mis pedidos") },
            icon = {
                Icon(
                    Icons.Default.ShoppingCart,
                    contentDescription = null
                )
            },
            selected = opcionSeleccionada == "Mis pedidos",
            onClick = { onOpcionClick("Mis pedidos") },
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        NavigationDrawerItem(
            label = { Text("Favoritos") },
            icon = {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = null
                )
            },
            selected = opcionSeleccionada == "Favoritos",
            onClick = { onOpcionClick("Favoritos") },
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        NavigationDrawerItem(
            label = { Text("Perfil") },
            icon = {
                Icon(
                    Icons.Default.Person,
                    contentDescription = null
                )
            },
            selected = opcionSeleccionada == "Perfil",
            onClick = { onOpcionClick("Perfil") },
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        NavigationDrawerItem(
            label = { Text("Cerrar sesion") },
            icon = {
                Icon(
                    Icons.Default.ExitToApp,
                    contentDescription = null
                )
            },
            selected = false,
            onClick = { onOpcionClick("Cerrar sesion") },
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}