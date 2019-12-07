/*
 *
 *   Created by Arda Kazancı on 7.12.2019 22:34
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 7.12.2019 22:34
 *
 */

package generics

fun main(args: Array<String>) {
    //printRepeated("Hello World", 5)
    //printRepeated(0, 10)

    val list = arrayOf(1, 2, 3, 4, 5)
    val list2 = arrayOf("Kotlin", "Java", "Javascript", "Ruby", "Phyton")
    val list3 = arrayOf(2.6, 3.9, 0.5, 1.2)

    //printArray(list)
    //printArray(list2)
    //printArray(list3)

    list.printArrayExt()
    list2.printArrayExt()
    list3.printArrayExt()

    val sonuc = maximum(1.4, 2.3, 3.9)
    println(sonuc)
}

fun <T> printRepeated(t: T, k: Int) {
    for (items in 0..k) println(t)
}

fun <T> printArray(myArray: Array<T>) {
    for (items in myArray) println(items)
}

fun <T> Array<T>.printArrayExt() {
    for (items in this) println(items)
}

fun <T : Comparable<T>> maximum(x: T, y: T, z: T): T {
    var max = x

    if (y.compareTo(max) > 0) max = y
    if (z.compareTo(max) > 0) max = z

    return max
}