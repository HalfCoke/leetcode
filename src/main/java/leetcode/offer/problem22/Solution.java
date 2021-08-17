package leetcode.offer.problem22;

import leetcode.ListNode;

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
