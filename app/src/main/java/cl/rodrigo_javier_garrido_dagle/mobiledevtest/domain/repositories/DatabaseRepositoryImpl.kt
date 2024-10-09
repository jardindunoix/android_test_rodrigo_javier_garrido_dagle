package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.entities.HitEntity
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.room.HitsDao
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class DatabaseRepositoryImpl @Inject constructor(
    private val dao: HitsDao
) : DatabaseRepository {

    override suspend fun getAllHits(): List<HitEntity>? {
        runCatching { dao.getAllData() }
            .onSuccess {
                return it
            }
            .onFailure {
                Log.d(
                    TAG,
                    "There is an error in the api call::> ${it.message}"
                )
            }
        return null
    }

}