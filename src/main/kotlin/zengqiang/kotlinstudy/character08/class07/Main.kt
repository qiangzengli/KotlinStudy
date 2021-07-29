package zengqiang.kotlinstudy.character08.class07

/**
Time: 2020-03-25 上午3:45
Author:alan
Desc:
 */
fun main() {

    for (s in Season.values()) {
        println(s)
    }


    val seasonName = "SUMMER"
    //根据字符串返回枚举值
    val s: Season = Season.valueOf(seasonName)

    println(s)

    //直接访问枚举值
    println(Season.WINTER)

    println(Season.WINTER.name + Season.WINTER.ordinal)
    println(Season.WINTER.toString())

    println(Season.WINTER.compareTo(Season.FALL))

    println(Gender.MALE.desc())


    println(Operation.PLUS.eval(10.1, 2.4))

}