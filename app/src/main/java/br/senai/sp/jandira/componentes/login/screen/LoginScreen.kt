package br.senai.sp.jandira.componentes.login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.componentes.login.components.Form
import br.senai.sp.jandira.componentes.login.components.Header

@Composable
fun LoginScreen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(217, 52, 93))
        .padding(top = 32.dp)
        .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "LOGIN", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.width(200.dp))
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("menu") }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            shape = RoundedCornerShape(16.dp)
            ) {
            Text(text = "Entrar", fontWeight = FontWeight.Bold, color = Color.Blue, fontSize = 24.sp)
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen()
//}