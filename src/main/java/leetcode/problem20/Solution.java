package leetcode.problem20;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Assert.assertTrue(solution.isNumber("  +6.6E+6  "));

        Assert.assertTrue(solution.isNumber("+100"));
        Assert.assertTrue(solution.isNumber("5e2"));
        Assert.assertTrue(solution.isNumber("-123"));
        Assert.assertTrue(solution.isNumber("3.1416"));
        Assert.assertTrue(solution.isNumber("-1E-16"));
        Assert.assertTrue(solution.isNumber("0123"));

        Assert.assertFalse(solution.isNumber("12e"));
        Assert.assertFalse(solution.isNumber("1a3.14"));
        Assert.assertFalse(solution.isNumber("1.2.3"));
        Assert.assertFalse(solution.isNumber("+-5"));
        Assert.assertFalse(solution.isNumber("12e+5.4"));

        Assert.assertTrue(solution.isNumber(".1"));
        Assert.assertFalse(solution.isNumber(".8+"));
        Assert.assertTrue(solution.isNumber("3."));
        Assert.assertFalse(solution.isNumber("3.+"));
        Assert.assertTrue(solution.isNumber("+.8"));

        Assert.assertFalse(solution.isNumber("."));

    }

    public boolean isNumber(String s) {
        Map<Character, Integer>[] states = initStates();
        int state = 0;
        for (char c : s.toCharArray()) {
            char t;
            if (c == ' ') t = 'b';
            else if (c == '.') t = 'p';
            else if (c <= '9' && c >= '0') t = 'd';
            else if (c == '+' || c == '-') t = 's';
            else if (c == 'E' || c == 'e') t = 'e';
            else t = '?';

            if (states[state].containsKey(t)) {
                state = states[state].get(t);
            } else {
                return false;
            }
        }
        return state == 2 || state == 3 || state == 4 || state == 7 || state == 8;

    }

    private Map<Character, Integer>[] initStates() {
        Map<Character, Integer>[] states = new Map[10];
        // 0
        Map<Character, Integer> state0 = new HashMap<>();
        state0.put('s', 1);
        state0.put('b', 0);
        state0.put('d', 2);
        state0.put('p', 9);
        // 1
        Map<Character, Integer> state1 = new HashMap<>();
        state1.put('d', 2);
        state1.put('p', 9);
        // 2
        Map<Character, Integer> state2 = new HashMap<>();
        state2.put('d', 2);
        state2.put('p', 3);
        state2.put('e', 5);
        state2.put('b', 8);
        // 3
        Map<Character, Integer> state3 = new HashMap<>();
        state3.put('d', 4);
        state3.put('e', 5);
        state3.put('b', 8);
        // 4
        Map<Character, Integer> state4 = new HashMap<>();
        state4.put('d', 4);
        state4.put('e', 5);
        state4.put('b', 8);
        // 5
        Map<Character, Integer> state5 = new HashMap<>();
        state5.put('s', 6);
        state5.put('d', 7);
        // 6
        Map<Character, Integer> state6 = new HashMap<>();
        state6.put('d', 7);
        // 7
        Map<Character, Integer> state7 = new HashMap<>();
        state7.put('d', 7);
        state7.put('b', 8);
        // 8
        Map<Character, Integer> state8 = new HashMap<>();
        state8.put('b', 8);
        //9
        Map<Character, Integer> state9 = new HashMap<>();
        state9.put('d', 4);


        states[0] = state0;
        states[1] = state1;
        states[2] = state2;
        states[3] = state3;
        states[4] = state4;
        states[5] = state5;
        states[6] = state6;
        states[7] = state7;
        states[8] = state8;
        states[9] = state9;

        return states;
    }

}
