package zengqiang.kotlinstudy.character07.class06

/**
Time: 2020-03-24 下午11:50
Author:alan
Desc:
 */
class SubClass : SuperClass() {

    override var name: String? = SubClass::class.simpleName

    fun subClass() {
        println("子类中特有的方法")

    }
    
    override fun test() {
        println("子类覆盖的类的方法")
    }

}