package zengqiang.kotlinstudy.flow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 创建Flow 冷流 (无消费者不产生数据) 热流(无观察者也会产生数据)
/**
 * Notice:
 * 1 A builder function for Flow type is called flow
 * 2 Code inside the flow {... } builder block can suspend
 * 3 The simple function is no longer marked with suspend modifier
 * 4 Values are emitted from the flow using emit function
 * 5 Values are collected from the collect function
 */
/**
 * create flow
 * 1 flow{}
 * 2 flowOf
 *
 */


fun main() = runBlocking<Unit> {
//    sequencesSimple().forEach { println(it) }
//    coroutines 数据
//    coroutineSimple().forEach { println(it) }

//     flow
//    flowSimple().collect { value ->
//        println(value)
//    }
//
//    flow are cold
    println("Calling flowSimple function")
    val flow = flowSimple()
    println("Calling collect...")
    flow.collect { value ->
        println(value)
    }
    println("Calling collect...")
    flow.collect { value ->
        println(value)
    }

    flowOf(1,2,3,4).collect {
        println()
    }
}

fun simple(): List<Int> = listOf(1, 2, 3)
fun sequencesSimple(): Sequence<Int> = sequence {
    for (i in 1..3) {
        Thread.sleep(100) //pretend we are computing it
        yield(i) //yield next value
    }
}

suspend fun coroutineSimple(): List<Int> {
    delay(1000)
    return listOf(1, 2, 3)
}

fun flowSimple(): Flow<Int> = flow {
    println("flow started")
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

enum class Result {
    Loading,
    Complete,
}