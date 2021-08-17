## 剑指 Offer 13. 机器人的运动范围

leetcode链接：[https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)

### 题目描述

地上有一个 m 行 n 列的方格，从坐标 `[0,0]` 到坐标 `[m-1,n-1]` 。一个机器人从坐标 `[0, 0]` 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于
k 的格子。例如，当 k 为 18 时，机器人能够进入方格 `[35, 37]` ，因为 3+5+3+7=18。但它不能进入方格 `[35, 38]`，因为 3+5+3+8=19。请问该机器人能够到达多少个格子？

**示例 1：**

```
输入：m = 2, n = 3, k = 1
输出：3
```

**示例 2：**

```
输入：m = 3, n = 1, k = 0
输出：1
```

**提示：**

- `1 <= n,m <= 100`
- `0 <= k <= 20`

### 解法

深度优先遍历

### 代码

```java
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
```
