package zengqiang.kotlinstudy.character08.class08

/**
Time: 2020-03-25 上午4:26
Author:alan
Desc:
 */
class DefaultOutput : Outputable {
    override fun output(msg: String) {
        for (i in 1..6) {
            println("<h${i}>${msg}</h${i}")

        }
    }

    override var type: String = "输出设备"


}