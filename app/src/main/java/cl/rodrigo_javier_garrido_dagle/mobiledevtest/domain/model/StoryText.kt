package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class StoryText(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)