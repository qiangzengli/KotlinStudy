package zengqiang.kotlinstudy.character07.class02

/**
Time: 2020-03-19 上午4:47
Author:alan
Desc:
 */
class Apple(weight: Double) {
    var weight = weight
    override fun toString(): String {
        return "Apple(weight=$weight)"
    }


    //定义中缀方法 使用infix修饰


    infix fun add(other: Apple): ApplePack {
        return ApplePack(this.weight + other.weight)
    }


    infix fun drop(other: Apple): Apple {
        this.weight -= other.weight

        return this
    }

}
