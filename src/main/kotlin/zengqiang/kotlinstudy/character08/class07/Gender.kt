package zengqiang.kotlinstudy.character08.class07

/**
 * Time: 2020-03-25 上午3:58
 * Author:alan
 * Desc:
 */
enum class Gender : GenderDesc {
    MALE, FEMALE;

    override fun desc() {

        when (this) {
            MALE -> println("天行健，君子以自强不息")
            FEMALE -> println("地势坤，君子以厚德载物")

        }
    }


}