package leetcode.offer.problem43;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.countDigitOne(12));
        Assert.assertEquals(6, solution.countDigitOne(13));
        Assert.assertEquals(2, solution.countDigitOne(10));
        Assert.assertEquals(1737167499, solution.countDigitOne(1410065408));

    }

    public int countDigitOne(int n) {
        int digit = 1;
        int count = 0;

        int high = n / 10, cur = n % 10, low = 0;

        while (high != 0 || cur != 0) {
            if (cur == 0) {
                count += high * digit;
            } else if (cur == 1) {
                count += high * digit + low + 1;
            } else {
                count += (high + 1) * digit;
            }
            low += cur * digit;
            cur = high % 10;
            high = high / 10;
            digit *= 10;
        }

        return count;
    }
}
