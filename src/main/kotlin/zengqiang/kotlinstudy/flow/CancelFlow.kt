package zengqiang.kotlinstudy.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

// 协程取消
fun main() = runBlocking<Unit> {
    withTimeoutOrNull(250) {
        simpleByFlow().collect { value ->
            println(value)
        }
    }
    println("Done")
}

fun simpleByFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100L)
        println("Emitting $i")
        emit(i)
    }
}