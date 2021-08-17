package leetcode.offer.problem56.problem56_2;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.singleNumber(new int[]{3, 4, 3, 3}));
        Assert.assertEquals(1, solution.singleNumber(new int[]{9, 1, 7, 9, 7, 9, 7}));
    }

    public int singleNumber(int[] nums) {
        int[] sumBinary = new int[32];
        for (int num : nums) {
            String binaryString = Integer.toBinaryString(num);
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '1') sumBinary[binaryString.length() - 1 - i] += 1;
            }
        }
        int pos = 0;
        int res = 0;
        for (int i = 0; i < sumBinary.length; i++) {
            res += (sumBinary[i] % 3) * (int) Math.pow(2, pos++);
        }
        return res;
    }
}
