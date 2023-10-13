package level4

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10)

    for (i in 0 until 10) {
        val N = sc.nextInt()
        arr[i] = N % 42
    }

    val darr = arr.distinct().size
    println(darr)
}
