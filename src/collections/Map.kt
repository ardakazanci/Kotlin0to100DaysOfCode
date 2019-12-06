/*
 *
 *   Created by Arda Kazancı on 6.12.2019 21:29
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 21:29
 *
 */

package collections

fun main() {

    // Inmutable
    // mapOf

    // Mutable
    // HashMap , hasMapOf , mutableMapOf

    val map = mapOf<Int, String>(1 to "Arda", 2 to "Kazancı")

    for (item in map) {
        println(item)
        /*
            Output
            ---------
            1 = Arda
            2 = Kazancı
         */
    }

    for (key in map.keys) {
        println("Key -> $key and values " + map[key])
    }




    println(map[1])
    println(map[2])
    println(map[3]) // hata vermez , null yazar.

    // Veriler sıralı gelmez.
    val map_2 = HashMap<Int, String>(5)
    map_2.put(1, "Arda")
    map_2.put(2, "Arda")
    map_2.put(3, "Arda")
    map_2.put(4, "Arda")
    map_2.put(5, "Arda")
    map_2[6] = "Arda"


    val map_3 = hashMapOf<Int, String>(1 to "Arda")
    map_3.put(2, "Kazancı")

    // Veriler sıralı gelir.
    val map_4 = mutableMapOf<Int, String>(1 to "Kazancı")
    map_4.put(2, "Kazancı")


}