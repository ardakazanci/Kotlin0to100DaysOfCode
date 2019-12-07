/*
 *
 *   Created by Arda Kazancı on 7.12.2019 20:24
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 7.12.2019 20:24
 *
 */

package `object`

// Bir sınıfın property ve metodlarına tüm projeden
// tek bir örnek üzerinden ulaşmak istersek object kullanırız.


fun main() {

    var sample_user = getUserInsertDate.userInsertDate

}

object getUserInsertDate {

    var userId: Int = 0
    var userName: String = ""
    var userInsertDate: String = ""

    fun getUserRoles() {

    }

}

// Eğer normal bir class içinde belirli metodlar ya da propertylerin istenilen noktada çağırılması için.

class SampleClassCompanion {

    var sample_prop: String? = null

    companion object {
        // property ya da metod.
    }

}