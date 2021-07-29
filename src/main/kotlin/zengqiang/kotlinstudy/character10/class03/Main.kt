package zengqiang.kotlinstudy.character10.class03

/**
Time: 2020-03-26 上午12:38
Author:alan
Desc:
 */
fun main() {
//    var strList = listOf("java", "Kotlin")
//    var objList: MutableList<Any> = mutableListOf(1, 2, "Android")
//
//
//    //指定泛型函数的T 为String类型
//
//    copy<String>(strList, objList)
//
//    println(objList)
//
//
//    var intList = listOf(7, 13, 19, 17)
//
//    //不指定泛型函数T的类型  系统推断出T 为Int 类型
//    copy(intList, objList)
//    println(objList)
//
//
//    val a = 2
//
//    println(a.toBookString<Int>())
//    //自定推断出了类型
//
//    println(2.3.toBookString())


//    println(findData(Integer::class.java))
//    println(findData(java.lang.Double::class.java))


//    println(findData<java.lang.Integer>())
//    println(findData<java.lang.Character>())


//    var ai = Apple<Int>(2)
//
//    //显式指定泛型函数的T 是 Double类型
//
//    var ad = Apple<Double>(4.3)


    //编译错误  因为String  不是Number 以及Number的子类
//    var ap = Apple<String>("hello")



}

fun <T> copy(from: List<T>, to: MutableList<in T>) {

    for (ele in from) {
        to.add(ele)
    }
}


//为泛型T 定义扩展函数
fun <T> T.toBookString(): String {
    return "《${this.toString()}》"
}


val db = listOf("Java", java.util.Date(), 102, 1.2, '我')


//不适用reified和 inline

fun <T> findData(clazz: Class<T>): T? {
    for (ele in db) {
        if (clazz.isInstance(ele)) {
            @Suppress("UNCHECKED_CAST")
            return ele as? T
        }

    }

    return null

}

//使用内联函数和 reified
inline fun <reified T> findData(): T? {
    for (ele in db) {
        if (ele is T) {
            return ele
        }
    }

    return null
}



