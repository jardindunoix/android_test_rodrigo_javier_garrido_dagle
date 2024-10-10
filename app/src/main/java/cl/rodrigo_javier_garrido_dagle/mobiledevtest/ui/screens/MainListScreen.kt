@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.MainViewModel
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens.components.ColumnItem
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.ui.screens.components.SwipeToDeleteContainer
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.SwipeRefreshIndicator
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainListScreen(
    navController: NavHostController,
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
    hits_: List<Hit>
) {
    val isLoading by viewModel.isLoading.collectAsState()
    val swipeRefreshState = rememberSwipeRefreshState(isRefreshing = isLoading)


    SwipeRefresh(
        state = swipeRefreshState,
        onRefresh = { viewModel.isLoading },
        indicator = { state, refreshTriugger ->
            SwipeRefreshIndicator(state = state, refreshTriggerDistance = refreshTriugger)
        }
    ) {

        val hits = hits_.toMutableStateList()

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(0.dp),
        ) {


            val itemCount = hits.size
            items(
//                itemCount
                items = hits,
                key = { it }
            ) { item ->
                val dismissState = rememberSwipeToDismissBoxState(
                    confirmValueChange = { boxToSwipe ->
                        true


//                        if (boxToSwipe == SwipeToDismissBoxValue.EndToStart) {
//                            Log.d(TAG, "MainListScreen: $item")
//                            var itemToDelete: Hit? = null
//
//                            for (innerItem in hits) {
//                                if (hits[item].createdAtI == innerItem.createdAtI) {
//                                    itemToDelete = hits[item]
//                                    break
//                                }
//                            }
//
//                            Log.d(TAG, "${itemToDelete?.createdAtI}")
//                        hits.remove(itemToDelete)
//                            true
//                        } else {
//                            false
//                        }


                    }
                )

                SwipeToDeleteContainer(
                    item = language,
                    onDelete = {
                        programmingLanguages -= language
                    }
                    /*
                       state = dismissState,
                       backgroundContent = {
                           Row(
                               modifier = Modifier
                                   .padding(vertical = 10.dp),

                               ) {
                               Box(
                                   modifier = Modifier
   //                                    .fillMaxHeight()
   //                                    .fillMaxWidth()
                                       .background(Color.Red)
                                       .padding(horizontal = 120.dp, vertical = 80.dp)
                                       .align(Alignment.CenterVertically),
                                   contentAlignment = Alignment.CenterEnd,
                               ) {
                                   Text(
                                       text = "Delete",
                                       color = Color.White,
                                       fontWeight = FontWeight.Bold,
                                   )
                               }
                           }
                       }
   */

                ) {
                    ColumnItem(
                        modifier,
                        hit = hits[item],
                        navController = navController,
                    )
                }
            }
        }
    }
}
