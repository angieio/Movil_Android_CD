package com.tecsup.tecsup_store

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tecsup.tecsup_store.componentes.TarjetaProducto
import com.tecsup.tecsup_store.navigation.AppNavigation
import com.tecsup.tecsup_store.navigation.AppNavigation
import com.tecsup.tecsup_store.ui.theme.Tecsup_StoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tecsup_StoreTheme {
                setContent {
                    Tecsup_StoreTheme {
                        AppNavigation()
                    }
                }
            }
        }
    }
}