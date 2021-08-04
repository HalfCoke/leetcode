package leetcode.problem56.problem56_1;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] singleNumbers(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            temp ^= num;
        }
        int m = 1;
        while ((temp & m) == 0) {
            m = m << 1;
        }
        int x = 0, y = 0;
        for (int num : nums) {
            if ((num & m) == 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x, y};
    }
}
