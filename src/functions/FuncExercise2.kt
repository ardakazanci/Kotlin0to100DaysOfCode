/*
 *
 *   Created by Arda Kazancı on 5.12.2019 15:10
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 5.12.2019 15:10
 *
 */

package functions

fun main() {
    print("Lütfen 0 dan büyük sayı giriniz :  ")
    tekSayilarinToplami(readLine()!!.toInt())
}

fun tekSayilarinToplami(i: Int): Int {
    var toplam = 0
    return if (i >= 0) {
        for (k in 1..i) {
            if (k % 2 != 0) {
                toplam += k
            }
        }
        toplam
    } else {
        0
    }

}