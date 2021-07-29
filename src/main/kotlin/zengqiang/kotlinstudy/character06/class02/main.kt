package zengqiang.kotlinstudy.character06.class02

/**
Time: 2020-03-19 上午1:05
Author:alan
Desc:
 */
fun main() {


//    //直接调用  根据位置传参
//    println(area(1.0, 2.0, 3.0))
//    //完全根据参数名
//    println(area(width = 3.0, length = 1.0, height = 2.0))
//    //部分使用位置  部分使用命名
//    println(area(3.0, width = 1.0, height = 2.0))
//
//
//    //形参默认值
//
//    println(area())


//    println(fact(3))


    var arr = arrayOf("哈哈", "格列佛游记", "鲁宾逊漂流记")
    funVararg1(*arr, a = 10)
}


//定义体积函数
fun area(length: Double = 1.0, width: Double = 2.0, height: Double = 2.0): Double =
    length * width * height

//计算阶乘(常规写法)

fun fact(i: Int): Int {

    if (i == 1) {
        return 1
    } else {
        return fact(i - 1) * i
    }
}

//使用尾递归函数（使用场景  调用自身作为最后一行代码，并且递归调用后没有更多代码）
//可以减少内存消耗
tailrec fun factRec(n: Int, total: Int = 1): Int =
    if (n == 1) total else factRec(n - 1, n * total)


//个数可变的形参（本质就是数据参数）

fun funVararg(a: Int, vararg books: String) {

    for (book in books) {
        println(book)
    }
    println(a)
}


//当可变形参在开始位置时   后面的参数需要使用命名参数赋值
fun funVararg1(vararg books: String, a: Int) {

    for (book in books) {
        println(book)
    }
    println(a)
}