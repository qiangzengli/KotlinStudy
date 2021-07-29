package zengqiang.kotlinstudy.character08.class08

/**
Time: 2020-03-25 上午10:19
Author:alan
Desc:
 */
class LazyProp {
    val lazyProp: String by lazy {

println("第一次执行")
        "疯狂软件"
    }

}