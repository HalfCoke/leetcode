package leetcode.problem09;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> one;
    private Stack<Integer> two;

    public CQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void appendTail(int value) {
        one.push(value);
    }

    public int deleteHead() {
        if (one.empty()) return -1;
        int res;
        while (!one.empty()) {
            two.push(one.pop());
        }
        res = two.pop();
        while (!two.empty()) {
            one.push(two.pop());
        }
        return res;
    }
}
