## 剑指 Offer 14- I. 剪绳子

leetcode链接：[https://leetcode-cn.com/problems/jian-sheng-zi-lcof/](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/)

### 题目描述

给你一根长度为 `n` 的绳子，请把绳子剪成整数长度的 `m` 段（m、n 都是整数，n>1 并且 m>1），每段绳子的长度记为 `k[0],k[1]...k[m-1]` 。请问 `k[0]*k[1]*...*k[m-1]`
可能的最大乘积是多少？例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18。

**示例 1：**

```
输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1
```

**示例 2:**

```
输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
```

**提示：**

- `2 <= n <= 58`

### 解法

使用动态规划求解

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.cuttingRope(2));
        Assert.assertEquals(36, solution.cuttingRope(10));
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = 1; j < i; j++) {
                int t = Math.max(dp[j], j);
                dp[i] = Math.max(dp[i], t * (i - j));
            }
        }
        return dp[n];
    }
}

```

## 剑指 Offer 14- II. 剪绳子 II

leetcode链接：[https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/)

### 题目描述

给你一根长度为 `n` 的绳子，请把绳子剪成整数长度的 `m` 段（m、n 都是整数，n>1 并且 m>1），每段绳子的长度记为 `k[0],k[1]...k[m-1]` 。请问 `k[0]*k[1]*...*k[m-1]`
可能的最大乘积是多少？例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1
```

**示例 2:**

```
输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
```

**提示：**

- `2 <= n <= 1000`

### 解法

快速幂+数学推导
[面试题14- II. 剪绳子 II（数学推导 / 贪心思想 + 快速幂求余，清晰图解）](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/solution/mian-shi-ti-14-ii-jian-sheng-zi-iitan-xin-er-fen-f/)

### 代码

```java
import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(953271190, solution.cuttingRope(120));
    }

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int p = 1000000007;
        int b = n % 3;
        long rem = 1, x = 3;
        for (int a = n / 3 - 1; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) return (int) (rem * 3 % p);
        if (b == 1) return (int) (rem * 4 % p);
        return (int) (rem * 6 % p);
    }
}

```

#### 快速幂算法

```java
public class Main {
    public int quickPow(int x, int a) {
        int res = 1;
        int p = 1000;
        while (a != 0) {
            if (a % 2 != 0) {
                res = (res * x) % p;
            }
            x = (x * x) % p;
            a >>= 1;
        }
        return res;
    }
}

```