package com.example.napoleonitapp

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun start() {

        val eventDataClass1 = EventDataClass("Человек-паук", "22.05", "300")
        val eventDataClass2 = EventDataClass("Звездные войны", "24.04", "400")
        val eventDataClass3 = EventDataClass("Крик", "10.01", "350")
        val eventDataClass4 = EventDataClass("Бой с тенью", "01.01", "500")
        val eventDataClass5 = EventDataClass("Боец", "15.10", "600")
        var eventCollection = mutableListOf<EventDataClass>(
            eventDataClass1,
            eventDataClass2,
            eventDataClass3,
            eventDataClass4,
            eventDataClass5
        )
        eventCollection.sort(1)
        println("Сортировка по фильму: ")
        println()

        for (i in 0..4){
            println("Фильм: " + eventCollection[i].film + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].price)
        }

        println()
        eventCollection = eventCollection.sort(2).toMutableList()
        println("Сортировка по дате: ")
        println()

        for (i in 0..4){
            println("Фильм: " + eventCollection[i].film + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].price)
        }

        println()
        eventCollection = eventCollection.sort(3).toMutableList()
        println("Сортировка по цена: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].film + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].price)
        }

    }

    fun MutableList<EventDataClass>.sort(type: Int): MutableList<EventDataClass> {


        when (type) {
            1 -> this.sortBy { it.film }
            2 ->  this.sortBy { it.date }
            3 ->  this.sortBy { it.price }
        }
        return this;
    }
}