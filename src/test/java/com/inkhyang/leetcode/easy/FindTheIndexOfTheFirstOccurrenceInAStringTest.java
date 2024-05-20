package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    private final FindTheIndexOfTheFirstOccurrenceInAString firstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void test1() {
        //given
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        //when
        int actual = firstOccurrenceInAString.strStr(haystack, needle);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //given
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        //when
        int actual = firstOccurrenceInAString.strStr(haystack, needle);
        //then
        assertEquals(expected, actual);
    }
}