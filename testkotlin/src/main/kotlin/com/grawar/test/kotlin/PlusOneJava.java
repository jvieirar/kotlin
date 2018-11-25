package com.grawar.test.kotlin;

public class PlusOneJava {
    public int[] plusOne(int[] digits) {
        return plusOneR(digits, true, digits.length - 1);
    }

    private int[] plusOneR(int []nums, boolean addOne, int i){
        if(addOne){
            if(nums[i] != 9){
                nums[i] = nums[i] + 1;
                return nums;
            }else{
                nums[i] = 0;
                if(i == 0){
                    return plusOneR(insertAtFirst(1, nums), false, i - 1);
                }else {
                    return plusOneR(nums, true, i - 1);
                }
            }
        }else{
            return nums;
        }
    }

    private int[] insertAtFirst(int num, int [] nums){
        int[] nNums = new int[nums.length + 1];
        nNums[0] = num;
        System.arraycopy(nums, 0, nNums, 1, nums.length);
        return nNums;
    }
}
