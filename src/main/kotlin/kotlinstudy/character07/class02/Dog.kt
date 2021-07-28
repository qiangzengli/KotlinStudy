package zengqiang.kotlinstudy.character07.class02

/**
Time: 2020-03-19 上午12:19
Author:alan
Desc:
 */
class Dog {

    //这个方法的类型为   （）->Unit
    fun run() {
        println("${this}run()")
    }

    //这个方法的类型为    （food:Stirng）->Unit
    fun eat(food: String) {

        println("${this}eating${food}")

    }
}