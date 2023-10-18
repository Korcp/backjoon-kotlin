package level7
fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(100) { IntArray(100) { 0 } }

    for (i in 0 until n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        for (j in x until x + 10) {
            for (z in y until y + 10) {
                if (j in 0 until 100 && z in 0 until 100) {
                    arr[j][z] = 1
                }
            }
        }
    }
    println(arr.sumBy { it.count { value -> value == 1 } })
}
