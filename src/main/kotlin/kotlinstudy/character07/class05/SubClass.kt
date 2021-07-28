package zengqiang.kotlinstudy.character07.class05

/**
Time: 2020-03-24 下午5:24
Author:alan
Desc:
 */
class SubClass(name: String) : SuperClass(name + "hello") {

    init {

        //在初始化块中使用this. 属性  是使用成员变量   不使用this.   使用的是本类主构造器中的属性

        println(name)
        println(super.name)
        println(this.toString())
        println(super.toString())

    }

    fun hello() {


        println("-----------------------hello-----------------")
        println(this.name)
        println(super.name)
        println(this.toString())
        println(super.toString())

    }

}