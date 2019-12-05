/*
 *
 *   Created by Arda Kazancı on 5.12.2019 17:05
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 17:05
 *
 */

package functions


/*
    Extension Fonksiyon Kullanımı.
*/

fun main() {

    println(10.KaresiniAl())
    println(20.KupunuAl())
    println(50.YarisiniAl())

    val ornekList = arrayListOf<String>("A", "B", "C", "D", "E", "F")
    ornekList.IndexChange(0, 2)
    for (item in ornekList) println(item)
    //println(ornekList)
}

fun Int.KaresiniAl(): Int = this * this

// Normal Hali
fun KaresiniAlNormal(sayi1: Int): Int = sayi1 * sayi1

fun Int.KupunuAl(): Int = this * this * this
fun Int.YarisiniAl(): Int = this / 2

fun ArrayList<String>.IndexChange(x: Int, y: Int) {

    val c = this[y]
    this[y] = this[x]
    this[x] = c

}


