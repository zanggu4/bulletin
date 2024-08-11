package xyz.hyeonjae.bulletin.core.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import xyz.hyeonjae.bulletin.core.data.dto.local.PostLocalDto

@Dao
interface PostLocalDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPosts(vararg posts: PostLocalDto)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPosts(posts: List<PostLocalDto>)

    @Query("SELECT * FROM post ORDER BY id DESC")
    fun getPosts(): List<PostLocalDto>

    @Query("DELETE FROM post")
    fun clearPosts()
}
