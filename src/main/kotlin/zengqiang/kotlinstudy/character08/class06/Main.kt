package zengqiang.kotlinstudy.character08.class06

import zengqiang.kotlinstudy.character08.class04.Outputable

/**
Time: 2020-03-25 上午2:59
Author:alan
Desc:
 */
fun main() {


    var ob1 = object : Outputable {


        override fun test() {

        }


    }


    var ob2 = object {
        //初始化块
        init {
            println("初始化块")
        }


        //只能包含内部类，不能包含嵌套类
        inner class A {
            fun hello() {
                println("hello A")
            }

        }
    }

//    ob2.A().hello()



//    ObjectDemo.name


    //使用伴生对象的类 调用伴生对象的方法


//    MyClass.test()

    println(MyClass.name)
    println(MyClass.hello())
    println(MyClass.age)

//    println(MyClass.MyObject1.test())

    //
//    println(MyClass.Companion.test())


}

//伴生对象扩展方法
fun MyClass.Companion.hello() {
    println("为伴生对象扩展的方法")
}

val MyClass.Companion.age
    get() = "为伴生对象扩展的属性"