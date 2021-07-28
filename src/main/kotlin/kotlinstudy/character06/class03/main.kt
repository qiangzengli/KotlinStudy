package zengqiang.kotlinstudy.character06.class03

/**
Time: 2020-03-19 上午2:12
Author:alan
Desc:
 */
fun main() {

//    println(getMathFun("cube", 3))
//    println(getMathFun("square", 3))
//    println(getMathFun("", 5))

    //  ::pow  是将pow的引用赋值给 pow变量不能加圆括号
//    var a = ::pow
//    //
//    var b = ::area
//
//
//    println(a(2, 3))
//    println(b(2, 3))
//
//
//
//    var array = arrayOf(1, 2, 3, 4)
//
//    println(map(array, ::cube).contentToString())
//    println(map(array, ::squre).contentToString())
//    println(map(array, ::fact).contentToString())

    println(getMathFun1("cube")(3))

}

//
//fun add(a: Int, b: Int) {
//
//}
//
//fun add(b: Int, a: Int, c: Int) {
//
//}

//返回函数计算结果
fun getMathFun(type: String, n: Int): Int {
    //计算平方
    fun squre(n: Int): Int = n * n

    //计算立方
    fun cube(n: Int): Int = n * n * n

    //计算阶乘
    tailrec fun fact(n: Int, total: Int = 1): Int =
        if (n == 1) total else fact(n - 1, n * total)


    when (type) {

        "square" -> return squre(n)
        "cube" -> return cube(n)
        else -> return fact(n)
    }
}


fun getMathFun1(type: String): (Int) -> Int {
    //计算平方
    fun squre(n: Int): Int = n * n

    //计算立方
    fun cube(n: Int): Int = n * n * n

    //计算阶乘
    tailrec fun fact(n: Int, total: Int = 1): Int =
        if (n == 1) total else fact(n - 1, n * total)


    when (type) {

        "square" -> return ::squre
        "cube" -> return ::cube
        else -> return ::fact
    }
}


//计算乘方
fun pow(base: Int, exponent: Int): Int {
    var result = 1

    for (i in 1..exponent) {
        result *= base

    }

    return result

}

//计算面积
fun area(height: Int, width: Int) = height * width


fun map(data: Array<Int>, cal: (Int) -> Int): Array<Int> {

    var temp = Array<Int>(data.size) { 0 }

    for (i in data.indices) {

        temp[i] = cal(data[i])

    }


    return temp

}


fun squre(i: Int) = i * i
fun cube(i: Int) = i * i * i
fun fact(i: Int): Int {

    if (i == 1) {
        return 1
    } else {
        return i * fact(i - 1)
    }


}





