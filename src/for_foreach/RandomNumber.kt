/*
 *
 *   Created by Arda Kazancı on 4.12.2019 23:13
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 23:13
 *
 */

package for_foreach


fun main(args: Array<String>) {

    val randomNumber = (0..10).random()
    do {
        print("Lütfen 1 ile 10 arasında rakam giriniz : > ")
        var userRandom = readLine()!!.toInt()
        if (userRandom == randomNumber) break

    } while (true)

    println("Tebrikler")

}