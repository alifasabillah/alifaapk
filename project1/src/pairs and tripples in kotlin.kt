class `pairs and tripples in kotlin`

fun main(args: Array<String>){
 //   val xAndy  = Pair(80, 20)
 //   println(xAndy)
 //   println(xAndy.first)
 //   println(xAndy.second)

 //   val xAndWithTo = 30 to 100
 //   println(xAndWithTo.first)
 //   println(xAndWithTo.second)

 //   val mixedPair = 5.4 to 9

 //   val(x, y) = mixedPair
 //   println(x)
 //   println(y)

    //kesimpulannya sama saja

    val xyz: Triple<Int, Double, Float> = Triple(10, 20.5, 30.9f)

    println(xyz.first)
    println(xyz.second)
    println(xyz.third)

    val (x2, y2, z2) = xyz

    println(x2)
    println(y2)
    println(z2)



}