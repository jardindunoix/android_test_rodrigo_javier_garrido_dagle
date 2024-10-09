package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.entityToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToEntity
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.DatabaseRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class HitUsecases @Inject constructor(
    private val networkRepository: NetworkRepositoryImpl,
    private val databaseRepository: DatabaseRepositoryImpl
) {
    suspend operator fun invoke() {
        val listDDBB = databaseRepository.getAllHits()

        if (listDDBB!!.isNotEmpty()) {
            listDDBB.map { hit ->
                Log.d(TAG, "DDBB RESPONSE: $hit")
                hit.entityToDomain()
            }
        } else {
            val listNetwork = networkRepository.getAllHits()
            val listDb = listNetwork?.map {
                val hitt = it.networkToEntity()
                databaseRepository.insertHit(hitt)
                hitt
            }
            Log.d(TAG, "NETWORK: $listDb")

            listNetwork?.map { hit ->
                hit.networkToDomain()
            }
            databaseRepository.insertAllHits(listDb)


        }

    }
}