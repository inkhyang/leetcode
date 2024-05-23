package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthOfLastWordTest {
    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    void test1() {
        //given
        String input = "Hello World";
        int expected = 5;
        //when
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        //given
        String input = "   fly me   to   the moon  ";
        int expected = 4;
        //when
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        //given
        String input = "luffy is still joyboy";
        int expected = 6;
        //when
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void negative_test() {
        //given
        String input = "luffy is still joy";
        int notExpected = 6;
        //when
        int actual = lengthOfLastWord.lengthOfLastWord(input);
        //then
        assertNotEquals(notExpected, actual);
    }
}