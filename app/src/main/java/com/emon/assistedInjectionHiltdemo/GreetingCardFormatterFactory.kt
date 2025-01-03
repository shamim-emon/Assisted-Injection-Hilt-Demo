package com.emon.assistedInjectionHiltdemo

import dagger.assisted.AssistedFactory

@AssistedFactory
interface GreetingCardFormatterFactory {
    fun create(message: String, fontSize: Int): GreetingCardFormatter
}