package level3

import java.util.Scanner

fun main (){
    var sc = Scanner(System.`in`)
    while(true){
        var A = sc.nextInt()
        var B = sc.nextInt()
        if(A==0 && B==0){
            break;
        }
        else println("${A+B}")
    }


}