## 剑指 Offer 66. 构建乘积数组

leetcode链接：[https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/](https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/)

### 题目描述

给定一个数组 `A[0,1,…,n-1]`，请构建一个数组 `B[0,1,…,n-1]`，其中 B 中的元素 `B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]`。不能使用除法。

**示例:**

```
输入: [1,2,3,4,5]
输出: [120,60,40,30,24]
```

**提示：**

- 所有元素乘积之和不会溢出 32 位整数
- `a.length <= 100000`

### 解法

遍历两轮数组得到所有需要的乘积

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution.constructArr(new int[]{1, 2, 3, 4, 5}));

    }

    public int[] constructArr(int[] a) {
        if (a.length <= 1) return a;
        int[] first = new int[a.length];
        int[] last = new int[a.length];
        first[0] = a[0];
        last[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            first[i] = first[i - 1] * a[i];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            last[i] = last[i + 1] * a[i];
        }
        int[] res = new int[a.length];
        res[0] = last[1];
        res[res.length - 1] = first[res.length - 2];
        for (int i = 1; i < res.length - 1; i++) {
            res[i] = first[i - 1] * last[i + 1];
        }
        return res;
    }

    public int[] constructArr1(int[] a) {
        if (a.length <= 1) return a;
        int[] res = new int[a.length];
        res[0] = 1;
        for (int i = 1; i < a.length; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }
        int temp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            res[i] *= temp;
        }
        return res;
    }
}

```
