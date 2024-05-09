package com.inkhyang.leetcode.easy;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> roman = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);
        String[] values = s.split("");
        int counter = 0;
        for (int i = values.length - 1; i >= 0; i--) {
            if (i >= 1 && roman.get(values[i - 1]) < roman.get(values[i])) {
                counter += roman.get(values[i]) - roman.get(values[i - 1]);
                i--;
            } else counter += roman.get(values[i]);
        }
        return counter;
    }
}
