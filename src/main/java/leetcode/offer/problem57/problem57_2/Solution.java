package leetcode.offer.problem57.problem57_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.findContinuousSequence(9)));
        System.out.println(Arrays.deepToString(solution.findContinuousSequence(15)));
    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();

        int first = 1;
        int last = first + 1;
        int sum = first + last;
        while (last > first) {
            if (sum < target) {
                last++;
                sum += last;
            } else if (sum > target) {
                sum -= first;
                first++;
            } else {
                int[] ints = new int[last - first + 1];
                int pos = 0;
                for (int i = first; i <= last; i++) {
                    ints[pos++] = i;
                }
                res.add(ints);
                sum -= first;
                first++;
            }
        }
        return res.toArray(new int[0][]);
    }
}
