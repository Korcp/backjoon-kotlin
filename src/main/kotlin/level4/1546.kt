package level4

import java.util.Scanner

fun main (){
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var arr = DoubleArray(N)
    var sum:Double= 0.0

    for ( i in 0 until N ){
        var s = sc.nextDouble()
        arr[i]=s
    }

    var max =arr.max()
    for ( i in 0 until N){
        arr[i]=arr[i]/max*100
    }

    for ( i in 0  until N){
        sum=sum+arr[i]
    }
    var av = sum/N
    print(av)
}