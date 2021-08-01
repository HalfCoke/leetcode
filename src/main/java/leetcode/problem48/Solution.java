package leetcode.problem48;

import org.junit.Assert;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int res = 1;
        int[] dp = new int[s.length()];
        HashMap<Character, Integer> pos = new HashMap<>();
        dp[0] = 1;
        pos.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {
            int last = -1;
            if (pos.containsKey(s.charAt(i))) {
                last = pos.get(s.charAt(i));
            }
            pos.put(s.charAt(i), i);
            if (dp[i - 1] < i - last) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = i - last;
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
