package com.emon.assistedInjectionHiltdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var greetingCardFormatterFactory: GreetingCardFormatterFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val message = "Happy Birthday!"
        val fontSize = 18

        val formatter = greetingCardFormatterFactory.create(message, fontSize)
        println(formatter.format()) // Prints: Message: Happy Birthday!, Font: Sans-serif, Size: 18
    }
}