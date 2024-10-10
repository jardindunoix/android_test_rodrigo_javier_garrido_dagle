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
import androidx.lifecycle.lifecycleScope
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.navigation.AppNavigation
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.theme.MobileDevTestTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var hits: List<Hit>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        lifecycleScope.launch(Dispatchers.Main) {
//            hits = viewModel.getAllHits()
        }
            hits = emptyList()
        setContent {
            MobileDevTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    AppNavigation(
                        viewModel,
                        hits,
                        lifecycleScope
                    )
                }
            }
        }
    }
}
