/*
 *
 *   Created by Arda Kazancı on 3.12.2019 21:10
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 3.12.2019 21:10
 *
 */

package variables

fun main(args: Array<String>) {

    // *** var : Değeri sonradan  değiştirilebilen değişkenler için kullanılır.

    var name = "Arda Kazancı"
    name = "Arda Kznc"
    println(name)

    // *** val : Değeri sonradan  değiştirilemeyen değişkenler için kullanılır.

    val name_val = "Arda Kazancı"
    //name_val = "Arda Kznc" -> Error
    println(name_val)


    // val 0numberVal = 15 -> Error
    // val number a = 15 ->  Error
    // val -NewName = "Deneme"  -> Error

    val _NewName = "Deneme"
    println(_NewName)



}
