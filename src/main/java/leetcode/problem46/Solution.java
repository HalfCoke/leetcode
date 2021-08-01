package leetcode.problem46;

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
        int[] dp = new int[numString.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < numString.length(); i++) {
            int i1 = Integer.parseInt(numString.substring(i - 1, i + 1));
            if (i1 < 26 && i1 > 9) {
                dp[i + 1] += dp[i - 1];
            }
            dp[i + 1] += dp[i];
        }
        return dp[numString.length()];
    }
}
