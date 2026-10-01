package com.tecsup.tecsup_store.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AppDrawer(
    opcionSeleccionada: String,
    onOpcionClick: (String) -> Unit
) {
    val colorPurpura = Color(0xFF4A148C)
    val colorFondoSeleccionado = Color(0xFFF3E5F5)

    ModalDrawerSheet(
        drawerContainerColor = Color.White
    ) {

        // Encabezado del usuario
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(
                            Color(0xFFE1D5E7),
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "AV",
                        fontWeight = FontWeight.Bold,
                        color = colorPurpura
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "Angieluz Vasquez",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "angieluz@tecsup.edu.pe",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray
                    )
                }
            }
        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 24.dp),
            color = Color(0xFFEEEEEE)
        )

        Spacer(modifier = Modifier.height(16.dp))

        val opciones = listOf(
            "Inicio",
            "Mis pedidos",
            "Favoritos",
            "Perfil",
            "Cerrar sesion"
        )

        opciones.forEach { opcion ->

            val esSeleccionado = opcionSeleccionada == opcion

            NavigationDrawerItem(
                label = {
                    Text(
                        text = opcion,
                        fontWeight = if (esSeleccionado) {
                            FontWeight.Bold
                        } else {
                            FontWeight.Normal
                        },
                        color = if (esSeleccionado) {
                            colorPurpura
                        } else {
                            Color.DarkGray
                        }
                    )
                },

                icon = {
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .border(
                                2.dp,
                                if (esSeleccionado) {
                                    colorPurpura
                                } else {
                                    Color.Gray
                                },
                                CircleShape
                            )
                    )
                },

                selected = esSeleccionado,

                onClick = {
                    onOpcionClick(opcion)
                },

                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = colorFondoSeleccionado,
                    unselectedContainerColor = Color.Transparent
                ),

                shape = RoundedCornerShape(12.dp),

                modifier = Modifier.padding(
                    horizontal = 16.dp,
                    vertical = 4.dp
                )
            )
        }
    }
}