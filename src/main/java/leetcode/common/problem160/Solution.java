package leetcode.common.problem160;

import leetcode.ListNode;

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        if (headA == null || headB == null) return null;
        ListNode A = headA;
        ListNode B = headB;
        while (A != null && B != null && A != B) {
            A = A.next;
            B = B.next;
            if (A == null) A = headB;
            if (B == null) B = headA;
        }
        return A;


    }
}
