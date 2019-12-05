/*
 *
 *   Created by Arda Kazancı on 5.12.2019 15:05
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 15:05
 *
 */

package functions

fun main() {

    println("Dairenin Çevresi -> " + daireninCevresi(5))
    println("Dairenin Çevresi -> " + daireninAlani(5))

}


fun daireninCevresi(r: Int): Double {

    return 2 * Math.PI * r

}

fun daireninAlani(r: Int): Double {

    return Math.PI * r * r

}