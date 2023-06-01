package com.demo.daggerhilt.hilt.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DieselEngineModule {

    @Provides
    fun provideHorsePower(): Int {
        return 138
    }

}