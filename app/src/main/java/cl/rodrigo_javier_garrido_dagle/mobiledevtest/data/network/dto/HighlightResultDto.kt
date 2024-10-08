package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

import com.google.gson.annotations.SerializedName

data class HighlightResultDto(
   @SerializedName("author")
   val author: AuthorDto,
   @SerializedName("comment_text")
   val commentText: CommentTextDto,
   @SerializedName("story_title")
   val storyTitle: StoryTitleDto,
   @SerializedName("story_url")
   val storyUrl: StoryUrlDto
)