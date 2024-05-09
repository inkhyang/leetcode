package com.inkhyang.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void test1() {
        //given
        int x = 123;
        int expected = 321;
        //when
        int actual = reverseInteger.reverse(x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //given
        int x = -501;
        int expected = -105;
        //when
        int actual = reverseInteger.reverse(x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        //given
        int x = -1000000;
        int expected = -1;
        //when
        int actual = reverseInteger.reverse(x);
        //then
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Given invalid int then return 0")
    void test4() {
        //given
        int x = -1999999999;
        int expected = 0;
        //when
        int actual = reverseInteger.reverse(x);
        //then
        assertEquals(expected, actual);
    }
}