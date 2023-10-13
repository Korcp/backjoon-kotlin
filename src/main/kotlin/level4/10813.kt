package level4

import java.util.Scanner

fun main () {
    var sc =Scanner(System.`in`)
    var N = sc.nextInt()
    var M = sc.nextInt()
    var arr = IntArray(N)
                    //0,1,2,3,4
    for(i in 0 until N){
        arr[i]=i+1
    }
     for(A in 0 until M ){
         var i =sc.nextInt()
         var j =sc.nextInt()
         var temp = arr[i-1]
         arr[i-1]=arr[j-1]
         arr[j-1]=temp
     }

    for(i in 0 until N){
        print("${arr[i]} ")
    }
}