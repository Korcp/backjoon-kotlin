package level5

fun main () {
    var S = readLine()!!.toCharArray()
    var count =0;

    for(char in S){
       when(char){
           'A','B','C' -> count +=3
           'D','E','F' -> count +=4
           'G','H','I' -> count +=5
           'J','K','L' -> count +=6
           'M','I','N','O' -> count +=7
           'P','Q','R','S' -> count +=8
           'T','U','V' -> count +=9
           'W','X','Y','Z' -> count +=10
           else -> count +=11
       }
    }
    print(count)
}