package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.entityToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToEntity
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.DatabaseRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class HitUsecases @Inject constructor(
    private val networkRepository: NetworkRepositoryImpl,
    private val databaseRepository: DatabaseRepositoryImpl
) {
    suspend operator fun invoke(): List<Hit> {
        val listNetwork = networkRepository.getAllHits()
        val listDDBB = databaseRepository.getAllHits()

        if (listDDBB!!.isEmpty()) {
            Log.d(TAG, "DDBB EMPTY")
            return listNetwork!!.map { hit ->
                databaseRepository.insertHit(hit.networkToEntity())
                hit.networkToDomain()
            }
        } else {
            Log.d(TAG, "NETWORK TO UI")
            listNetwork!!.map { databaseRepository.insertHit(it.networkToEntity()) }
            return listDDBB.map { it.entityToDomain() }
        }
    }

    suspend fun invokeOffLine(): List<Hit> {
        val listDDBB = databaseRepository.getAllHits()
        Log.d(TAG, "NETWORK OFF LINE")
        return listDDBB!!.map { it.entityToDomain() }
    }

}