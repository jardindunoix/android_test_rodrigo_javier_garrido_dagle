package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class MainHit(
    val exhaustive: Exhaustive,
    val exhaustiveNbHits: Boolean,
    val exhaustiveTypo: Boolean,
    val hits: List<Hit>,
    val hitsPerPage: Int,
    val nbHits: Int,
    val nbPages: Int,
    val page: Int,
    val params: String,
    val processingTimeMS: Int,
    val processingTimingsMS: ProcessingTimingsMS,
    val query: String,
    val serverTimeMS: Int
)