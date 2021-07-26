package leetcode.problem10.problem10_2;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.numWays(2));
        Assert.assertEquals(21, solution.numWays(7));
    }

    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        int one = 1, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
