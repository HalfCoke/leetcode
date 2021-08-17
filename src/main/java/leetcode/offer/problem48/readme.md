## 剑指 Offer 48. 最长不含重复字符的子字符串

leetcode链接：[https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/](https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/)

### 题目描述

请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。

**示例 1:**

```
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```

**示例 2:**

```
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```

**示例 3:**

```
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```

**提示：**

- `s.length <= 40000`

### 解法

动态规划或双指针(注意指针不能回退)

用map保存一个字符上一次出现的位置

### 代码

```java

import org.junit.Assert;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int res = 1;
        int[] dp = new int[s.length()];
        HashMap<Character, Integer> pos = new HashMap<>();
        dp[0] = 1;
        pos.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {
            int last = -1;
            if (pos.containsKey(s.charAt(i))) {
                last = pos.get(s.charAt(i));
            }
            pos.put(s.charAt(i), i);
            if (dp[i - 1] < i - last) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = i - last;
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public int lengthOfLongestSubstring1(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        int left = 0;
        int res = 1;
        for (int right = 1; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            res = Math.max(res, right - left + 1);
            map.put(c, right);
        }
        return res;
    }

}

```
