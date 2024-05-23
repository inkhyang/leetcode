package com.inkhyang.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        String result = strs[strs.length-1].trim();
        return result.length();
    }
}
