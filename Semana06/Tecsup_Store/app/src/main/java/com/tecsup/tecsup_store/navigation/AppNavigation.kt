package com.tecsup.tecsup_store.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.tecsup.tecsup_store.componentes.TarjetaProducto
import com.tecsup.tecsup_store.screens.InicioScreen
import com.tecsup.tecsup_store.screens.PedidosScreen
import com.tecsup.tecsup_store.screens.FavoritosScreen
import com.tecsup.tecsup_store.screens.PerfilScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope = rememberCoroutineScope()

    var opcionActual by remember {
        mutableStateOf("Inicio")
    }

    var contadorFavoritos by remember {
        mutableStateOf(0)
    }

    val colorPurpura = Color(0xFF4A148C)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            AppDrawer(
                opcionSeleccionada = opcionActual,
                contadorFavoritos = contadorFavoritos,
                onOpcionClick = { opcion ->
                    opcionActual = opcion

                    scope.launch {
                        drawerState.close()
                    }
                }
            )
        }
    ) {
        Scaffold(
            containerColor = Color.White,

            topBar = {
                TopAppBar(
                    title = {
                        Column {
                            Text(
                                text = "TECSUP Store",
                                color = Color.White
                            )

                            Text(
                                text = "Mas vendidos",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.LightGray
                            )
                        }
                    },

                    navigationIcon = {
                        IconButton(
                            onClick = {
                                scope.launch {
                                    drawerState.open()
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menú",
                                tint = Color.White
                            )
                        }
                    },

                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = colorPurpura
                    )
                )
            }
        ) { paddingValues ->

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {

                when (opcionActual) {

                    "Inicio" -> {
                        item {
                            InicioScreen()
                        }

                        item {
                            TarjetaProducto(
                                nombreProducto = "Audifonos Bluetooth",
                                precio = "S/ 89.00",
                                onAgregarAFavoritos = { contadorFavoritos++ }
                            )
                        }

                        item {
                            TarjetaProducto(
                                nombreProducto = "Smartwatch Pro",
                                precio = "S/ 199.00",
                                onAgregarAFavoritos = { contadorFavoritos++ }
                            )
                        }
                    }

                    "Mis pedidos" -> {
                        item {
                            PedidosScreen()
                        }

                        item {
                            TarjetaProducto(
                                nombreProducto = "Audifonos",
                                precio = "S/ 89.00",
                                onAgregarAFavoritos = { contadorFavoritos++ }
                            )
                        }

                        item {
                            TarjetaProducto(
                                nombreProducto = "Smartwatch",
                                precio = "S/ 199.00",
                                onAgregarAFavoritos = { contadorFavoritos++ }
                            )
                        }

                        item {
                            TarjetaProducto(
                                nombreProducto = "Funda celular",
                                precio = "S/ 25.00",
                                onAgregarAFavoritos = { contadorFavoritos++ }
                            )
                        }
                    }

                    "Favoritos" -> {
                        item {
                            FavoritosScreen()
                        }
                    }

                    "Perfil" -> {
                        item {
                            PerfilScreen()
                        }
                    }
                }
            }
        }
    }
}