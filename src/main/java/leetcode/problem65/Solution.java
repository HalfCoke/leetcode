package leetcode.problem65;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.add(1, 1));
        Assert.assertEquals(3, solution.add(1, 2));
        Assert.assertEquals(1, solution.add(-1, 2));
        Assert.assertEquals(-1, solution.add(-1, 0));

    }

    public int add(int a, int b) {
        int m = 1;
        int res = 0;
        int up = 0;
        while (m != 0) {
            int dA = a & m;
            int dB = b & m;
            if (dA != 0 && dB != 0) {
                res |= up;
                up = m << 1;
            } else if (dA != 0 || dB != 0) {
                res |= dA ^ dB ^ up;
                if (up != 0) up = m << 1;
            } else {
                res |= up;
                up = 0;
            }
            m <<= 1;
        }
        res |= up;
        return res;
    }
}
