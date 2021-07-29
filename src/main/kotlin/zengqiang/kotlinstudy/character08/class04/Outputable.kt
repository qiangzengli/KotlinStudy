package zengqiang.kotlinstudy.character08.class04

/**
Time: 2020-03-25 上午2:05
Author:alan
Desc:
 */
interface Outputable {
    //只读属性定义了getter 非抽象属性
//    val name: String
//        get() = "输出设备"
//
//    //只读属性没有定义getter  抽象属性
//    var brand: String
//
//    //读写属性没有定义setter getter 抽象属性
//    var category: String
//
//
//    var temp: String
//    var location: String
//        get() = temp
//        set(value) {
//            temp = value
//        }


    //接口中的非抽象方法可以使用ｐｒｉｖａｔｅ　修饰

    fun test()


}