package com.grawar.test.kotlin

fun main(args: Array<String>) {
    //lambdas
    var ld = Lambdas()
    ld.testLambdas()
    println()

    var nums = intArrayOf(1,2,3)
    var threeTimes = ld.modifArray(nums){it * 3}
//    var threeTimes = ld.modifArray(nums){
//        num: Int -> num * 3
//    }
    threeTimes.forEach { println(it) }
    println()
}