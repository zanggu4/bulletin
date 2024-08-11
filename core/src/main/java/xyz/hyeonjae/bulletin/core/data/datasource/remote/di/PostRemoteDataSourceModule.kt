package xyz.hyeonjae.bulletin.core.data.datasource.remote.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import xyz.hyeonjae.bulletin.core.data.datasource.remote.PostApiDataSource
import xyz.hyeonjae.bulletin.core.data.datasource.remote.PostRemoteDataSource

@Module
@InstallIn(ActivityComponent::class)
abstract class PostRemoteDataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(
        dataSource: PostApiDataSource
    ): PostRemoteDataSource
}