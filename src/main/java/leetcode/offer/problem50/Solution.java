package leetcode.offer.problem50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public char firstUniqChar(String s) {
        Map<Character, Boolean> emerge = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            emerge.put(s.charAt(i), !emerge.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if (emerge.get(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
