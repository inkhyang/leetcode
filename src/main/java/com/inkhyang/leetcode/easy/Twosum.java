package com.inkhyang.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int[] result = new int[2];
        for (int i = 1; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                result[0] = map.get(val);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
