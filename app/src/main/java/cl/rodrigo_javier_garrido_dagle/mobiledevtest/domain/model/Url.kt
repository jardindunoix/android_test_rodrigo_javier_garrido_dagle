package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class Url(
    val matchLevel: String,
    val matchedWords: List<Any>,
    val value: String
)