/*
 *
 *   Created by Arda Kazancı on 7.12.2019 13:40
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 7.12.2019 13:40
 *
 */

package `class`

interface InterfaceSample {

    var sample_property: String
    fun sample_function_1()
    fun sample_function_2()
}

// Bir class'a interface bağladığımızda tüm metod ve propertylerini override etmemiz gerek.

class SampleClassInterface : InterfaceSample {

    // İlgili property'nin değerinin atanası için yapılan işlem
    override var sample_property: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun sample_function_1() {

    }

    override fun sample_function_2() {

    }
}

interface InterfaceSample2 {

    var sample_property: String // İlgili property i ilgili sınıfa aktarılırken direkt olarak atanma işlemi aşağıda yer almaktadır.
    fun sample_function_1()

}

// Direkt olarak ilgili property' i var ve override ile birlikte getter - setter olacak şekilde ekledik.
class SampleClassInterface2(override var sample_property: String) : InterfaceSample2 {

    override fun sample_function_1() {

    }

}


// Soyut metodlar direkt olarak override edilmek zorundadır.
interface ExampleInterface {
    var myVar: Int            // soyut property
    fun absMethod(): String    // soyut method
    // Gövdeli metod soyut metod değildir.
    fun hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }
}

class InterfaceImp() : ExampleInterface {

    override var myVar: Int = 25 // Yapıcı metod a eklenmedi ilk değeri atandı
    override fun absMethod() = "Happy Learning "

}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello(): ")
    obj.hello()

    print("Message from the Website-- ")
    println(obj.absMethod())
}

