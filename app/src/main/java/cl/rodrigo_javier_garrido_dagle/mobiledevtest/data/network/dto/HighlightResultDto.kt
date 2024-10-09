package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

data class HighlightResultDto(
    val author: AuthorDto,
    val comment_text: CommentTextDto,
    val story_text: StoryTextDto,
    val story_title: StoryTitleDto,
    val story_url: StoryUrlDto,
    val title: TitleDto,
    val url: UrlDto
)