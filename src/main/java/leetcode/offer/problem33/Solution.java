package leetcode.offer.problem33;

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
