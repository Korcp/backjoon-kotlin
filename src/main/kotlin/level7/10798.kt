package level7

fun main(){
    var arr = Array(5){CharArray(15){ ' '}}
    var sum = " "
    for( i in 0 until 5){
        var input = readLine()?: " "
        for(j in input.indices){
            arr[i][j]=input[j]
        }
    }

    for(i in 0 until 15){
        for( j in 0 until 5){
            sum+=arr[j][i]
        }
    }
    sum = sum.replace("\\s".toRegex(), "")
    print(sum)
}