package com.motawebdev.countermvvm

data class CounterModel(var count: Int)

class CounterRepository {
    private var counter = CounterModel(0)

    fun getCounter(): CounterModel {
        return counter
    }

    fun increment() {
        counter.count++
    }

    fun decrement() {
        counter.count--
    }
}
