package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwosumTest {
    private Twosum twosum = new Twosum();

    @Test
    void test1(){
        //given
        int[] nums = new int[]{3,2,3};
        int target = 6;
        //test
        int[] expected = new int[]{0,2};
        int[] actual = twosum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
    @Test
    void test2(){
        //given
        int[] nums = new int[]{3,3};
        int target = 6;
        //test
        int[] expected = new int[]{0,1};
        int[] actual = twosum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
    @Test
    void test3(){
        //given
        int[] nums = new int[]{3,2,4};
        int target = 6;
        //test
        int[] expected = new int[]{1,2};
        int[] actual = twosum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
    @Test
    void test4(){
        //given
        int[] nums = new int[]{3,2,4,11,25,32};
        int target = 43;
        //test
        int[] expected = new int[]{3,5};
        int[] actual = twosum.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}