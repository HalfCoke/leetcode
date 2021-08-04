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

## 剑指 Offer 41. 数据流中的中位数

leetcode链接：[https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/](https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/)

### 题目描述

如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。

例如，

`[2,3,4]`  的中位数是 3

`[2,3]` 的中位数是 (2 + 3) / 2 = 2.5

设计一个支持以下两种操作的数据结构：

- void addNum(int num) - 从数据流中添加一个整数到数据结构中。
- double findMedian() - 返回目前所有元素的中位数。

**示例 1：**

```
输入：
["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
[[],[1],[2],[],[3],[]]
输出：[null,null,null,1.50000,null,2.00000]
```

**示例 2：**

```
输入：
["MedianFinder","addNum","findMedian","addNum","findMedian"]
[[],[2],[],[3],[]]
输出：[null,null,2.00000,null,2.50000]
```

**限制：**

- 最多会对 addNum、findMedia 进行 50000 次调用。

注意：本题与主站 295 题相同：https://leetcode-cn.com/problems/find-median-from-data-stream/

### 解法

使用大顶堆和小顶堆

### 代码

```java

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        A = new PriorityQueue<>(); // 小顶堆
        B = new PriorityQueue<>((o1, o2) -> o2 - o1); // 大顶堆
    }

    public void addNum(int num) {
        int n = A.size();
        int m = B.size();
        if (n == m) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        int n = A.size();
        int m = B.size();
        if (n == m) {
            return (double) (A.peek() + B.peek()) / 2;
        } else {
            return (double) B.peek();
        }
    }
}

```

## 剑指 Offer 42. 连续子数组的最大和

leetcode链接：[https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/](https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/)

### 题目描述

输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

要求时间复杂度为 O(n)。

**示例 1:**

```
输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
```

**提示：**

- `1 <= arr.length <= 10^5`
- `-100 <= arr[i] <= 100`

<p>注意：本题与主站 53 题相同：<a href="https://leetcode-cn.com/problems/maximum-subarray/">https://leetcode-cn.com/problems/maximum-subarray/</a></p>

### 解法

动态规划，dp[i]表示以第i个数结尾的子数组最大和

### 代码

```java
package leetcode.problem42;

public class Solution {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) dp[i] = nums[i];
            else dp[i] = nums[i] + dp[i - 1];
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

```

## 剑指 Offer 43. 1～n 整数中 1 出现的次数

leetcode链接：[https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/](https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/)

### 题目描述

输入一个整数 `n` ，求 1 ～ n 这 n 个整数的十进制表示中 1 出现的次数。

例如，输入 12，1 ～ 12 这些整数中包含 1 的数字有 1、10、11 和 12，1 一共出现了 5 次。

**示例 1：**

```
输入：n = 12
输出：5
```

**示例 2：**

```
输入：n = 13
输出：6
```

**限制：**

- `1 <= n < 2^31`

注意：本题与主站 233 题相同：https://leetcode-cn.com/problems/number-of-digit-one/

### 解法

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.countDigitOne(12));
        Assert.assertEquals(6, solution.countDigitOne(13));
        Assert.assertEquals(2, solution.countDigitOne(10));
        Assert.assertEquals(1737167499, solution.countDigitOne(1410065408));

    }

    public int countDigitOne(int n) {
        int digit = 1;
        int count = 0;

        int high = n / 10, cur = n % 10, low = 0;

        while (high != 0 || cur != 0) {
            if (cur == 0) {
                count += high * digit;
            } else if (cur == 1) {
                count += high * digit + low + 1;
            } else {
                count += (high + 1) * digit;
            }
            low += cur * digit;
            cur = high % 10;
            high = high / 10;
            digit *= 10;
        }

        return count;
    }
}

