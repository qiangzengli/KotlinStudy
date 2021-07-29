package zengqiang.kotlinstudy.character10.class01

/**
Time: 2020-03-25 上午10:48
Author:alan
Desc:
 */
open class Apple<T> {
    open var info: T?

    constructor() {
        info = null
    }


    constructor(info: T) {
        this.info = info
    }


}