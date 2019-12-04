/*
 *
 *   Created by Arda Kazancı on 4.12.2019 20:44
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 20:44
 *
 */

package if_else_when

fun main(args: Array<String>) {

    // Exercise 1

    var sayi = 100
    if (sayi < 1000) {
        println("sayı 1000 den küçük")
    } else {
        println("sayı 1000 den büyük")
    }

    // Exercise 2
    var sicaklik = 10
    if (sicaklik >= 30 && sicaklik >= 0) {
        println("30 dan büyük")
    } else {
        println("30 dan Küçük")
    }

    // Exercise 3
    var isLogin = false
    if (isLogin)
        println("Giriş Başarılı")
    else
        println("Giriş Başarısız")

    // Exercise 4
    var sayi_2 = 7
    when (sayi_2) {
        1 -> {
            println("Sayı 1")
        }
        2 -> {
            println("Sayı 2")
        }
        3 -> println("Sayı 3")

        else -> println("Sayı 4")
    }

    // Exercise 5
    var sayi_3 = 10
    var sonuc = when (sayi_3) {
        0, 1 -> "Sıfır Bir"
        2, 3 -> "İki Üç"
        else -> "Bilinmeyen sayılar olabilir."
    }


    // Exercise 6
    var sayi_5 = 30
    when (sayi_5) {
        in 1..30 -> println("Girilen Sayı 1 ile 30 arasındadır.")
        !in 1..30 -> println("Girilen Sayı 1 ile 30 arasında değildir.")
    }


}