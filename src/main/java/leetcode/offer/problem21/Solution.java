package leetcode.problem21;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int[] exchange(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;

        int first = 0, last = nums.length - 1;

        while (first < nums.length && last >= 0 && first < last) {
            while (nums[first] % 2 == 0 && first < last) {
                int t = nums[first];
                nums[first] = nums[last];
                nums[last] = t;
                last--;
            }
            first++;
        }

        return nums;
    }
}