```

## 剑指 Offer 44. 数字序列中某一位的数字

leetcode链接：[https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/](https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/)

### 题目描述

数字以 0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第 5 位（从下标 0 开始计数）是 5，第 13 位是 1，第 19 位是 4，等等。

请写一个函数，求任意第 n 位对应的数字。

**示例 1：**

```
输入：n = 3
输出：3
```

**示例 2：**

```
输入：n = 11
输出：0
```

**限制：**

- `0 <= n < 2^31`

注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/

### 解法

分别计算不同位数的数字的总数，然后依次确定n指定位置的数字位数、数字、数字中位置

注意越界问题

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.findNthDigit(16));
        Assert.assertEquals(1, solution.findNthDigit(1000000000));
    }

    public int findNthDigit(int n) {
        if (n == 0) return 0;
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = (n - 1) / digit + start;
        String s = String.valueOf(num);
        return s.charAt((n - 1) % digit) - '0';
    }
}

```

## 剑指 Offer 45. 把数组排成最小的数

leetcode链接：[https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/](https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/)

### 题目描述

输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。

**示例 1:**

```
输入: [10,2]
输出: "102"
```

**示例 2:**

```
输入: [3,30,34,5,9]
输出: "3033459"
```

**提示:**

- `0 < nums.length <= 100`

**说明:**

- 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
- 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0。

### 解法

自定义排序

### 代码

```java

import org.junit.Assert;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals("102", solution.minNumber(new int[]{10, 2}));
        Assert.assertEquals("3033459", solution.minNumber(new int[]{3, 30, 34, 5, 9}));
        Assert.assertEquals("12112", solution.minNumber(new int[]{12, 121}));
        Assert.assertEquals("1399439856075703697382478249389609",
                solution.minNumber(new int[]{824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}));
        Assert.assertEquals("10481090114311471380141714951518154817631922000206021321622281231323622362246526972732745282297030213084316332983399346235163567357536363650366436993836384639053932428344534704479848124980520854225460552956825712578459095972603862216241626563066327651165546636698674467586806685670327100720573217423747175367605784679828070810781081838353839889378939902690949149385944894569533968598279890",
                solution.minNumber(new int[]{4704, 6306, 9385, 7536, 3462, 4798, 5422, 5529, 8070, 6241, 9094, 7846, 663, 6221, 216, 6758, 8353, 3650, 3836, 8183, 3516, 5909, 6744, 1548, 5712, 2281, 3664, 7100, 6698, 7321, 4980, 8937, 3163, 5784, 3298, 9890, 1090, 7605, 1380, 1147, 1495, 3699, 9448, 5208, 9456, 3846, 3567, 6856, 2000, 3575, 7205, 2697, 5972, 7471, 1763, 1143, 1417, 6038, 2313, 6554, 9026, 8107, 9827, 7982, 9685, 3905, 8939, 1048, 282, 7423, 6327, 2970, 4453, 5460, 3399, 9533, 914, 3932, 192, 3084, 6806, 273, 4283, 2060, 5682, 2, 2362, 4812, 7032, 810, 2465, 6511, 213, 2362, 3021, 2745, 3636, 6265, 1518, 8398}));
    }

    public String minNumber(int[] nums) {
        return Arrays.stream(nums).mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1)).collect(Collectors.joining());
    }
}

```

## 剑指 Offer 46. 把数字翻译成字符串

leetcode链接：[https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/](https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/)

### 题目描述

给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

**示例 1:**

```
输入: 12258
输出: 5
解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
```

**提示：**

- 0 <= num < 2<sup>31</sup>

### 解法

动态规划

dp[i]为以数字i结尾时翻译方法的个数

注意字符串"06"不可翻译

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.translateNum(12258));
        Assert.assertEquals(1, solution.translateNum(26));
        Assert.assertEquals(1, solution.translateNum(506));
    }

    public int translateNum(int num) {
        String numString = String.valueOf(num);
        int[] dp = new int[numString.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < numString.length(); i++) {
            int i1 = Integer.parseInt(numString.substring(i - 1, i + 1));
            if (i1 < 26 && i1 > 9) {
                dp[i + 1] += dp[i - 1];
            }
            dp[i + 1] += dp[i];
        }
        return dp[numString.length()];
    }
}

