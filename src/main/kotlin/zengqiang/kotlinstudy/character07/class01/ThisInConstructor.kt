package zengqiang.kotlinstudy.character07.class01

/**
Time: 2020-03-19 上午12:07
Author:alan
Desc:
 */
class ThisInConstructor {

    var foo: Int   //在类中不赋值会编译错误

    constructor() {
        //给foo 赋值
        val foo = 0
        this.foo = 0

        println(this)  //this  代表正在初始化的对象
    }


}