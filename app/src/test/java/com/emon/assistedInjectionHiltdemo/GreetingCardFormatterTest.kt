package com.emon.assistedInjectionHiltdemo

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class GreetingCardFormatterTest {
    @Test
    fun `test GreetingCardFormatter`() {
        val mockFontProvider = mock(FontProvider::class.java)
        `when`(mockFontProvider.getFont()).thenReturn("MockFont")

        val formatter = GreetingCardFormatter(mockFontProvider, "Test Message", 16)
        val result = formatter.format()

        assertEquals("Message: Test Message, Font: MockFont, Size: 16", result)
    }
}