package level3

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var T = sc.nextInt()

    for (i in 1..T){
        var A =sc.nextInt()
        var B = sc.nextInt()
        println("Case #${i}: ${A} + ${B} = ${A+B}")
    }
}