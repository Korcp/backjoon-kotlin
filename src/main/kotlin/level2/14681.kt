package level2

import java.util.Scanner

fun main (){
    var sc = Scanner(System.`in`)
    var x =sc.nextInt()
    var y =sc.nextInt()

    when {
        x>0 && y>0 -> print("1")
        x<0 && y>0 -> print("2")
        x<0 && y<0 -> print("3")
        x>0 && y<0 -> print("4")
    }
}