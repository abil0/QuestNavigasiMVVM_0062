package com.example.pertemuan6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-Laki","Perempuan"),
    OnSubmitBtnClick: () -> Unit
)
