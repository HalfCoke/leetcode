## 233. 数字 1 的个数

leetcode链接：[https://leetcode-cn.com/problems/number-of-digit-one/](https://leetcode-cn.com/problems/number-of-digit-one/)

### 题目描述

### 解法

### 代码
```java

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDigitOne(13));
        System.out.println(solution.countDigitOne(1));
        System.out.println(solution.countDigitOne(10));
    }

    public int countDigitOne(int n) {
        int last = 0;
        int res = 0;
        int digit = 1;
        while (digit <= n) {
            int pre = n / digit;
            int cur = pre % 10;
            pre /= 10;
            if (cur < 1) {
                res += pre * digit;
            } else if (cur == 1) {
                res += pre * digit + last + 1;
            } else {
                res += (pre + 1) * digit;
            }
            last = n % (10 * digit);
            digit *= 10;
        }
        return res;
    }
}

```