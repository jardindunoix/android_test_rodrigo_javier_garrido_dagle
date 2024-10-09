package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.dto

data class ProcessingTimingsMSDto(
    val _request: RequestDto,
    val afterFetch: AfterFetchDto,
    val fetch: FetchDto,
    val getIdx: GetIdxDto,
    val total: Int
)