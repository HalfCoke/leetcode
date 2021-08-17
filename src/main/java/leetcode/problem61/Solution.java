package leetcode.problem61;

import org.junit.Assert;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isStraight(new int[]{1, 2, 3, 4, 5}));
        Assert.assertTrue(solution.isStraight(new int[]{0, 0, 1, 2, 5}));
    }

    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (set.contains(num)) return false;
            set.add(num);
        }
        return max - min < 5;
    }
}
