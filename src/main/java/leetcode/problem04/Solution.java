package leetcode.problem04;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assert solution.findNumberIn2DArray(matrix, 5);
        assert !solution.findNumberIn2DArray(matrix, 20);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] line : matrix) {
            for (int i : line) {
                if (target == i) {
                    return true;
                } else if (target < i) {
                    break;
                }
            }
        }
        return false;
    }
}