```

## 剑指 Offer 47. 礼物的最大价值

leetcode链接：[https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/](https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/)

### 题目描述

在一个 `m*n` 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于
0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？

**示例 1:**

```
输入:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 12
解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
```

**提示：**

- `0 < grid.length <= 200`
- `0 < grid[0].length <= 200`

### 解法

动态规划

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Assert.assertEquals(12, solution.maxValue(grid));
    }

    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]) + grid[i][j];
            }
        }
        return dp[grid.length][grid[0].length];
    }
}

```

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

动态规划

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
}

```

## 剑指 Offer 49. 丑数

leetcode链接：[https://leetcode-cn.com/problems/chou-shu-lcof/](https://leetcode-cn.com/problems/chou-shu-lcof/)

### 题目描述

我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。

**示例:**

```
输入: n = 10
输出: 12
解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
```

**说明:**

1. `1`  是丑数。
2. `n`  不超过 1690。

### 解法

动态规划，对丑数进行递推

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(12, solution.nthUglyNumber(10));
        Assert.assertEquals(15, solution.nthUglyNumber(11));
        System.out.println(solution.nthUglyNumber(1352));
    }

    public int nthUglyNumber(int n) {
        int[] dp = new int[1700];
        int a = 1, b = 1, c = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
            if (dp[i] == dp[a] * 2) {
                a++;
            }
            if (dp[i] == dp[b] * 3) {
                b++;
            }
            if (dp[i] == dp[c] * 5) {
                c++;
            }
        }

        return dp[n];
    }
}

```

## 剑指 Offer 50. 第一个只出现一次的字符

leetcode链接：[https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)

### 题目描述

在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。

**示例:**

```
s = "abaccdeff"
返回 "b"

s = ""
返回 " "
```

**限制：**

- `0 <= s 的长度 <= 50000`

### 解法

两次循环即可

### 代码

```java

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public char firstUniqChar(String s) {
        Map<Character, Boolean> emerge = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            emerge.put(s.charAt(i), !emerge.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if (emerge.get(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

```

## 剑指 Offer 51. 数组中的逆序对

leetcode链接：[https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/](https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)

### 题目描述

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

**示例 1:**

```
输入: [7,5,6,4]
输出: 5
```

**限制：**

- `0 <= 数组长度 <= 50000`

### 解法

归并排序，在合并的时候，检查逆序对的个数

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.reversePairs(new int[]{7, 5, 6, 4}));
        Assert.assertEquals(0, solution.reversePairs(new int[]{4, 5, 6, 7}));
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length, new int[nums.length]);
    }

    private int mergeSort(int[] nums, int start, int end, int[] resNums) {
        if (end - start <= 1) return 0;
        int res = 0;
        int mid = (start + end) / 2;
        res += mergeSort(nums, start, mid, resNums);
        res += mergeSort(nums, mid, end, resNums);
        int pos = start;

        int i = start, j = mid;
        while (i < mid && j < end) {
            if (nums[i] > nums[j]) {
                resNums[pos++] = nums[j++];
                res += mid - i;
            } else {
                resNums[pos++] = nums[i++];
            }
        }
        while (i < mid) {
            resNums[pos++] = nums[i++];
        }
        while (j < end) {
            resNums[pos++] = nums[j++];
        }
        while (start < end) {
            nums[start] = resNums[start];
            start++;
        }
        return res;
    }
}

```

## 剑指 Offer 52. 两个链表的第一个公共节点

leetcode链接:[https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/](https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/)

### 题目描述

输入两个链表，找出它们的第一个公共节点。

如下面的两个链表：

![](https://gitee.com/halfcoke/blog_img/raw/master/20210803135101.png)

在节点 c1 开始相交。

**示例 1：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210803135118.png)

```
输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
输出：Reference of the node with value = 8
输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
```

**示例 2：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210803135129.png)

```
输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
输出：Reference of the node with value = 2
输入解释：相交节点的值为 2 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。
```

**示例 3：**

![](https://gitee.com/halfcoke/blog_img/raw/master/20210803135137.png)

```
输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
输出：null
输入解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
解释：这两个链表不相交，因此返回 null。
```

**注意：**

- 如果两个链表没有交点，返回 `null`。
- 在返回结果后，两个链表仍须保持原有的结构。
- 可假定整个链表结构中没有循环。
- 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。

### 解法

双指针 如果两个链表长度相同则直接返回相同节点或null 如果两个链表长度不同，则通过将A指针指向B链表的操作来计算指针之间的差值

### 代码

```java

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode inter = new ListNode(8);
        inter.next = new ListNode(4);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = inter;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = inter;

        solution.getIntersectionNode(headA, headB);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode posA = headA;
        ListNode posB = headB;
        while (posA != posB) {
            posA = posA == null ? headB : posA.next;
            posB = posB == null ? headA : posB.next;
        }
        return posA;
    }
}

