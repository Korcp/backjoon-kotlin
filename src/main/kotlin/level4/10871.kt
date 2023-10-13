package level4

import java.util.Scanner

//fun main () {
//    var sc = Scanner(System.`in`)
//    var N = sc.nextInt()
//    var X = sc.nextInt()
//    var arr = IntArray(N)
//    for( i in 0 until N){
//        var A = sc.nextInt()
//        arr[i]=A
//    }
//
//    for ( i in 0 until N){
//        if(arr[i]<X){
//            print("${arr[i]} ")
//        }
//    }
//}

fun main () {
    var sc =Scanner(System.`in`)
    var N = sc.nextInt()
    var X = sc.nextInt()
    for( i in 0 until N){
        var A = sc.nextInt()
        if(A<X){
            print("${A} ")
        }
    }
}