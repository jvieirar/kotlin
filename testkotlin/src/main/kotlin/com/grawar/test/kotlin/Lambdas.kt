package com.grawar.test.kotlin

class Lambdas{
    fun testLambdas(){
        var counter = 0
        //we can modify vars from context
        var firstLamda: (Int, Int) -> Int
        firstLamda = {
            a: Int, b: Int ->
            counter++
            a + b
        }
        println("Lambda of 1 and 2 is ${firstLamda(1,2)}. Counter is $counter")
    }

    //lamda as argument to define behaviour
    fun modifArray(nums: IntArray, mod: (Int) -> Int): IntArray{
        var arrayMod = IntArray(nums.size)
        for((i, num) in nums.withIndex()){
            arrayMod[i] = mod(num)
        }
        return arrayMod
    }
}