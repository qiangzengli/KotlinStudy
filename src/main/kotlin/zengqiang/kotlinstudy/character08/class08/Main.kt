package zengqiang.kotlinstudy.character08.class08

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
Time: 2020-03-25 上午4:19
Author:alan
Desc:
 */


//延迟属性
val lazyProp: String by lazy {

    println("第一次执行")
    "疯狂软件"
}


//属性监听

//var prop: String by Delegates.observable("初始化值") {
//
//        property, oldValue, newValue ->
//
//    println("${property}的值从${oldValue}变成了 $newValue")
//
//
//}


var prop: Int by Delegates.vetoable(10) { property, oldValue, newValue ->
    println("${property}的值从${oldValue}变成了 $newValue")

    newValue > oldValue  //如果为true  修改成功  false 会修改失败

}

fun main() {

//    var output = DefaultOutput()
//
//    var printer = Printer(output)
//
//    printer.output("fkit.org")
//
//    println(printer.type)
//
//
//    var projector = Projector()
//    projector.output("疯狂空心")
//    println(projector.type)
//
//
//    //使用属性委托
//    val pd = PropertyDelegation()
//    println(pd.name)
//
//    pd.name = "fkit.org"
//    println(pd.name)
//

//    println(lazyProp)
//    println(lazyProp)
    
    println(prop)
    prop = 9
    println(prop)

}