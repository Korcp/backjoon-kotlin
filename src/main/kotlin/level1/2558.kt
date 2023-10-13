package level1

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var f = sc.nextInt()
    var s = sc.nextInt()

    var t = s%10
    var fo = (s/10)%10
    var fi = s/100

    println(f*t)
    println(f*fo)
    println(f*fi)
    println(f*s)
}