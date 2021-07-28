package leetcode.problem31;

import org.junit.Assert;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        Assert.assertTrue(solution.validateStackSequences(pushed, popped));

        Assert.assertTrue(solution.validateStackSequences(new int[]{1, 0}, new int[]{1, 0}));

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed == null || pushed.length == 0) return true;
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        for (int push : pushed) {
            stack.push(push);
            while (!stack.isEmpty() && stack.peek() == popped[pos]) {
                stack.pop();
                pos++;
            }
        }
        return stack.isEmpty();
    }
}
