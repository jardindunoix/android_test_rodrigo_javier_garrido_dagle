package cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.model

data class ProcessingTimingsMS(
    val _request: Request,
    val afterFetch: AfterFetch,
    val fetch: Fetch,
    val getIdx: GetIdx,
    val total: Int
)