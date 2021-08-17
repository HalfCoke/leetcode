## 剑指 Offer 03. 数组中重复的数字

leetcode链接：[https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

### 题目描述

找出数组中重复的数字。

在一个长度为 n 的数组 nums 里的所有数字都在 0 ～ n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

**示例 1：**

```
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
```

**限制：**

```
2 <= n <= 100000
```

### 解法

0 ～ n-1 范围内的数，分别还原到对应的位置上，如：数字 2 交换到下标为 2 的位置。

若交换过程中发现重复，则直接返回。

### 代码

```java
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        final int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int res = solution.findRepeatNumber(nums);
        assert (res == 2 || res == 3);

        final int[] nums1 = {2, 3, 1, 5, 0, 0};
        res = solution.findRepeatNumber(nums1);
        assert res == 0;

        // 在寻找时，必须使用while，否则这一用例无法通过
        final int[] nums2 = {2, 3, 1, 5, 5, 0};
        res = solution.findRepeatNumber(nums2);
        assert res == 5;
    }

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            while (cur != i) {
                if (nums[cur] != cur) {
                    nums[i] = nums[cur];
                    nums[cur] = cur;
                } else {
                    return cur;
                }
                cur = nums[i];
            }
        }
        return -1;
    }
}
```
