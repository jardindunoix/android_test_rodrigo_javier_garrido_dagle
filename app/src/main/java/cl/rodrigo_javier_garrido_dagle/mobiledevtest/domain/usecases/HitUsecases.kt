package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.entityToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.DatabaseRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class HitUsecases @Inject constructor(
    private val networkRepository: NetworkRepositoryImpl,
    private val databaseRepository: DatabaseRepositoryImpl
) {
    suspend operator fun invoke() =
        databaseRepository
            .getAllHits()
            ?.map { hit ->
                Log.d(TAG, "DATABASE RESPONSE: ")

                hit.entityToDomain()
            }
            ?.ifEmpty {
                networkRepository
                    .getAllHits()
                    ?.map { hit ->
                        Log.d(TAG, "NETWORK RESPONSE: ")

                        hit.networkToDomain()
                    }
            }
}