package zengqiang.kotlinstudy.character08.class08

/**
Time: 2020-03-25 上午9:58
Author:alan
Desc:属性委托示例
 */
class PropertyDelegation {

    var name:String by MyDelegation()
}