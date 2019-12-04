/*
 *
 *   Created by Arda Kazancı on 4.12.2019 21:23
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 21:23
 *
 */

package for_foreach

fun main(args: Array<String>) {

    /** For Döngüsü **/

    //for(i in 1..10) println("İlgili değer $i")
    //for (i in 100 downTo  1) println("İlgili değer $i")
    //for (i in 1.rangeTo(20) step 2) println("ilgili değer $i")
    //for( i in 1..100) println("ilgili değer $i")

    /** For-Each Döngüsü **/

    // Exercise 1
    (1..100).forEach { i ->
        println("ilgili değer $i")
    }

    // Exercise 2
    var sampleWord = "Arda Kazancı"
    var sampleWordLength = sampleWord.length
    (0..sampleWordLength - 1).forEach { i ->

        for (k in 1..i) {
            print(" ")
        }
        println(sampleWord[i])


    }

    /*
                *
                * *
                * * *
                * * * *
                * * * * *
     */

    /*for(i in 1..5) {
        if (i == 1){
            println(" * ")
        }else{
            for( k in 1..i){
                print(" * ")
            }
            println("")
        }

    }*/

    /*
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
    */

    for (i in 1..5) {
        if (i == 1) {
            for (z in 5 downTo i) {
                print(" ")
            }
            println(" * ")
        } else {
            for (k in 1..i) {
                for (z in 5 downTo i) {
                    if (k > 1) {
                        break
                    }
                    print(" ")
                }
                print(" * ")
            }
            println("")
        }
    }


}