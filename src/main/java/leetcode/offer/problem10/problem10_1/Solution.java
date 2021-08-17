package leetcode.problem10.problem10_1;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.fib(2));
        Assert.assertEquals(5, solution.fib(5));
        Assert.assertEquals(134903163, solution.fib(45));
        Assert.assertEquals(807526948, solution.fib(48));
        Assert.assertEquals(407059028, solution.fib(95));
    }

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int one = 0, two = 1;
        for (int i = 2; i <= n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
            two %= 1000000007;
        }
        return two % 1000000007;
    }
}
