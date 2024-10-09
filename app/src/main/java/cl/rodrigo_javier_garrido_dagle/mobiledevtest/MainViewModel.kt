package cl.rodrigo_javier_garrido_dagle.mobiledevtest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.ConnectivityRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases.NetworkUsecases
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
            networkUsecases.invoke()

//            list!!.map { hit ->
//                val author = hit.author
//                val createdAtId = hit.createdAtI
//                val title = hit.title ?: hit.storyTitle
//                val storyLink = hit.storyUrl ?: "no link"
//                val storyText = hit.storyText ?: hit.commentText
//                val storyDate = hit.updatedAt ?: hit.createdAt
//
//                Log.d(
//                    TAG,
//                    "$createdAtId  -- $storyText"
//                )

        }
    }
}
}