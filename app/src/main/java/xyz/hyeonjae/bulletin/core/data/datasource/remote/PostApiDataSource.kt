package xyz.hyeonjae.bulletin.core.data.datasource.remote

import dagger.hilt.android.AndroidEntryPoint
import xyz.hyeonjae.bulletin.core.data.dto.Never
import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto.ResponseError
import javax.inject.Inject

class PostApiDataSource @Inject constructor(private val postApi: PostApi) : PostRemoteDataSource {
    override suspend fun getPosts(lastId: Int?): ResponseDto<List<PostDto>, Never> {
        val response = postApi.getPosts(lastId)
        return response.body()
            ?: ResponseDto(
                status = "failure",
                message = "app error",
                error = ResponseError("APP_ERROR", null)
            )
    }

    override suspend fun getPost(id: Int): ResponseDto<PostDto, Never> {
        val response = postApi.getPost(id)
        return response.body()
            ?: ResponseDto(
                status = "failure",
                message = "app error",
                error = ResponseError("APP_ERROR", null)
            )
    }
}