package com.inkhyang.leetcode.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int y = 0;
        for (int i = needle.length(); i <= haystack.length(); i++) {
            if (needle.equals(haystack.substring(y, i))) return y;
            y++;
        }
        return -1;
    }
}
