package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

data class CommentTextDto(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)