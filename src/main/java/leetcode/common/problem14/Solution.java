package leetcode.common.problem14;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int i = 0;
        boolean same = true;
        while (same && i < strs[0].length()) {
            char c = strs[0].charAt(i);
            for (int i1 = 1; i1 < strs.length; i1++) {
                if (i >= strs[i1].length() || strs[i1].charAt(i) != c) {
                    same = false;
                    break;
                }
            }
            i++;
        }
        return i == 0 ? "" : strs[0].substring(0, i - 1);
    }
}
