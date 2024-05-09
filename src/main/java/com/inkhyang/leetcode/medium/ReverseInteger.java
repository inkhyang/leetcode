package com.inkhyang.leetcode.medium;

public class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = x < 0;
        int result = 0;
        int m;
        if (isNegative) x *= -1;
        while (x > 0) {
            m = x % 10;
            int validValue = (Integer.MAX_VALUE - x) / 10;
            if (result > validValue) return 0;
            result *= 10;
            result += m;
            x /= 10;
        }
        if (isNegative) result *= -1;
        return result;
    }
}
