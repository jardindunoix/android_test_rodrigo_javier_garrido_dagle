package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

data class UrlDto(
    val matchLevel: String,
    val matchedWords: List<Any>,
    val value: String
)