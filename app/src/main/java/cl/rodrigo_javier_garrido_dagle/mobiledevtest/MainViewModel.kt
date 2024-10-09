package cl.rodrigo_javier_garrido_dagle.mobiledevtest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.ConnectivityRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases.NetworkUsecases
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
   connectivityRepository: ConnectivityRepository,
   private val networkUsecases: NetworkUsecases,
) : ViewModel() {
   val isOnline = connectivityRepository.isConnected.asLiveData()

   init {
      getAllHits()
   }

   private fun getAllHits() {
      viewModelScope.launch {
         val list = networkUsecases.invoke()

         list!!.map { hit ->
            val author = hit.author
            val title = if (hit.title != null) hit.title else hit.storyTitle
            val storyLink = if (hit.storyUrl != null) hit.storyUrl else "no link"
            val storyText = if (hit.storyText != null) hit.storyText else hit.commentText
            val createdAtId = hit.createdAtI
            val storyDate = if (hit.updatedAt != null) hit.updatedAt else hit.createdAt

            Log.d(
               TAG,
               "$createdAtId  -- $storyText"
            )

         }
      }
   }
}