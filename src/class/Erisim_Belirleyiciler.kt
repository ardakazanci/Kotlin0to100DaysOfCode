/*
 *
 *   Created by Arda Kazancı on 6.12.2019 22:53
 *   Copyright (c) 2019 . All rights reserved.
 *   Last modified 6.12.2019 22:53
 *
 */

package `class`

/*
    public
    private
    protected
    internal
 */

class A {
    fun a() {}

}

class B {
    private fun b() {}

}

private class F {
    private var f: String? = null
}

open class C {
    protected var c: String? = null
}

class D : C() {
    var d = c //
}

internal class E {
    // Diğer modüllerden erişilemez.
}

fun main() {
    val a = A()
    a.a()

    val b = B()
    // b.b error

    var f = F()
    // f.f error
}