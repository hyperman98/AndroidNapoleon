package com.example.napoleonitapp

import com.example.napoleonitapp.data.Event
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun start() {

        val eventDataClass1 = Event("Человек-паук", "02.02", 200)
        val eventDataClass2 = Event("Боец", "03.03", 400)
        val eventDataClass3 = Event("Звездные войны", "07.07", 600)
        val eventDataClass4 = Event("Жизнь", "04.04", 250)
        val eventDataClass5 = Event("Технология", "05.06", 350)
        var eventCollection = mutableListOf<Event>(
            eventDataClass1,
            eventDataClass2,
            eventDataClass3,
            eventDataClass4,
            eventDataClass5
        )
        eventCollection.sort(1)
        println("Сортировка по названию: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Цена билета: "+ eventCollection[i].price)
        }

        println()
        eventCollection = eventCollection.sort(2).toMutableList()
        println("Сортировка по дате: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Цена билета: "+ eventCollection[i].price)
        }

        println()
        eventCollection = eventCollection.sort(3).toMutableList()
        println("Сортировка по цене билета: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Цена билета: "+ eventCollection[i].price)
        }

    }

    fun MutableList<Event>.sort(type: Int): MutableList<Event> {


        when (type) {
            1 -> this.sortBy { it.name }
            2 ->  this.sortBy { it.date }
            3 ->  this.sortBy { it.price }
        }
        return this;
    }
}