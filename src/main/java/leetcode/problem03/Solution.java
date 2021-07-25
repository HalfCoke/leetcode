package leetcode.problem03;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        final int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int res = solution.findRepeatNumber(nums);
        assert (res == 2 || res == 3);

        final int[] nums1 = {2, 3, 1, 5, 0, 0};
        res = solution.findRepeatNumber(nums1);
        assert res == 0;

        // 在寻找时，必须使用while，否则这一用例无法通过
        final int[] nums2 = {2, 3, 1, 5, 5, 0};
        res = solution.findRepeatNumber(nums2);
        assert res == 5;

    }


    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            while (cur != i) {
                if (nums[cur] != cur) {
                    nums[i] = nums[cur];
                    nums[cur] = cur;
                } else {
                    return cur;
                }
                cur = nums[i];
            }
        }
        return -1;
    }
}
