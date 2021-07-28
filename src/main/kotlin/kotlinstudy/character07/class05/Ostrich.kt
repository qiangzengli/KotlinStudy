package zengqiang.kotlinstudy.character07.class05

/**
Time: 2020-03-24 下午10:57
Author:alan
Desc:
 */
class Ostrich : Bird() {
    //重写父类的属性
    public override var weight: Double = 40.0

    //鸵鸟重写鸟类的飞行方法
    override fun fly() {
        println("我在陆地上开心的奔跑")
    }

    //此方法不是重写方法，不能重写
    fun eat() {
        println("我在陆地吃东西")
    }
}
