package leetcode.problem14_1;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.cuttingRope(2));
        Assert.assertEquals(36, solution.cuttingRope(10));
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = 1; j < i; j++) {
                int t = Math.max(dp[j], j);
                dp[i] = Math.max(dp[i], t * (i - j) % 1000000007);
            }
        }
        return dp[n];
    }
}
