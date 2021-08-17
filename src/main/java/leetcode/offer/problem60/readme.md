## 剑指 Offer 60. n个骰子的点数

leetcode链接：[https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/](https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/)

### 题目描述

把 n 个骰子扔在地上，所有骰子朝上一面的点数之和为 s。输入 n，打印出 s 的所有可能的值出现的概率。

你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。

**示例 1:**

```
输入: 1
输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
```

**示例 2:**

```
输入: 2
输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
```

**限制：**

- `1 <= n <= 11`

### 解法

动态规划

### 代码

```java

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

```
