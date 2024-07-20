package xyz.hyeonjae.bulletin.core.data.datasource.local

import xyz.hyeonjae.bulletin.core.data.dto.local.PostLocalDto

interface PostLocalDataSource {
    suspend fun getPosts(): List<PostLocalDto>

    suspend fun setPosts(posts: List<PostLocalDto>?)
}