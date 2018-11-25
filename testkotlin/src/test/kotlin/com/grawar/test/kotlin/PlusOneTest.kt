package com.grawar.test.kotlin

import org.junit.Assert.*
import org.junit.Test

class PlusOneTest{
    val po = PlusOne()

    @Test
    fun recursividad(){
        //given
        var input = intArrayOf(1,2,3)

        //when
        var result = po.plusOneR(input, true, input.size - 1)

        //then
        assertArrayEquals(intArrayOf(1,2,4), result)

        input = intArrayOf(9,9)
        result = po.plusOneR(input, true, input.size - 1)
        assertArrayEquals(intArrayOf(1,0,0), result)

        input = intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,0)
        result = po.plusOneR(input, true, input.size - 1)
        assertArrayEquals(intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,1), result)
    }


    @Test
    fun givenArrayWhenPlusOneThenIncrement(){
        //given
        var input = intArrayOf(1,2,3)

        //when
        var result = po.plusOne(input)

        //then
        assertArrayEquals(intArrayOf(1,2,4), result)

        input = intArrayOf(4,3,2,1)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(4,3,2,2), result)

        input = intArrayOf(9)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(1,0), result)

        input = intArrayOf(9,9)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(1,0,0), result)

        input = intArrayOf(2,9,9)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(3,0,0), result)

        input = intArrayOf(9,8,7,6,5,4,3,2,1,0)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(9,8,7,6,5,4,3,2,1,1), result)

        input = intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,0)
        result = po.plusOne(input)
        assertArrayEquals(intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,1), result)
    }


    @Test
    fun givenArrayWhenPlusOneThenIncrementV1(){
        //given
        var input = intArrayOf(1,2,3)

        //when
        var result = po.plusOneV1(input)

        //then
        assertArrayEquals(intArrayOf(1,2,4), result)

        input = intArrayOf(4,3,2,1)
        result = po.plusOneV1(input)
        assertArrayEquals(intArrayOf(4,3,2,2), result)

        input = intArrayOf(9)
        result = po.plusOneV1(input)
        assertArrayEquals(intArrayOf(1,0), result)

        input = intArrayOf(9,9)
        result = po.plusOneV1(input)
        assertArrayEquals(intArrayOf(1,0,0), result)

        input = intArrayOf(2,9,9)
        result = po.plusOneV1(input)
        assertArrayEquals(intArrayOf(3,0,0), result)

        input = intArrayOf(9,8,7,6,5,4,3,2,1,0)
        result = po.plusOneV1(input)
        assertArrayEquals(intArrayOf(9,8,7,6,5,4,3,2,1,1), result)
    }

    @Test
    fun givenArrayWhenPlusOneThenIncrementV2(){
        //given
        var input = intArrayOf(1,2,3)

        //when
        var result = po.plusOneV2(input)

        //then
        assertArrayEquals(intArrayOf(1,2,4), result)

        input = intArrayOf(4,3,2,1)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(4,3,2,2), result)

        input = intArrayOf(9)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(1,0), result)

        input = intArrayOf(9,9)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(1,0,0), result)

        input = intArrayOf(2,9,9)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(3,0,0), result)

        input = intArrayOf(9,8,7,6,5,4,3,2,1,0)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(9,8,7,6,5,4,3,2,1,1), result)

        input = intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,0)
        result = po.plusOneV2(input)
        assertArrayEquals(intArrayOf(9,9,9,9,9,8,7,6,5,4,3,2,1,1), result)
    }

    @Test
    fun givenArrayGetEquivalentNum(){
        //given
        var input = intArrayOf(1,2,3)

        //when
        var result = po.getNumFromArray(input)

        //then
        assertEquals(123, result)
    }
}