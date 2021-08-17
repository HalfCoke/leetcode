## 剑指 Offer 19. 正则表达式匹配

leetcode链接：[https://leetcode-cn.com/problems/zheng-ze-biao-da-shi-pi-pei-lcof/](https://leetcode-cn.com/problems/zheng-ze-biao-da-shi-pi-pei-lcof/)

### 题目描述

请实现一个函数用来匹配包含`'. '`和`'*'`的正则表达式。模式中的字符`'.'`表示任意一个字符，而`'*'`表示它前面的字符可以出现任意次（含 0 次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串`"aaa"`
与模式`"a.a"`和`"ab*ac*a"`匹配，但与`"aa.a"`和`"ab*a"`均不匹配。

**示例 1:**

```
输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。
```

**示例 2:**

```
输入:
s = "aa"
p = "a*"
输出: true
解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
```

**示例 3:**

```
输入:
s = "ab"
p = ".*"
输出: true
解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
```

**示例 4:**

```
输入:
s = "aab"
p = "c*a*b"
输出: true
解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
```

**示例 5:**

```
输入:
s = "mississippi"
p = "mis*is*p*."
输出: false
```

- `s`  可能为空，且只包含从  `a-z`  的小写字母。
- `p`  可能为空，且只包含从  `a-z`  的小写字母，以及字符  `.`  和  `*`。

### 解法

动态规划

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Assert.assertFalse(solution.isMatch("aa", "a"));

        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("aa", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));

        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));

        Assert.assertTrue(solution.isMatch("aaa", "ab*a*c*a"));
        Assert.assertFalse(solution.isMatch("aaa", "aaaa"));
        Assert.assertFalse(solution.isMatch("a", "ab*a"));

    }

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 2; i < p.length() + 1; i += 2) {
            dp[0][i] = dp[0][i - 2] && p.charAt(i - 1) == '*';
        }

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < p.length() + 1; j++) {
                if (p.charAt(j - 1) != '*') {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1));
                    dp[i][j] = dp[i][j] || (dp[i - 1][j - 1] && (p.charAt(j - 1) == '.'));
                } else {
                    dp[i][j] = dp[i][j - 2];
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2)));
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && (p.charAt(j - 2) == '.'));
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}

```
