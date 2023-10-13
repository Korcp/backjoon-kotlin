package level3

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var X = sc.nextInt()
    var N  = sc.nextInt()
    var sum =0
    for(i in 1..N){
        var a =sc.nextInt()
        var b= sc.nextInt()
        sum = sum+(a*b)
    }
    if(X==sum){
        println("Yes")
    }
    else println("No")

}