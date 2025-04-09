package co.edu.unab.isa.ecommerceapp

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.unab.isa.ecommerceapp.ui.theme.EcommerceAppTheme
import co.edu.unab.isa.ecommerceapp.ui.theme.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcommerceAppTheme {
                val myNavController = rememberNavController()
                val myStartDestination = "Login"


                NavHost(
                    navController = myNavController,
                    startDestination = myStartDestination,
                    modifier = Modifier.fillMaxSize()
                ){
                    composable("Login") {
                        LoginScreen(myNavController)
                    }
                    composable("register") {
                        RegisterScreen(myNavController)
                    }
                    composable("Home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}

