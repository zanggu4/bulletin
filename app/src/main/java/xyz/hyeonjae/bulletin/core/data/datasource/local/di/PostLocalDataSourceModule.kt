package xyz.hyeonjae.bulletin.core.data.datasource.local.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import xyz.hyeonjae.bulletin.core.data.datasource.local.PostDatabaseDataSource
import xyz.hyeonjae.bulletin.core.data.datasource.local.PostLocalDataSource

@Module
@InstallIn(ActivityComponent::class)
abstract class PostLocalDataSourceModule {

    @Binds
    abstract fun bindLocalDataSource(
        dataSource: PostDatabaseDataSource
    ): PostLocalDataSource
}