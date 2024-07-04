package xyz.hyeonjae.bulletin.core.data.datastore.remote

import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostRemoteDataStore {
    suspend fun getPosts(lastId: Int?): List<PostDto>

    suspend fun getPost(id: Int): PostDto?
}