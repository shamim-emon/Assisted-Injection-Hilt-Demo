package com.emon.assistedInjectionHiltdemo

import javax.inject.Inject

interface FontProvider {
    fun getFont(): String
}

class FontProviderImpl @Inject constructor(): FontProvider {
    override fun getFont(): String {
        return "Sans-serif"
    }
}