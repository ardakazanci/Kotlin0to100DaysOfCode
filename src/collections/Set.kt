/*
 *
 *   Created by Arda Kazancı on 6.12.2019 21:40
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 21:40
 *
 */

package collections

// Set yapısında bir eleman tekrar bulunamaz.
/*
    InMutable

    setOf

    Mutable

    mutableSetOf,hashSetOf
 */

fun main() {

    val set = setOf<Int>(1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6)

    val set_2 = mutableSetOf<Int>(1, 2, 3, 4, 5)

    val set_3 = hashSetOf<Int>(1, 1, 1, 1, 1, 1, 1, 2)


}