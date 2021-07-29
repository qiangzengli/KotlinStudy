package zengqiang.kotlinstudy.character07.class03

/**
Time: 2020-03-24 上午1:30
Author:alan
Desc:
 */
class Item(barCode: String, name: String) {
    val barCode = barCode
    val name = name


    val price: String //如果get方法中的方法体可以推出返回值的类型 这里可以不写返回值类型
        get() = barCode + name   //

//        get() {
//            return barCode + name
//
//        }

}