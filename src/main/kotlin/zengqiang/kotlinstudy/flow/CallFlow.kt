package zengqiang.kotlinstudy.flow

/**
 * 1 onStart(在上游流开始之前被调用。 可以发出额外元素,也可以处理其他事情，比如发埋点)
 * 2 onCompletion(在流取消或者结束时调用。可以执行发送元素，发埋点等操作)
 * 3 onEach(在上游向下游发出元素前调用)
 * 4 onEmpty(当流完成却没有发出任何元素时回调。 可以用来兜底)
 * 5 onSubscription(SharedFlow 专属操作符，)
 *
 */
fun main() {

}
