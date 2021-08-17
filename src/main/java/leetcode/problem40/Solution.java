package leetcode.problem40;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.getLeastNumbers(new int[]{3, 2, 1}, 2);
        System.out.println(Arrays.toString(ints));
        ints = solution.getLeastNumbers(new int[]{0, 1, 2, 1}, 1);
        System.out.println(Arrays.toString(ints));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0) return new int[0];
        int[] ints = quickSort(arr);
        int[] res = new int[k];
        Arrays.fill(res, -1);
        int pos = 0;
        for (int i = 0; i < ints.length && pos < k; i++) {
            if (res[pos] != ints[i]) {
                res[pos++] = ints[i];
            }
        }
        return res;
    }

    private int[] quickSort(int[] nums) {
        int[] ints = Arrays.copyOf(nums, nums.length);
        sort(ints, 0, ints.length);
        return ints;
    }

    private void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partitionIndex(nums, start, end);
        sort(nums, start, index);
        sort(nums, index + 1, end);
    }

    private int partitionIndex(int[] nums, int start, int end) {
        int index = start + 1;
        for (int i = index; i < end; i++) {
            if (nums[i] < nums[start]) {
                swap(nums, index, i);
                index++;
            }
        }
        swap(nums, start, index - 1);
        return index - 1;
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

}
