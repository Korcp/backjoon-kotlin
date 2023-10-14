package level7

fun main () {
    var (N,M) = readLine()!!.split(" ").map { it.toInt() }
    var arr  = Array(N){IntArray(M)}

    for(i in 0 until N){
        var a = readLine()!!.split(" ").map { it.toInt() }
        for(j in 0 until M) {
            arr[i][j] += a[j]
        }
    }

    for(i in 0 until N){
        var b = readLine()!!.split(" ").map { it.toInt() }
        for(j in 0 until M){
            arr[i][j] += b[j]
        }
    }

    for(i in 0 until N) {
            if(i>0) println()
        for (j in 0 until M) {
            print("${arr[i][j]} ")
        }
    }
}