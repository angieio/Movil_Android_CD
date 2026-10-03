package com.tecsup.mibodega.ui.cliente.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tecsup.mibodega.ui.componentes.BotonPrimario
import com.tecsup.mibodega.ui.componentes.CampoTexto
import com.tecsup.mibodega.ui.theme.BodegaTheme
import com.tecsup.mibodega.ui.theme.GrisClaro
import com.tecsup.mibodega.ui.theme.VerdeBodega

/**
 * Pantalla de Iniciar Sesión con la misma interfaz y logo que RegistroScreen.
 */
@Composable
fun LoginScreen(
    onVolver: () -> Unit,
    onIniciarSesion: () -> Unit
) {
    var correo by remember { mutableStateOf("") }
    var contrasenia by remember { mutableStateOf("") }
    var mostrarError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp)
    ) {
        EncabezadoLogin(onVolver = onVolver)

        Spacer(Modifier.height(24.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Foto de perfil",
                tint = VerdeBodega,
                modifier = Modifier
                    .size(84.dp)
                    .background(GrisClaro, CircleShape)
                    .padding(4.dp)
            )
        }

        Spacer(Modifier.height(28.dp))

        CampoTexto(
            etiqueta = "Correo electrónico",
            valor = correo,
            onValorCambia = { correo = it },
            placeholder = "correo@ejemplo.com",
            teclado = KeyboardType.Email
        )
        Spacer(Modifier.height(16.dp))

        CampoTexto(
            etiqueta = "Contraseña",
            valor = contrasenia,
            onValorCambia = { contrasenia = it },
            placeholder = "********",
            teclado = KeyboardType.Password
        )

        Spacer(Modifier.height(28.dp))

        BotonPrimario(
            texto = "Iniciar sesión",
            onClick = {
                if (correo.isBlank() || contrasenia.isBlank()) {
                    mostrarError = true
                } else {
                    onIniciarSesion()
                }
            }
        )

        Spacer(Modifier.height(24.dp))
    }

    if (mostrarError) {
        AlertDialog(
            onDismissRequest = { mostrarError = false },
            title = { Text("Campos incompletos") },
            text = { Text("Por favor ingresa tu correo y contraseña para continuar.") },
            confirmButton = {
                TextButton(onClick = { mostrarError = false }) {
                    Text("Aceptar", color = VerdeBodega)
                }
            }
        )
    }
}

@Composable
private fun EncabezadoLogin(onVolver: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        IconButton(
            onClick = onVolver,
            modifier = Modifier.align(Alignment.CenterVertically)
        ) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
        }
        Text(
            text = "Iniciar sesión",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.weight(1f, fill = false)
        )
        Spacer(Modifier.size(48.dp))
    }
    Text(
        text = "Ingresa tus datos para continuar",
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginPreview() {
    BodegaTheme {
        LoginScreen(onVolver = {}, onIniciarSesion = {})
    }
}
