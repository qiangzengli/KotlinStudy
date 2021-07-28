package zengqiang.kotlinstudy.character07.class05

/**
 * Time: 2020-03-24 下午6:09
 * Author:alan
 * Desc:
 */
class Man : Person {


    //因为这个构造器没有委托父类的任何构造器，那么编译器将默认委托父类无参构造
    constructor(nt: Int) {
        println("子类没有委托一参构造器")
    }

    constructor(name: String) : super(name) {
        println("子类一参构造器")
    }


    constructor(name: String, age: Int) : super(name, age) {
        println("子类两参构造器")


    }


    constructor(name: String, age: Int, sex: String) : super(name, age, sex) {
        println("子类三参构造器")

    }

}