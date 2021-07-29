package zengqiang.kotlinstudy.character06.class05

/**
Time: 2020-03-19 上午3:51
Author:alan
Desc:
 */
fun main() {
    var list = listOf("Java", "Kotlin", "Go")


    var rt = list.dropWhile { e -> e.length > 3 }
    println(rt)

    println(square)
    println(result(3, 4))

}


var square = { n: Int -> n * n }(2)


//给变量指定类型   参数类型可以省略
var square1: (Int) -> Int = { n -> n * n }


var result = { base: Int, exponent: Int ->

    var result = 1
    for (i in 1..exponent) {

        result *= base

    }

    result
}



