package zengqiang.kotlinstudy.character06.class04

/**
Time: 2020-03-19 上午3:22
Author:alan
Desc:
 */
var a = java.util.ArrayList<(Int) -> Int>()

fun main() {

    addFun { it * it }
    addFun { it * it * it }


    println(a.size.toString())

    for (i in a.indices) {

        println(a[i](i + 10))

    }


}
fun addFun(lambda: (Int) -> Int) {
    a.add(lambda)

}

fun getMath(type: String, i: Int): (Int) -> Int {

    when (type) {

        "square" -> return { i: Int -> i * i }
        "cube" -> return { i: Int -> i * i * i }
        else -> return { i: Int -> i * i }
    }


}


