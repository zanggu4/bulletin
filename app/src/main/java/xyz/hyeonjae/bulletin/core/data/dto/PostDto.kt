package xyz.hyeonjae.bulletin.core.data.dto

data class PostDto(
    val id: Int,
    val title: String,
    val content: String,
    val userId: Int?,
    val user: User?,
    val createAt: String,
    val updatedAt: String?,
) {
    data class User(
        val username: String,
        val profile: UserProfile
    )

    data class UserProfile(
        val name: String
    )
}
