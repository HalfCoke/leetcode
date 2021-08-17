package leetcode.offer.problem53.problem53_2;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.missingNumber(new int[]{1}));
        Assert.assertEquals(0, solution.missingNumber(new int[]{1, 2}));
        Assert.assertEquals(2, solution.missingNumber(new int[]{0, 1, 3}));
        Assert.assertEquals(1, solution.missingNumber(new int[]{0, 2, 3}));
        Assert.assertEquals(8, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));

    }

    public int missingNumber(int[] nums) {
        if (nums[0] != 0) return 0;
        int res = halfSearch(nums, 0, nums.length);
        return res == -1 ? nums[nums.length - 1] + 1 : res;
    }

    private int halfSearch(int[] nums, int start, int end) {
        if (end - start <= 2) return nums[end - 1] - nums[start] <= 1 ? -1 : nums[start] + 1;

        int mid = (start + end) / 2;
        int res = -1;
        res = halfSearch(nums, start, mid + 1);
        if (res != -1) return res;
        res = halfSearch(nums, mid, end);
        return res;
    }
}
