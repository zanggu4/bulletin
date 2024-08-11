package xyz.hyeonjae.bulletin.core.data.dto.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "post")
data class PostLocalDto(
    @PrimaryKey val id: Int,
    val title: String,
    val content: String,
    val userId: Int?,
    val username: String?,
    val name: String?,
    val createdAt: String,
    val updatedAt: String?
)