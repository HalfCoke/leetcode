## 剑指 Offer 16. 数值的整数次方

leetcode链接：[https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/](https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)

### 题目描述

实现 `pow(x, n)` ，即计算 x 的 n 次幂函数（即，x^n）。不得使用库函数，同时不需要考虑大数问题。
**示例 1:**

```
输入: 2.00000, 10
输出: 1024.00000
```

**示例 2:**

```
输入: 2.10000, 3
输出: 9.26100
```

**示例 3:**

```
输入: 2.00000, -2
输出: 0.25000
解释: 2^(-2) = 1/2^2 = 1/4 = 0.25
```

**说明:**

- `-100.0 < x < 100.0`
- n 是 32 位有符号整数，其数值范围是   `[−2^31, 2^(31 − 1)]` 。

### 解法

使用快速幂求解，注意需要将n替换为long类型，否则在最后一个用例处会越界。

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1024.0, solution.myPow(2.0, 10), 0.000000001);
        Assert.assertEquals(9.26100, solution.myPow(2.1, 3), 0.000000001);
        Assert.assertEquals(0.25, solution.myPow(2.0, -2), 0.000000001);
        Assert.assertEquals(4, solution.myPow(-2.0, 2), 0.000000001);
        Assert.assertEquals(0, solution.myPow(2.0, -2147483648), 0.000000001);
    }

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (Math.abs(x - 0) < 0.00000000001) return 0.0;
        long ln = n;
        if (ln < 0) {
            ln = -1 * ln;
            x = 1 / x;
        }
        double res = 1.0;
        for (long i = ln; i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }
}

```
