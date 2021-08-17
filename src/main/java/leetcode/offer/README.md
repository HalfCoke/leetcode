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
package leetcode.offer.problem54;

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

import leetcode.offer.problem55.TreeNode;

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

import leetcode.offer.problem55.TreeNode;

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