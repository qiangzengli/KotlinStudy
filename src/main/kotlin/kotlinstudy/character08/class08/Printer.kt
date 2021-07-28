package zengqiang.kotlinstudy.character08.class08

/**
Time: 2020-03-25 上午4:52
Author:alan
Desc:
 */
//使用委托  将b中的实现拿来自己使用
class Printer(b: DefaultOutput) : Outputable by b