package zengqiang.kotlinstudy.character07.class05

/**
 * Time: 2020-03-24 下午5:25
 * Author:alan
 * Desc:
 */
open class SuperClass(var name: String) {
    init {

        //在初始化块中使用this. 属性  是使用成员变量   不使用this.   使用的是本类主构造器中的属性
        println("-------------superclass---------------")
        println(name)
        println(this.name)
        println(this.toString())
        println(super.toString())

    }

    constructor() : this("你好")


}