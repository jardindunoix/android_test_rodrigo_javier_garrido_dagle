package cl.rodrigo_javier_garrido_dagle.mobile_test.domain.model

data class Hit(
    val highlightResult: HighlightResult,
    val tags: List<String>,
    val author: String,
    val commentText: String,
    val createdAt: String,
    val createdAtI: Int,
    val objectID: String,
    val parentId: Int,
    val storyId: Int,
    val storyTitle: String,
    val storyUrl: String,
    val updatedAt: String
)