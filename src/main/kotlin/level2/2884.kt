package level2

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)
    var H = sc.nextInt()
    var M = sc.nextInt()

    when {
        H==0 && M<45 -> {
            H=23
            M=M+60-45}
        M<45 -> {
           H=H-1
            M=M+60-45}
        else -> M=M-45
    }
   print("${H} ${M}")
}