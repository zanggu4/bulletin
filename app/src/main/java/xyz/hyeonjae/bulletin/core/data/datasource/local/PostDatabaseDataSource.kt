package xyz.hyeonjae.bulletin.core.data.datasource.local

import xyz.hyeonjae.bulletin.core.data.dto.local.PostLocalDto
import javax.inject.Inject

class PostDatabaseDataSource @Inject constructor(
    private val dao: PostLocalDao
) : PostLocalDataSource {

    override suspend fun getPosts(): List<PostLocalDto> {
        return dao.getPosts()
    }

    override suspend fun setPosts(posts: List<PostLocalDto>?) {
        dao.clearPosts()
        posts?.let { posts ->
            dao.insertPosts(posts)
        }
    }
}