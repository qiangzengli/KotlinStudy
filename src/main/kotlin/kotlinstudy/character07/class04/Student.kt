package zengqiang.kotlinstudy.character07.class04

/**
 * Time: 2020-03-24 上午3:28
 * Author:alan
 * Desc:
 */
class Student(name: String) {
    var name: String
    var age: Int
    var info: String?

    init {
        this.name = name
        this.age = 0
        info = null


//        println("name:$name age:$age info:$info")
        println("Studeng的初始化块")

    }

    constructor(name: String, age: Int, info: String?) : this(name, age) {
        this.info = info
//        println("name:$name age:$age info:$info")

    }

    constructor(name: String, age: Int) : this(name) {

        this.age = age
//        println("name:$name age:$age info:$info")


    }


}