/*
 *
 *   Created by Arda Kazancı on 5.12.2019 17:17
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 17:17
 *
 */

package functions

/*
    Infix Fonksiyonların Kullanımı

*/

fun main() {

    10 downTo 1 // -> Infix Fonksiyon
    10.downTo(1) // -> Extension Fonksiyon

    val toplamaIslemi = 5 topla 10
    println(toplamaIslemi)
    val birlestirmeIslemi = "Arda" birlestir "Kazancı" // Arda -> this Kazancı -> a
    println(birlestirmeIslemi)
}

infix fun Int.topla(a: Int): Int = this + a

infix fun String.birlestir(a: String): String = this + " " + a