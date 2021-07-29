package zengqiang.kotlinstudy.character08.class08

/**
 * Time: 2020-03-25 上午4:53
 * Author:alan
 * Desc:
 */
class Projector() : Outputable by DefaultOutput() {

    override fun output(msg: String) {
        println("重写方法")

    }
}