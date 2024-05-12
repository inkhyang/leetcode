package com.inkhyang.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        int i = 0;
        while (i < firstWord.length() && i < lastWord.length()){
            if (firstWord.charAt(i) == lastWord.charAt(i)){
                i++;
            }
            else {
                break;
            }
        }
        return firstWord.substring(0, i);
    }
}
