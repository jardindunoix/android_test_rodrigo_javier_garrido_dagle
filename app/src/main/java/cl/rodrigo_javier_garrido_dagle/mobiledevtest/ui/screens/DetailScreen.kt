package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel

@Composable
fun DetailScreen(
   navController: NavHostController,
   viewmodel: MainViewModel,
) {
   Surface(
      modifier = Modifier
         .fillMaxSize()
         .padding(0.dp)
   ) {
      Text(
         text = "Hola detail"
      )
   }
}