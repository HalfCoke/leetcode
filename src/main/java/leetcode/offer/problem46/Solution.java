package leetcode.offer.problem46;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.translateNum(12258));
        Assert.assertEquals(1, solution.translateNum(26));
        Assert.assertEquals(1, solution.translateNum(506));
    }

    public int translateNum(int num) {
        String numString = String.valueOf(num);
        int[] dp = new int[numString.length()];
        dp[0] = 1;
        for (int i = 1; i < numString.length(); i++) {
            int doubleNumber = Integer.parseInt(numString.substring(i - 1, i + 1));
            if (doubleNumber < 26 && doubleNumber > 9) {
                if (i > 1) dp[i] += dp[i - 2];
                else dp[i] += 1;
            }
            dp[i] += dp[i - 1];
        }
        return dp[numString.length() - 1];
    }
}
