/*
 *
 *   Created by Arda Kazancı on 3.12.2019 21:17
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 3.12.2019 21:17
 *
 */

package variables_type

/**
 *  Byte    -     1 Byte
 *  Short   -     2 Byte
 *  Int     -     4 Byte
 *  Long    -     8 Byte
 *  Float   -     4 Byte   -   Ondalık Değer
 *  Double  -     8 Byte   -   Ondalık Değer
 *  Char    -     2 Byte   -   Karakterler
 *  Boolean -     1 Bit    -   True yada False
 */

fun main(args: Array<String>) {

    var v1 = "C"
    var v2 = 0.1
    var v3 = 0.1F
    var v4 = 0.999
    var v5 = 12
    var v6 = -124
    var v7 = 1232341234234
    var v8 = 313423423424234242
    // var v9 = 132342342342545243131313 Error
    var v9 = true

    var v11 : Short = 1234
    var v12 : Double = 1.23
    var v13 : Float = 1.2F
    var v14 : Long = 123L

    // var v15 : Char = "C" Error - ' ' != " "
    // var v15 : Char = "C3" Error
    var v15 : Char = 'C'

    var v16 : String = "Deneme"



}