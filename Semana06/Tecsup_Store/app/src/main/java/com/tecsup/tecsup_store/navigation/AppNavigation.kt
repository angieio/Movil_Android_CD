package com.tecsup.tecsup_store.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tecsup.tecsup_store.componentes.TarjetaProducto
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

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            AppDrawer(
                opcionSeleccionada = opcionActual,
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
            topBar = {
                TopAppBar(
                    title = {
                        Text("TECSUP Store")
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
                                Icons.Default.Menu,
                                contentDescription = "Menú principal"
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->

            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(8.dp)
            ) {

                Text(
                    text = "Más vendidos",
                    style = MaterialTheme.typography.titleLarge
                )

                TarjetaProducto(
                    nombreProducto = "Audífonos",
                    precio = "S/ 89.00"
                )

                TarjetaProducto(
                    nombreProducto = "Smartwatch",
                    precio = "S/ 199.00"
                )

                TarjetaProducto(
                    nombreProducto = "Funda celular",
                    precio = "S/ 25.00"
                )
            }
        }
    }
}