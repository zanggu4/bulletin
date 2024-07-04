package xyz.hyeonjae.bulletin.core.data.datastore.local

import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostLocalDataStore {
    suspend fun getPosts(): List<PostDto>

    suspend fun getPost(id: Int): PostDto?
}