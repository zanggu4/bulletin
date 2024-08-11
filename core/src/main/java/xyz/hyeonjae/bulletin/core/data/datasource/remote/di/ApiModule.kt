package xyz.hyeonjae.bulletin.core.data.datasource.remote.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import xyz.hyeonjae.bulletin.core.data.datasource.remote.PostApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {
    @Provides
    fun providePostApi(
        retrofit: Retrofit
    ): PostApi =
        retrofit.create(PostApi::class.java)
}