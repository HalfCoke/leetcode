## 剑指 Offer 67. 把字符串转换成整数

leetcode链接：[https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/](https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/)

### 题目描述

写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。

首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。

注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。

在任何情况下，若函数不能进行有效的转换时，请返回 0。

说明：

假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为  `[−2^31, 2^31 − 1]`。如果数值超过这个范围，请返回  `INT_MAX (2^31 − 1)` 或  `INT_MIN (−2^31)` 。

**示例 1:**

```
输入: "42"
输出: 42
```

**示例 2:**

```
输入: "   -42"
输出: -42
解释: 第一个非空白字符为 '-', 它是一个负号。
     我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
```

**示例 3:**

```
输入: "4193 with words"
输出: 4193
解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
```

**示例 4:**

```
输入: "words and 987"
输出: 0
解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
     因此无法执行有效的转换。
```

**示例 5:**

```
输入: "-91283472332"
输出: -2147483648
解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
     因此返回 INT_MIN (−2^31) 。
```

### 解法

1. 直接对字符串判断
2. 利用有限状态自动机先判断字符串是否合法，然后再执行

### 代码

```java

import org.junit.Assert;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(42, solution.strToInt("42"));
        Assert.assertEquals(-42, solution.strToInt("      -42"));
        Assert.assertEquals(-42, solution.strToInt("      -42adfad  123"));
        Assert.assertEquals(4193, solution.strToInt("4193 with words"));
        Assert.assertEquals(-13, solution.strToInt("-13+8"));
    }


    List<Map<Character, Integer>> states;

    public Solution() {
        states = new ArrayList<>();
        HashMap<Character, Integer> state0 = new HashMap<>();
        state0.put('n', 1);
        state0.put('b', 0);
        state0.put('s', 2);
        states.add(state0);

        HashMap<Character, Integer> state1 = new HashMap<>();
        state1.put('n', 1);
        state1.put('b', 3);
        state1.put('s', 3);
        state1.put('?', 3);
        states.add(state1);

        HashMap<Character, Integer> state2 = new HashMap<>();
        state2.put('n', 1);
        states.add(state2);

        HashMap<Character, Integer> state3 = new HashMap<>();
        state3.put('?', 3);
        state3.put('b', 3);
        state3.put('n', 3);
        state3.put('s', 3);
        states.add(state3);
    }

    public int strToInt(String str) {
        if (isLegalNumber(str)) {
            int signNumber = 1;
            long resNumber = 0L;
            boolean first = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                    resNumber *= 10;
                    resNumber += (str.charAt(i) - '0');
                    first = false;
                } else if (first && (str.charAt(i) == '-')) {
                    signNumber = -1;
                } else if (!first) {
                    break;
                }
                if (resNumber > Integer.MAX_VALUE) {
                    return signNumber == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            return (int) resNumber * signNumber;
        } else {
            return 0;
        }
    }

    private boolean isLegalNumber(String str) {
        int curState = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char op;
            if (c == ' ') {
                op = 'b';
            } else if ('0' <= c && c <= '9') {
                op = 'n';
            } else if (c == '+' || c == '-') {
                op = 's';
            } else {
                op = '?';
            }
            if (states.get(curState).containsKey(op)) {
                curState = states.get(curState).get(op);
            } else {
                return false;
            }
        }
        return curState == 1 || curState == 3;
    }

    public int strToInt1(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0, sign = 1, length = str.length();
        if (length == 0) return 0;
        while (str.charAt(i) == ' ')
            if (++i == length) return 0;
        if (str.charAt(i) == '-') sign = -1;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        for (int j = i; j < length; j++) {
            if (str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if (res > bndry || res == bndry && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign * res;
    }
}

```