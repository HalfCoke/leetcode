package leetcode.offer.problem63;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        int minPrices = prices[0];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrices = Math.min(minPrices, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrices);
        }
        return dp[prices.length - 1];
    }
}
