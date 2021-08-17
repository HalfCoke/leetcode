package leetcode.offer.problem52;

import leetcode.ListNode;

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
