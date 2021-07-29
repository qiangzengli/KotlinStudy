package zengqiang.kotlinstudy.flow

/**
 * 1 map 值转换
 * 2 mapLatest 类比collectLatest 新值发送，上个变换未完成就取消变换
 * 3 mapNotNull 仅发送map后不为null的数据
 * 4 transform 区别于map  ,transform接收者FlowCollector ，非常灵活，可以变换，跳过或多次发送
 * 5 transformLatest 有新值时上一个转换会取消掉
 * 6 transformWhile 如果lambda false 终止转换 true 继续转换
 * 7 asStateFlow (将 MutableStateFlow 转换为 StateFlow ，就是变成不可变的。常用在对外暴露属性时使用)
 * 8 asSharedFlow(将 MutableSharedFlow 转换为 SharedFlow ，就是变成不可变的。常用在对外暴露属性时使用)
 * 9 receiveAsFlow(将Channel 转换为Flow 可以有多个观察者，但不是多播，可能轮流获取到值)
 * 10 consumeAsFlow(将Channel 转换为Flow 不能多个观察者（crash）)
 * 11 withIndex(结果包装成IndexedValue)
 * 12 scan(和fold类似,fold 返回最终结果，scan返回flow ，会把初始值和每步的操作结果发送出去)
 * 13 produceIn(转换为 ReceiveChannel (Channel有ReceiveChannel  和 SendChannel))
 * 14 runningFold(区别fold ，返回新流)
 * 15 runningReduce(区别reduce，返回新流)
 * 16 shareIn
 * 17 stateIn
 */