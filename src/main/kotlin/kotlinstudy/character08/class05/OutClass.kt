package zengqiang.kotlinstudy.character08.class05

/**
 * Time: 2020-03-25 上午2:37
 * Author:alan
 * Desc:
 */
class OutClass {
    private var name: String = "OutClass"

    //使用inner 修饰的是非静态内部类 调用需要创建对象调用OutClass().NestClass().hello()
    inner class InnerClass {
        private var name: String = "innerClass"

        fun hello() {
            println(this@OutClass.name)
        }

    }


    //直接定义的相当于静态内部类 使用直接OutClass.NestClass().hello()
    class NestClass {


        fun hello() {
            println("NestClass")
        }
    }

}