package leetcode.problem18;

import leetcode.ListNode;
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