package zengqiang.kotlinstudy.character10.class03

/**
Time: 2020-03-26 上午1:07
Author:alan
Desc:
 */
//为T指定多个上限
class Apple<T> where T : Comparable<T>, T : Cloneable {


    //为函数中的泛型制定多个上限
    fun <T> cloneWhenGreater(list: List<T>, threshold: T)
            where T : Comparable<T>, T : Cloneable {


    }

}