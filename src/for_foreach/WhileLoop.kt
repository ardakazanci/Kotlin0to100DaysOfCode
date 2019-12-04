/*
 *
 *   Created by Arda Kazancı on 4.12.2019 22:46
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 22:46
 *
 */

package for_foreach

fun main(args: Array<String>) {
    // Exercise 1
    var a = 1
    while (a >= 1) {
        println("a")
        a++
        println("Değer :> $a")
        if (a == 10) {
            break
        }
    }

    // Exercise 2
    var b = 0;
    while (b <= 100) {

        if (b > 100) {
            break;
        } else {
            if (b % 2 == 0) {
                println("Çift Sayı :> $b")

            }
            b++
        }


    }

    // Exercise 3
    var c = 0;
    var toplam = 0
    while (c < 100) {

        if (c > 100) {
            break
        } else {
            if (c % 2 != 0) {
                toplam = toplam + c
            }
            c++
        }
    }
    println("Tek Sayıların Toplamı : > $toplam")


}