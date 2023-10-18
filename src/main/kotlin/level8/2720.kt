package level8

fun main (){
    var T = readLine()!!.toInt()
    val Q = 25
    val D = 10
    val L = 5

    for( i in 0 .. T-1){
        var C = readLine()!!.toInt()
        var Q1 = C/Q
        var D1 = (C%Q)/D
        var L1 = ((C%Q)%D)/L
        var P1 = (((C%Q)%D)%L)
        println("${Q1} ${D1} ${L1} ${P1}")
    }
}