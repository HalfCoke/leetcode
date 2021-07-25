package leetcode.problem06;

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

