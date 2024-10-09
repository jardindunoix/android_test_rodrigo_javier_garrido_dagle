package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit

@Composable
fun MainListScreen(
   navController: NavHostController,
   viewModel: MainViewModel,
) {
   Surface(
      modifier = Modifier
         .fillMaxSize()
         .padding(8.dp)
   ) {





//      val hits by viewmodel.hits.collectAsState()
//      LazyColumn(
//         modifier = Modifier.fillMaxSize(),
//         verticalArrangement = Arrangement.spacedBy(16.dp)
//      ) {
//         items(hits) { hit ->
//            CourseItem(
//               hit = hit,
//               modifier = Modifier
//                  .fillMaxWidth()
//                  .padding(16.dp)
//            )
//         }
//      }

   }
}

@Composable
fun CourseItem(
   hit: Hit,
   modifier: Modifier = Modifier
) {
   Column(
      modifier = modifier
   ) {
      Text(
         text = "hit theme",
         fontWeight = FontWeight.Bold,
         fontSize = 20.sp
      )
      Text(
         text = "Held by me",
         fontSize = 14.sp,
         fontStyle = FontStyle.Italic
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
         text = "Enrolled : 5000",
         fontSize = 10.sp,
      )
   }
}