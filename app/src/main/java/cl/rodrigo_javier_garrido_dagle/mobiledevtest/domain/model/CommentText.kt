package cl.rodrigo_javier_garrido_dagle.mobile_test.domain.model

data class CommentText(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)