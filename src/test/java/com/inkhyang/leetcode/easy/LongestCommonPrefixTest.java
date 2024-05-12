package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void test1(){
        //given
        String[] strs =  new String[]{"flower","flow","flight"};
        String expected = "fl";
        //when
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test2(){
        //given
        String[] strs =  new String[]{"dog","racecar","car"};
        String expected = "";
        //when
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test3(){
        //given
        String[] strs =  new String[]{"billing","billy","bilbo"};
        String expected = "bil";
        //when
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        //then
        assertEquals(expected, actual);
    }
}