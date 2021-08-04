package leetcode.problem67;

import org.junit.Assert;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(42, solution.strToInt("42"));
        Assert.assertEquals(-42, solution.strToInt("      -42"));
        Assert.assertEquals(-42, solution.strToInt("      -42adfad  123"));
        Assert.assertEquals(4193, solution.strToInt("4193 with words"));
        Assert.assertEquals(-13, solution.strToInt("-13+8"));
    }


    List<Map<Character, Integer>> states;

    public Solution() {
        states = new ArrayList<>();
        HashMap<Character, Integer> state0 = new HashMap<>();
        state0.put('n', 1);
        state0.put('b', 0);
        state0.put('s', 2);
        states.add(state0);

        HashMap<Character, Integer> state1 = new HashMap<>();
        state1.put('n', 1);
        state1.put('b', 3);
        state1.put('s', 3);
        state1.put('?', 3);
        states.add(state1);

        HashMap<Character, Integer> state2 = new HashMap<>();
        state2.put('n', 1);
        states.add(state2);

        HashMap<Character, Integer> state3 = new HashMap<>();
        state3.put('?', 3);
        state3.put('b', 3);
        state3.put('n', 3);
        state3.put('s', 3);
        states.add(state3);
    }

    public int strToInt(String str) {
        if (isLegalNumber(str)) {
            int signNumber = 1;
            long resNumber = 0L;
            boolean first = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                    resNumber *= 10;
                    resNumber += (str.charAt(i) - '0');
                    first = false;
                } else if (first && (str.charAt(i) == '-')) {
                    signNumber = -1;
                } else if (!first) {
                    break;
                }
                if (resNumber > Integer.MAX_VALUE) {
                    return signNumber == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            return (int) resNumber * signNumber;
        } else {
            return 0;
        }
    }

    private boolean isLegalNumber(String str) {
        int curState = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char op;
            if (c == ' ') {
                op = 'b';
            } else if ('0' <= c && c <= '9') {
                op = 'n';
            } else if (c == '+' || c == '-') {
                op = 's';
            } else {
                op = '?';
            }
            if (states.get(curState).containsKey(op)) {
                curState = states.get(curState).get(op);
            } else {
                return false;
            }
        }
        return curState == 1 || curState == 3;
    }

    public int strToInt1(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0, sign = 1, length = str.length();
        if (length == 0) return 0;
        while (str.charAt(i) == ' ')
            if (++i == length) return 0;
        if (str.charAt(i) == '-') sign = -1;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        for (int j = i; j < length; j++) {
            if (str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if (res > bndry || res == bndry && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign * res;
    }
}
