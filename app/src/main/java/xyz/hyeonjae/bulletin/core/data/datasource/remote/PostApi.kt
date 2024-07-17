package xyz.hyeonjae.bulletin.core.data.datasource.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import xyz.hyeonjae.bulletin.core.data.dto.Never
import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.core.data.dto.ResponseDto

interface PostApi {
    @GET("posts")
    suspend fun getPosts(@Query("lastId") lastId: Int?): Response<ResponseDto<List<PostDto>, Never>>

    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id: Int): Response<ResponseDto<PostDto, Never>>
}