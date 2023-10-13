package level3

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var n =sc.nextInt()
    var sum : Int = 0

    for ( i in 1 .. n) {
        sum = sum + i
    }

    println(sum)
}
