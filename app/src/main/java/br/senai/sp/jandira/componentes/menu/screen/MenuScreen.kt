package br.senai.sp.jandira.componentes.menu.screen

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
import br.senai.sp.jandira.componentes.login.screen.LoginScreen

@Composable
fun MenuScreen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(51, 77, 192))
        .padding(top = 32.dp)
        .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "MENU", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.width(200.dp))
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("perfil/Vinicius Nunes") }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Perfil", fontWeight = FontWeight.Bold, color = Color.Blue, fontSize = 24.sp)
        }
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("pedidos") }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Pedidos", fontWeight = FontWeight.Bold, color = Color.Blue, fontSize = 24.sp)
        }
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("login") }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Sair", fontWeight = FontWeight.Bold, color = Color.Blue, fontSize = 24.sp)
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun MenuScreenPreview() {
//    MenuScreen()
//}