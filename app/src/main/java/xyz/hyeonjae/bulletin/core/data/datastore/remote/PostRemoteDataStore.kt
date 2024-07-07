package xyz.hyeonjae.bulletin.core.data.datastore.remote

import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto

interface PostRemoteDataStore {
    suspend fun getPosts(lastId: Int?): ResponseDto<List<PostDto>, Void>

    suspend fun getPost(id: Int): ResponseDto<PostDto, Void>
}