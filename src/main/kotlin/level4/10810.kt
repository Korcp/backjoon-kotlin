package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var M = sc.nextInt()
    var arr = IntArray(N+1,{0})

    for(A in 0 until M) {
        var i = sc.nextInt()
        var j = sc.nextInt()
        var k = sc.nextInt()
        for (B in i..j) {
            arr[B] = k
        }
    }

    for(C in 1 .. N){
        print("${arr[C]} ")
    }
}