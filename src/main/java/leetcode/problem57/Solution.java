package leetcode.problem57;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (nums[first] + nums[last] != target) {
            if (nums[first] + nums[last] > target) {
                last--;
            } else {
                first++;
            }
        }
        return new int[]{nums[first], nums[last]};
    }
}
