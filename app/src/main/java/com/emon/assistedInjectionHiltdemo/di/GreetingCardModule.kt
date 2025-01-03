package com.emon.assistedInjectionHiltdemo.di

import com.emon.assistedInjectionHiltdemo.FontProvider
import com.emon.assistedInjectionHiltdemo.FontProviderImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface GreetingCardModule {
    @Binds
    fun bindFontProvider(provider: FontProviderImpl) : FontProvider
}