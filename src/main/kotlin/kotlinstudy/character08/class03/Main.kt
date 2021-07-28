package zengqiang.kotlinstudy.character08.class03

/**
Time: 2020-03-25 上午1:40
Author:alan
Desc:
 */
fun main() {


    var apple = RedFushi()

    apple.taste()


    var gale = Gala()
    gale.taste()



    judge(apple)
    judge(gale)
}


fun judge(apple: Apple) {
    when (apple) {
        is RedFushi -> println("红富士苹果")

        is Gala -> println("嘎啦果")
    }


}