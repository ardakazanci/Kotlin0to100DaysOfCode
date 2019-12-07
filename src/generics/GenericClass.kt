/*
 *
 *   Created by Arda Kazancı on 7.12.2019 22:25
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 7.12.2019 22:25
 *
 */

package generics

fun main() {

    val box_1 = Box<Int>()
    box_1.s = 5
    box_1.add(5)
    box_1.get()

    val box_2 = Box<String>()
    box_2.s = "10"
    box_2.add("10")
    box_2.get()

    val myclass = MyClass<SecondClass>()
    myclass.myFunc(SecondClass())

}

// Örneğin T yerine Int yazar ise String bir işlem için bu süreç tekrar yazılması gerekirdi.
// Generic ile birlikte bir Class ' ı Generic yaparak kodlama sürecini rahatlattık.

class Box<T> {
    var s: T? = null

    fun add(s: T) {
        this.s = s
    }

    fun get(): T? = this.s
}


open class FirstClass {
    fun first() {}
}

class SecondClass : FirstClass() {
    fun second() {}
}

class ThirdClass : FirstClass() {
    fun third() {}
}


class MyClass<T : FirstClass> {
    fun myFunc(t: T) {

    }
}

class Producer<out T>(val value: T) {
    fun get(): T = value
}

class Consumer<in S> {
    fun toString(value: S): String {
        return value.toString()
    }
}

