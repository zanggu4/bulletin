package xyz.hyeonjae.bulletin.core.data.dto

data class PostDto(
    val id: Int,
    val userId: Int?,
    val title: String,
    val content: String,
    val createAt: String,
    val updatedAt: String?,
)
