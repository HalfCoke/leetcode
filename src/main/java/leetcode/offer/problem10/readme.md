## 剑指 Offer 10- I. 斐波那契数列

leetcode链接：[https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)

### 题目描述

写一个函数，输入 `n` ，求斐波那契（Fibonacci）数列的第 `n` 项。斐波那契数列的定义如下：

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入：n = 2
输出：1
```

**示例 2：**

```
输入：n = 5
输出：5
```

**提示：**

- `0 <= n <= 100`

### 解法

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.fib(2));
        Assert.assertEquals(5, solution.fib(5));
        Assert.assertEquals(134903163, solution.fib(45));
        Assert.assertEquals(807526948, solution.fib(48));
        Assert.assertEquals(407059028, solution.fib(95));
    }

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int one = 0, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
```

## 剑指 Offer 10- II. 青蛙跳台阶问题

leetcode链接：[https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

### 题目描述

一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级台阶。求该青蛙跳上一个 `n`  级的台阶总共有多少种跳法。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入：n = 2
输出：2
```

**示例 2：**

```
输入：n = 7
输出：21
```

**提示：**

- `0 <= n <= 100`

### 解法

青蛙想上第 `n` 级台阶，可从第 `n-1` 级台阶跳一级上去，也可从第 `n-2` 级台阶跳两级上去，即：`f(n) = f(n-1) + f(n-2)`。

与求斐波那契数列第n项相同，只是初始值不同

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.numWays(2));
        Assert.assertEquals(21, solution.numWays(7));
    }

    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        int one = 1, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
```
