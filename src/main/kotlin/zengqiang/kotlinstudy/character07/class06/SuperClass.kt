package zengqiang.kotlinstudy.character07.class06

/**
 * Time: 2020-03-24 下午11:49
 * Author:alan
 * Desc:
 */
open class SuperClass {
    //父类的名称
    open var name: String? = SuperClass::class.simpleName
    fun superClass() {
        println("父类特有的方法")
    }

    //父类被覆盖的方法
    open fun test() {
        println("父类被覆盖的方法")

    }

}