package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto.MainHitDto
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.URL_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface ApiCalls {

   @GET(URL_ENDPOINT)
   suspend fun getAllHit(): Response<MainHitDto>

}