package level6

fun main () {
    var chess = readLine()!!.split(" ").map { it.toInt() }
    var k =1
    var l =2
    var p =8

    for ( i in 0 .. 1){
        print("${k-chess[i]} ")
    }
    for ( i in 2 .. 4){
        print("${l-chess[i]} ")
    }
    for ( i in 5 .. 5){
        print("${p-chess[i]} ")
    }
}