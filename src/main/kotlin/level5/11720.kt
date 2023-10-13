package level5

fun main () {
    var N = readLine()!!.toInt()
    var n = readLine()!!.toCharArray()
    var sum =0
    for(i in 0 until N ){
        sum += n[i].toString().toInt()
    }
    print(sum)

}