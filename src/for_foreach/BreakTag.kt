/*
 *
 *   Created by Arda Kazancı on 4.12.2019 23:08
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 4.12.2019 23:08
 *
 */

package for_foreach

fun main(args: Array<String>) {

    dongu1@ for (i in 1..4) {
        dongu2@ for (k in 1..5) {

            println("i = $i ve k = $k")
            if (i == 3) break@dongu2

        }
    }

}