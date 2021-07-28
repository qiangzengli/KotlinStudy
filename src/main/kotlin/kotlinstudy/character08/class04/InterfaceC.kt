package zengqiang.kotlinstudy.character08.class04

/**
Time: 2020-03-25 上午2:19
Author:alan
Desc:
 */
interface InterfaceC : InterfaceA, InterfaceB {
    val proC: Int
        get() = 3

    fun testC()
}