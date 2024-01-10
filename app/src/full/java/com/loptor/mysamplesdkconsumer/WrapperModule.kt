package com.loptor.mysamplesdkconsumer

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class WrapperModule {

  @Binds
  abstract fun bindAnalyticsService(
    wrapper: FullLibraryWrapper
  ): Wrapper
}