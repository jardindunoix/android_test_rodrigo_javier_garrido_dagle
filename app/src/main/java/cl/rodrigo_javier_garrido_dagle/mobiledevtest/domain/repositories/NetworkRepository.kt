package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto.HitDto

interface NetworkRepository {

   suspend fun getAllHits(): List<HitDto>?
}