package leetcode.problem16;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1024.0, solution.myPow(2.0, 10), 0.000000001);
        Assert.assertEquals(9.26100, solution.myPow(2.1, 3), 0.000000001);
        Assert.assertEquals(0.25, solution.myPow(2.0, -2), 0.000000001);
        Assert.assertEquals(4, solution.myPow(-2.0, 2), 0.000000001);
        Assert.assertEquals(0, solution.myPow(2.0, -2147483648), 0.000000001);
    }

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (Math.abs(x - 0) < 0.00000000001) return 0.0;
        long ln = n;
        if (ln < 0) {
            ln = -1 * ln;
            x = 1 / x;
        }
        double res = 1.0;
        for (long i = ln; i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }
}
