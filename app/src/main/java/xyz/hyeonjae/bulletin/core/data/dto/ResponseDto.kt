package xyz.hyeonjae.bulletin.core.data.dto

data class ResponseDto<DataType, ErrorDetailType>(
    val status: String,
    val message: String,
    val data: DataType?,
    val error: ResponseError<ErrorDetailType>?,
) {
    data class ResponseError<T>(
        val code: String,
        val details: T?
    )
}