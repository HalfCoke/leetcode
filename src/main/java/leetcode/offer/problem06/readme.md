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
```
