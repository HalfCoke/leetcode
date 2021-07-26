package leetcode.problem14.problem14_2;

import org.junit.Assert;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(953271190, solution.cuttingRope(120));
    }

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int p = 1000000007;
        int b = n % 3;
        long rem = 1, x = 3;
        for (int a = n / 3 - 1; a > 0; a /= 2) {
            if (a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if (b == 0) return (int) (rem * 3 % p);
        if (b == 1) return (int) (rem * 4 % p);
        return (int) (rem * 6 % p);
    }
}
