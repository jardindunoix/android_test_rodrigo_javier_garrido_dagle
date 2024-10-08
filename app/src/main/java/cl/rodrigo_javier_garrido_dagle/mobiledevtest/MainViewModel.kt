package cl.rodrigo_javier_garrido_dagle.mobiledevtest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.ConnectivityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
   connectivityRepository: ConnectivityRepository,
) : ViewModel() {
   val isOnline = connectivityRepository.isConnected.asLiveData()

}