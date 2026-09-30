package com.tecsup.tecsup_store

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.tecsup.tecsup_store.navigation.AppNavigation
import com.tecsup.tecsup_store.ui.theme.Tecsup_StoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tecsup_StoreTheme {
                AppNavigation()
            }
        }
    }
}