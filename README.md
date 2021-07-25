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

### 解法

### 代码

```java

```


### 题目描述

### 解法

### 代码

```java

```

