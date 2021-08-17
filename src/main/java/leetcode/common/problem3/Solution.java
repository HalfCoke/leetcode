package leetcode.common.problem3;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(2, solution.lengthOfLongestSubstring("aab"));
        Assert.assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int last = 0;
        Map<Character, Integer> charPos = new HashMap<>();
        int maxLen = 0;
        while (last < s.length()) {
            char c = s.charAt(last);
            if (charPos.containsKey(c)) {
                Integer pos = charPos.get(c);
                if (pos >= first) {
                    first = pos + 1;
                }
            }
            maxLen = Math.max(maxLen, last - first + 1);
            charPos.put(c, last);
            last++;
        }
        return maxLen;
    }
}
