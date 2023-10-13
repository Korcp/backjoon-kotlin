package level2

import java.util.Scanner

fun main () {
    var sc = Scanner(System.`in`)

    var A = sc.nextInt()
    var B = sc.nextInt()

    when {
        A>B -> {
            print(">")
        }
        A<B -> {
            print("<")
        }

        A==B -> {
            print("==")
        }
    }
}