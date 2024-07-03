package xyz.hyeonjae.bulletin.core.data.repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.single
import xyz.hyeonjae.bulletin.core.data.dto.PostDto

interface PostRepository {
    fun getPosts(): Flow<List<PostDto>>

    fun getPost(id: Int): Flow<PostDto>
}
