package level5

fun main(){
    var T = readLine()!!.toInt()

    for( i in 0 until T){
        var a = readLine()!!.toCharArray()
        var s =a.lastIndex
        println(a[0]+""+a[s])
    }

}