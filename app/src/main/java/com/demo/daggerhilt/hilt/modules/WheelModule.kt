package com.demo.daggerhilt.hilt.modules

import com.demo.daggerhilt.model.Rim
import com.demo.daggerhilt.model.Tyre
import com.demo.daggerhilt.model.Wheel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object WheelModule {

    @Provides
    fun provideRim(): Rim {
        return Rim()
    }

    @Provides
    fun provideTyre(): Tyre {
        return Tyre()
    }

    @Provides
    fun provideWheel(rim: Rim, tyre: Tyre): Wheel {
        return Wheel(rim, tyre)
    }

}