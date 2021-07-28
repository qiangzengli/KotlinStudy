package zengqiang.kotlinstudy.character10.class02

/**
Time: 2020-03-25 上午11:09
Author:alan
Desc:
 */
fun main() {
//    //此时 T的类型是String
//    var user = User<String>("fkit")
//
//    println(user.info)
//    //对于u2而言   它的类型是User<Any> 此时T的类型是Any
//
//    var u2: User<Any> = user
//
//    //一旦声明了泛型类支持协变，程序即可安全的将User<String> ,User<Int> 赋值给
////    User<Any>
//    println(u2.info)
//
//    var userInt = User<Int>(1)
//    u2 = userInt
//    println(u2.info)
//
//
//    var it = Item<Any>()
//
//    it.foo(20)
//
//
//    //im2 的实际类型是Any 但是我们声明了 im2 的类型为Item<String>,所以只能是String
//    var im2: Item<String> = it
//
//    im2.foo("Kotlin")


    //运行处型变
//    var arr1 = arrayOf(2, 3, 15, 26)
//    var arr2: Array<Any> = arrayOf(4, 17, 3, 7, 9, 43)
//
//    copy(arr1, arr2)
//    println(arr2.contentToString())

    //使用出协变
//    var numArr: Array<out Number> = arrayOf(2, 5, 1.23, 4.2)
//
//    println(numArr.contentToString())
//
////    numArr.set(0, 4.5)  //如果声明了型变  这里会报错
//
//    var intArr: Array<Int> = arrayOf(3, 4, 5)
//
//    numArr = intArr  //此处因为Array<Number>没有声明型变，编译错误


    //使用处逆变
    
    var arr1: Array<CharSequence> = arrayOf("a", "b", StringBuilder("cc"))
    fill(arr1, "xxxx")
    println(arr1.contentToString())


    var intArr: Array<in Int> = arrayOf(2, 5, 30)
    println(intArr)
    intArr.set(0, 33)

    var numArr: Array<Number> = arrayOf(2, 4.2, 20.3)
    intArr = numArr


    println(intArr.contentToString())

}

//
////使用处型变  因为Array不支持声名处型变
//fun copy(from: Array<out Any>, to: Array<Any>) {
//    //此处from的类型是 Array<out Any>这就是使用处协变。也就是说  from 的类型可以是Array<Int> Array<String>
//    //需要说明的是，如果将from 参数声明为Array<out Any>类型，那么就以为着只能安全的从该from参数代表中取出元素，而不能
//    //将元素添加到from数组中，因为我们无法预测 from参数是Array<Int> 还是Array<String>
//
//    val len = if (from.size < to.size) from.size else to.size
//
//    for (i in 0 until len) {
//        to[i] = from[i]
//    }
//}


//声明使用出逆变


fun fill(dest: Array<in String>, value: String) {
    if (dest.size > 0) {
        dest[0] = value
    }
}