package com.tecsup.mibodega.ui.cliente.screens.entrega

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.tecsup.mibodega.R
import com.tecsup.mibodega.ui.componentes.BotonPrimario
import com.tecsup.mibodega.ui.componentes.CampoTexto
import com.tecsup.mibodega.ui.theme.VerdeBodega

@Composable
fun DatosEntregaScreen(
    onConfirmar: () -> Unit
) {
    var nombre by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }
    var referencia by remember { mutableStateOf("") }
    var metodoPago by remember { mutableStateOf("Efectivo al entregar") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Datos de entrega",
            style = MaterialTheme.typography.headlineSmall
        )

        CampoTexto(
            etiqueta = "Nombre completo",
            valor = nombre,
            onValorCambia = { nombre = it }
        )

        CampoTexto(
            etiqueta = "Dirección",
            valor = direccion,
            onValorCambia = { direccion = it }
        )

        CampoTexto(
            etiqueta = "Referencia",
            valor = referencia,
            onValorCambia = { referencia = it }
        )

        Text(
            text = "Método de pago",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        val metodosPago = listOf("Efectivo al entregar", "Yape", "Plin")
        metodosPago.forEach { metodo ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { metodoPago = metodo }
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = metodoPago == metodo,
                    onClick = { metodoPago = metodo },
                    colors = RadioButtonDefaults.colors(selectedColor = VerdeBodega)
                )
                Spacer(Modifier.width(8.dp))
                when (metodo) {
                    "Efectivo al entregar" -> {
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .background(Color(0xFFE8F5E9), RoundedCornerShape(6.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Payments,
                                contentDescription = null,
                                tint = VerdeBodega,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                    "Yape" -> {
                        Image(
                            painter = painterResource(id = R.drawable.yape),
                            contentDescription = "Yape",
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(6.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }
                    "Plin" -> {
                        Image(
                            painter = painterResource(id = R.drawable.plin),
                            contentDescription = "Plin",
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(6.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Spacer(Modifier.width(10.dp))
                Text(text = metodo, style = MaterialTheme.typography.bodyMedium)
            }
        }

        BotonPrimario(
            texto = "Confirmar pedido",
            onClick = onConfirmar
        )
    }
}
