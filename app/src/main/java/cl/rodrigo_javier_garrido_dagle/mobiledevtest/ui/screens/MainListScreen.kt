package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel

@Composable
fun MainListScreen(
    navController: NavHostController,
    viewModel: MainViewModel,
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
    ) {
        val itemCount = 0
    }


}

@Composable
fun ColumnItem(
//    hit: Hit,
    modifier: Modifier = Modifier
) {
    Column(
//        modifier = modifier
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