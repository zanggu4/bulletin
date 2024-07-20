package xyz.hyeonjae.bulletin.core.data.dto.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.hyeonjae.bulletin.core.data.dto.PostDto.User

@Entity(tableName = "post")
data class PostLocalDto(
    @PrimaryKey val id: Int,
    val title: String,
    val content: String,
    val userId: Int?,
    val user: User?,
    val createdAt: String,
    val updatedAt: String?,
)
