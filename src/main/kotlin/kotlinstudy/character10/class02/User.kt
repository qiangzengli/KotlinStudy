package zengqiang.kotlinstudy.character10.class02

/**
Time: 2020-03-25 下午6:22
Author:alan
Desc:
 */
class User<out T> constructor(val info: T) {

    //此处不能用var  否则就有setter 方法
    //setter 方法会导致T出现在方法形参中
//    val info: T
//
//    constructor(info: T) {
//        this.info = info
//    }

    fun test(): T {

        println("执行test方法")
        return info
    }


}