```

## 剑指 Offer 53 - I. 在排序数组中查找数字 I

leetcode链接：[https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/](https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/)

### 题目描述

统计一个数字在排序数组中出现的次数。

**示例 1:**

```
输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
```

**示例 2:**

```
输入: nums = [5,7,7,8,8,10], target = 6
输出: 0
```

**限制：**

- `0 <= 数组长度 <= 50000`

### 解法

二分查找

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
        Assert.assertEquals(0, solution.search(new int[]{2, 2}, 1));
    }

    public int search(int[] nums, int target) {

        return nums.length == 0 ? 0 : halfSearch(nums, target, 0, nums.length);
    }

    private int halfSearch(int[] nums, int target, int start, int end) {
        if (end - start <= 1) return nums[start] == target ? 1 : 0;
        if (nums[start] == target && target == nums[end - 1]) return end - start;

        int res = 0;
        int mid = (end + start) / 2;
        if (nums[mid - 1] >= target) res += halfSearch(nums, target, start, mid);
        if (nums[mid] <= target) res += halfSearch(nums, target, mid, end);
        return res;
    }
}

```

## 剑指 Offer 53 - II. 0～n-1中缺失的数字

leetcode链接：[https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/](https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/)

### 题目描述

一个长度为 n-1 的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围 0 ～ n-1 之内。在范围 0 ～ n-1 内的 n 个数字中有且只有一个数字不在该数组中，请找出这个数字。

**示例 1:**

```
输入: [0,1,3]
输出: 2
```

**示例 2:**

```
输入: [0,1,2,3,4,5,6,7,9]
输出: 8
```

**限制：**

- `1 <= 数组长度 <= 10000`

### 解法

二分法

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.missingNumber(new int[]{1}));
        Assert.assertEquals(0, solution.missingNumber(new int[]{1, 2}));
        Assert.assertEquals(2, solution.missingNumber(new int[]{0, 1, 3}));
        Assert.assertEquals(1, solution.missingNumber(new int[]{0, 2, 3}));
        Assert.assertEquals(8, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));

    }

    public int missingNumber(int[] nums) {
        if (nums[0] != 0) return 0;
        int res = halfSearch(nums, 0, nums.length);
        return res == -1 ? nums[nums.length - 1] + 1 : res;
    }

    private int halfSearch(int[] nums, int start, int end) {
        if (end - start <= 2) return nums[end - 1] - nums[start] <= 1 ? -1 : nums[start] + 1;

        int mid = (start + end) / 2;
        int res = -1;
        res = halfSearch(nums, start, mid + 1);
        if (res != -1) return res;
        res = halfSearch(nums, mid, end);
        return res;
    }
}

```

## 剑指 Offer 54. 二叉搜索树的第k大节点

leetcode链接：[https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)

### 题目描述

给定一棵二叉搜索树，请找出其中第 k 大的节点。

**示例 1:**

```
输入: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
输出: 4
```

**示例 2:**

```
输入: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
输出: 4
```

**限制：**

- `1 ≤ k ≤ 二叉搜索树元素个数`

### 解法

中序遍历，计数并提前返回

### 代码

```java
package leetcode.problem54;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        solution.kthLargest(root, 3);
    }

    int k = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        return preOrder(root).val;
    }

    private TreeNode preOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode res;
        res = preOrder(root.right);
        if (res != null) return res;
        this.k--;
        if (this.k == 0) {
            return root;
        }
        return preOrder(root.left);
    }
}

