package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void test1() {
        //given
        int[] nums = new int[]{1, 1, 2};
        int expectedLength = 2;
        int[] expectedNums = new int[]{1, 2};
        //when
        removeDuplicatesFromSortedArray.removeDuplicates(nums);
        int[] actualNums = Arrays.copyOf(nums, expectedLength);
        //then
        assertArrayEquals(expectedNums, actualNums);
    }

    @Test
    void test2() {
        //given
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength = 5;
        int[] expectedNums = new int[]{0, 1, 2, 3, 4};
        //when
        removeDuplicatesFromSortedArray.removeDuplicates(nums);
        int[] actualNums = Arrays.copyOf(nums, expectedLength);
        //then
        assertArrayEquals(expectedNums, actualNums);
    }
}