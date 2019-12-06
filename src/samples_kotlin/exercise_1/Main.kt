/*
 *
 *   Created by Arda Kazancı on 5.12.2019 19:13
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 19:13
 *
 */

package samples_kotlin.exercise_1

class Main {

    fun main() {
        // Bu derlenmeyecek. Sanatçı boş olamaz
        // var notNullArtist : Artist = null

        // ? -> Null Olabilir . Derlenecek 🐥
        val artist: Artist? = null

        // artist_name null ise empty yazdır.
        val name = artist?.artist_name ?: "empty"


    }


}