```

## 剑指 Offer 55 - I. 二叉树的深度

leetcode链接：[https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/](https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/)

### 题目描述

输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。

例如：

给定二叉树 `[3,9,20,null,null,15,7]`，

```
    3
   / \
  9  20
    /  \
   15   7
```

返回它的最大深度 3 。

**提示：**

- `节点总数 <= 10000`

### 解法

使用层序遍历，循环了多少层便是深度

### 代码

```java

import leetcode.problem55.TreeNode;

import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayDeque<TreeNode> level = new ArrayDeque<>();
        ArrayDeque<TreeNode> exchange = new ArrayDeque<>();

        int res = 0;
        level.add(root);
        while (!level.isEmpty()) {
            ArrayDeque<TreeNode> t = exchange;
            exchange = level;
            level = t;
            while (!exchange.isEmpty()) {
                TreeNode node = exchange.poll();
                if (node.left != null) level.add(node.left);
                if (node.right != null) level.add(node.right);
            }
            res++;
        }
        return res;
    }
}

```

## 剑指 Offer 55 - II. 平衡二叉树

leetcode链接：[https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/](https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/)

### 题目描述

输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过 1，那么它就是一棵平衡二叉树。

**示例 1:**

给定二叉树 `[3,9,20,null,null,15,7]`

```
    3
   / \
  9  20
    /  \
   15   7
```

返回 `true`。

**示例 2:**

给定二叉树 `[1,2,2,3,3,null,null,4,4]`

```
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
```

返回  `false`。

**限制：**

- `1 <= 树的结点个数 <= 10000`

### 解法

前序遍历判断是否是平衡二叉树，用map保存对节点深度的求解

### 代码

```java

import leetcode.problem55.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    Map<TreeNode, Integer> depthMap = new HashMap<>();

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (depthMap.containsKey(root)) return depthMap.get(root);
        int res = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        depthMap.put(root, res);
        return res;
    }
}

```

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

## 剑指 Offer 57. 和为s的两个数字

leetcode链接：[https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/](https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/)

### 题目描述

输入一个递增排序的数组和一个数字 s，在数组中查找两个数，使得它们的和正好是 s。如果有多对数字的和等于 s，则输出任意一对即可。

**示例 1：**

```
输入：nums = [2,7,11,15], target = 9
输出：[2,7] 或者 [7,2]
```

**示例 2：**

```
输入：nums = [10,26,30,31,47,60], target = 40
输出：[10,30] 或者 [30,10]
```

**限制：**

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^6`

### 解法

双指针

### 代码

```java

public class Solution {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (nums[first] + nums[last] != target) {
            if (nums[first] + nums[last] > target) {
                last--;
            } else {
                first++;
            }
        }
        return new int[]{nums[first], nums[last]};
    }
}

```

## 剑指 Offer 57 - II. 和为s的连续正数序列

leetcode链接：[https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/](https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)

### 题目描述

输入一个正整数 `target` ，输出所有和为 `target` 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

**示例 1：**

```
输入：target = 9
输出：[[2,3,4],[4,5]]
```

**示例 2：**

```
输入：target = 15
输出：[[1,2,3,4,5],[4,5,6],[7,8]]
```

**限制：**

- `1 <= target <= 10^5`

### 解法

滑动窗口(双指针)

### 代码

```java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.findContinuousSequence(9)));
        System.out.println(Arrays.deepToString(solution.findContinuousSequence(15)));
    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();

        int first = 1;
        int last = first + 1;
        int sum = first + last;
        while (last > first) {
            if (sum < target) {
                last++;
                sum += last;
            } else if (sum > target) {
                sum -= first;
                first++;
            } else {

                int[] ints = new int[last - first + 1];
                int pos = 0;
                for (int i = first; i <= last; i++) {
                    ints[pos++] = i;
                }
                res.add(ints);
                sum -= first;
                first++;
            }

        }
        return res.toArray(new int[0][]);
    }
}

```

## 剑指 Offer 58 - I. 翻转单词顺序

leetcode链接：[https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/](https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/)

### 题目描述

输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。

**示例 1：**

```
输入: "the sky is blue"
输出: "blue is sky the"
```

