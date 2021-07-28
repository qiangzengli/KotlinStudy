package zengqiang.kotlinstudy.character08.class06

import zengqiang.kotlinstudy.character08.class04.Outputable

/**
Time: 2020-03-25 上午3:34
Author:alan
Desc:
 */
class MyClass {


    companion object : Outputable {
        val name = "hello"
        override fun test() {

            for (i in 0..5) {

                println(i)
            }
        }


    }

}