package level3

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N =sc.nextInt()

    for(i in 1..9){
        println("${N} * ${i} = ${N*i}")
    }
}