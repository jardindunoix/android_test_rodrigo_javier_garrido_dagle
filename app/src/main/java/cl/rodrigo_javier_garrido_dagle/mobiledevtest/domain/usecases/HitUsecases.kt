package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.usecases

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.mappers.networkToDomain
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepositoryImpl
import javax.inject.Inject

class HitUsecases @Inject constructor(
    private val networkRepository: NetworkRepositoryImpl,
) {
    suspend operator fun invoke() = networkRepository
        .getAllHits()
        ?.map { hit ->
            hit.networkToDomain()
        }
}