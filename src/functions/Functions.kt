/*
 *
 *   Created by Arda Kazancı on 5.12.2019 10:49
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 10:49
 *
 */

package functions

/*
    Parametreli - Parametresiz Fonksiyonlar
    Dönüş değeri olan - olmayan fonksiyonlar
*/

fun main() {
    // println() // Örnek Fonksiyon
    println("------------------ Default Parametreli Func -------------------")
    helloWorldMessage()
    helloWorldMessageFun2()
    helloWorldMessageFun3("Test")
    val sampleVarToFunc = helloWorldMessageFun3("Test 2")
    println(sampleVarToFunc)
    println("------------------ Return Func -------------------")
    println(helloWorldMessageFun4())
    println(helloWorldMessageFun5())
    println(number1PlusNumber2())
    number1PlusNumber3()
    sampleFunc()
}

fun helloWorldMessage() {
    println("Hello World")
}

fun helloWorldMessageFun2() = println("Hello World 2")
fun helloWorldMessageFun3(message: String) = println("Hello $message")

fun helloWorldMessageFun4(): String {
    return "Hello World Return Fun"
}

fun helloWorldMessageFun5(): String = "Test Return Func"
fun number1PlusNumber2(): Int = 1 + 1

fun number1PlusNumber3(): Unit = println(2 + 2)

// Unit = Void -> Değer Döndürmeyen , Default olarak Unit Eklenir.
fun sampleFunc(): Unit = println("Hello World Unit")


fun sampleFunc_2(x: Int, y: Int): Int = x + y