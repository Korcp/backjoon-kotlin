package level3

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N =sc.nextInt()
    var sum :String = ""
    var s =N/4
    for (i in 1 .. s){
        sum = sum+"long "
    }


    print("${sum}int")

}