package zengqiang.kotlinstudy.character07.class03

/**
 * Time: 2020-03-24 上午2:04
 * Author:alan
 * Desc:
 */
class Person {

    var name = ""
        set(newName) {

            if (newName.length > 6 || newName.length < 2) {
                println("name invalid")
            } else {
                field = newName
            }


        }

    var age = 0
        set(newAge) {
            if (newAge > 150 || newAge < 0) {
                println("age invalid")

            } else {
                field = newAge
            }
        }
}