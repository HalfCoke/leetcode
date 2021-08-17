package leetcode.problem19;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Assert.assertFalse(solution.isMatch("aa", "a"));

        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("aa", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));

        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));

        Assert.assertTrue(solution.isMatch("aaa", "ab*a*c*a"));
        Assert.assertFalse(solution.isMatch("aaa", "aaaa"));
        Assert.assertFalse(solution.isMatch("a", "ab*a"));

    }

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 2; i < p.length() + 1; i += 2) {
            dp[0][i] = dp[0][i - 2] && p.charAt(i - 1) == '*';
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                if (p.charAt(j - 1) != '*') {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1));
                    dp[i][j] = dp[i][j] || (dp[i - 1][j - 1] && (p.charAt(j - 1) == '.'));
                } else {
                    dp[i][j] = dp[i][j - 2];
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2)));
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && (p.charAt(j - 2) == '.'));
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
