package level5

fun main () {

    var alp  = Array('z'-'a'+1, {-1})
    var S = readLine()!!.toCharArray()
    for ( i in 0 until S.size){
       if(alp[((S[i]-'a').toInt())]==-1){
           alp[((S[i]-'a').toInt())] =i
       }
    }
    alp.forEach { print("${it} ") }
}