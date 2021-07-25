package leetcode.problem15;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.hammingWeight(1));
        Assert.assertEquals(1, solution.hammingWeight(2));
        Assert.assertEquals(1, solution.hammingWeight(4));
        Assert.assertEquals(31, solution.hammingWeight(-3));
        Assert.assertEquals(1, solution.hammingWeight(128));
        Assert.assertEquals(3, solution.hammingWeight(11));
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
