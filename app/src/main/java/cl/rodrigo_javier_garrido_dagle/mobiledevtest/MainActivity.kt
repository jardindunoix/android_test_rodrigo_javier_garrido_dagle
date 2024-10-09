package cl.rodrigo_javier_garrido_dagle.mobiledevtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.navigation.AppNavigation
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.theme.MobileDevTestTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

   private val viewmodel by viewModels<MainViewModel>()
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         MobileDevTestTheme {
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colorScheme.background
            ) {
               AppNavigation(viewmodel)
            }
         }
      }
   }
}

//@Composable
//fun Greeting(
//   name: String,
//   modifier: Modifier = Modifier
//) {
//   Text(
//      text = "Hello $name!",
//      modifier = modifier
//   )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//   MobileDevTestTheme {
//      Greeting("Android")
//   }
//}