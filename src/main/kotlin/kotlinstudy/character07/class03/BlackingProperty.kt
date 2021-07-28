package zengqiang.kotlinstudy.character07.class03

/**
Time: 2020-03-24 上午2:23
Author:alan
Desc:
 */
class BlackingProperty(name: String) {
    //定义private修饰的属性，该属性是幕后属性
    private var _name: String = name

    var name
        get() = _name
        set(newName) {
            if (newName.length > 5 || newName.length < 2) {
                println("您输入的任命不符合要求")
            } else {
                _name = newName
            }
        }

}