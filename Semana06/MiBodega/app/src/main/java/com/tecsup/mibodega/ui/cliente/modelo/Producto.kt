package com.tecsup.mibodega.ui.cliente.modelo

import androidx.annotation.DrawableRes

data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val categoria: String,
    val presentacion: String = "",
    @DrawableRes val imagenRes: Int? = null
)
