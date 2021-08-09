fun main(args: Array<String>){

    var Age = 9
    var isUserSingle = true

    var datingResult : Boolean = (Age > 20)
            && (isUserSingle == true)

    println(datingResult)

    var datingResult2 : Boolean = (Age > 20)||
    (isUserSingle == true)

    println(datingResult2)

}