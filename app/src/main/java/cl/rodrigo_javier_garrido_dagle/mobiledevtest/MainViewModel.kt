package cl.rodrigo_javier_garrido_dagle.mobiledevtest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.ConnectivityRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases.HitUsecases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    connectivityRepository: ConnectivityRepository,
    private val networkUsecases: HitUsecases,
) : ViewModel() {
    private val isOnline = connectivityRepository.isConnected.asLiveData()



    suspend fun getAllHits(): List<Hit> {
        return if (isOnline.value!!) {
            networkUsecases.invoke()
        } else {
            networkUsecases.invokeOffLine()
        }
    }
}