package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.R
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.theme.montserratFont

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
         Modifier.background(Color.Yellow)
      ) {

         Spacer(Modifier.padding(25.dp))
         Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
         ) {
            Image(
               modifier = Modifier
                  .padding(top = 0.dp)
                  .width(180.dp)
                  .height(180.dp)
                  .padding(0.dp),
               painter = painterResource(id = R.drawable.icon),
               contentDescription = "image"
            )
         }
         Spacer(Modifier.padding(8.dp))

         Row(
            Modifier
               .height(490.dp)
               .fillMaxWidth()
         ) {
            Column {
               Spacer(modifier = Modifier.padding(12.dp))
               Row(
                  modifier = Modifier.fillMaxWidth(),
                  horizontalArrangement = Arrangement.Center
               ) {
                  Card(
                     modifier = Modifier
                        .width(300.dp)
                        .height(400.dp),
                     shape = RoundedCornerShape(35.dp),
                     border = BorderStroke(
                        width = 1.dp,
                        Color.Gray
                     ),
                     elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                     colors = CardDefaults.cardColors(containerColor = Color.White),
                  ) {
                     Spacer(modifier = Modifier.padding(12.dp))
                     Spacer(modifier = Modifier.padding(8.dp))
                  }
               }
               Spacer(modifier = Modifier.padding(25.dp))
            }
         }
      }
      Spacer(modifier = Modifier.padding(2.dp))
      Row(
         modifier = Modifier.fillMaxWidth(),
         horizontalArrangement = Arrangement.Center
      ) {
         Text(
            modifier = Modifier,
            text = "by Rodrigo Javier",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Light,
            fontFamily = montserratFont,
         )
      }
   }
}