**示例 2：**

```
输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
```

**示例 3：**

```
输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
```

**说明：**

- 无空格字符构成一个单词。
- 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
- 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。

**注意：** 本题与主站 151 题相同：https://leetcode-cn.com/problems/reverse-words-in-a-string/

**注意：** 此题对比原题有改动

### 解法

分割后反转

### 代码

```java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] s1 = s.split(" ");

        List<String> collect = Arrays.stream(s1)
                .filter((s2 -> s2.length() != 0))
                .collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ", collect);
    }
}

```

## 剑指 Offer 58 - II. 左旋转字符串

leetcode链接：[https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/](https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/)

### 题目描述

字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字 2，该函数将返回左旋转两位得到的结果"cdefgab"。

**示例 1：**

```
输入: s = "abcdefg", k = 2
输出: "cdefgab"
```

**示例 2：**

```
输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"
```

**限制：**

- `1 <= k < s.length <= 10000`

### 解法

直接拼接即可

### 代码

```java

public class Solution {
    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}

```

## 剑指 Offer 59 - I. 滑动窗口的最大值

leetcode链接：[https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/)

### 题目描述

给定一个数组 `nums` 和滑动窗口的大小 `k`，请找出所有滑动窗口里的最大值。

**示例:**

```
输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
解释:

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

**提示：**

- 你可以假设 k 总是有效的，在输入数组不为空的情况下，`1 ≤ k ≤ 输入数组的大小`。

注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/

### 解法

### 代码

```java
import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{1, -1}, solution.maxSlidingWindow(new int[]{1, -1}, 1));
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow1(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{1, -1}, solution.maxSlidingWindow1(new int[]{1, -1}, 1));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return new int[0];
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        ArrayDeque<Integer> numQueue = new ArrayDeque<>(k);

        int[] res = new int[nums.length - k + 1];
        int pos = 0;

        for (int num : nums) {
            numQueue.add(num);
            maxQueue.add(num);
            while (numQueue.size() > k) {
                maxQueue.remove(numQueue.poll());
            }
            if (numQueue.size() == k) {
                res[pos++] = maxQueue.peek();
            }
        }
        return res;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (k == 0) return new int[0];
        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) queue.removeLast();
            queue.add(nums[i]);
        }
        res[0] = queue.peek();
        int pos = 1;
        for (int i = k; i < nums.length; i++) {
            if (!queue.isEmpty() && queue.peek() == nums[i - k]) queue.remove();
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) queue.removeLast();
            queue.add(nums[i]);
            res[pos++] = queue.peek();
        }
        return res;
    }
}

```

## 剑指 Offer 59 - II. 队列的最大值

leetcode链接：[https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/](https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/)

### 题目描述

请定义一个队列并实现函数 `max_value` 得到队列里的最大值，要求函数`max_value`、`push_back` 和 `pop_front` 的**均摊**时间复杂度都是 O(1)。

若队列为空，`pop_front` 和 `max_value`  需要返回 -1

**示例 1:**

```
输入:
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
```

**示例 2:**

```
输入:
["MaxQueue","pop_front","max_value"]
[[],[],[]]
输出: [null,-1,-1]
```

**限制：**

- `1 <= push_back,pop_front,max_value的总操作数 <= 10000`
- `1 <= value <= 10^5`

### 解法

### 代码

```java

import java.util.Deque;
import java.util.LinkedList;

public class MaxQueue {
    Deque<Integer> data, maxData;

    public MaxQueue() {
        data = new LinkedList<>();
        maxData = new LinkedList<>();
    }

    public int max_value() {
        return maxData.isEmpty() ? -1 : maxData.peek();
    }

    public void push_back(int value) {
        data.add(value);
        while (!maxData.isEmpty() && maxData.peekLast() < value) maxData.pollLast();
        maxData.add(value);
    }

    public int pop_front() {
        if (!data.isEmpty()) {
            int res = data.poll();
            if (!maxData.isEmpty() && maxData.peek() == res) maxData.poll();
            return res;
        } else {
            return -1;
        }
    }
}

