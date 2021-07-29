package zengqiang.kotlinstudy.flow

import kotlinx.coroutines.runBlocking

/**
 * 1 collect
 * 2 collectIndexed
 * 3 collectLatest(只收集最新的值)
 * 4 toCollection(结果添加到集合)
 * 5 toList(转换为List)
 * 6 toSet()
 * 7 launchIn(直接触发流的执行，不设置action,入参为coroutineScope 一般不会直接调用，会搭配别的操作符一起使用，如onEach,onCompletion 。返回值是Job)
 * 8 last(返回最后一个值,非空安全)
 * 9 lastOrNull(空安全)
 * 10 first(返回第一个值，非空安全)
 * 11 firstOrNull(空安全)
 * 12 single(接收第一个值，如果为空或者不是一个值报错)
 * 13 singleOrNull(空安全)
 * 14 count(发送值的个数，sharedFlow无意义)
 * 15 fold (从初始值开始 执行遍历,并将结果作为下个执行的 参数)
 * 16 reduce(fold 类似，无初始值)
 * 17
 *
 */


fun main() = runBlocking {


}