package com.emon.assistedInjectionHiltdemo

import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class GreetingCardFormatter @AssistedInject constructor(
    private val fontProvider: FontProvider,
    @Assisted private val message: String,
    @Assisted private val fontSize: Int
) {
    fun format(): String {
        return "Message: $message, Font: ${fontProvider.getFont()}, Size: $fontSize"
    }
}