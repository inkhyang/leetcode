package com.inkhyang.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void test1() {
        //given
        int input = 5;
        List<List<Integer>> expected = List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1));
        //when
        List<List<Integer>> actual = pascalsTriangle.generate(input);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        //given
        int input = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        //when
        List<List<Integer>> actual = pascalsTriangle.generate(input);
        //then
        assertEquals(expected, actual);
    }
}