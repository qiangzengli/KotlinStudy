package zengqiang.kotlinstudy.character08.class03

/**
 * Time: 2020-03-25 上午1:48
 * Author:alan
 * Desc:
 */
sealed class Apple {
    abstract fun taste()

}

open class RedFushi : Apple() {
    override fun taste() {
        println("红富士香甜可口")
    }


}

open class Gala : Apple() {
    override fun taste() {
        println("Gala口感清脆")

    }

}