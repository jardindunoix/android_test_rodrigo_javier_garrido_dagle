package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.R

@Composable
fun MainListScreen(
   navController: NavHostController,
   viewmodel: MainViewModel,
) {
   Surface(
      modifier = Modifier
         .fillMaxSize()
         .padding(0.dp)
   ) {
      Column(
         Modifier.background(Color.White)
      ) {

         Spacer(Modifier.padding(24.dp))
         Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
         ) {
            Image(
               painter = painterResource(id = R.drawable.icon),
               contentDescription = "image",
               contentScale = ContentScale.Crop,
               modifier = Modifier
                  .size(84.dp)
                  .clip(CircleShape)
                  .border(
                     2.dp,
                     Color.Gray,
                     CircleShape
                  )
            )
         }
         Spacer(Modifier.padding(12.dp))
         Text(
            text = if (viewmodel.isOnline.value!!) {
               "On line"
            } else {
               "Is out of line"
            },
            color = Color.Black,
            fontSize = 20.sp
         )
      }
   }
}