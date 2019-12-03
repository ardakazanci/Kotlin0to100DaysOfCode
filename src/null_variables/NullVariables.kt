/*
 *
 *   Created by Arda Kazancı on 3.12.2019 21:26
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 3.12.2019 21:26
 *
 */

package null_variables

fun main(args : Array<String>){

    var v1 : String? = null

    var v2 : String = "" // Not Null
    var v3 : Int = 0 // Not Null

    // *** Null Safety Örnek

    var v4 : String? = "Deneme"
    println(v4?.length) // Null olabileceği için, metodları çağırdığımızda null olabilir diyoruz.

    var v5  = v4?.length // v4 null olabilir anlamı taşır.
    var v6 = v4!!.length // v4 kesinlikle null değil anlamı taşır.

}