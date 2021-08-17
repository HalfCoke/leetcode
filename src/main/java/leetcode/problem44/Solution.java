package leetcode.problem44;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1,solution.findNthDigit(16));
        Assert.assertEquals(1,solution.findNthDigit(1000000000));
    }

    public int findNthDigit(int n) {
        if (n == 0) return 0;
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = (n - 1) / digit + start;
        String s = String.valueOf(num);
        return s.charAt((n - 1) % digit) - '0';
    }
}
