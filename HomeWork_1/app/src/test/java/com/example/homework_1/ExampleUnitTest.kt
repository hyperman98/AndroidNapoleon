package com.example.homework_1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val listOfDevelopers = listOf<DataClasses>(
        DataClasses("Nikolas", 22, 5),
        DataClasses("Artyom", 21, 7),
        DataClasses("Kirill", 20, 8),
        DataClasses("Maxim", 19, 9)
    )

    fun List<DataClasses>.sort():List<DataClasses> {
        return this.sortedBy { it.skillRating }
    }
    @Test
    fun addition_isCorrect() {
        println(listOfDevelopers.sort())
    }
}