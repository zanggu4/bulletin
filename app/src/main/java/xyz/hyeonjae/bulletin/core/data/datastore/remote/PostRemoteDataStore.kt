package xyz.hyeonjae.bulletin.core.data.datastore.remote

import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostRemoteDataStore {
    suspend fun getPosts(): List<PostDto>

    suspend fun getPost(id: Int): PostDto?
}