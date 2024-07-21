package xyz.hyeonjae.bulletin.feature.posts.domain.repository

import kotlinx.coroutines.flow.Flow
import xyz.hyeonjae.bulletin.core.data.datasource.local.PostLocalDataSource
import xyz.hyeonjae.bulletin.core.data.datasource.remote.PostRemoteDataSource
import xyz.hyeonjae.bulletin.core.data.dto.PostDto
import xyz.hyeonjae.bulletin.feature.domain.posts.repository.PostsRepository
import javax.inject.Inject

class DefaultPostsRepository @Inject constructor(
    private val local: PostLocalDataSource,
    private val remote: PostRemoteDataSource,
): PostsRepository {

    override fun getPosts(lastIndex: Int?): Flow<List<PostDto>> {
        TODO("Not yet implemented")
    }
}