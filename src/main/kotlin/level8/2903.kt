package level8

fun main (){
    var N = readLine()!!.toInt()
    var result =2

    for(i in 0 .. N-1){
        result+=(result-1)
    }
    print(result*result)


}