package leetcode.problem13;

import org.junit.Assert;

public class Solution {

    int[][] offsets = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.movingCount(2, 3, 1));
        Assert.assertEquals(1, solution.movingCount(3, 1, 0));
        Assert.assertEquals(1, solution.movingCount(1, 1, 0));
        Assert.assertEquals(15, solution.movingCount(16, 8, 4));
        Assert.assertEquals(135, solution.movingCount(38, 15, 9));
    }

    public int movingCount(int m, int n, int k) {
        int[][] flag = new int[m][n];
        return dfs(0, 0, k, flag, 0);
    }

    private int dfs(int x, int y, int k, int[][] flag, int count) {
        if (countCooSum(x, y) > k || flag[x][y] != 0) {
            return count;
        }
        flag[x][y] = 1;
        count++;
        for (int[] offset : offsets) {
            int x1 = x + offset[0];
            int y1 = y + offset[1];
            x1 = x1 >= 0 ? (x1 < flag.length ? x1 : flag.length - 1) : 0;
            y1 = y1 >= 0 ? (y1 < flag[0].length ? y1 : flag[0].length - 1) : 0;

            count = dfs(x1, y1, k, flag, count);
        }
        return count;
    }

    private int countCooSum(int m, int n) {
        int res = 0;
        while (m != 0) {
            res += m % 10;
            m = m / 10;
        }
        while (n != 0) {
            res += n % 10;
            n = n / 10;
        }
        return res;
    }
}
