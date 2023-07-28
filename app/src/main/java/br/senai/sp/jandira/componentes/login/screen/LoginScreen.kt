package br.senai.sp.jandira.componentes.login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.componentes.login.components.Form
import br.senai.sp.jandira.componentes.login.components.Header

@Composable
fun LoginScreen() {
    Column (modifier = Modifier
        .fillMaxWidth()
        .background(Color.Cyan)

    ) {
        Header()
        Form()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}