package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto.HitDto
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.URL_ENDPOINT
import retrofit2.http.GET

interface ApiCalls {

   @GET(URL_ENDPOINT)
   suspend fun getAllHit(): List<HitDto>

}