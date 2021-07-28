package zengqiang.kotlinstudy.character07.class02

import zengqiang.kotlinstudy.character06.class04.a

/**
Time: 2020-03-19 上午12:16
Author:alan
Desc:
 */
fun main() {

//    var run: (Dog) -> Unit = Dog::run
//    var run = Dog::run
//
//
//    var d = Dog()
//    var d1 = Dog()
//
//    run(d)
//    run(d1)
//
//
//    var eat: (Dog, String) -> Unit = Dog::eat
//    
//    eat(d, "骨头")
//    eat(d1, "骨头")


//    var origin = Apple(3.5)
//
//    //使用add
//
//    val ap = origin add Apple(2.4)
//
//    println(ap)
//
//
//    val a=origin drop Apple(2.1)
//    println(a)


//    var (name, age, weight) = User("李增强", 20, 62.1F)
//
//    println(name)
//    println(age.toString())
//    println(weight.toString())
//
//
//    var (_, _, weight1) = User("人相亲", 20, 43.9F)
//
//    println(weight1)

//    var (_, sex, height) = DataClassTest("王二小")
////    println(name)
//    println(sex)
//    println(height)


    //在Lambda中使用解构
    

    val map = mapOf(Pair("name", "lizengqiang"), Pair("sex", "男"))
    map.mapValues { (_, value) -> println(value) }


}