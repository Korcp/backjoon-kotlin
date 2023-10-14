package level6
fun main() {
    var N = readLine()!!.toInt()
    var count = N

    repeat(N) {
        val word = readLine()!!
        val v = mutableSetOf<Char>()
        var pC: Char? = null

        for (char in word) {
            if (char != pC) {
                if (v.contains(char)) {
                    count--
                    break
                }
                v.add(char)
            }
            pC = char
        }
    }

    print(count)
}
