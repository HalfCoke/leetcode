## 剑指 Offer 11. 旋转数组的最小数字

leetcode链接：[https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

### 题目描述

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组  `[3,4,5,1,2]` 为 `[1,2,3,4,5]` 的一个旋转，该数组的最小值为 1。

**示例 1：**

```
输入：[3,4,5,1,2]
输出：1
```

**示例 2：**

```
输入：[2,2,2,0,1]
输出：0
```

### 解法

直接找到第一个非排序的值

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.minArray(new int[]{3, 4, 5, 1, 2}));
        Assert.assertEquals(0, solution.minArray(new int[]{2, 2, 2, 0, 1}));
        Assert.assertEquals(1, solution.minArray(new int[]{1}));
        Assert.assertEquals(-10, solution.minArray(new int[]{-9, 0, 10, 10, 10, -10, -9, -9, -9, -9}));
    }

    public int minArray(int[] numbers) {
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (pre > numbers[i]) {
                return numbers[i];
            }
            pre = numbers[i];
        }
        return numbers[0];
    }
}
```
