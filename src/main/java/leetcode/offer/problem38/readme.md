## 剑指 Offer 38. 字符串的排列

leetcode链接：[https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/](https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/)

### 题目描述

输入一个字符串，打印出该字符串中字符的所有排列。

你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。

**示例:**

```
输入：s = "abc"
输出：["abc","acb","bac","bca","cab","cba"]
```

**限制：**

- `1 <= s 的长度 <= 8`
-

### 解法

回溯

### 代码

```java
package leetcode.problem38;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] res = solution.permutation("abc");
        System.out.println(Arrays.toString(res));
    }

    public String[] permutation(String s) {
        boolean[] flag = new boolean[s.length()];
        HashSet<String> res = new HashSet<>();

        order(s, flag, new StringBuilder(), res);
        return res.toArray(new String[0]);
    }

    private void order(String s, boolean[] flag, StringBuilder temp, HashSet<String> res) {
        if (temp.length() == s.length()) {
            res.add(temp.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!flag[i]) {
                temp.append(s.charAt(i));
                flag[i] = true;
                order(s, flag, temp, res);
                flag[i] = false;
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}

```
