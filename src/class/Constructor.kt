/*
 *
 *   Created by Arda Kazancı on 6.12.2019 23:00
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 23:00
 *
 */

package `class`

// Version 1

class Version {

    var versionName: String? = null
    var versionNumber: Int? = null

    constructor(a: String, b: Int) {
        this.versionName = a
        this.versionNumber = b
    }

}

// Version 2
// () içinde kiler constroucter belirler. get ve set değerlerini eklemiş olur

class Version2(a: String, b: Int) {

    var versionName: String? = a
    var versionNumber: Int? = b

}

// Version 2 ye ek olarak propertyleri kendi otomatik eklemiş oldu çünkü var var.
// var olduğu için read-write olur
// Version 3
class Version3(var a: String, var b: Int) {

}

// Version 4

// Val yaptığımız için sadece read-only olur.
class Version4(val a: String, val b: Int) {

}

/*
    Eğer ki constructor değerlerinin sadece bazılarına ait değer gönderilmesi istenirse
    O değerlerin default değerlerinin null yada 0 gibi değerler olması gerekir.
 */


class Version5(val a: String? = null, val b: Int? = 0) {

}

fun main() {
    var version_5 =
        Version5(b = 5) // Sadece b değerini gönderdik. Diğerleri için özel constructor oluşturmaya gerek kalmadı.
    var createUser = User("Arda", 8) // User nesnesi oluşturuldu yazacaktır.
}


class User(val name: String? = null, val age: Int = 0) {

    init { // Nesne oluşturulduğunda ilk yapılacak işlemler ele alınır.
        print("User nesnesi oluşturuldu")
    }

}