package zengqiang.kotlinstudy.character07.class04

/**
 * Time: 2020-03-24 上午3:09
 * Author:alan
 * Desc:
 */
class Person constructor(name: String) {

    init {

        val a = 56
        if (a > 5) {
            println("局部变量a大于5")
            println("Person的第一个初始化快")
            println("得到的名字$name")
        }
    }

    init {
        println("第二个初始化块")

    }


}