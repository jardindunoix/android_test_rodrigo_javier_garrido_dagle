package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model.Hit

interface NetworkRepository {

   suspend fun getAllHits(): List<Hit>?
}