package zengqiang.kotlinstudy.character08.class06

/**
Time: 2020-03-25 上午3:16
Author:alan
Desc:
 */
class ObjectExprType {

    private val ob1 = object {

        val name: String = "fkit"

    }

    internal val ob2 = object {

        val name: String = "fkit"
    }

    private fun privateBar() = object {
        val name: String = "fkjava.org"
    }

    fun publicBar() = object {
        val name: String = "fkjava.org"
    }


    fun test() {

        //变了一起可以识别他的真是类型
//        println(ob1.name)
//        //编译器当它是Any类型
//        println(ob2.name)
//
//        println(privateBar().name)
//        println(publicBar().name)
    }


}