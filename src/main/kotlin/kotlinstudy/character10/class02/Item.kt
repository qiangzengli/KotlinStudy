package zengqiang.kotlinstudy.character10.class02

/**
Time: 2020-03-25 下午6:31
Author:alan
Desc:
 */
class Item<in T> {

    fun foo(t: T) {
        println(t)

    }


}