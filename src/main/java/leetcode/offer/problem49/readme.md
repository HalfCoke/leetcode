## 剑指 Offer 49. 丑数

leetcode链接：[https://leetcode-cn.com/problems/chou-shu-lcof/](https://leetcode-cn.com/problems/chou-shu-lcof/)

### 题目描述

我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。

**示例:**

```
输入: n = 10
输出: 12
解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
```

**说明:**

1. `1`  是丑数。
2. `n`  不超过 1690。

### 解法

动态规划，对丑数进行递推

### 代码

```java

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

```
