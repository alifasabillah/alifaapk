
fun main(args: Array<String>){

    var multiplyFun = ::multiply
    // (int, int) -> int
    println(multiplyFun(3 , 4))
    //multiplyFun =::divide
    val divideFun =::divide
    // (int, int) -> double
    println(divideFun(70, 20))


}

fun multiply(firstNum: Int, secondNum: Int) : Int{

    return firstNum * secondNum
}

fun divide(firstNum: Int, secondNum: Int) : Int{
    return firstNum / secondNum
}




//MASIH ADA YANG SALAH