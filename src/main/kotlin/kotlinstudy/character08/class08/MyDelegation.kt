package zengqiang.kotlinstudy.character08.class08

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
Time: 2020-03-25 上午9:59
Author:alan
Desc:
 */
open class MyDelegation : ReadWriteProperty<PropertyDelegation, String> {
    private var _backValue = ""

    //通过实现ReadWriteProperty 重写方法实现
    override fun getValue(
        thisRef: PropertyDelegation,
        property: KProperty<*>
    ): String {
        return _backValue

    }

    override fun setValue(
        thisRef: PropertyDelegation,
        property: KProperty<*>, value: String
    ) {
        _backValue = value
    }

    //下面是自己实现
//    private var _backValue = "默认值"
//
//    operator fun getValue(
//        thisRef: PropertyDelegation,
//        property: KProperty<*>
//    ): String {
//        println("${thisRef} 的${property.name} 属性执行getter方法")
//        return _backValue
//    }
//
//    operator fun setValue(
//        thisRef: PropertyDelegation,
//        property: KProperty<*>,
//        newValue: String
//    ) {
//
//        _backValue = newValue
//    }
}