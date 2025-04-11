package com.motawebdev.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//class CounterViewModel(private val repository: CounterRepository): ViewModel() {
class CounterViewModel(): ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
//    private val _count = mutableStateOf(0)
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose _count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }

}