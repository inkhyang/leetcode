package com.inkhyang.leetcode.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) val = i + 1;
            if (nums[i] == target) return i;

        }
        return val;
    }
}
