package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
   private val apiCalls: ApiCalls
) : NetworkRepository {

   override suspend fun getAllHits(): List<Hit>? {
      runCatching { apiCalls.getAllHit() }
         .onSuccess {
            return it.map { item -> item.networkToDomain() }
         }
         .onFailure {
            Log.i(
               TAG,
               "There is an error in the api call ${it.message}"
            )
         }
      return null
   }

}