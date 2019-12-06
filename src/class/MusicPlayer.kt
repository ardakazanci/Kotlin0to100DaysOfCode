/*
 *
 *   Created by Arda Kazancı on 6.12.2019 21:53
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 21:53
 *
 */

package `class`

class MusicPlayer {

    var marka: String? = null
    var kapasite: Int = 0
    var seri_no: String? = null

    // bla bla bla

    fun oynat() = println("Müzik Oynatılıyor")
    fun durdur() = println("Müzik Durduruluyor")
    fun beklet() = println("Müzik Bekletiliyor")

}


fun main() {

    var musicPlayer = MusicPlayer()
    musicPlayer.kapasite = 1234
    musicPlayer.marka = "Test"
    musicPlayer.seri_no = "12324aadasd12rgb23"

}