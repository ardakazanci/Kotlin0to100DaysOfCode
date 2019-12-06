/*
 *
 *   Created by Arda Kazancı on 6.12.2019 19:33
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 19:33
 *
 */

package collections

// Array Collections başlığı altına alınmıştır.
// Array Collections yapılarından biri değildir.
// Belleğin Heap bölgesinde tutulur Referans tiplidir.
fun main() {

    // Version 1
    val array_1 = Array<Int>(10) { 5 } // 10 Elemanınlı array ' in tüm elemanları 5
    for (item in array_1) {
        println(item)
    }

    // Version 2
    val array_2 = arrayOf(1, 2, 3)
}