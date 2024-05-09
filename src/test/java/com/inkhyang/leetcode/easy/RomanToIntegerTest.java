package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void test1(){
        //given
        String s = "III";
        int expected = 3;
        //when
        int actual = romanToInteger.romanToInt(s);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test2(){
        //given
        String s = "LVIII";
        int expected = 58;
        //when
        int actual = romanToInteger.romanToInt(s);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test3(){
        //given
        String s = "MCMXCIV";
        int expected = 1994;
        //when
        int actual = romanToInteger.romanToInt(s);
        //then
        assertEquals(expected, actual);
    }

}