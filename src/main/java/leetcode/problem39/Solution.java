package leetcode.problem39;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private int[] quickSort(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        return sort(copy, 0, copy.length);
    }

    private int[] sort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int partitionIndex = partitionIndex(nums, start, end);
        nums = sort(nums, start, partitionIndex);
        nums = sort(nums, partitionIndex + 1, end);
        return nums;
    }

    private int partitionIndex(int[] nums, int start, int end) {
        int index = start + 1;
        for (int i = index; i < end; i++) {
            if (nums[i] < nums[start]) {
                swap(nums, index, i);
                index++;
            }
        }
        swap(nums, index - 1, start);
        return index - 1;
    }

    private void swap(int[] arr, int x, int y) {
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }
}
