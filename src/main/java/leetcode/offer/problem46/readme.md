## 剑指 Offer 46. 把数字翻译成字符串

leetcode链接：[https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/](https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/)

### 题目描述

给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

**示例 1:**

```
输入: 12258
输出: 5
解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
```

**提示：**

- 0 <= num < 2<sup>31</sup>

### 解法

动态规划

dp[i]为以数字i结尾时翻译方法的个数

注意字符串"06"不可翻译

### 代码

```java

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

```
