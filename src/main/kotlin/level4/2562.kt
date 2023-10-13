package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var arr = IntArray(9)
    for( i in 0 until 9){
        var N =sc.nextInt()
        arr[i]=N
    }
    println(arr.max())
    println(arr.indexOf((arr.max()))+1)

}