## 剑指 Offer 33. 二叉搜索树的后序遍历序列

leetcode链接：[https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/)

### 题目描述

输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回  `true`，否则返回  `false`。假设输入的数组的任意两个数字都互不相同。

参考以下这棵二叉搜索树：

```
     5
    / \
   2   6
  / \
 1   3
```

**示例 1：**

```
输入: [1,6,3,2,5]
输出: false
```

**示例 2：**

```
输入: [1,3,2,6,5]
输出: true
```

**提示：**

- `数组长度 <= 1000`

### 解法

递归或遍历方法

### 代码

```java
package leetcode.problem33;

import org.junit.Assert;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.verifyPostorder(new int[]{1, 3, 2, 6, 5}));
        Assert.assertFalse(solution.verifyPostorder(new int[]{1, 6, 3, 2, 5}));
    }

    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length <= 1) return true;
        int root = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!stack.isEmpty() && stack.peek() > postorder[i]) {
                root = stack.pop();
            }
            stack.push(postorder[i]);

        }
        return true;
    }

    public boolean verifyPostorder1(int[] postorder) {
        return recur(0, postorder.length - 1, postorder);
    }

    private boolean recur(int start, int end, int[] postorder) {
        if (start >= end) return true;
        int index = start;
        while (postorder[index] < postorder[end]) index++;
        int midIndex = index;
        while (postorder[index] > postorder[end]) index++;
        return index == end && recur(start, midIndex - 1, postorder) && recur(midIndex, end - 1, postorder);
    }
}

```
