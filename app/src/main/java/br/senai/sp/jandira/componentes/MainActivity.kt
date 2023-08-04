package br.senai.sp.jandira.componentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.componentes.login.screen.LoginScreen
import br.senai.sp.jandira.componentes.menu.screen.MenuScreen
import br.senai.sp.jandira.componentes.pedidos.screen.PedidosScreen
import br.senai.sp.jandira.componentes.perfil.screen.PerfilScreen
import br.senai.sp.jandira.componentes.ui.theme.ComponentesTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(navController = navController,
                        startDestination = "login",
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentScope.SlideDirection.End,
                                animationSpec = tween(
                                    700
                                )
                            ) + fadeIn(tween(1000))
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentScope.SlideDirection.Start,
                                animationSpec = tween(
                                    500
                                )
                            ) + fadeOut(tween(1000))
                        }
                        ){
                    composable(route = "login"){ LoginScreen(navController) }
                    composable(route = "menu"){ MenuScreen(navController) }
                    composable(route = "pedidos"){ PedidosScreen(navController) }
                    composable(route = "perfil/{nomeUsuario}"){
                    var nome = it.arguments!!.getString("nomeUsuario")
                        PerfilScreen(navController = navController, nome = nome!!)
                    }
                    }

                }
            }
        }
    }
}