```

## 剑指 Offer 60. n个骰子的点数

leetcode链接：[https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/](https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/)

### 题目描述

把 n 个骰子扔在地上，所有骰子朝上一面的点数之和为 s。输入 n，打印出 s 的所有可能的值出现的概率。

你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。

**示例 1:**

```
输入: 1
输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
```

**示例 2:**

```
输入: 2
输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
```

**限制：**

- `1 <= n <= 11`

### 解法

动态规划

### 代码

```java

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.dicesProbability(2);
    }

    public double[] dicesProbability(int n) {
        double[][] dp = new double[n + 1][6 * n + 1];
        Arrays.fill(dp[1], 1.0 / 6);
        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j <= (i - 1) * 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    dp[i][j + k] += dp[i - 1][j] * 1 / 6;
                }
            }
        }
        return Arrays.copyOfRange(dp[n], n, dp[n].length);
    }
}

```

## 剑指 Offer 61. 扑克牌中的顺子

leetcode链接：[https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/](https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/)

### 题目描述

从扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这 5 张牌是不是连续的。2 ～ 10 为数字本身，A 为 1，J 为 11，Q 为 12，K 为 13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。

**示例 1:**

```
输入: [1,2,3,4,5]
输出: True
```

**示例 2:**

```
输入: [0,0,1,2,5]
输出: True
```

**限制：**

- 数组长度为 5
- 数组的数取值为 `[0, 13]`

### 解法

遍历

### 代码

```java

import org.junit.Assert;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isStraight(new int[]{1, 2, 3, 4, 5}));
        Assert.assertTrue(solution.isStraight(new int[]{0, 0, 1, 2, 5}));
    }

    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (set.contains(num)) return false;
            set.add(num);
        }
        return max - min < 5;
    }
}

```

## 剑指 Offer 62. 圆圈中最后剩下的数字

leetcode链接：[https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/](https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/)

### 题目描述

0,1,,n-1 这 n 个数字排成一个圆圈，从数字 0 开始，每次从这个圆圈里删除第 m 个数字。求出这个圆圈里剩下的最后一个数字。

例如，0、1、2、3、4 这 5 个数字组成一个圆圈，从数字 0 开始每次删除第 3 个数字，则删除的前 4 个数字依次是 2、0、4、1，因此最后剩下的数字是 3。

**示例 1：**

```
输入: n = 5, m = 3
输出: 3
```

**示例 2：**

```
输入: n = 10, m = 17
输出: 2
```

**限制：**

- `1 <= n <= 10^5`
- `1 <= m <= 10^6`

### 解法

暂无

### 代码

```java

```

## 剑指 Offer 63. 股票的最大利润

leetcode链接：[https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/](https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/)

### 题目描述

假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？

**示例 1:**

```
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
```

**示例 2:**

```
输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
```

**限制：**

- `0 <= 数组长度 <= 10^5`

### 解法

动态规划

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        int minPrices = prices[0];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrices = Math.min(minPrices, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrices);
        }
        return dp[prices.length - 1];
    }
}

```

## 剑指 Offer 64. 求1+2+…+n

leetcode链接：[https://leetcode-cn.com/problems/qiu-12n-lcof/](https://leetcode-cn.com/problems/qiu-12n-lcof/)

### 题目描述

求 `1+2+...+n`，要求不能使用乘除法、for、while、if、else、switch、case 等关键字及条件判断语句（A?B:C）。

**示例 1：**

```
输入: n = 3
输出: 6
```

**示例 2：**

```
输入: n = 9
输出: 45
```

**限制：**

- `1 <= n <= 10000`

### 解法

逻辑符短路，加递归

### 代码

```java
package leetcode.problem64;

public class Solution {
    public static void main(String[] args) {

    }

    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}

```

## 剑指 Offer 65. 不用加减乘除做加法

leetcode链接：[https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/](https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/)

### 题目描述

写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“\*”、“/” 四则运算符号。

**示例:**

```
输入: a = 1, b = 1
输出: 2
```

**提示：**

- `a`, `b`  均可能是负数或 0
- 结果不会溢出 32 位整数

### 解法

位运算

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.add(1, 1));
        Assert.assertEquals(3, solution.add(1, 2));
        Assert.assertEquals(1, solution.add(-1, 2));
        Assert.assertEquals(-1, solution.add(-1, 0));

    }

    public int add(int a, int b) {
        int m = 1;
        int res = 0;
        int up = 0;
        while (m != 0) {
            int dA = a & m;
            int dB = b & m;
            if (dA != 0 && dB != 0) {
                res |= up;
                up = m << 1;
            } else if (dA != 0 || dB != 0) {
                res |= dA ^ dB ^ up;
                if (up != 0) up = m << 1;
            } else {
                res |= up;
                up = 0;
            }
            m <<= 1;
        }
        res |= up;
        return res;
    }
}

