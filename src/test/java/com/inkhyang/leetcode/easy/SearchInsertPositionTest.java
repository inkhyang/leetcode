package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {
    private final SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    void test1() {
        //given
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;

        int expected = 2;
        //when
        int actual = searchInsertPosition.searchInsert(nums, target);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //given
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 2;

        int expected = 1;
        //when
        int actual = searchInsertPosition.searchInsert(nums, target);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        //given
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;

        int expected = 4;
        //when
        int actual = searchInsertPosition.searchInsert(nums, target);
        //then
        assertEquals(expected, actual);
    }
}