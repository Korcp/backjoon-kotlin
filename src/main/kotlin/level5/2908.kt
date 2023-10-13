package level5

fun main(){
    var (A,B) = readLine()!!.split(" ")

    var ra= A.reversed().toInt()
    var rb =B.reversed().toInt()
    when {
        ra>rb -> print(ra)
        else ->print(rb)
    }
}