package leetcode.problem49;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(12, solution.nthUglyNumber(10));
        Assert.assertEquals(15, solution.nthUglyNumber(11));
        System.out.println(solution.nthUglyNumber(1352));
    }

    public int nthUglyNumber(int n) {
        int[] dp = new int[1700];
        int a = 1, b = 1, c = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
            if (dp[i] == dp[a] * 2) {
                a++;
            }
            if (dp[i] == dp[b] * 3) {
                b++;
            }
            if (dp[i] == dp[c] * 5) {
                c++;
            }
        }

        return dp[n];
    }
}
