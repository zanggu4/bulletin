package xyz.hyeonjae.bulletin.core.data.datasource.local

import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostLocalDataSource {
    suspend fun getPosts(): List<PostDto>

    suspend fun setPosts(posts: List<PostDto>?)

    suspend fun getPost(id: Int): PostDto?
}