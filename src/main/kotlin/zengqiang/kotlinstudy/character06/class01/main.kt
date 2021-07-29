package zengqiang.kotlinstudy.character06.class01

/**
Time: 2020-03-19 上午12:48
Author:alan
Desc:
 */
fun main() {

    calculator(10)
    println(calculator(10))

}


/**
 * 递归函数
 */

fun calculator(i: Int): Int {


    if (i == 0) {
        return 1

    } else if (i == 1) {
        return 4
    } else {

        return 2 * calculator(i - 1) + calculator(i - 2)
    }

}