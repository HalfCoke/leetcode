## 剑指 Offer 05. 替换空格

leetcode链接：[https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/)

### 题目描述

请实现一个函数，把字符串 `s` 中的每个空格替换成"%20"。

**示例 1：**

```
输入：s = "We are happy."
输出："We%20are%20happy."
```

**限制：**

- `0 <= s 的长度 <= 10000`

### 解法

直接replace

### 代码

```java
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "We are happy.";
        Assert.assertEquals("We%20are%20happy.", solution.replaceSpace(s));
    }

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
```
