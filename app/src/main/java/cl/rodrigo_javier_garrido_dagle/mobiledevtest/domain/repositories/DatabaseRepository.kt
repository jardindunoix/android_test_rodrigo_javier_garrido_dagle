package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.entities.HitEntity

interface DatabaseRepository {

    suspend fun getAllHits(): List<HitEntity>?
}