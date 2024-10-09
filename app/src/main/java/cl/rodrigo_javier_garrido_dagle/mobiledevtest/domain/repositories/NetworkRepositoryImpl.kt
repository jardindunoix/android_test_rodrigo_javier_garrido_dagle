package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories

import android.util.Log
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.ApiCalls
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto.HitDto
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.TAG
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
   private val apiCalls: ApiCalls
) : NetworkRepository {

   override suspend fun getAllHits(): List<HitDto>? {
      runCatching { apiCalls.getAllHit() }
         .onSuccess {

            return it.body()?.hits?.map { hit ->
               hit
//               val author = hit.author
//               val title = if (hit.title != null) hit.title else hit.storyTitle
//               val storyLink = if (hit.storyUrl != null) hit.storyUrl else "no link"
//               val storyText = if (hit.storyText != null) hit.storyText else hit.commentText
//               val createdAtId = hit.createdAtI
//               val storyDate = if (hit.updatedAt != null) hit.updatedAt else hit.createdAt
//
//               Log.d(
//                  TAG,
//                  "$createdAtId  -- $storyText"
//               )

            }

         }
         .onFailure {
            Log.d(
               TAG,
               "There is an error in the api call::> ${it.message}"
            )
         }
      return null
   }

}