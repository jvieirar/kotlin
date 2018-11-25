package com.grawar.test.kotlin

import java.lang.Math.pow

class PlusOne{

    fun plusOne(digits: IntArray): IntArray {
        return plusOneR(digits, true, digits.size - 1)
    }

    fun plusOneR(nums: IntArray, addOne: Boolean, i: Int): IntArray{
        if(addOne){
            if(nums[i] != 9){
                nums[i] = nums[i] + 1
                return nums
            }else{
                nums[i] = 0
                if(i == 0){
                    //192-196ms
//                    return plusOneR(insertAtFirst(1, nums), false, i - 1)
                    //208-212ms
                    return plusOneR(intArrayOf(1) + nums, false, i - 1)
                }else {
                    return plusOneR(nums, true, i - 1)
                }
            }
        }else{
            return nums
        }
    }

    fun insertAtFirst(num: Int, nums: IntArray): IntArray{
        var nNums = IntArray(nums.size + 1)
        nNums[0] = num
        for ((i,n) in nums.withIndex()){
            nNums[i+1] = n
        }
        return nNums
    }











    fun plusOneV1(digits: IntArray): IntArray {
        var result = ArrayList<Int>()

        //1,2,3 -> 123 -> 1,2,4
        //9,9 -> 99 -> 1,0,0

        var add = false
        for((i, digit) in digits.reversed().withIndex()){
            if(digit + 1 == 10){
                result.add(0)
                add = true
            }else{
                if(i == 0) {
                    result.add((if (add) digit + 1 else digit) + 1)
                }else{
                    result.add(if (add) digit + 1 else digit)
                }
                add = false
            }
        }
        if(add) result.add(1)

        return result.reversed().toIntArray()
    }

    fun plusOneV2(digits: IntArray): IntArray {
        var result = IntArray(5)
        //extract integer
        var sum = getNumFromArray(digits)
        //add 1
        sum += 1
        //convert to array
        var n = digits.size
        if((sum/pow(10.0, n.toDouble()).toLong()) % 10 != 0L){
            n += 1
        }
        return intToArray(sum,n)
    }

    fun getNumFromArray(nums: IntArray): Long{
        var result = 0L
        for (i in nums.size-1 downTo 0){
            result += getNum(nums[nums.size-i-1], i)
        }
        return result
    }

    //Int(K/10^(N-1)) mod 10, but we don't need the mod 10 as we have already the number isolated
    fun getNum(num: Int, n: Int): Long{
        return (num * pow(10.0, n.toDouble())).toLong()
    }

    //we know the size
    fun intToArray(num: Long, n: Int): IntArray{
        var result = ArrayList<Int>()
        for(i in n-1 downTo 0){
            result.add(((num/pow(10.0, i.toDouble()).toLong()) % 10).toInt())
        }
        return result.toIntArray()
    }
}