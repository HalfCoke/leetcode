package leetcode.problem53.problem53_1;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
        Assert.assertEquals(0, solution.search(new int[]{2, 2}, 1));
    }

    public int search(int[] nums, int target) {

        return nums.length == 0 ? 0 : halfSearch(nums, target, 0, nums.length);
    }

    private int halfSearch(int[] nums, int target, int start, int end) {
        if (end - start <= 1) return nums[start] == target ? 1 : 0;
        if (nums[start] == target && target == nums[end - 1]) return end - start;

        int res = 0;
        int mid = (end + start) / 2;
        if (nums[mid - 1] >= target) res += halfSearch(nums, target, start, mid);
        if (nums[mid] <= target) res += halfSearch(nums, target, mid, end);
        return res;
    }
}
