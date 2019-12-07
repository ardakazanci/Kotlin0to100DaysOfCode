/*
 *
 *   Created by Arda Kazancı on 7.12.2019 13:03
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 7.12.2019 13:03
 *
 */

package `class`

// Exericse 1
open class ABC {

    fun foo() {

    }

    fun bar() {

    }

}


class CBA : ABC() {

    var a = foo() // SuperClass function
    var b = bar() // SuperClass function

}


// Exericse 2

open class TestClass {
    open fun testFunction() {

    }
}

class TestSubClass : TestClass() {
    // Open Class - Override
    override fun testFunction() {
        super.testFunction()
    }
}


// Exericse 3
open class DatabaseUserAction {


    open fun user_add() {

    }

    open fun user_remove() {

    }

    open fun user_update() {

    }
}


class Personel(var username: String, var userid: Int) : DatabaseUserAction() {


    override fun user_add() {
        super.user_add()
        println("User Add Function")
    }

    override fun user_remove() {
        super.user_remove()
        println("User Remove Function")
    }

    override fun user_update() {
        super.user_update()
        println("User Update Function")
    }
}

fun main() {
    val people_1 = Personel(username = "Arda", userid = 1)
    people_1.user_add()
    people_1.user_remove()
    people_1.user_update()

    var dog = Dog("Red", 12)
    dog.wof()
}


/*  // Exericse 4
    color ve age değerleri yapıcı metod değerleridir.
    Animal sınıfı için yapıcı değerlerini ifade eder.
    Animal sınıfının yaratılması için gerekmektedir.
 */

open class Animal(color: String, age: Int) {

    init {
        println("Color $color")
        println("Age $age")
    }

    open fun animal_function_message() {
        println("animal function created")
    }

}


// Dog ' a gönderilen yapıcı metod değerleri Animal değerine otomatik aktarıldı
/*
    Dog nesnesinin oluşturulması için color_dog ve age_dog değerlerine ihtiyaç vardır
    color_dog ve age_dog değerleri bu değerleri kullanır ve Animal sınıfına gönderilir.
    Kalıtım aracıığıyla is - a ilişkisi - evebeyn - çocuk ilişkisi vardır.
 */
class Dog(color_dog: String, age_dog: Int) : Animal(color_dog, age_dog) {

    fun wof() {
        println("Wof Wof")
    }

    override fun animal_function_message() {
        super.animal_function_message() // super ile birlikte parent class ' ta ki property ve metodlara erişebiliriz.
        println("dog function created")
    }

}

