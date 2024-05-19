package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void test1() {
        //given
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = new int[]{2, 2};
        int expectedLength = 2;
        //when
        removeElement.removeElement(nums, val);
        int[] actualNums = Arrays.copyOf(nums, expectedLength);
        //then
        assertArrayEquals(expectedNums, actualNums);
    }

    @Test
    void test2() {
        //given
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = new int[]{0, 1, 3, 0, 4};
        int expectedLength = 5;
        //when
        removeElement.removeElement(nums, val);
        int[] actualNums = Arrays.copyOf(nums, expectedLength);
        //then
        assertArrayEquals(expectedNums, actualNums);
    }
}