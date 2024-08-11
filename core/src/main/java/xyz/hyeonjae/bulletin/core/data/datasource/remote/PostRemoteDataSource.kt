package xyz.hyeonjae.bulletin.core.data.datasource.remote

import xyz.hyeonjae.bulletin.core.data.dto.Never
import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto

interface PostRemoteDataSource {
    suspend fun getPosts(lastId: Int?): ResponseDto<List<PostDto>, Never>

    suspend fun getPost(id: Int): ResponseDto<PostDto, Never>
}
