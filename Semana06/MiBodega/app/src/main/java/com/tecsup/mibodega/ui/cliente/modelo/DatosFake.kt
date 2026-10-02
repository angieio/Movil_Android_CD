package com.tecsup.mibodega.ui.cliente.modelo

import com.tecsup.mibodega.R
/**
 * Datos de ejemplo (fake) para mostrar la UI sin base de datos.
 * Cuando conecten Room o una API, este archivo se reemplaza por
 * un Repository real, pero las pantallas no cambian porque ya
 * reciben una List<Producto> como parámetro.
 */
val listaCategorias = listOf("Todos", "Bebidas", "Abarrotes", "Snacks", "Limpieza")

val listaProductosFake = listOf(
    Producto(
        id = 1,
        nombre = "Arroz Costeño",
        descripcion = "Arroz extra, grano largo, ideal para el día a día.",
        precio = 4.50,
        categoria = "Abarrotes",
        imagen = R.drawable.arroz_costeno
    ),
    Producto(
        id = 2,
        nombre = "Aceite Primor",
        descripcion = "Aceite vegetal 1 L, alto en vitamina E.",
        precio = 8.90,
        categoria = "Abarrotes",
        imagen = R.drawable.aceite_primor
    ),
    Producto(
        id = 3,
        nombre = "Leche Gloria",
        descripcion = "Leche evaporada entera 1 L.",
        precio = 5.20,
        categoria = "Abarrotes",
        imagen = R.drawable.leche_gloria
    ),
    Producto(
        id = 4,
        nombre = "Galleta Oreo",
        descripcion = "Galletas de chocolate rellenas 126 g.",
        precio = 3.50,
        categoria = "Snacks",
        imagen = R.drawable.galleta_oreo
    ),
    Producto(
        id = 5,
        nombre = "Coca-Cola Original",
        descripcion = "Bebida gaseosa sabor cola. Ideal para compartir en familia.",
        precio = 6.50,
        categoria = "Bebidas",
        imagen = R.drawable.coca_cola
    ),
    Producto(
        id = 6,
        nombre = "Inca Kola",
        descripcion = "Bebida gaseosa sabor original de 1.5 L.",
        precio = 6.00,
        categoria = "Bebidas",
        imagen = R.drawable.inca_kola
    ),
    Producto(
        id = 7,
        nombre = "Agua San Luis",
        descripcion = "Agua mineral sin gas de 625 ml.",
        precio = 2.50,
        categoria = "Bebidas",
        imagen = R.drawable.agua_sanluis
    ),
    Producto(
        id = 8,
        nombre = "Papas Lays",
        descripcion = "Papas fritas clásicas de 150 g.",
        precio = 7.50,
        categoria = "Snacks",
        imagen = R.drawable.papas_lays
    ),
    Producto(
        id = 9,
        nombre = "Chocolate Sublime",
        descripcion = "Chocolate con leche y maní de 30 g.",
        precio = 2.50,
        categoria = "Snacks",
        imagen = R.drawable.chocolate_sublime
    ),
    Producto(
        id = 10,
        nombre = "Fideos Don Vittorio",
        descripcion = "Fideos tallarín de 500 g.",
        precio = 4.20,
        categoria = "Abarrotes",
        imagen = R.drawable.tallarin_donvittorio
    ),
    Producto(
        id = 11,
        nombre = "Azúcar Rubia",
        descripcion = "Azúcar rubia de 1 kg.",
        precio = 4.80,
        categoria = "Abarrotes",
        imagen = R.drawable.azucar_rubia
    ),
    Producto(
        id = 12,
        nombre = "Atún Florida",
        descripcion = "Atún en agua de 170 g.",
        precio = 6.90,
        categoria = "Abarrotes",
        imagen = R.drawable.atun_florida
    ),
    Producto(
        id = 13,
        nombre = "Galletas Casino",
        descripcion = "Galletas rellenas sabor chocolate de 6 unidades.",
        precio = 3.00,
        categoria = "Snacks",
        imagen = R.drawable.galleta_casino
    ),
    Producto(
        id = 14,
        nombre = "Yogurt Gloria",
        descripcion = "Yogurt de fresa de 1 litro.",
        precio = 8.50,
        categoria = "Bebidas",
        imagen = R.drawable.yogurt_gloria
    ),
    Producto(
        id = 15,
        nombre = "Leche Chocolatada",
        descripcion = "Bebida láctea sabor chocolate de 200 ml.",
        precio = 2.80,
        categoria = "Bebidas",
        imagen = R.drawable.leche_chocolatada
    ),
    Producto(
        id = 16,
        nombre = "Detergente Bolívar",
        descripcion = "Detergente en polvo para lavar ropa.",
        precio = 8.50,
        categoria = "Limpieza",
        imagen = R.drawable.detergente_bolivar
    ),
    Producto(
        id = 17,
        nombre = "Lejía Clorox",
        descripcion = "Lejía para limpieza y desinfección del hogar.",
        precio = 5.50,
        categoria = "Limpieza",
        imagen = R.drawable.lejia_clorox
    )
)

