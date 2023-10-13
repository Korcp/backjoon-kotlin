package level5

fun main () {
    var T = readLine()!!.toInt()

    repeat(T){
        var (R,S) = readLine()!!.split(" ")
        var result =""

        for(char in S){
            repeat(R.toInt()){
                result +=char
            }
        }
        println(result)
    }
}