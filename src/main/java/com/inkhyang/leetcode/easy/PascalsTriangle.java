package com.inkhyang.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] chain = new Integer[i + 1];
            Arrays.fill(chain, 1);
            result.add(Arrays.asList(chain));
        }
        for (int i = 2; i < result.size(); i++) {
            for (int t = 1; t < result.get(i).size() - 1; t++) {
                int left = result.get(i - 1).get(t - 1);
                int right = result.get(i - 1).get(t);
                result.get(i).set(t, left + right);
            }
        }
        return result;
    }
}
