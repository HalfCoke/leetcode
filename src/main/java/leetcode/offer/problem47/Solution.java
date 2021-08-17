package leetcode.offer.problem47;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assert.assertEquals(12, solution.maxValue(grid));

    }

    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]) + grid[i][j];
            }
        }
        return dp[grid.length][grid[0].length];
    }
}