```

## 剑指 Offer 66. 构建乘积数组

leetcode链接：[https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/](https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/)

### 题目描述

给定一个数组 `A[0,1,…,n-1]`，请构建一个数组 `B[0,1,…,n-1]`，其中 B 中的元素 `B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]`。不能使用除法。

**示例:**

```
输入: [1,2,3,4,5]
输出: [120,60,40,30,24]
```

**提示：**

- 所有元素乘积之和不会溢出 32 位整数
- `a.length <= 100000`

### 解法

遍历两轮数组得到所有需要的乘积

### 代码

```java
import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution.constructArr(new int[]{1, 2, 3, 4, 5}));

    }

    public int[] constructArr(int[] a) {
        if (a.length <= 1) return a;
        int[] first = new int[a.length];
        int[] last = new int[a.length];
        first[0] = a[0];
        last[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            first[i] = first[i - 1] * a[i];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            last[i] = last[i + 1] * a[i];
        }
        int[] res = new int[a.length];
        res[0] = last[1];
        res[res.length - 1] = first[res.length - 2];
        for (int i = 1; i < res.length - 1; i++) {
            res[i] = first[i - 1] * last[i + 1];
        }
        return res;
    }

    public int[] constructArr1(int[] a) {
        if (a.length <= 1) return a;
        int[] res = new int[a.length];
        res[0] = 1;
        for (int i = 1; i < a.length; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }
        int temp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            res[i] *= temp;
        }
        return res;
    }
}

```

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

## 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先

leetcode链接：[https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/)

### 题目描述

给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。

[百度百科](https://baike.baidu.com/item/%E6%9C%80%E8%BF%91%E5%85%AC%E5%85%B1%E7%A5%96%E5%85%88/8918834?fr=aladdin)中最近公共祖先的定义为：“对于有根树
T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（**一个节点也可以是它自己的祖先**）。”

例如，给定如下二叉搜索树:  root = `[6,2,8,0,4,7,9,null,null,3,5]`

![](./images/binarysearchtree_improved.png)

**示例 1:**

```
输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
输出: 6
解释: 节点 2 和节点 8 的最近公共祖先是 6。
```

**示例 2:**

```
输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
输出: 2
解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
```

**说明:**

- 所有节点的值都是唯一的。
- p、q 为不同节点且均存在于给定的二叉搜索树中。

### 解法

### 代码

```java

```

## 剑指 Offer 68 - II. 二叉树的最近公共祖先

leetcode链接：[https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/](https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/)

### 题目描述

给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

[百度百科](https://baike.baidu.com/item/%E6%9C%80%E8%BF%91%E5%85%AC%E5%85%B1%E7%A5%96%E5%85%88/8918834?fr=aladdin)中最近公共祖先的定义为：“对于有根树
T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（**一个节点也可以是它自己的祖先**）。”

例如，给定如下二叉树:  root = `[3,5,1,6,2,0,8,null,null,7,4]`

![](https://gitee.com/halfcoke/blog_img/raw/master/20210804165837.png)

**示例 1:**

```
输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
输出: 3
解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
```

**示例 2:**

```
输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
输出: 5
解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
```

**说明:**

- 所有节点的值都是唯一的。
- p、q 为不同节点且均存在于给定的二叉树中。

### 解法

### 代码

```java
package leetcode.problem68.problem68_1;

import leetcode.problem68.TreeNode;

public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}

```