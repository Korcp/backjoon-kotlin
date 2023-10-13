package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var arr = IntArray(N)

    for(i in 0 until N){
       var n = sc.nextInt()
       arr[i]=n
    }

    println("${arr.min()} ${arr.max()}")
}