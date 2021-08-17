## 剑指 Offer 56 - I. 数组中数字出现的次数

leetcode链接：[https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/](https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/)

### 题目描述

一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是 O(n)，空间复杂度是 O(1)。

**示例 1：**

```
输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
```

**示例 2：**

```
输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]
```

**限制：**

- `2 <= nums <= 10000`

### 解法

位运算

### 代码

```java
public class Solution {
    public static void main(String[] args) {

    }

    public int[] singleNumbers(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            temp ^= num;
        }
        int m = 1;
        while ((temp & m) == 0) {
            m = m << 1;
        }
        int x = 0, y = 0;
        for (int num : nums) {
            if ((num & m) == 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x, y};
    }
}

```

## 剑指 Offer 56 - II. 数组中数字出现的次数 II

leetcode链接：[https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/](https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/)

### 题目描述

在一个数组 `nums` 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。

**示例 1：**

```
输入：nums = [3,4,3,3]
输出：4
```

**示例 2：**

```
输入：nums = [9,1,7,9,7,9,7]
输出：1
```

**限制：**

- `1 <= nums.length <= 10000`
- `1 <= nums[i] < 2^31`

### 解法

按二进制位，出现三次的数字的二进制位上的1的个数应该是3的倍数，如果不是，则说明只出现1次的数字在这位上有1

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.singleNumber(new int[]{3, 4, 3, 3}));
        Assert.assertEquals(1, solution.singleNumber(new int[]{9, 1, 7, 9, 7, 9, 7}));
    }

    public int singleNumber(int[] nums) {
        int[] sumBinary = new int[32];
        for (int num : nums) {
            String binaryString = Integer.toBinaryString(num);
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '1') sumBinary[binaryString.length() - 1 - i] += 1;
            }
        }
        int pos = 0;
        int res = 0;
        for (int i = 0; i < sumBinary.length; i++) {
            res += (sumBinary[i] % 3) * (int) Math.pow(2, pos++);
        }
        return res;
    }
}

```
