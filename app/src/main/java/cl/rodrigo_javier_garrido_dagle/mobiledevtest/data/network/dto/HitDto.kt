package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

import com.google.gson.annotations.SerializedName

data class HitDto(
   @SerializedName("_highlightResult")
   val highlightResult: HighlightResultDto,
   @SerializedName("_tags")
   val tags: List<String>,
   @SerializedName("author")
   val author: String,
   @SerializedName("comment_text")
   val commentText: String,
   @SerializedName("created_at")
   val createdAt: String,
   @SerializedName("created_at_i")
   val createdAtI: Int,
   @SerializedName("objectID")
   val objectID: String,
   @SerializedName("parent_id")
   val parentId: Int,
   @SerializedName("story_id")
   val storyId: Int,
   @SerializedName("story_title")
   val storyTitle: String,
   @SerializedName("story_url")
   val storyUrl: String,
   @SerializedName("updated_at")
   val updatedAt: String
)