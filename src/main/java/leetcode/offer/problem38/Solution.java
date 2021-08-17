package leetcode.offer.problem38;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] res = solution.permutation("abc");
        System.out.println(Arrays.toString(res));
    }

    public String[] permutation(String s) {
        boolean[] flag = new boolean[s.length()];
        HashSet<String> res = new HashSet<>();

        order(s, flag, new StringBuilder(), res);
        return res.toArray(new String[0]);
    }

    private void order(String s, boolean[] flag, StringBuilder temp, HashSet<String> res) {
        if (temp.length() == s.length()) {
            res.add(temp.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!flag[i]) {
                temp.append(s.charAt(i));
                flag[i] = true;
                order(s, flag, temp, res);
                flag[i] = false;
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}
