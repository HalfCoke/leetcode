package leetcode.problem11;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.minArray(new int[]{3, 4, 5, 1, 2}));
        Assert.assertEquals(0, solution.minArray(new int[]{2, 2, 2, 0, 1}));
        Assert.assertEquals(1, solution.minArray(new int[]{1}));
        Assert.assertEquals(-10, solution.minArray(new int[]{-9,0,10,10,10,-10,-9,-9,-9,-9}));
    }

    public int minArray(int[] numbers) {
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (pre > numbers[i]) {
                return numbers[i];
            }
            pre = numbers[i];
        }
        return numbers[0];
    }
}
