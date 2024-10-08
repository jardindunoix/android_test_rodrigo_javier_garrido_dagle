package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

import com.google.gson.annotations.SerializedName

data class CommentTextDto(
   @SerializedName("fullyHighlighted")
   val fullyHighlighted: Boolean,
   @SerializedName("matchLevel")
   val matchLevel: String,
   @SerializedName("matchedWords")
   val matchedWords: List<String>,
   @SerializedName("value")
   val value: String
)