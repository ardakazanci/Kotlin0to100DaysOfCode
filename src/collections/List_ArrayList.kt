/*
 *
 *   Created by Arda Kazancı on 6.12.2019 19:38
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 19:38
 *
 */

package collections

import samples_kotlin.exercise_1.Artist


/*
    ---- Inmutable ----

    List -> Inmutable (Read Only) - listOf

    ---- Mutable ----

    ArrayList , arrayListOf, mutableListOf (Read & Write)
 */

fun main() {

    var list = listOf<Int>(1, 2, 3, 4, 5)
    // list[1] = 5 Error çünkü inmutable
    var list_2 = listOf<String>("Arda", "Kazancı")
    // list_2[1] = "Kznc" Error

    val arrayList = ArrayList<String>(2)
    arrayList.add("Arda")
    arrayList.add("Kazancı")
    arrayList.add("Arrrrr")

    val arrayList_2 = arrayListOf<Int>(5)
    arrayList_2.add(1)
    arrayList_2.add(2)
    arrayList_2.add(3)
    arrayList_2.add(4)
    arrayList_2.add(5)

    val sampleMusicList = listOf<String>("Arda", "Kazancı")
    val sampleArtist = Artist(1, "Arda", sampleMusicList)

    val arrayList_3 = mutableListOf<Artist>()
    arrayList_3.add(sampleArtist)
    arrayList_3.add(sampleArtist)
    arrayList_3.add(sampleArtist)
    arrayList_3.add(sampleArtist)


}