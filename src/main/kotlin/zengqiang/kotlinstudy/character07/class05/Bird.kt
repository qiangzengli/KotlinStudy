package zengqiang.kotlinstudy.character07.class05

/**
Time: 2020-03-24 下午10:53
Author:alan
Desc:
 */
open class Bird {
    //可重写的属性
     protected open var weight: Double = 40.0

    //飞翔方法
    open fun fly() {

        println("我在天空飞行飞翔")
        println(weight)
    }

    private fun eat() {
        println("我在天上吃东西")
    }
}