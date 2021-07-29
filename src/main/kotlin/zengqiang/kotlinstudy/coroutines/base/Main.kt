package zengqiang.kotlinstudy.coroutines.base

import kotlinx.coroutines.*

// first Coroutines
/***
 *
 * A coroutine is an instance of suspendable computation. It is conceptually similar to a thread, in the sense that it takes a block of code to run that works concurrently with the rest of the code. However, a coroutine is not bound to any particular thread. It may suspend its execution in one thread and resume in another one.
 * Coroutines can be thought of as light-weight threads, but there is a number of important differences that make their real-life usage very different from threads.
 * Run the following code to get to your first working coroutine:
 */
fun main()= runBlocking {
    repeat(100_000){
        launch {
            delay(5000L)
            print(".")
        }
    }
}
//fun main() = runBlocking {
//    val job = launch { // launch a new coroutine and keep a reference to its Job
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello")
//
//    job.join() // wait until child coroutine completes
//    println("Done")
//}

suspend fun doWorld() = coroutineScope {
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")

    }
    println("Hello")
}