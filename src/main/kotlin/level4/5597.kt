package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var arr = IntArray(30)

    for ( i in 0 until 30){
        arr[i]=i+1
    }


    for(i in 0 .. 27){
        var M=sc.nextInt()
        for( j in 0 until 30){
            if(arr[j]==M){
                arr[j]=arr[j]-M
            }
        }
    }
    var C = arr.filter { it!=0 }

    println(C.min())
    println(C.max())

}