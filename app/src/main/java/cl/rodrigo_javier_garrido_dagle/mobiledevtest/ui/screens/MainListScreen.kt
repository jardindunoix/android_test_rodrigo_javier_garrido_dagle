package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import kotlinx.coroutines.CoroutineScope

@Composable
fun MainListScreen(
    navController: NavHostController,
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
    hits: List<Hit>,
    coroutineScope: CoroutineScope
) {
//    val coroutineScope = rememberCoroutineScope()


    LazyColumn(
        contentPadding = PaddingValues(16.dp),
    ) {

//        coroutineScope.launch {
//            viewModel.getAllHits()
//        }

        val names = arrayOf(
            "Peperoni",
            "Vegan",
            "FourCheese",
            "Margaritta",
            "American",
            "Mexican"
        )

        val ingredients = arrayOf(
            "Tomato sos, cheese, oregano, peperoni",
            "Tomato sos, cheese, oregano, spinach, green paprika, rukola",
            "Tomato sos, oregano, mozzarella, goda, parmesan, cheddar",
            "Tomato sos, cheese, oregano, bazillion",
            "Tomato sos, cheese, oregano, green paprika, red beans",
            "Tomato sos, cheese, oregano, corn, jalapeno, chicken",
        )

        val itemCount = 6
        items(itemCount) {
            ColumnItem(
                modifier,
//                hit = hits[it],
                navController = navController,
                ingredients = ingredients,
                itemIndex = it,
            )
        }
    }
}

@Composable
fun ColumnItem(
    modifier: Modifier,
//    hit: Hit,
    navController: NavController,
    ingredients: Array<String>,
    itemIndex: Int,
) {

    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize()
            .clickable {
                navController.navigate(route= "detail_screen")
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Column(modifier.padding(12.dp)) {
                Text(text = ingredients[itemIndex], fontSize = 18.sp)

            }
        }
    }
}
