package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var M = sc.nextInt()
    var arr = IntArray(N)

    for(i in 0 until N){
        arr[i]=i+1
    }

    for( A in 1 .. M){
        var i = sc.nextInt()-1
        var j = sc.nextInt()-1

        while(i<j){
            var temp = arr[i]
            arr[i]=arr[j]
            arr[j]=temp
            j--
            i++
        }
    }
    for(B in 0 until N){
        print("${arr[B]} ")
    }
}