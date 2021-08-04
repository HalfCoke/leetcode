package leetcode.problem51;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.reversePairs(new int[]{7, 5, 6, 4}));
        Assert.assertEquals(0, solution.reversePairs(new int[]{4, 5, 6, 7}));
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length, new int[nums.length]);
    }

    private int mergeSort(int[] nums, int start, int end, int[] resNums) {
        if (end - start <= 1) return 0;
        int res = 0;
        int mid = (start + end) / 2;
        res += mergeSort(nums, start, mid, resNums);
        res += mergeSort(nums, mid, end, resNums);
        int pos = start;

        int i = start, j = mid;
        while (i < mid && j < end) {
            if (nums[i] > nums[j]) {
                resNums[pos++] = nums[j++];
                res += mid - i;
            } else {
                resNums[pos++] = nums[i++];
            }
        }
        while (i < mid) {
            resNums[pos++] = nums[i++];
        }
        while (j < end) {
            resNums[pos++] = nums[j++];
        }
        while (start < end) {
            nums[start] = resNums[start];
            start++;
        }
        return res;
    }
}
