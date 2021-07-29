package zengqiang.kotlinstudy.coroutines.base

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// first Coroutines
/***
 *
 * A coroutine is an instance of suspendable computation. It is conceptually similar to a thread, in the sense that it takes a block of code to run that works concurrently with the rest of the code. However, a coroutine is not bound to any particular thread. It may suspend its execution in one thread and resume in another one.
 * Coroutines can be thought of as light-weight threads, but there is a number of important differences that make their real-life usage very different from threads.
 * Run the following code to get to your first working coroutine:
 */
fun main() = runBlocking {//this: CoroutineScope()
    val job = launch {
        doWorld()
    }
    println("Hello")
}

suspend fun doWorld() {
    delay(1000L)
    println("World")

}