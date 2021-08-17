## 剑指 Offer 17. 打印从1到最大的n位数

leetcode链接：[https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/](https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/)

### 题目描述

输入数字`n`，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
**示例 1:**

```
输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]
```

**说明：**

- 用返回一个整数列表来代替打印
- n 为正整数

### 解法

分为两种方法：

- 不考虑大数

  不考虑大数时的方法较为简单，实测此方法满足题目要求，直接遍历生成数组即可

- 考虑大数

  考虑大数时需要使用字符串表示数字，使用回溯法递归生成所有数字，注意数字需要按序输出

### 代码

```java
import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.printNumbers(1));

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.wrapStringNumbers(solution.printStringNumbers(1)));
        System.out.println(String.join("\n", solution.printStringNumbers(5)));
    }

    public int[] printNumbers(int n) {
        int pow = (int) Math.pow(10, n);
        int[] res = new int[pow - 1];
        for (int i = 1; i < pow; i++) {
            res[i - 1] = i;
        }
        return res;
    }

    // 扩展方法，支持大数
    List<String> numbersRes;
    char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public int[] wrapStringNumbers(String[] strings) {
        return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
    }

    public String[] printStringNumbers(int n) {
        numbersRes = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            buildNumbers(i, new StringBuilder());
        }
        return numbersRes.toArray(new String[0]);
    }

    private void buildNumbers(int cur, StringBuilder stringBuilder) {
        if (stringBuilder.length() == cur) {
            numbersRes.add(stringBuilder.toString());
            return;
        }
        for (char num : nums) {
            if (Objects.equals(num, '0') && stringBuilder.length() == 0) {
                continue;
            }
            stringBuilder.append(num);
            buildNumbers(cur, stringBuilder);
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        }
    }
}

```
