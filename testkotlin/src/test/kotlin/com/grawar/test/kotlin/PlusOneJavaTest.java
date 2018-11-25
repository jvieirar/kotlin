package com.grawar.test.kotlin;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneJavaTest {
    private PlusOneJava po = new PlusOneJava();


    @Test
    public void givenArrayWhenPlusOneThenIncrement(){
        //given
        int[] input = new int[]{1,2,3};

        //when
        int[] result = po.plusOne(input);

        //then
        assertArrayEquals(new int[]{1,2,4}, result);

        input = new int[]{4,3,2,1};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{4,3,2,2}, result);

        input = new int[]{9};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{1,0}, result);

        input = new int[]{9,9};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{1,0,0}, result);

        input = new int[]{2,9,9};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{3,0,0}, result);

        input = new int[]{9,8,7,6,5,4,3,2,1,0};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, result);

        input = new int[]{9,9,9,9,9,8,7,6,5,4,3,2,1,0};
        result = po.plusOne(input);
        assertArrayEquals(new int[]{9,9,9,9,9,8,7,6,5,4,3,2,1,1}, result);
    }
}