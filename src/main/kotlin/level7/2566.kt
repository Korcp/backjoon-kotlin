package level7

fun main () {
    var arr = Array(9){IntArray(9){0}}
    var mN =0
    var mR =0
    var mC =0

    for (i in 0 .. 8){
        var score = readLine()!!.split(" ").map { it.toInt() }
        for (j in 0 .. 8){
            arr[i][j] = score[j]
           if(arr[i][j]>mN){
               mN =arr[i][j]
               mR =i
               mC =j
           }
        }
    }
    println(mN)
    println("${mR+1} ${mC+1}")
}