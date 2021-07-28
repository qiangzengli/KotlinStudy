package zengqiang.kotlinstudy.character07.class05

/**
 * Time: 2020-03-24 下午6:06
 * Author:alan
 * Desc:
 */
open class Person {

    constructor() {
        println("父类无参构造")
    }

    constructor(name: String) {
        println("父类一个参构造器")
    }

    constructor(name: String, age: Int) {
        println("父类两个参构造器")

    }

    constructor(name: String, age: Int, sex: String) {
        println("父类三个参构造器")
    }


}