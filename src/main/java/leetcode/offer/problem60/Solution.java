package leetcode.offer.problem60;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.dicesProbability(2);
    }

    public double[] dicesProbability(int n) {
        double[][] dp = new double[n + 1][6 * n + 1];
        Arrays.fill(dp[1], 1.0 / 6);
        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j <= (i - 1) * 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    dp[i][j + k] += dp[i - 1][j] * 1 / 6;
                }
            }
        }
        return Arrays.copyOfRange(dp[n], n, dp[n].length);
    }
}
