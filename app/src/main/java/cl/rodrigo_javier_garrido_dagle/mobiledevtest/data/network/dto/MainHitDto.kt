package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

data class MainHitDto(
    val exhaustive: ExhaustiveDto,
    val exhaustiveNbHits: Boolean,
    val exhaustiveTypo: Boolean,
    val hits: List<HitDto>,
    val hitsPerPage: Int,
    val nbHits: Int,
    val nbPages: Int,
    val page: Int,
    val params: String,
    val processingTimeMS: Int,
    val processingTimingsMS: ProcessingTimingsMSDto,
    val query: String,
    val serverTimeMS: Int
)