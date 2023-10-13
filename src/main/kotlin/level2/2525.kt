package level2

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var A = sc.nextInt()
    var B = sc.nextInt()
    var C = sc.nextInt()

    if(A<=23){
        A=A+C/60
        B=B+C%60

        if(A>=24){
            A=A-24
        }
        if(B>=60){
            B=B-60
            A=A+1
            if(A>=24){
                A=A-24
            }
        }
    }
    else {
        A=A-24
        A=A+C/60
        B=B+C%60
        if(B>=60){
            A=A+1
            B=B-60
        }

    }

    print("${A} ${B}")
}