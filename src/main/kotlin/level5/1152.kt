package level5

fun main () {
    var S = readLine()!!.split(" ").toMutableList()
    S.removeAll(listOf(""))
    print("${S.size}")
}