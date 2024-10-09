package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

interface NetworkRepository {

   suspend fun getAllHits() //: List<HitDto>
}