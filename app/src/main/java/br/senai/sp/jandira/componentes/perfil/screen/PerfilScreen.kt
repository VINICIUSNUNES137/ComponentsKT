package br.senai.sp.jandira.componentes.perfil.screen

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
import br.senai.sp.jandira.componentes.menu.screen.MenuScreen



@Composable
fun PerfilScreen(navController: NavController, nome: String) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(83, 157, 111))
        .padding(top = 32.dp)
        .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "PERFIL - $nome", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold, modifier = Modifier.width(200.dp))
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate("menu") }, colors = ButtonDefaults.buttonColors(Color.White), modifier = Modifier
            .width(200.dp)
            .height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Voltar", fontWeight = FontWeight.Bold, color = Color.Blue, fontSize = 24.sp)
        }
        Spacer(modifier = Modifier.height(200.dp))

    }
}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun PerfilScreenPreview() {
//    PerfilScreen(nav)
//}