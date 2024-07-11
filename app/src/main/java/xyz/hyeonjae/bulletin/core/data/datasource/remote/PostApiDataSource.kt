package xyz.hyeonjae.bulletin.core.data.datasource.remote

import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto

class PostApiDataSource: PostRemoteDataSource {
    override suspend fun getPosts(lastId: Int?): ResponseDto<List<PostDto>, Void> {
        TODO("Not yet implemented")
    }

    override suspend fun getPost(id: Int): ResponseDto<PostDto, Void> {
        TODO("Not yet implemented")
    }
}