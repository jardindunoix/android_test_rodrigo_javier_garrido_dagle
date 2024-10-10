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
            databaseRepository.insertAllHits(listNetwork!!.map { it.networkToEntity() })
            return listNetwork.map { it.networkToDomain() }
        } else {
            databaseRepository.insertAllHits(listNetwork!!.map { it.networkToEntity() })
            return listDDBB.map { it.entityToDomain() }
        }
    }

    suspend fun invokeOffLine(): List<Hit> {
        val listDDBB = databaseRepository.getAllHits()
        Log.d(TAG, "NETWORK OFF LINE")
        return listDDBB!!.map { it.entityToDomain() }
    }

}