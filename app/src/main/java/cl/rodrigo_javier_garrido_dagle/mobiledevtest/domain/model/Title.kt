package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class Title(
    val fullyHighlighted: Boolean,
    val matchLevel: String,
    val matchedWords: List<String>,
    val value: String
)