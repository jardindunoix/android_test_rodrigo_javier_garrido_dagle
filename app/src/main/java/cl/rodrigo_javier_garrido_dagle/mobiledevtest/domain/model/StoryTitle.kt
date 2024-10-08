package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class StoryTitle(
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)