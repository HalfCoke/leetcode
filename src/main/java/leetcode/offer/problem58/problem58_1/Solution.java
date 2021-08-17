package leetcode.offer.problem58.problem58_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] s1 = s.split(" ");

        List<String> collect = Arrays.stream(s1)
                .filter((s2 -> s2.length() != 0))
                .collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ", collect);
    }
}
