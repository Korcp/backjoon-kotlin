package level6

fun main () {
    var S = readLine()!!.toCharArray()

    var alp = IntArray('z'-'a'+1){0}

    S.forEach { alp[it-'a']}

    alp.forEach { it }

}