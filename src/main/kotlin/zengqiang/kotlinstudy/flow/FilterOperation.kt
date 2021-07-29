package zengqiang.kotlinstudy.flow

/**
 * 1 filter(筛选符合条件的值)
 * 2 filterInstance(筛选对应类型的值)
 * 3 filterNot(filter取反)
 * 4 filterNotNull(筛选不为空的值)
 * 5 drop(入参count为int ，丢弃掉前n个值)
 * 6 dropWhile(找到第一个不满足条件的，返回其和其后的值)
 * 7 take(返回前n个元素)
 * 8 takeWhile(找到第一个不满足条件的项，但是取其之前的值，和dropWhile相反)
 * 9 debounce(防抖节流，指定时间内的值只接收最新的，其他的过滤掉.搜索联想场景适用)
 * 10 sample(给定时间周期,仅获取周期内最新发出的值)
 * 11 distinctUntilChangedBy(去重操作，判断连续的两个值是否重复，可以选择丢弃重复值)
 * 12 distinctUntilChanged(distinctUntilChangedBy简化调用，连续值一样，跳过发送)
 * 13 combine(组合每个流最新发出的值)
 * 14 combineTransform(combine+transform)
 * 15 merge(多个流合并)
 * 16 flattenConcat(以顺序方式将给定的流展开为单个流 ，是Flow<Flow<T>>的扩展函数)
 * 17 flattenMerge(作用和 flattenConcat 一样，但是可以设置并发收集流的数量。)
 *
 * 18
 */