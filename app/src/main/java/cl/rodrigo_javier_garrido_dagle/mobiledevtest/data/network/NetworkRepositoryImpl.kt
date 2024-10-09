package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
   private val apiCalls: ApiCalls
) : NetworkRepository {

   override suspend fun getAllHits() { // : List<HitDto> {
      runCatching { apiCalls.getAllHit() }
         .onSuccess {

            it.body()?.hits?.map { hit ->
               val title = if (hit.title != null) hit.title else hit.storyTitle
               val storyUrl = if (hit.storyUrl != null) hit.storyUrl else "no url"
               val commentText = if (hit.commentText != null) hit.commentText else "no comment"

               Log.d(
                  TAG,
//                  "${hit.author}"
                  "${hit.createdAt} // $commentText"
//                  "${hit.created_at}"
//                  "${hit.created_at}"
               )

            }

         }
         .onFailure {
            Log.d(
               TAG,
               "There is an error in the api call::> ${it.message}"
            )
         }
//      return null
   }

}