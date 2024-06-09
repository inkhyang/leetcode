package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {
    private final PlusOne plusOne = new PlusOne();

    @Test
    void test1() {
        //given
        int[] givenDigits = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        //when
        int[] actual = plusOne.plusOne(givenDigits);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        //given
        int[] givenDigits = new int[]{4, 3, 2, 1};
        int[] expected = new int[]{4, 3, 2, 2};
        //when
        int[] actual = plusOne.plusOne(givenDigits);
        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        //given
        int[] givenDigits = new int[]{9, 9};
        int[] expected = new int[]{1, 0, 0};
        //when
        int[] actual = plusOne.plusOne(givenDigits);
        //then
        assertArrayEquals(expected, actual);
    }

}