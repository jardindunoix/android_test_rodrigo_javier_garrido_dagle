package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class HighlightResult(
   val author: Author,
   val commentText: CommentText,
   val storyTitle: StoryTitle,
   val storyUrl: StoryUrl
)