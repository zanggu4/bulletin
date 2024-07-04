package xyz.hyeonjae.bulletin.feature.domain.posts.repository

import kotlinx.coroutines.flow.Flow
import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostsRepository {
    fun getPosts(lastIndex: Int?): Flow<List<PostDto>>
}