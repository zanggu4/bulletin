package xyz.hyeonjae.bulletin.core.data.dto

data class ResponseDto<DataType, ErrorDetailType>(
    val status: String,
    val message: String,
    val data: DataType? = null,
    val error: ResponseError<ErrorDetailType>? = null,
) {
    data class ResponseError<T>(
        val code: String,
        val details: T?
    )
}