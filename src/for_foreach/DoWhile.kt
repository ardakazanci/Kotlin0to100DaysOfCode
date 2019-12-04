/*
 *
 *   Created by Arda Kazancı on 4.12.2019 22:54
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 22:54
 *
 */

package for_foreach

fun main(args: Array<String>) {
    var a = 100
    do {
        println("İlgili Sayı :> $a")
        a++
        if (a > 1000) {
            break
        }
    } while (a < 1000)


    var userName = "Arda"
    var userPassword = "1234a"

    do {
        println("User Name : ")
        var b = readLine().toString()
        println("User Password : ")
        var c = readLine().toString()
    } while (b != userName && c != userPassword)
    println("Success Login")

}