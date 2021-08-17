package leetcode.problem09;

import java.util.Stack;

public class CQueue1 {
    private Stack<Integer> one;
    private Stack<Integer> two;

    public CQueue1() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void appendTail(int value) {
        one.push(value);
        if (two.empty()) {
            move();
        }
    }

    public int deleteHead() {
        if (two.empty()) {
            move();
        }
        return two.empty() ? -1 : two.pop();
    }

    private void move() {
        while (!one.empty()) {
            two.push(one.pop());
        }
    }
}
