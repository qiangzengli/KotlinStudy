package zengqiang.kotlinstudy.character06.class06

/**
Time: 2020-03-23 下午6:05
Author:alan
Desc:
 */
fun main() {

//    //定义一个匿名函数
//    var test = fun(x: Int, y: Int): Int {
//        return x + y
//    }
//
//    println(
//        test(1, 2)
//    )
//
//
//    //使用Lambda表达式作为filter的参数
//    var filteredListLambda = listOf(3, 5, 20, 100, -25).filter {
//
//        Math.abs(it) > 20
//    }
//    println(filteredListLambda)
//
//    //使用匿名函数作为filter() 方法的参数
//    var filteredList = listOf(10, 20, 30, 50, 60)
//        .filter(fun(e): Boolean {
//            return Math.abs(e) > 50
//        })
//
//    println(filteredList)

//
//    var list = listOf(1, 2, 3, 5, 6)
//
//    list.forEach(fun(e) {
//
//        println("元素依次为${e}")
//        return
//
//    })
//
//    list.forEach {
//        println("元素依次为Lambda${it}")
//        return@forEach
//    }


    /**
     * 元素依次为1
    元素依次为2
    元素依次为3
    元素依次为5
    元素依次为6
    元素依次为Lambda1
     */

//    val add1 = makeList("孙悟空")
//    println(add1())
//    println(add1())
//
//
//    val add2 = makeList("猪八戒")
//    println(add2())
//    println(add2())

//
//    var list = arrayOf(1, 2, 4, 6, 7, 89, 10)
//    var array = map(list) { it + 3 }
//    print(array.contentToString())


    nonLocalityReturn(arrayOf(2, 35, 76, 7, 8, 9, 4)) { println(it); }
}


/**
 * 非局部返回示例
 */
fun nonLocalityReturn(arrayOf: Array<Int>, any: (Int) -> Unit) {

    for (i in arrayOf) {
        any(i)

    }
    
}


//fun makeList(ele: String): () -> List<String> {
//    var list: MutableList<String> = mutableListOf()
//    fun addElement(): List<String> {
//        //向list中添加一个元素
//        list.add(ele)
//        return list
//    }
//
//    return ::addElement
//
//
//}


//使用inline 关键字 标记 就会成为一个内联函数
//inline fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
//    //使用匿名函数创建Array,可以去掉Array的泛型
////    val result = Array(data.size, fun(int: Int): Int { return 0 })
//
//    //使用匿名函数以及函数放在括号外 创建Array,可以去掉Array的泛型
////    val result = Array(data.size){ fun(int: Int): Int { return 0 }}
//
//    //使用Lambda表达式
////    val result = Array(data.size, { 0 })
//
//    //使用Lambda表达式 以及函数放在括号外
//    val result = Array<Int>(data.size) { 0 }
//
//    for (i in data.indices) {
//        result[i] = fn(data[i])
//
//    }
//
//
//
//    return result
//
//
//}





