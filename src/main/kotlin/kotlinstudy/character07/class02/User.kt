package zengqiang.kotlinstudy.character07.class02

/**
Time: 2020-03-19 上午4:59
Author:alan
Desc:
 */
class User(name: String, age: Int, weight: Float) {
    var name = name
    var weight = weight
    var age = age


    operator fun component1() = this.name
    operator fun component2() = this.weight
    operator fun component3() = this.age
}