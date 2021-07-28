package zengqiang.kotlinstudy.character07.class01

/**
Time: 2020-03-19 上午12:12
Author:alan
Desc:
 */
class ReturnThis {
    var age:Int=0

    fun returnThis():ReturnThis{

        age++
        return this
    }
}