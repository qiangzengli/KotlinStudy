package zengqiang.kotlinstudy.character08.class07

/**
Time: 2020-03-25 上午4:10
Author:alan
Desc:
 */
enum class Operation {

    PLUS {
        override fun eval(x: Double, y: Double): Double = x + y
    },
    MINUS {
        override fun eval(x: Double, y: Double): Double = x - y

    },
    TIMES {
        override fun eval(x: Double, y: Double): Double = x * y

    },
    DIVIDE {
        override fun eval(x: Double, y: Double): Double = x / y

    };

    abstract fun eval(x: Double, y: Double): Double
}