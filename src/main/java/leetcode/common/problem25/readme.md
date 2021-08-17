## 25. K 个一组翻转链表

leetcode链接：[https://leetcode-cn.com/problems/reverse-nodes-in-k-group/](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/)

### 题目描述

### 解法

### 代码
```java
package leetcode.common.problem25;

import leetcode.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode listNode = solution.reverseKGroup(head, 4);
        System.out.println(listNode);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) return head;

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode last = head;
        ListNode first = dummyHead;
        while (last != null) {
            int pos = 1;
            // 找到反转区域的最后一个节点，或者节点数不够时为null
            while (pos < k && last != null) {
                pos++;
                last = last.next;
            }
            // 先保存下一阶段起始状态的几个节点
            ListNode nextLast = last == null ? null : last.next;
            ListNode nextFirst = first.next;
            if (pos == k && last != null) {
                // 如果可以进行反转，则反转这一区的节点
                reverseInterval(first, last);
                last = nextLast;
                first = nextFirst;
                // 重新链接链表
                first.next = last;
            }
        }
        return dummyHead.next;
    }

    private void reverseInterval(ListNode dummyFirst, ListNode last) {
        ListNode pre = dummyFirst;
        ListNode cur = dummyFirst.next;
        while (pre != last) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        dummyFirst.next.next = cur;
        dummyFirst.next = pre;
    }
}

```