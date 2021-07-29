package zengqiang.kotlinstudy.flow

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/**
 * create flow
 *
 * first flow{}
 * second flowOf()
 * third asFlow()
 * forth callbackFlow()
 * fifth emptyFlow()
 * sixth channelFlow()
 *
 *
 */
fun main() = runBlocking {
//    val flowFirst = flow {
//        emit(1)
//        emit(2)
//        emit(3)
//    }
//    flowFirst.collect {
//        println(it)
//    }
//    val flowSecond = flowOf(1, 2, 3, 4)
//    flowSecond.collect {
//        println(it)
//    }
//    (1..6).asFlow().collect { println(it);
    (1..10).asFlow()
        //filter 是过滤出符合条件的数据
        .filter { it < 5 }
        //转换数据类型
        .map { "num:$it" }
        .collect {
            println(it)
        }
}