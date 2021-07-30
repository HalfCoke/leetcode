## 目录

- [剑指 Offer 03. 数组中重复的数字](#剑指-Offer-03-数组中重复的数字)
- [剑指 Offer 04. 二维数组中的查找](#剑指-Offer-04-二维数组中的查找)
- [剑指 Offer 06. 从尾到头打印链表](#剑指-Offer-06-从尾到头打印链表)
- [剑指 Offer 07. 重建二叉树](#剑指-Offer-07-重建二叉树)
- [剑指 Offer 09. 用两个栈实现队列](#剑指-Offer-09-用两个栈实现队列)
- [剑指 Offer 10- I. 斐波那契数列](#剑指-Offer-10--I-斐波那契数列)
- [剑指 Offer 10- II. 青蛙跳台阶问题](#剑指-Offer-10--II-青蛙跳台阶问题)
- [剑指 Offer 11. 旋转数组的最小数字](#剑指-Offer-11-旋转数组的最小数字)
- [剑指 Offer 12. 矩阵中的路径](#剑指-Offer-12-矩阵中的路径)
- [剑指 Offer 13. 机器人的运动范围](#剑指-Offer-13-机器人的运动范围)
- [剑指 Offer 14- I. 剪绳子](#剑指-Offer-14--I-剪绳子)
- [剑指 Offer 14- II. 剪绳子 II](#剑指-Offer-14--II-剪绳子-II)
- [剑指 Offer 15. 二进制中1的个数](#剑指-Offer-15-二进制中1的个数)
- [剑指 Offer 16. 数值的整数次方](#剑指-Offer-16-数值的整数次方)
- [剑指 Offer 17. 打印从1到最大的n位数](#剑指-Offer-17-打印从1到最大的n位数)
- [剑指 Offer 18. 删除链表的节点](#剑指-Offer-18-删除链表的节点)
- [剑指 Offer 19. 正则表达式匹配](#剑指-Offer-19-正则表达式匹配)
- [剑指 Offer 20. 表示数值的字符串](#剑指-Offer-20-表示数值的字符串)
- [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面](#剑指-Offer-21-调整数组顺序使奇数位于偶数前面)
- [剑指 Offer 20. 表示数值的字符串](#剑指-Offer-20-表示数值的字符串)
- [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面](#剑指-Offer-21-调整数组顺序使奇数位于偶数前面)
- [剑指 Offer 22. 链表中倒数第k个节点](#剑指-Offer-22-链表中倒数第k个节点)
- [剑指 Offer 24. 反转链表](#剑指-Offer-24-反转链表)
- [剑指 Offer 25. 合并两个排序的链表](#剑指-Offer-25-合并两个排序的链表)
- [剑指 Offer 26. 树的子结构](#剑指-Offer-26-树的子结构)
- [剑指 Offer 27. 二叉树的镜像](#剑指-Offer-27-二叉树的镜像)
- [剑指 Offer 28. 对称的二叉树](#剑指-Offer-28-对称的二叉树)
- [剑指 Offer 29. 顺时针打印矩阵](#剑指-Offer-29-顺时针打印矩阵)
- [剑指 Offer 30. 包含min函数的栈](#剑指-Offer-30-包含min函数的栈)
- [剑指 Offer 31. 栈的压入、弹出序列](#剑指-Offer-31-栈的压入、弹出序列)
- [剑指 Offer 32 - I. 从上到下打印二叉树](#剑指-Offer-32---I-从上到下打印二叉树)
- [剑指 Offer 32 - II. 从上到下打印二叉树 II](#剑指-Offer-32---II-从上到下打印二叉树-II)
- [剑指 Offer 32 - III. 从上到下打印二叉树 III](#剑指-Offer-32---III-从上到下打印二叉树-III)
- [剑指 Offer 33. 二叉搜索树的后序遍历序列](#剑指-Offer-33-二叉搜索树的后序遍历序列)
- [剑指 Offer 34. 二叉树中和为某一值的路径](#剑指-Offer-34-二叉树中和为某一值的路径)
- [剑指 Offer 35. 复杂链表的复制](#剑指-Offer-35-复杂链表的复制)
- [剑指 Offer 36. 二叉搜索树与双向链表](剑指-Offer-36-二叉搜索树与双向链表)

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

## 剑指 Offer 04. 二维数组中的查找

leetcode链接：[https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)

### 题目描述

在一个 n \* m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

**示例:**

现有矩阵 matrix 如下：

```
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
```

给定 target = 5，返回  `true`。

给定 target = 20，返回  `false`。

**限制：**

- `0 <= n <= 1000`

- `0 <= m <= 1000`

### 解法

直接从左上角开始查找

### 代码

```java

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assert solution.findNumberIn2DArray(matrix, 5);
        assert !solution.findNumberIn2DArray(matrix, 20);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] line : matrix) {
            for (int i : line) {
                if (target == i) {
                    return true;
                } else if (target < i) {
                    break;
                }
            }
        }
        return false;
    }
}
```

剑指 Offer 05. 替换空格

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

## 剑指 Offer 06. 从尾到头打印链表

leetcode链接：[https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

### 题目描述

输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

**示例 1：**

```
输入：head = [1,3,2]
输出：[2,3,1]
```

**限制：**

- `0 <= 链表长度 <= 10000`

### 解法

用栈实现

### 代码

```java
import org.junit.Assert;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = {2, 3, 5};

        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);

        Assert.assertArrayEquals(res, solution.reversePrint(head));
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> tempStack = new Stack<>();
        while (head != null) {
            tempStack.push(head.val);
            head = head.next;
        }
        int[] res = new int[tempStack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tempStack.pop();
        }
        return res;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
```

## 剑指 Offer 07. 重建二叉树

leetcode链接：[https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/)

### 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

例如，给出

```
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
```

返回如下的二叉树：

```
    3
   / \
  9  20
    /  \
   15   7
```

**限制：**

- `0 <= 节点个数 <= 5000`

### 解法

直接递归求解

下面代码中寻找索引的部分可以使用hashmap优化

### 代码

```java
public class Solution {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] preOrder = {1};
        int[] inOrder = {1};

        solution.buildTree(preOrder, inOrder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) return null;
        return build(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (inEnd - inStart == 1) {
            return new TreeNode(inorder[inStart]);
        }
        TreeNode rootNode = new TreeNode(preorder[preStart]);
        int index = findIndex(preorder[preStart], inorder);
        if (index != inStart) {
            rootNode.left = build(preorder, inorder, preStart + 1, preStart + (index - inStart), inStart, index);
        }
        if (index != inEnd - 1) {
            rootNode.right = build(preorder, inorder, preStart + (index - inStart) + 1, preEnd, index + 1, inEnd);
        }
        return rootNode;
    }

    private int findIndex(int x, int[] order) {
        for (int i = 0; i < order.length; i++) {
            if (x == order[i]) {
                return i;
            }
        }
        return -1;
    }

}
```

## 剑指 Offer 09. 用两个栈实现队列

leetcode链接：[https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)

### 题目描述

用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 `appendTail` 和 `deleteHead` ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，`deleteHead`  操作返回 -1 )

**示例 1：**

```
输入：
["CQueue","appendTail","deleteHead","deleteHead"]
[[],[3],[],[]]
输出：[null,null,3,-1]
```

**示例 2：**

```
输入：
["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
[[],[],[5],[2],[],[]]
输出：[null,-1,null,null,5,2]
```

**提示：**

- `1 <= values <= 10000`
- `最多会对 appendTail、deleteHead 进行 10000 次调用`

### 解法

有两个栈，one和two

append的时候向one中push数据，如果two为空，则把数据转移过去

deleteHead的时候，如果two为空，则先转移数据，在pop

### 代码

```java
import java.util.Stack;

public class CQueue {
    private Stack<Integer> one;
    private Stack<Integer> two;

    public CQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void appendTail(int value) {
        one.push(value);
        if (two.empty()) {
            move();
        }
    }

    public int deleteHead() {
        if (two.empty()) {
            move();
        }
        return two.empty() ? -1 : two.pop();
    }

    private void move() {
        while (!one.empty()) {
            two.push(one.pop());
        }
    }
}

```

## 剑指 Offer 10- I. 斐波那契数列

leetcode链接：[https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)

### 题目描述

写一个函数，输入 `n` ，求斐波那契（Fibonacci）数列的第 `n` 项。斐波那契数列的定义如下：

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入：n = 2
输出：1
```

**示例 2：**

```
输入：n = 5
输出：5
```

**提示：**

- `0 <= n <= 100`

### 解法

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.fib(2));
        Assert.assertEquals(5, solution.fib(5));
        Assert.assertEquals(134903163, solution.fib(45));
        Assert.assertEquals(807526948, solution.fib(48));
        Assert.assertEquals(407059028, solution.fib(95));
    }

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int one = 0, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
```

## 剑指 Offer 10- II. 青蛙跳台阶问题

leetcode链接：[https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

### 题目描述

一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级台阶。求该青蛙跳上一个 `n`  级的台阶总共有多少种跳法。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入：n = 2
输出：2
```

**示例 2：**

```
输入：n = 7
输出：21
```

**提示：**

- `0 <= n <= 100`

### 解法

青蛙想上第 `n` 级台阶，可从第 `n-1` 级台阶跳一级上去，也可从第 `n-2` 级台阶跳两级上去，即：`f(n) = f(n-1) + f(n-2)`。

与求斐波那契数列第n项相同，只是初始值不同

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.numWays(2));
        Assert.assertEquals(21, solution.numWays(7));
    }

    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        int one = 1, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
```

## 剑指 Offer 11. 旋转数组的最小数字

leetcode链接：[https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

### 题目描述

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组  `[3,4,5,1,2]` 为 `[1,2,3,4,5]` 的一个旋转，该数组的最小值为 1。

**示例 1：**

```
输入：[3,4,5,1,2]
输出：1
```

**示例 2：**

```
输入：[2,2,2,0,1]
输出：0
```

### 解法

直接找到第一个非排序的值

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.minArray(new int[]{3, 4, 5, 1, 2}));
        Assert.assertEquals(0, solution.minArray(new int[]{2, 2, 2, 0, 1}));
        Assert.assertEquals(1, solution.minArray(new int[]{1}));
        Assert.assertEquals(-10, solution.minArray(new int[]{-9, 0, 10, 10, 10, -10, -9, -9, -9, -9}));
    }

    public int minArray(int[] numbers) {
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (pre > numbers[i]) {
                return numbers[i];
            }
            pre = numbers[i];
        }
        return numbers[0];
    }
}
```

## 剑指 Offer 12. 矩阵中的路径

leetcode链接：[https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/)

### 题目描述

给定一个`m x n`二维字符网格`board`和一个字符串单词`word` 。如果`word`存在于网格中，返回 true ；否则，返回 false 。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。

![](https://assets.leetcode.com/uploads/2020/11/04/word2.jpg)

但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符 b 占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。

**示例 1：**

```
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
```

**示例 2：**

```
输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false
```

**提示：**

- `1 <= board.length <= 200`
- `1 <= board[i].length <= 200`

### 解法

回溯法

#### 补充：回溯法与深度优先搜索区别

DFS只要将所有的点均访问到了即可，是一种无序的搜索

回溯法需要重置状态。每走一步如果不符合约束条件，则需要回到上一步的状态下重新尝试。

参考：

[【Algorithm】回溯法与深度优先遍历的异同](https://blog.csdn.net/weixin_34259559/article/details/85683286?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EsearchFromBaidu%7Edefault-17.pc_relevant_baidujshouduan&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EsearchFromBaidu%7Edefault-17.pc_relevant_baidujshouduan)

### 代码

```java
import org.junit.Assert;

import java.util.Objects;

public class Solution {

    final int[][] offset = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "ABCCED"));

        char[][] board1 = {{'a', 'b'}, {'c', 'd'}};
        Assert.assertFalse(solution.exist(board1, "abcd"));
    }

    public boolean exist(char[][] board, String word) {
        if (board.length != 0 && (board.length * board[0].length < word.length())) return false;
        int[][] accessed = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Objects.equals(board[i][j], word.charAt(0))) {
                    if (findPathWithPoint(board, i, j, word, accessed)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean findPathWithPoint(char[][] board, int x, int y, String subWord, int[][] accessed) {
        accessed[x][y] = 1;
        if (Objects.equals(board[x][y], subWord.charAt(0))) {
            if (subWord.length() == 1) return true;
            for (int i = 0; i < offset.length; i++) {
                int a = Math.max(0, x + offset[i][0]);
                int b = Math.max(0, y + offset[i][1]);
                a = Math.min(a, board.length - 1);
                b = Math.min(b, board[0].length - 1);
                if (accessed[a][b] == 0
                        && findPathWithPoint(board, a, b, subWord.substring(1), accessed)) {
                    return true;
                }
            }
        }
        accessed[x][y] = 0;
        return false;
    }
}
```

## 剑指 Offer 13. 机器人的运动范围

leetcode链接：[https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)

### 题目描述

地上有一个 m 行 n 列的方格，从坐标 `[0,0]` 到坐标 `[m-1,n-1]` 。一个机器人从坐标 `[0, 0]` 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于
k 的格子。例如，当 k 为 18 时，机器人能够进入方格 `[35, 37]` ，因为 3+5+3+7=18。但它不能进入方格 `[35, 38]`，因为 3+5+3+8=19。请问该机器人能够到达多少个格子？

**示例 1：**

```
输入：m = 2, n = 3, k = 1
输出：3
```

**示例 2：**

```
输入：m = 3, n = 1, k = 0
输出：1
```

**提示：**

- `1 <= n,m <= 100`
- `0 <= k <= 20`

### 解法

深度优先遍历

### 代码

```java
import org.junit.Assert;

public class Solution {

    int[][] offsets = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.movingCount(2, 3, 1));
        Assert.assertEquals(1, solution.movingCount(3, 1, 0));
        Assert.assertEquals(1, solution.movingCount(1, 1, 0));
        Assert.assertEquals(15, solution.movingCount(16, 8, 4));
        Assert.assertEquals(135, solution.movingCount(38, 15, 9));
    }

    public int movingCount(int m, int n, int k) {
        int[][] flag = new int[m][n];
        return dfs(0, 0, k, flag, 0);
    }

    private int dfs(int x, int y, int k, int[][] flag, int count) {
        if (countCooSum(x, y) > k || flag[x][y] != 0) {
            return count;
        }
        flag[x][y] = 1;
        count++;
        for (int[] offset : offsets) {
            int x1 = x + offset[0];
            int y1 = y + offset[1];
            x1 = x1 >= 0 ? (x1 < flag.length ? x1 : flag.length - 1) : 0;
            y1 = y1 >= 0 ? (y1 < flag[0].length ? y1 : flag[0].length - 1) : 0;

            count = dfs(x1, y1, k, flag, count);
        }
        return count;
    }

    private int countCooSum(int m, int n) {
        int res = 0;
        while (m != 0) {
            res += m % 10;
            m = m / 10;
        }
        while (n != 0) {
            res += n % 10;
            n = n / 10;
        }
        return res;
    }
}
```

## 剑指 Offer 14- I. 剪绳子

leetcode链接：[https://leetcode-cn.com/problems/jian-sheng-zi-lcof/](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/)

### 题目描述

给你一根长度为 `n` 的绳子，请把绳子剪成整数长度的 `m` 段（m、n 都是整数，n>1 并且 m>1），每段绳子的长度记为 `k[0],k[1]...k[m-1]` 。请问 `k[0]*k[1]*...*k[m-1]`
可能的最大乘积是多少？例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18。

**示例 1：**

```
输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1
```

**示例 2:**

```
输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
```

**提示：**

- `2 <= n <= 58`

### 解法

使用动态规划求解

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.cuttingRope(2));
        Assert.assertEquals(36, solution.cuttingRope(10));
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = 1; j < i; j++) {
                int t = Math.max(dp[j], j);
                dp[i] = Math.max(dp[i], t * (i - j));
            }
        }
        return dp[n];
    }
}

```

## 剑指 Offer 14- II. 剪绳子 II

leetcode链接：[https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/)

### 题目描述

给你一根长度为 `n` 的绳子，请把绳子剪成整数长度的 `m` 段（m、n 都是整数，n>1 并且 m>1），每段绳子的长度记为 `k[0],k[1]...k[m-1]` 。请问 `k[0]*k[1]*...*k[m-1]`
可能的最大乘积是多少？例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

**示例 1：**

```
输入: 2
输出: 1
解释: 2 = 1 + 1, 1 × 1 = 1
```

**示例 2:**

```
输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
```

**提示：**

- `2 <= n <= 1000`

### 解法

快速幂+数学推导
[面试题14- II. 剪绳子 II（数学推导 / 贪心思想 + 快速幂求余，清晰图解）](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/solution/mian-shi-ti-14-ii-jian-sheng-zi-iitan-xin-er-fen-f/)

### 代码

```java
import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(953271190, solution.cuttingRope(120));
    }

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int p = 1000000007;
        int b = n % 3;
        long rem = 1, x = 3;
        for (int a = n / 3 - 1; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) return (int) (rem * 3 % p);
        if (b == 1) return (int) (rem * 4 % p);
        return (int) (rem * 6 % p);
    }
}

```

## 剑指 Offer 15. 二进制中1的个数

leetcode链接：[https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)

### 题目描述

编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。

**示例 1：**

```
输入：00000000000000000000000000001011
输出：3
解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
```

**示例 2：**

```
输入：00000000000000000000000010000000
输出：1
解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
```

**示例 3：**

```
输入：11111111111111111111111111111101
输出：31
解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
```

**提示：**

- 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
- 在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在上面的**示例 3**中，输入表示有符号整数 -3。

### 解法

判断最后一位是否为`1`，累加计数，`n`右移1位循环判断；

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.hammingWeight(1));
        Assert.assertEquals(1, solution.hammingWeight(2));
        Assert.assertEquals(1, solution.hammingWeight(4));
        Assert.assertEquals(31, solution.hammingWeight(-3));
        Assert.assertEquals(1, solution.hammingWeight(128));
        Assert.assertEquals(3, solution.hammingWeight(11));
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}

```

## 剑指 Offer 16. 数值的整数次方

leetcode链接：[https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/](https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)

### 题目描述

实现 `pow(x, n)` ，即计算 x 的 n 次幂函数（即，x^n）。不得使用库函数，同时不需要考虑大数问题。
**示例 1:**

```
输入: 2.00000, 10
输出: 1024.00000
```

**示例 2:**

```
输入: 2.10000, 3
输出: 9.26100
```

**示例 3:**

```
输入: 2.00000, -2
输出: 0.25000
解释: 2^(-2) = 1/2^2 = 1/4 = 0.25
```

**说明:**

- `-100.0 < x < 100.0`
- n 是 32 位有符号整数，其数值范围是   `[−2^31, 2^(31 − 1)]` 。

### 解法

使用快速幂求解，注意需要将n替换为long类型，否则在最后一个用例处会越界。

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1024.0, solution.myPow(2.0, 10), 0.000000001);
        Assert.assertEquals(9.26100, solution.myPow(2.1, 3), 0.000000001);
        Assert.assertEquals(0.25, solution.myPow(2.0, -2), 0.000000001);
        Assert.assertEquals(4, solution.myPow(-2.0, 2), 0.000000001);
        Assert.assertEquals(0, solution.myPow(2.0, -2147483648), 0.000000001);
    }

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (Math.abs(x - 0) < 0.00000000001) return 0.0;
        long ln = n;
        if (ln < 0) {
            ln = -1 * ln;
            x = 1 / x;
        }
        double res = 1.0;
        for (long i = ln; i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }
}

```

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

## 剑指 Offer 18. 删除链表的节点

leetcode链接：[https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/](https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/)

### 题目描述

给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

返回删除后的链表的头节点。

注意：此题对比原题有改动。

**示例 1:**

```
输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
```

**示例 2:**

```
输入: head = [4,5,1,9], val = 1
输出: [4,5,9]
解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
```

**说明：**

- 题目保证链表中节点的值互不相同
- 若使用 C 或 C++ 语言，你不需要 `free` 或 `delete` 被删除的节点

### 解法

直接检索后删除即可

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        solution.deleteNode(head, 1);
        Assert.assertEquals(4, head.val);
        Assert.assertEquals(5, head.next.val);
        Assert.assertEquals(9, head.next.next.val);
        Assert.assertNull(head.next.next.next);
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;

        ListNode headTemp = head;

        while (headTemp.next != null) {
            if (headTemp.next.val == val) {
                headTemp.next = headTemp.next.next;
                break;
            }
            headTemp = headTemp.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
```

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

## 剑指 Offer 20. 表示数值的字符串

Leetcode链接: [https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/](https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/)

### 题目描述

请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。

数值（按顺序）可以分成以下几个部分：

1. 若干空格
2. 一个小数或者整数
3. （可选）一个'e'或'E'，后面跟着一个整数
4. 若干空格

小数（按顺序）可以分成以下几个部分：

1. （可选）一个符号字符（'+' 或 '-'）
2. 下述格式之一：
    1. 至少一位数字，后面跟着一个点 '.'
    2. 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
    3. 一个点 '.' ，后面跟着至少一位数字

整数（按顺序）可以分成以下几个部分：

1. （可选）一个符号字符（'+' 或 '-'）
2. 至少一位数字

部分数值列举如下：

- `["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"]`

部分非数值列举如下：

- `["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]`

### 解法

有限状态自动机
![](https://gitee.com/halfcoke/blog_img/raw/master/20210725165406.svg)

### 代码

```java
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Assert.assertTrue(solution.isNumber("  +6.6E+6  "));

        Assert.assertTrue(solution.isNumber("+100"));
        Assert.assertTrue(solution.isNumber("5e2"));
        Assert.assertTrue(solution.isNumber("-123"));
        Assert.assertTrue(solution.isNumber("3.1416"));
        Assert.assertTrue(solution.isNumber("-1E-16"));
        Assert.assertTrue(solution.isNumber("0123"));

        Assert.assertFalse(solution.isNumber("12e"));
        Assert.assertFalse(solution.isNumber("1a3.14"));
        Assert.assertFalse(solution.isNumber("1.2.3"));
        Assert.assertFalse(solution.isNumber("+-5"));
        Assert.assertFalse(solution.isNumber("12e+5.4"));

        Assert.assertTrue(solution.isNumber(".1"));
        Assert.assertFalse(solution.isNumber(".8+"));
        Assert.assertTrue(solution.isNumber("3."));
        Assert.assertFalse(solution.isNumber("3.+"));
        Assert.assertTrue(solution.isNumber("+.8"));

        Assert.assertFalse(solution.isNumber("."));

    }

    public boolean isNumber(String s) {
        Map<Character, Integer>[] states = initStates();
        int state = 0;
        for (char c : s.toCharArray()) {
            char t;
            if (c == ' ') t = 'b';
            else if (c == '.') t = 'p';
            else if (c <= '9' && c >= '0') t = 'd';
            else if (c == '+' || c == '-') t = 's';
            else if (c == 'E' || c == 'e') t = 'e';
            else t = '?';

            if (states[state].containsKey(t)) {
                state = states[state].get(t);
            } else {
                return false;
            }
        }
        return state == 2 || state == 3 || state == 4 || state == 7 || state == 8;

    }

    private Map<Character, Integer>[] initStates() {
        Map<Character, Integer>[] states = new Map[10];
        // 0
        Map<Character, Integer> state0 = new HashMap<>();
        state0.put('s', 1);
        state0.put('b', 0);
        state0.put('d', 2);
        state0.put('p', 9);
        // 1
        Map<Character, Integer> state1 = new HashMap<>();
        state1.put('d', 2);
        state1.put('p', 9);
        // 2
        Map<Character, Integer> state2 = new HashMap<>();
        state2.put('d', 2);
        state2.put('p', 3);
        state2.put('e', 5);
        state2.put('b', 8);
        // 3
        Map<Character, Integer> state3 = new HashMap<>();
        state3.put('d', 4);
        state3.put('e', 5);
        state3.put('b', 8);
        // 4
        Map<Character, Integer> state4 = new HashMap<>();
        state4.put('d', 4);
        state4.put('e', 5);
        state4.put('b', 8);
        // 5
        Map<Character, Integer> state5 = new HashMap<>();
        state5.put('s', 6);
        state5.put('d', 7);
        // 6
        Map<Character, Integer> state6 = new HashMap<>();
        state6.put('d', 7);
        // 7
        Map<Character, Integer> state7 = new HashMap<>();
        state7.put('d', 7);
        state7.put('b', 8);
        // 8
        Map<Character, Integer> state8 = new HashMap<>();
        state8.put('b', 8);
        //9
        Map<Character, Integer> state9 = new HashMap<>();
        state9.put('d', 4);


        states[0] = state0;
        states[1] = state1;
        states[2] = state2;
        states[3] = state3;
        states[4] = state4;
        states[5] = state5;
        states[6] = state6;
        states[7] = state7;
        states[8] = state8;
        states[9] = state9;

        return states;
    }

}

```

## 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面

leetcode链接：[https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/](https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/)

### 题目描述

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

**示例：**

```
输入：nums = [1,2,3,4]
输出：[1,3,2,4]
注：[3,1,2,4] 也是正确的答案之一。
```

**提示：**

- 1 <= nums.length <= 50000
- 1 <= nums[i] <= 10000

### 解法

双指针交换数据

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int[] exchange(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;

        int first = 0, last = nums.length - 1;

        while (first < nums.length && last >= 0 && first < last) {
            while (nums[first] % 2 == 0 && first < last) {
                int t = nums[first];
                nums[first] = nums[last];
                nums[last] = t;
                last--;
            }
            first++;
        }

        return nums;
    }
}

```

## 剑指 Offer 22. 链表中倒数第k个节点

leetcode链接：[https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)

### 题目描述

输入一个链表，输出该链表中倒数第 k 个节点。为了符合大多数人的习惯，本题从 1 开始计数，即链表的尾节点是倒数第 1 个节点。例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3
个节点是值为 4 的节点。

**示例：**

给定一个链表: 1->2->3->4->5, 和 k = 2.

返回链表 4->5.

### 解法

双指针，间隔K

### 代码

```java
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode last = head;
        while (k != 0 && last != null) {
            last = last.next;
            k--;
        }
        if (k != 0) {
            return first;
        }
        while (last != null) {
            first = first.next;
            last = last.next;
        }
        return first;
    }
}

```

## 剑指 Offer 24. 反转链表

leetcode链接：[https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/)

### 题目描述

定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

**示例:**

```
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
```

**限制：**

- `0 <= 节点个数 <= 5000`

### 解法

迭代反转

### 代码

```java
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = new Solution().reverseList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode cur = head.next;

        pre.next = null;
        while (cur != null) {
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

```

## 剑指 Offer 25. 合并两个排序的链表

leetcode链接：[https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)

### 题目描述

输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

**示例 1：**

```
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
```

**限制：**

- `0 <= 链表长度 <= 1000`

### 解法

遍历两个列表

### 代码

```java
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode newList = solution.mergeTwoLists(l1, l2);
        while (newList != null) {
            System.out.println(newList.val);
            newList = newList.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1 = addNodeToNew(cur, l1);
            } else {
                l2 = addNodeToNew(cur, l2);
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }

        return dummyHead.next;
    }

    private ListNode addNodeToNew(ListNode newList, ListNode node) {
        newList.next = node;
        return node.next;
    }
}

```

## 剑指 Offer 26. 树的子结构

leetcode链接：[https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/](https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/)

### 题目描述

输入两棵二叉树 A 和 B，判断 B 是不是 A W 的子结构。(约定空树不是任意一个树的子结构)

B 是 A 的子结构， 即 A 中有出现和 B 相同的结构和节点值。

**例如:**

给定的树 A:

```
     3
    / \
   4   5
  / \
 1   2
```

给定的树 B：

```
   4 
  /
 1
```

返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。

**示例 1：**

```
输入：A = [1,2,3], B = [3,1]
输出：false
```

**示例 2：**

```
输入：A = [3,4,5,1,2], B = [4,1]
输出：true
```

**限制：**

- `0 <= 节点个数 <= 10000`

### 解法

### 代码

```java

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}

```

## 剑指 Offer 27. 二叉树的镜像

leetcode链接：[https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/](https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/)

### 题目描述

请完成一个函数，输入一个二叉树，该函数输出它的镜像。

例如输入：

```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

镜像输出：

```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

**示例 1：**

```
输入：root = [4,2,7,1,3,6,9]
输出：[4,7,2,9,6,3,1]
```

**限制：**

- `0 <= 节点个数 <= 1000`

### 解法

递归

### 代码

```java
public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}

```

## 剑指 Offer 28. 对称的二叉树

leetcode链接：[https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/](https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/)

### 题目描述

请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

例如，二叉树  `[1,2,2,3,4,4,3]` 是对称的。

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

但是下面这个  `[1,2,2,null,3,null,3]` 则不是镜像对称的:

```
    1
   / \
  2   2
   \   \
   3    3
```

**示例 1：**

```
输入：root = [1,2,2,3,4,4,3]
输出：true
```

**示例 2：**

```
输入：root = [1,2,2,null,3,null,3]
输出：false
```

### 解法

### 代码

```java
package leetcode.problem28;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Assert.assertTrue(solution.isSymmetric(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        Assert.assertFalse(solution.isSymmetric(root));
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return recur(root.left, root.right);
    }

    private boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}

```

## 剑指 Offer 29. 顺时针打印矩阵

leetcode链接：[https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/](https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/)

### 题目描述

输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

**示例 1：**

```
输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,3,6,9,8,7,4,5]
```

**示例 2：**

```
输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
输出：[1,2,3,4,8,12,11,10,9,5,6,7]
```

**限制：**

- `0 <= matrix.length <= 100`
- `0 <= matrix[i].length <= 100`

### 解法

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, solution.spiralOrder(matrix));
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            if (l > --r) break;
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            if (++l > r) break;
        }
        return res;
    }
}

```

## 剑指 Offer 30. 包含min函数的栈

leetcode链接：[https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/](https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/)

### 题目描述

定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

**示例:**

```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
```

**提示：**

- 各函数的调用总次数不超过 20000 次

### 解法

一个栈保存正常压栈数据，另一个栈仅保存比栈顶数据小的数据

### 代码

```java
class MinStack {

    Stack<Integer> dataStore;
    Stack<Integer> minStore;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        dataStore = new Stack<>();
        minStore = new Stack<>();
    }

    public void push(int x) {
        dataStore.push(x);
        if (minStore.empty() || x <= minStore.peek()) {
            minStore.push(x);
        }
    }

    public void pop() {
        int x = dataStore.pop();
        if (x == minStore.peek()) {
            minStore.pop();
        }
    }

    public int top() {
        return dataStore.peek();
    }

    public int min() {
        return minStore.peek();
    }
}
```

## 剑指 Offer 31. 栈的压入、弹出序列

leetcode:
链接：[https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/](https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/)

### 题目描述

输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但
{4,3,5,1,2} 就不可能是该压栈序列的弹出序列。

**示例 1：**

```
输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
输出：true
解释：我们可以按以下顺序执行：
push(1), push(2), push(3), push(4), pop() -> 4,
push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
```

**示例 2：**

```
输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
输出：false
解释：1 不能在 2 之前弹出。
```

**提示：**

1. `0 <= pushed.length == popped.length <= 1000`
2. `0 <= pushed[i], popped[i] < 1000`
3. `pushed`  是  `popped`  的排列。

### 解法

使用辅助栈

### 代码

```java
import org.junit.Assert;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        Assert.assertTrue(solution.validateStackSequences(pushed, popped));

        Assert.assertTrue(solution.validateStackSequences(new int[]{1, 0}, new int[]{1, 0}));

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || pushed.length == 0) return true;
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        for (int push : pushed) {
            stack.push(push);
            while (!stack.isEmpty() && stack.peek() == popped[pos]) {
                stack.pop();
                pos++;
            }
        }
        return stack.isEmpty();
    }
}

```

## 剑指 Offer 32 - I. 从上到下打印二叉树

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/)

### 题目描述

从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

**返回：**

```
[3,9,20,15,7]
```

**提示：**

- `节点总数 <= 1000`

### 解法

层序遍历

### 代码

```java
package leetcode.problem32.problem32_1;

import leetcode.problem32.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> res = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.remove(0);
            res.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return res.stream().mapToInt(value -> value).toArray();
    }
}

```

## 剑指 Offer 32 - II. 从上到下打印二叉树 II

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/)

### 题目描述

从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

返回其层次遍历结果：

```
[
  [3],
  [9,20],
  [15,7]
]
```

**提示：**

- `节点总数 <= 1000`

### 解法

层序遍历保存中间结果

### 代码

```java
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();

        List<List<Integer>> res = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> temp = new LinkedList<>();
            List<Integer> tempRes = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove(0);
                tempRes.add(node.val);
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            res.add(tempRes);
            queue = temp;
        }
        return res;
    }
}

```

## 剑指 Offer 32 - III. 从上到下打印二叉树 III

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)

### 题目描述

请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

返回其层次遍历结果：

```
[
  [3],
  [20,9],
  [15,7]
]
```

**提示：**

- `节点总数 <= 1000`

### 解法

注意切换数据写入和读取的顺序

### 代码

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        Deque<TreeNode> level = new ArrayDeque<>();
        Deque<TreeNode> exchange;

        List<List<Integer>> res = new LinkedList<>();
        int levelNum = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> tmp = new LinkedList<>();
            exchange = level;
            level = queue;
            queue = exchange;
            if (levelNum % 2 == 0) {
                while (!level.isEmpty()) {
                    TreeNode cur = level.pollFirst();
                    tmp.add(cur.val);
                    if (cur.left != null) queue.add(cur.left);
                    if (cur.right != null) queue.add(cur.right);
                }
            } else {
                while (!level.isEmpty()) {
                    TreeNode cur = level.pollLast();
                    tmp.add(cur.val);
                    if (cur.right != null) queue.addFirst(cur.right);
                    if (cur.left != null) queue.addFirst(cur.left);
                }
            }
            levelNum++;
            res.add(tmp);
        }
        return res;
    }
}

```

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

## 剑指 Offer 34. 二叉树中和为某一值的路径

leetcode链接：[https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/](https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/)

### 题目描述

输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。

**示例:**

给定如下二叉树，以及目标和  `sum = 22`，

```
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
```

返回:

```
[
   [5,4,11,2],
   [5,8,4,5]
]
```

**提示：**

1. `节点总数 <= 10000`

### 解法

回溯法，注意叶子节点

### 代码

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new LinkedList<>();
        recall(root, target, new ArrayList<>(), res);
        return res;
    }

    private void recall(TreeNode root, int target, List<Integer> path, List<List<Integer>> res) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && path.stream().mapToInt(Integer::intValue).sum() == target) {
            res.add(new LinkedList<>(path));
        }
        recall(root.left, target, path, res);
        recall(root.right, target, path, res);
        path.remove(path.size() - 1);
    }
}

```

## 剑指 Offer 35. 复杂链表的复制

leetcode链接：[https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/](https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/)

### 题目描述

请实现 `copyRandomList` 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 `next` 指针指向下一个节点，还有一个 `random` 指针指向链表中的任意节点或者 `null`。

**示例 1：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210728135112.png)

```
输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
```

**示例 2：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210728135056.png)

```
输入：head = [[1,1],[2,1]]
输出：[[1,1],[2,1]]
```

**示例 3：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210728135125.png)

```
输入：head = [[3,null],[3,0],[3,null]]
输出：[[3,null],[3,0],[3,null]]
```

**示例 4：**

```
输入：head = []
输出：[]
解释：给定的链表为空（空指针），因此返回 null。
```

**提示：**

- `-10000 <= Node.val <= 10000`
- `Node.random`  为空（null）或指向链表中的节点。
- 节点数目不超过 1000 。

### 解法

映射新旧节点

### 代码

```java
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> nodeMap = new HashMap<>();
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            nodeMap.put(cur, newNode);

            if (pre != null) {
                Node node = nodeMap.get(pre);
                node.next = newNode;
            }
            pre = cur;
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                Node node = nodeMap.get(cur);
                node.random = nodeMap.get(cur.random);
            }
            cur = cur.next;
        }
        return nodeMap.get(head);
    }
}
```

## 剑指 Offer 36. 二叉搜索树与双向链表

leetcode链接：[https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)

### 题目描述

输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。

为了让您更好地理解问题，以下面的二叉搜索树为例：

![](https://gitee.com/halfcoke/blog_img/raw/master/20210728141713.png)

我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。

下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。

![](https://gitee.com/halfcoke/blog_img/raw/master/20210728141723.png)

特别地，我们希望可以就地完成转换操作。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中的第一个节点的指针。

**注意**：本题与主站 426 题相同：https://leetcode-cn.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/

**注意**：此题对比原题有改动。

### 解法

先中序遍历，再迭代结果

### 代码

```java

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Node node = new Node(4);
        node.right = new Node(5);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        solution.treeToDoublyList(node);

    }

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        List<Node> midOrder = middleOrder(root);

        for (int i = 0; i < midOrder.size(); i++) {
            midOrder.get(i).right = midOrder.get((i + 1) % midOrder.size());
            midOrder.get(i).left = midOrder.get(((i - 1) + midOrder.size()) % midOrder.size());
        }
        return midOrder.get(0);
    }

    private List<Node> middleOrder(Node root) {
        Stack<Node> nodeStack = new Stack<>();
        ArrayList<Node> nodes = new ArrayList<>();

        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            Node peek = nodeStack.peek();
            if (peek.left != null) {
                nodeStack.push(peek.left);
                peek.left = null;
                continue;
            }

            nodes.add(nodeStack.pop());

            if (peek.right != null) {
                nodeStack.push(peek.right);
                peek.right = null;
            }
        }
        return nodes;
    }
}

```

## 剑指 Offer 37. 序列化二叉树

leetcode链接：[https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/](https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/)

### 题目描述

你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。

提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅[LeetCode序列化二叉树的格式](https://leetcode-cn.com/faq/#binary-tree)
你并非必须采取这种方式，你也可以采用其他的方法解决这个问题

**示例:**

```
你可以将以下二叉树：

    1
   / \
  2   3
     / \
    4   5

序列化为 "[1,2,3,null,null,4,5]"
```

注意：本题与主站 297 题相同：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/

### 解法

### 代码

```java

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(solution.serialize(root));
        TreeNode node = solution.deserialize(solution.serialize(root));
        System.out.println(node);


        root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(solution.serialize(root));
        node = solution.deserialize("[5,2,3,null,null,2,4,3,1]");
        System.out.println(node);

        node = solution.deserialize("[1,null,2]");
        System.out.println(node);

        node = solution.deserialize("[1,2,null,3,null,4,null,5]");
        System.out.println(node);
    }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            } else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.

    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (i < vals.length && !vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if (i < vals.length && !vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}

```

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

## 剑指 Offer 39. 数组中出现次数超过一半的数字

leetcode链接：[https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/](https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/)

### 题目描述

数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

**示例 1:**

```
输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2
```

**限制：**

- `1 <= 数组长度 <= 50000`

### 解法

先排序，然后直接输出数组中值即可

### 代码

```java
package leetcode.problem39;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private int[] quickSort(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        return sort(copy, 0, copy.length);
    }

    private int[] sort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int partitionIndex = partitionIndex(nums, start, end);
        nums = sort(nums, start, partitionIndex);
        nums = sort(nums, partitionIndex + 1, end);
        return nums;
    }

    private int partitionIndex(int[] nums, int start, int end) {
        int index = start + 1;
        for (int i = index; i < end; i++) {
            if (nums[i] < nums[start]) {
                swap(nums, index, i);
                index++;
            }
        }
        swap(nums, index - 1, start);
        return index - 1;
    }

    private void swap(int[] arr, int x, int y) {
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}

```

## 剑指 Offer 40. 最小的k个数

leetcode链接：[https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)

### 题目描述

输入整数数组 `arr`，找出其中最小的 `k` 个数。例如，输入 4、5、1、6、2、7、3、8 这 8 个数字，则最小的 4 个数字是 1、2、3、4。

**示例 1：**

```
输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
```

**示例 2：**

```
输入：arr = [0,1,2,1], k = 1
输出：[0]
```

**限制：**

- `0 <= k <= arr.length <= 10000`
- `0 <= arr[i] <= 10000`

### 解法
排序后输出，注意重复值
### 代码

```java
import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0) return new int[0];
        Arrays.sort(arr);
        int[] res = new int[k];
        Arrays.fill(res, -1);
        int pos = 0;
        for (int i = 0; i < arr.length && pos < k; i++) {
            if (res[pos] != arr[i]) {
                res[pos++] = arr[i];
            }
        }
        return res;
    }
}
```

### 题目描述

### 解法

### 代码

```java

```