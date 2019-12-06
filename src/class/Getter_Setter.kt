/*
 *
 *   Created by Arda Kazancı on 6.12.2019 23:12
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 23:12
 *
 */

package `class`

fun main() {
    var userget = UserGet()
    userget.username // Default getter
}

class UserGet {
    var username: String? = "Arda"
}

// Manual getter - setter
class UserGet_2 {
    var userName: String = "Arda"
        get() = field
        set(value) {
            field = value
        }
}

// ne zaman kullanmalıyız ?
// kapsülleme durumlarında - setter ile kontrol metodlarında vb.

class UserGet_3 {
    var userAge: Int? = null
        set(value) {
            if (value != null) {
                field = if (value < 18) {
                    print("18 den küçük olamaz")
                    value
                } else {
                    value
                }
            }
        }
}