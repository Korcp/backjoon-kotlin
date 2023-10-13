package level4

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var arr = IntArray(N)
    var cnt =0
    for(i in 0 until  N){
        var B = sc.nextInt()
        arr[i]=B
    }
    var v = sc.nextInt()

    for (i in 0 until N){
        if(arr[i]== v){
            cnt++
        }
        else continue;
    }

    print(cnt)
}