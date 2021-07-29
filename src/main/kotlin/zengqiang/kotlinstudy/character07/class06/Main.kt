package zengqiang.kotlinstudy.character07.class06

/**
Time: 2020-03-24 下午11:43
Author:alan
Desc:
 */
fun main() {

    //编译器和运行期都是SuperClass 类型  不存在多态
    var superClass: SuperClass = SuperClass()
    println(superClass.name)

    superClass.superClass()
    superClass.test()

    //编译器和运行期都是SubClass 类型  不存在多态
    println()

    var subClass: SubClass = SubClass()
    println(subClass.name)

    subClass.superClass()
    subClass.test()


    //编译期是SuperClass  运行期是：SubClass
    var ploymophicSuperClass: SuperClass = SubClass()
    println()
    ploymophicSuperClass.superClass()
    println(ploymophicSuperClass.name)
    ploymophicSuperClass.test()

    //子类中独有的方法无法访问
//    ploymophicSuperClass.subClass()


}