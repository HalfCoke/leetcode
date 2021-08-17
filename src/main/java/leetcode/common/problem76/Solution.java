package leetcode.common.problem76;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            charCount.compute(t.charAt(i), (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            });
        }
        String res = "";
        int len = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int count = charCount.keySet().size();


        while (right < s.length()) {
            if (charCount.containsKey(s.charAt(right))) {
                Integer n = charCount.get(s.charAt(right));
                charCount.put(s.charAt(right), n - 1);
                if (charCount.get(s.charAt(right)) == 0) count--;
            }
            while (count == 0) {
                if (right + 1 - left < len) {
                    res = s.substring(left, right + 1);
                    len = res.length();
                }
                if (charCount.containsKey(s.charAt(left))) {
                    charCount.put(s.charAt(left), charCount.get(s.charAt(left)) + 1);
                    if (charCount.get(s.charAt(left)) > 0) count++;
                }
                left++;
            }
            right++;
        }

        return res;

    }
}
