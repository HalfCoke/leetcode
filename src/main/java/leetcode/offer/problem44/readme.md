## 剑指 Offer 44. 数字序列中某一位的数字

leetcode链接：[https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/](https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/)

### 题目描述

数字以 0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第 5 位（从下标 0 开始计数）是 5，第 13 位是 1，第 19 位是 4，等等。

请写一个函数，求任意第 n 位对应的数字。

**示例 1：**

```
输入：n = 3
输出：3
```

**示例 2：**

```
输入：n = 11
输出：0
```

**限制：**

- `0 <= n < 2^31`

注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/

### 解法

分别计算不同位数的数字的总数，然后依次确定n指定位置的数字位数、数字、数字中位置

注意越界问题

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.findNthDigit(16));
        Assert.assertEquals(1, solution.findNthDigit(1000000000));
    }

    public int findNthDigit(int n) {
        if (n == 0) return 0;
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = (n - 1) / digit + start;
        String s = String.valueOf(num);
        return s.charAt((n - 1) % digit) - '0';
    }
}

```
