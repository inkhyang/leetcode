package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void test1() {
        //given
        String s = "()[]{}";
        boolean expected = true;
        //when
        boolean actual = validParentheses.isValid(s);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        //given
        String s = "()[]{}(({))";
        boolean expected = false;
        //when
        boolean actual = validParentheses.isValid(s);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        //given
        String s = "()[{([()])}]{}";
        boolean expected = true;
        //when
        boolean actual = validParentheses.isValid(s);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test4() {
        //given
        String s = "([{)}]";
        boolean expected = false;
        //when
        boolean actual = validParentheses.isValid(s);
        //then
        assertEquals(expected, actual);
    }
}